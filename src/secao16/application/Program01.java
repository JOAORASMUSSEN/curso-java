package secao16.application;


import secao16.model.entities.CarRental;
import secao16.model.entities.Vehicle;
import secao16.model.services.BrazilTaxServices;
import secao16.model.services.RentalService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");

        System.out.println("Entre com os dados do aluguel");
        System.out.print("Modelo do carro: ");
        String model = scanner.nextLine();
        System.out.print("Retirada (dd/MM/yyyy hh:mm): ");
        LocalDateTime start = LocalDateTime.parse(scanner.nextLine(), fmt);
        System.out.print("Retorno (dd/MM/yyyy HH:mm): ");
        LocalDateTime finish = LocalDateTime.parse(scanner.nextLine(), fmt);

        CarRental cr = new CarRental(start, finish, new Vehicle(model));

        System.out.print("Entre com o preço por hora");
        double pricePerHour = scanner.nextDouble();
        System.out.print("Entre com o preço por dia");
        double pricePerDay = scanner.nextDouble();

        RentalService rentalService = new RentalService(pricePerHour,pricePerDay,
                new BrazilTaxServices());

        rentalService.processInvoice(cr);

        System.out.println("FATURA");
        System.out.println("Pagamento básico: "+ cr.getInvoice().getBasicPayment());
        System.out.println("Imposto: "+ cr.getInvoice().getTax());
        System.out.println("Pagamento total: "+ cr.getInvoice().getTotalPayment());

        scanner.close();
    }
}
