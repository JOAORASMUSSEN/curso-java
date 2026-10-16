package secao17.application;

import secao17.model.entities.Product02;

import java.util.Set;
import java.util.TreeSet;

public class Demo04 {
    public static void main(String[] args) {

        Set<Product02> set = new TreeSet<>();

        set.add(new Product02("TV", 900.0));
        set.add(new Product02("Notebook", 1200.0));
        set.add(new Product02("Tablet", 400.0));

        for (Product02 p : set) {
            System.out.println(p);
        }
    }
}
