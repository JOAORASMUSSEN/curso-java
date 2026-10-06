package secao12.application;

import secao12.entities.*;
import secao12.entities.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program04 {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter client data:");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        Date birthDate = sdf.parse(scanner.next());

        Client client = new Client(name, email, birthDate);

        System.out.println("Enter order data:");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(scanner.next());
        System.out.print("How many item to this order? ");
        int n = scanner.nextInt();
        Order01 order = new Order01(new Date(), status, client);

        for(int i = 1; i <= n; i++){
            System.out.println("Enter #"+i+" item data");
            scanner.nextLine();
            System.out.print("Product name: ");
            String productName = scanner.nextLine();
            System.out.print("Product price: ");
            double price = scanner.nextDouble();
            System.out.print("Quantity: ");
            int quantity = scanner.nextInt();

            Product product = new Product(productName, price);

            OrderItem orderItem = new OrderItem(quantity, price, product);

            order.addItem(orderItem);
        }

        System.out.println("ORDER SUMARY:");
        System.out.println(order);
    }
}
