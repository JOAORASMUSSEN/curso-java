package secao14.application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        method1();

        System.out.println("End of program");
        scanner.close();
    }

    public static void method1(){
        System.out.println("--------- method 1 start ---------");
        method2();
        System.out.println("--------- method 1 end ---------");
    }

    public static void method2(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("--------- method 2 start ---------");

        try{
            String[] vect = scanner.nextLine().split(" ");
            int position= scanner.nextInt();

            System.out.println(vect[position]);
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid position!");
            e.printStackTrace();
            scanner.next();

        }catch(InputMismatchException e){
            System.out.println("Input error");
        }

        System.out.println("--------- method 2 end ---------");
    }
}
