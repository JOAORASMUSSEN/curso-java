package secao06.segundaparte;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um inteiro");
        int n = scanner.nextInt();
        int x;
        int in = 0, out = 0;
        for(int i = 0; i < n; i++){
            x = scanner.nextInt();
            if(x >= 10 && x <=20){
                in++;
            }else out++;
        }
        System.out.println(in + " in");
        System.out.println(out + " out");

        scanner.close();
    }
}
