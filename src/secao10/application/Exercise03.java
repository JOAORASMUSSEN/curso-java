package secao10.application;

import secao10.entities.Pessoa;

import java.util.Locale;
import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantas pessoas seram digitadas? ");
        int n = scanner.nextInt();

        Pessoa[] pessoas = new Pessoa[n];

        for(int i = 0 ; i < pessoas.length; i++){
            System.out.printf("Dados da %da pessoa\n", i+1);
            scanner.nextLine();
            System.out.print("Nome: ");
            String nome = scanner.nextLine();
            System.out.print("Altura: ");
            double height = scanner.nextDouble();
            System.out.print("Idade: ");
            int age = scanner.nextInt();

            pessoas[i] = new Pessoa(nome, height, age);
        }

        double sumHeight = 0;

        for(int i = 0; i < pessoas.length; i++){
            sumHeight += pessoas[i].getHeight();
        }

        double avgHeight = sumHeight / pessoas.length;
        System.out.printf("\nAltura média: %.2f\n", avgHeight);

        int minors = 0;
        for(int i = 0; i < pessoas.length; i++){
            if(pessoas[i].getAge() < 16){
                minors++;
            }
        }
        double percentage = ((double) minors/ pessoas.length) *100;
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", percentage);
        for (int i = 0; i < pessoas.length; i++) {
            if(pessoas[i].getAge() < 16){
                System.out.println(pessoas[i].getName());
            }
        }

        scanner.close();
    }
}
