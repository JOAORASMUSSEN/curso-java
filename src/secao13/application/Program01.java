package secao13.application;

import secao13.entities.Account;
import secao13.entities.BusinessAccount;
import secao13.entities.SavingsAccount;

public class Program01 {
    public static void main(String[] args) {
        Account acc = new Account(1001, "Alex", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.00);

        //upcasting

        Account acc1 = bacc;//BusinessAccount é uma Account
        Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 500.0);
        Account acc3 = new SavingsAccount()
    }
}
