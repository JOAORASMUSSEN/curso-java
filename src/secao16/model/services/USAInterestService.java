package secao16.model.services;

public class USAInterestService implements InterestService {

    private double interestRate;

    public USAInterestService(){
    }

    public USAInterestService(double interestRate) {
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
