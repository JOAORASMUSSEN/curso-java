package secao17.application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercise01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Set<Integer> a = new HashSet<>();
        Set<Integer> b = new HashSet<>();
        Set<Integer> c = new HashSet<>();

        System.out.print("How many students for course A? ");
        int numA = scanner.nextInt();
        for(int i = 0; i < numA; i++){
            int id = scanner.nextInt();
            a.add(id);
        }

        System.out.print("How many students for course B? ");
        int numB = scanner.nextInt();
        for(int i = 0; i < numB; i++){
            int id = scanner.nextInt();
            b.add(id);
        }

        System.out.print("How many students for course C? ");
        int numC = scanner.nextInt();
        for(int i = 0; i < numC; i++){
            int id = scanner.nextInt();
            c.add(id);
        }

        Set<Integer> alunosAlex = new HashSet<>();

        alunosAlex.addAll(a);
        alunosAlex.addAll(b);
        alunosAlex.addAll(c);

        System.out.print("Total students: " + alunosAlex.size());

        scanner.close();

    }
}
