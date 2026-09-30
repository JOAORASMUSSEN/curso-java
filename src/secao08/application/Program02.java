package secao08.application;
import secao08.entities.Triangle;
import java.util.Locale;
import java.util.Scanner;

public class Program02 {
    //usando POO
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        Triangle x = new Triangle();
        Triangle y = new Triangle();

        System.out.println("Enter the measure of triangle X:");
        x.a = scanner.nextDouble();
        x.b = scanner.nextDouble();
        x.c = scanner.nextDouble();

        System.out.println("Enter the measure of triangle Y:");
        y.a = scanner.nextDouble();
        y.b= scanner.nextDouble();
        y.c = scanner.nextDouble();

        double areaX = x.area();
        double areaY = y.area();

        System.out.printf("Triangle X area: %.4f\n", areaX);
        System.out.printf("Triangle Y area: %.4f\n", areaY);
        System.out.print("Larger area: ");
        if(areaX > areaY){
            System.out.println("X");
        }else{
            System.out.println("Y");
        }

        scanner.close();
    }
}
