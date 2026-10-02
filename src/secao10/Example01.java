package secao10;

import java.util.Locale;
import java.util.Scanner;

public class Example01 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        double sumHeight = 0;
        for(int i = 0; i < n; i++){
            double height = scanner.nextDouble();
            sumHeight += height;
        }

        double avarageHeight = sumHeight/n;

        System.out.printf("AVARAGE HEIGHT: %.2f", avarageHeight);

        scanner.close();
    }
}
