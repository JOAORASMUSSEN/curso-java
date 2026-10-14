package exercicios.Interface.model.entities;

public class CurrentAccount implements Account{

    private Integer id;
    private String holder;
    private Double balance;

    public CurrentAccount(){
    }

    public CurrentAccount(Integer id, String holder, Double balance) {
        this.id = id;
        this.holder = holder;
        this.balance = balance;
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

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    @Override
    public Double viewBalance() {
        return getBalance();
    }

    @Override
    public void deposit(Double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(Double amount) {
        balance -= amount;
    }

    @Override
    public Double calculateInterest() {
        return balance * 0.02;
    }
}
