package secao17.application;

import secao17.model.service.PrintService;

import java.util.Scanner;

public class Program01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        PrintService<Integer> printService = new PrintService<>();

        System.out.print("How many values? ");
        int n = scanner.nextInt();

        for(int i = 0; i < n; i++){
            int value = scanner.nextInt();
            printService.addValue(value);
        }

        printService.print();

        System.out.println("First: " + printService.first());

        scanner.close();
    }

}
