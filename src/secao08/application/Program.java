package secao08.application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double xA, xB, xC, yA, yB, yC;

        System.out.println("Enter the measure of triangle X:");
        xA = scanner.nextDouble();
        xB = scanner.nextDouble();
        xC = scanner.nextDouble();

        System.out.println("Enter the measure of triangle Y:");
        yA = scanner.nextDouble();
        yB = scanner.nextDouble();
        yC = scanner.nextDouble();

        double xP = (xA+xB+xC)/2;
        double areaX = Math.sqrt(xP*(xP-xA)*(xP-xB)*(xP-xC));
        double yP = (yA+yB+yC)/2;
        double areaY = Math.sqrt(yP*(yP-yA)*(yP-yB)*(yP-yC));
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
