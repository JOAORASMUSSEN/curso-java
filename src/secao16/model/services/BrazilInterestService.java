package secao16.model.services;

public class BrazilInterestService implements InterestService {

    private double interestRate;

    public BrazilInterestService(){
    }

    public BrazilInterestService(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
}
