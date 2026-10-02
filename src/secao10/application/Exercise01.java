package secao10.application;

import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos números você quer digitar: ");
        int n = scanner.nextInt();
        int[] vect = new int[n];

        for(int i = 0; i < vect.length; i++){
            System.out.print("Digite um número: ");
            vect[i] = scanner.nextInt();
        }

        System.out.println("Número negativos: ");
        for (int i = 0; i < vect.length; i++){
            if(vect[i] < 0){
                System.out.println(vect[i]);
            }
        }

        scanner.close();
    }
}
