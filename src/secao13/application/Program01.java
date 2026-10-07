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
        //acc2: tipo Account instanciada como BusinessAccount
        //não pode converter para BusinessAccount sem casting
        Account acc3 = new SavingsAccount(1004, "Ana", 0.0, 0.01);

        //downcasting
        BusinessAccount acc4 = (BusinessAccount) acc2;
        acc4.loan(100.0);
        //BusinessAccount acc5 = (BusinessAccount) acc3; - dá problema em tempo de execução - não pode
        if(acc3 instanceof BusinessAccount){
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(1000.0);
            System.out.println("Loan!");
        }

        if(acc3 instanceof SavingsAccount){
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("Update!");
        }
    }
}
