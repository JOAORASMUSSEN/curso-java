package exercicios.Interface.model.entities;

public class SavingsAccount implements Account{
    private Integer id;
    private String holder;
    private Double balance;
    private Double interest;

    public SavingsAccount(){
    }

    public SavingsAccount(Integer id, String holder, Double balance, Double interest) {
        this.id = id;
        this.holder = holder;
        this.balance = balance;
        this.interest = interest;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public Double getInterest() {
        return interest;
    }

    public void setInterest(Double interest) {
        this.interest = interest;
    }

    @Override
    public void deposit(Double amount){
        balance += amount;
    }

    @Override
    public void withdraw(Double amount){
        balance -= amount;
    }

    @Override
    public Double viewBalance() {
        return getBalance();
    }

    @Override
    public Double calculateInterest() {
        return interest*0.15;
    }
}
