package secao10.application;

import secao10.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Example02 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner =  new Scanner(System.in);

        int n = scanner.nextInt();
        Product[] vect = new Product[n];

        for(int i = 0; i < vect.length; i++){
            scanner.nextLine();
            String name = scanner.nextLine();
            double price = scanner.nextDouble();

            vect[i] = new Product(name, price);
        }

        double sumPrices = 0;
        for(int i = 0; i < vect.length; i++){
            sumPrices += vect[i].getPrice();
        }

        double avarage = sumPrices/vect.length;
        System.out.printf("AVARAGE PRICES: %.2f", avarage);

        scanner.close();
    }
}
