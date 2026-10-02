package secao10;

import java.util.Locale;
import java.util.Scanner;

public class Example01_2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        double[] vect = new double[n];

        for(int i = 0; i < n; i++){
            vect[i] = scanner.nextDouble();
        }

        double sumHeight = 0;

        for(int i = 0; i < n; i++){
            sumHeight += vect[i];
        }

        double avarage = sumHeight/n;

        System.out.printf("AVARAGE HEIGHT: %.2f", avarage);

        scanner.close();
    }
}
