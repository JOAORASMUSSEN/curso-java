package secao16.application;

import secao16.model.entities.Contract;
import secao16.model.entities.Installment;
import secao16.model.services.ContractService;
import secao16.model.services.PaypalService;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre os dados do contrato:");

        System.out.print("Número: ");
        int number = scanner.nextInt();

        System.out.print("Data (dd/MM/yyyy): ");
        LocalDate date = LocalDate.parse(scanner.next(), fmt);

        System.out.print("Valor do contrato: ");
        double totalValue = scanner.nextDouble();

        Contract contract = new Contract(number, date, totalValue);

        System.out.print("Entre com o número de parcelas: ");
        int numOfInstallment = scanner.nextInt();

        ContractService contractService = new ContractService(new PaypalService());
        contractService.processContract(contract, numOfInstallment);

        System.out.println("Parcelas: ");

        for(Installment installment: contract.getInstallments()){
            System.out.println(installment);
        }

        scanner.close();
    }
}
