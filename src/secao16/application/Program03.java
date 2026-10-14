package secao16.application;

import secao16.model.services.BrazilInterestService;
import secao16.model.services.InterestService;
import secao16.model.services.USAInterestService;

import java.util.Locale;
import java.util.Scanner;

public class Program03 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Amount: ");
        double amount = scanner.nextDouble();

        System.out.print("Months: ");
        int months = scanner.nextInt();

        InterestService is = new BrazilInterestService(2.0);

        System.out.println("Payment after "+ months + " months: ");
        System.out.println(String.format("%.2f", is.payment(amount, months)));

        scanner.close();
    }
}
