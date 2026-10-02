package secao10.application;

import secao10.entities.Rent;

import java.util.Locale;
import java.util.Scanner;

public class Example03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        Rent[] vect = new Rent[10];
        System.out.print("How many rooms will be rented? ");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println();
            System.out.println("Rent#" + i + ":");
            System.out.print("Name: ");
            scanner.nextLine();
            String name = scanner.nextLine();
            System.out.print("Email: ");
            String email = scanner.nextLine();
            System.out.print("Room: ");
            int room = scanner.nextInt();
            vect[room] = new Rent(name, email);
        }
        System.out.println();
        System.out.println("Busyrooms:");
        for (int i = 0; i < 10; i++) {
            if (vect[i] != null) {
                System.out.println(i + ": " + vect[i]);
            }
        }

        scanner.close();
    }
}
