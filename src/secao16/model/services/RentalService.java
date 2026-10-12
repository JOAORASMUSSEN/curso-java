package secao16.model.services;

import secao16.model.entities.CarRental;
import secao16.model.entities.Invoice;

import java.time.Duration;

public class RentalService {

    private Double pricePerHour;
    private Double pricePerDay;

    private TaxService taxServices;

    public RentalService(Double pricePerHour, Double pricePerDay, TaxService taxServices) {
        this.pricePerHour = pricePerHour;
        this.pricePerDay = pricePerDay;
        this.taxServices = taxServices;
    }

    public void processInvoice(CarRental carRental){

        double minutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
        double hours = minutes/60;

        double basicPayment;

        if(hours <= 12){
            basicPayment = pricePerHour * Math.ceil(hours);
        }else{
            basicPayment = pricePerDay * Math.ceil(hours / 24);
        }

        double tax = taxServices.tax(basicPayment);
        
        carRental.setInvoice(new Invoice(basicPayment, tax));
    }
}
