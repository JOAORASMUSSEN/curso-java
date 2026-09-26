package secao04;
import java.util.Locale;
import java.util.Scanner;

public class entradadaDeDados {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        String x;
        System.out.print("Digite uma palavra: ");
        x = scanner.next();
        System.out.println("Você digitou: " + x);

        System.out.print("Digite um número inteiro: ");
        int y = scanner.nextInt();
        System.out.println("Você digitou o inteiro: " + y);

        System.out.print("Digite um número do tipo double: ");
        double z = scanner.nextDouble();
        System.out.println("Você digitou o double: " + z);

        System.out.print("Digite um caractere: ");
        char t = scanner.next().charAt(0);
        System.out.println("Você digitou o caractere: " + t);

        scanner.close();
    }
}
