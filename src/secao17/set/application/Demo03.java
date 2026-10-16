package secao17.set.application;

import secao17.set.model.entities.Product02;

import java.util.HashSet;
import java.util.Set;

public class Demo03 {
    public static void main(String[] args) {

        Set<Product02> set = new HashSet<>();

        set.add(new Product02("TV", 900.0));
        set.add(new Product02("Notebook", 1200.0));
        set.add(new Product02("Tablet", 400.0));

        Product02 prod = new Product02("Notebook", 1200.0);

        System.out.println(set.contains(prod));

    }
}
