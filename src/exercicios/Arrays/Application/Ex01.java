package exercicios.Arrays.Application;

import java.util.Locale;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        //Locale.setDefault(Locale.US);
        Scanner scanner =  new Scanner(System.in).useLocale(Locale.US);

        double[] notas = new double[5];

        for(int i = 0; i < notas.length; i++){
            notas[i] = scanner.nextDouble();
        }

        System.out.print("Notas: ");
        double somaNotas = 0;
        for(double nota : notas){
            System.out.print(nota + " ");
            somaNotas += nota;
        }


        double maior = notas[0];
        double menor = notas[0];
        for(int i = 1; i < notas.length; i++){
            if(notas[i] > maior){
                maior = notas[i];
            }

            if(notas[i] < menor){
                menor = notas[i];
            }
        }
        System.out.println();
        System.out.println("Maior nota: "+ maior);
        System.out.println("Menor nota: "+ menor);
        System.out.println("Média das notas: "+ somaNotas/notas.length);


        scanner.close();
    }
}
