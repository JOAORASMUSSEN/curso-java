package secao12.application;

import secao12.entities.Comment;
import secao12.entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;


public class Program03 {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Comment comment01 = new Comment("Have a nice trip");
        Comment comment02 = new Comment("Wow thats awesome");

        Post post01 = new Post(sdf.parse("21/06/2018 13:05:44"), "traveling to New Zeland","I'm going to visit this wonderful country", 12);

        post01.addComment(comment01);
        post01.addComment(comment02);

        Comment comment03 = new Comment("Good night");
        Comment comment04 = new Comment("May the force be with you");

        Post post02 = new Post(sdf.parse("28/07/2018 23:14:19"), "Good night guys", "See you tomorow", 5);

        post02.addComment(comment03);
        post02.addComment(comment04);

        System.out.println(post01);
        System.out.println(post02);
    }
}
