package secao06.primeiraparte;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cod;
        int alc = 0, gas = 0, diesel = 0;
        System.out.println("1.Álcool\n2.Gasolina\n3.Diesel\n4.Fim");
        cod = scanner.nextInt();
        while(cod != 4){
            if(cod == 1) alc++;
            else if(cod == 2) gas++;
            else if(cod == 3) diesel++;
            else{
                System.out.println("Digite novamente");
            }
            cod = scanner.nextInt();
        }
        System.out.printf("Alcool: %d\n", alc);
        System.out.printf("Gasolina: %d\n", gas);
        System.out.printf("Diesel: %d\n", diesel);
        scanner.close();
    }
}
