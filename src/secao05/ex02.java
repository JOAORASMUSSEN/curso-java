package secao05;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int x = scanner.nextInt();
        if(x % 2 == 0){
            System.out.println("O número digitado é par");
        }else {
            System.out.println("O númeor digitado é ímpar");
        }

        scanner.close();
    }
}
