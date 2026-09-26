package secao05;

import java.util.Arrays;
import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        System.out.println("Digite o primeiro número inteiro:");
        int x = scanner.nextInt();

        System.out.println("Digite o segundo número inteiro:");
        int y = scanner.nextInt();

        if(x % y == 0){
            System.out.printf("O número %d e o número %d são múltiplos", x, y);
        }else{
            System.out.printf("O número %d e o número %d não são múltiplos", x, y);
        }

        scanner.close();
    }
}
