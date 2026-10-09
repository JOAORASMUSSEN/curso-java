package secao13.application;

import secao13.entities.ImportedProduct;
import secao13.entities.Product;
import secao13.entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Exercise01 {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter the number of products: ");
        int n = scanner.nextInt();

        List<Product> products = new ArrayList<>();

        for(int i = 1; i <= n; i++){
            System.out.println("Product #"+i+" data:");
            System.out.print("Common, used or imported (c/u/i): ");
            char response = scanner.next().charAt(0);

            scanner.nextLine();

            System.out.println("Name: ");
            String name = scanner.nextLine();
            System.out.println("Price: ");
            double price = scanner.nextDouble();

            if(response == 'i'){
                System.out.println("Custom Fee: ");
                double customFee = scanner.nextDouble();
                products.add(new ImportedProduct(name, price, customFee));
            } else if (response == 'u') {
                System.out.println("Manufactured date (DD/MM/YYYY): ");
                Date manufactureDate = sdf.parse(scanner.next());

                products.add(new UsedProduct(name, price, manufactureDate));
            }else{
                products.add(new Product(name, price));
            }
        }

        System.out.println();
        System.out.println("PRICE TAGS:");
        for(Product product : products){
            System.out.println(product.priceTag());
        }

        scanner.close();
    }
}
