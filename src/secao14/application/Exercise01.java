package secao14.application;

import secao14.model.entities.Account;
import secao14.model.exception.BusinessException;

import java.util.Locale;
import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter account data");
        System.out.print("Number: ");
        int number = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Holder: ");
        String name = scanner.nextLine();
        System.out.print("Initial balance: ");
        double balance = scanner.nextDouble();
        System.out.print("Withdraw limit: ");
        double withdrawLimit = scanner.nextDouble();

        Account acc = new Account(number, name, balance, withdrawLimit);

        System.out.print("Enter amount for withdraw: ");
        double amount = scanner.nextDouble();

        acc.withdraw(amount);

        try {
            acc.withdraw(amount);
            System.out.printf("New balance: %.2f%n", acc.getBalance());
        }
        catch (BusinessException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}
