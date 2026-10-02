package secao10.application;

import java.util.Locale;
import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos números você quer digitar? ");
        int n = scanner.nextInt();

        double[] nums = new double[n];

        for(int i = 0; i < nums.length; i++){
            System.out.print("Digite um número: ");
            nums[i] = scanner.nextDouble();
        }

        System.out.print("VALORES: ");
        for(int i = 0; i < nums.length; i++){
            System.out.printf("%.2f ",nums[i]);
        }

        System.out.println();

        double sum = 0;
        for (int i = 0; i < nums.length; i++){
            sum += nums[i];
        }
        System.out.printf("SOMA DOS VALORES: %.2f\n", sum);

        double media = sum/ nums.length;

        System.out.printf("MEDIA: %.2f", media);

        scanner.close();
    }
}
