package secao06.primeiraparte;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x, y;
        System.out.println("Digite a primeira coordenada");
        x = scanner.nextInt();
        System.out.println("Digite a segunda coordenada");
        y = scanner.nextInt();

        while(x != 0 && y != 0){
            if(x > 0 && y > 0) System.out.println("Primeiro");
            else if(x < 0 && y > 0) System.out.println("Segundo");
            //se chegar aqui y só pode ser negativo
            else if(x < 0) System.out.println("Terceiro");
            else System.out.println("Quarto");

            System.out.println("Digite a primeira coordenada");
            x = scanner.nextInt();
            System.out.println("Digite a segunda coordenada");
            y = scanner.nextInt();
        }

        scanner.close();
    }
}
