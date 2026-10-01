package secao09.application;

import secao09.entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        Account account;

        System.out.print("Enter account number: ");
        int accountNumber = scanner.nextInt();
        System.out.print("Enter account holder: ");
        scanner.nextLine();
        String name = scanner.nextLine();
        System.out.println("Is there any initial deposit (y/n)? ");
        char response = scanner.nextLine().charAt(0);
        double initialDeposit = 0;
        if(response == 'y'){
            System.out.println("Enter initial deposit value: ");
            initialDeposit = scanner.nextDouble();
            account = new Account(accountNumber, name, initialDeposit);
        }else{
            account = new Account(accountNumber, name);
        }
        System.out.println();


        System.out.println("Account data: ");
        System.out.println(account);


        System.out.println();
        System.out.print("Enter a withdraw value: ");
        double withdrawValue = scanner.nextDouble();
        account.withdraw(withdrawValue);
        System.out.println("Updated account data:");
        System.out.println(account);

        scanner.close();
    }
}
