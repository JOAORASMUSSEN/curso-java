package secao06.segundaparte;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um inteiro");
        int x = scanner.nextInt();

        for(int i = 1; i <= x; i++){
            if(i % 2 != 0){
                System.out.println(i);
            }
        }

        scanner.close();
    }
}
