package secao06.primeiraparte;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String senha;
        System.out.println("Digite a senha: ");
        senha = scanner.nextLine();
        while(!(senha.equals("2002"))){
            System.out.println("Senha inválida, tente novamente");
            senha = scanner.nextLine();
        }
        System.out.println("Acesso permitido");

        scanner.close();
    }
}
