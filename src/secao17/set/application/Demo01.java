package secao17.set.application;

import java.util.LinkedHashSet;
import java.util.Set;

public class Demo01 {
    public static void main(String[] args) {

        Set<String> set = new LinkedHashSet<>();

        set.add("TV");
        set.add("Notebook");
        set.add("Tablet");
        set.add("Mouse");

        System.out.println(set.contains("Notebook"));

        set.remove("Tablet");
        set.removeIf(x -> x.charAt(0) == 'M');

        for (String p : set) {
            System.out.println(p);
        }

    }
}
