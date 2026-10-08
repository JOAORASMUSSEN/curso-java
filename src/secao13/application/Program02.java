package secao13.application;

import secao13.entities.Account;
import secao13.entities.SavingsAccount;

public class Program02 {
    public static void main(String[] args) {
        Account acc1 = new Account(1001, "João", 1000.0);

        acc1.withdraw(200.0);
        System.out.println(acc1.getBalance());

        Account acc2 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
        acc2.withdraw(200.0);
        System.out.println(acc2.getBalance());

    }
}
