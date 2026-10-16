package secao17.application;

import secao17.model.entities.Client;

public class Program04 {
    public static void main(String[] args) {

        Client c1 = new Client("Maria", "maria@gmail.com");
        Client c2 = new Client("Maria", "maria@gmail.com");

        String s1 = "Test";
        String s2 = "Test";

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1.equals(c2));
        System.out.println(c1 == c2); //compara as referencias de memória, por isso o resultado é false

        System.out.println(s1 == s2);

    }
}
