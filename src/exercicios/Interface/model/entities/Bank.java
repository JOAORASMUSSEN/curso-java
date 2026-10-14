package exercicios.Interface.model.entities;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    private List<Account> accounts = new ArrayList<>();

    public Bank(){
    }

    public void addAccount(Account acc){
        accounts.add(acc);
    }

    public void removeAccount(Account account) {
        accounts.remove(account);
    }

    // Method to deposit a specified amount into an account
    public void deposit(Account account, double amount) {
        account.deposit(amount);
    }

    // Method to withdraw a specified amount from an account
    public void withdraw(Account account, double amount) {
        account.withdraw(amount);
    }

    // Method to print the balances of all accounts in the bank
    public void printAccountBalances() {
        for (Account account : accounts) {
            System.out.println("Account balance: " + account.viewBalance());
        }
    }
}
