package exercicios.Interface.model.entities;

public class Circle implements Shape {

    private Double radius;

    public Circle(){
    }

    public Circle(Double radius){
        this.radius = radius;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    @Override
    public Double getArea(){
        return Math.PI*Math.pow(radius, 2);
    }
}
