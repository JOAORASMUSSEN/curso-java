package secao09.entities;

public class Account {
    private int numberAccount;
    private String name;
    private double balance;

    public Account(){

    }

    public Account(int numberAccount, String name) {
        this.numberAccount = numberAccount;
        this.name = name;
    }

    public Account(int numberAccount, String name, double initialDeposit) {
        this.numberAccount = numberAccount;
        this.name = name;
        deposit(initialDeposit);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setInitialValue(double initialDeposit){
        this.balance = initialDeposit;
    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public int getNumberAccount() {
        return numberAccount;
    }

    public void deposit(double amount){
        balance+=amount;
    }

    public void withdraw(double amount){
        balance -= amount + 5.00;
    }

    public String toString(){
        return "Account "
                + numberAccount
                + ", Name "
                + name
                + ", Balance: $"
                + String.format("%.2f", balance);
    }
}
