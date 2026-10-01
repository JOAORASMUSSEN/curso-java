package secao09.application;

import secao09.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Price: ");
        double price = scanner.nextDouble();

        Product product = new Product(name, price);

        product.setName("Computer");
        System.out.println("Updated name: " + product.getName());
        product.setPrice(1200.00);
        System.out.println("Updated price: " + product.getPrice());

        System.out.println();

        System.out.println("Updated data: "+product);

        scanner.close();
    }
}
