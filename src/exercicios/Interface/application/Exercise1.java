package exercicios.Interface.application;

import exercicios.Interface.model.entities.Circle;
import exercicios.Interface.model.entities.Rectangle;
import exercicios.Interface.model.entities.Triangle;

import java.util.Locale;

public class Exercise1 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Rectangle rec = new Rectangle(10.00, 10.00);
        Circle circ = new Circle(10.00);
        Triangle tri = new Triangle(10.00, 20.00);

        System.out.println("The rectangle area is: "+ String.format("%.2f", rec.getArea()));
        System.out.println("The circle area is: " + String.format("%.2f", circ.getArea()));
        System.out.println("The triangle area is: "+ String.format("%.2f", tri.getArea()));

    }
}
