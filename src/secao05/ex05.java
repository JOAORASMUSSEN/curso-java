package secao05;

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quant, cod;

        System.out.println("Digite o código do item:");
        cod = scanner.nextInt();

        System.out.println("Digite a quantidade deste item:");
        quant = scanner.nextInt();

        double total;

        switch (cod){
            case 1:
                total = 4.00 * quant;
                System.out.println("O valor da conta é: " + total);
                break;
            case 2:
                total = 4.50 * quant;
                System.out.println("O valor da conta é: " + total);
                break;
            case 3:
                total = 5.00 * quant;
                System.out.println("O valor da conta é: " + total);
                break;
            case 4:
                total = 2.00 * quant;
                System.out.println("O valor da conta é: " + total);
                break;
            case 5:
                total = 1.50 * quant;
                System.out.println("O valor da conta é: " + total);
                break;
            default:
                System.out.println("Código inválido");
        }

        scanner.close();
    }
}
