package exercicios.Interface.model.entities;

public class Rectangle implements Shape {

    private Double side1;
    private Double side2;

    public Rectangle(){
    }

    public Rectangle(Double side1, Double side2){
        this.side1 = side1;
        this.side2 = side2;
    }

    public Double getSide1() {
        return side1;
    }

    public void setSide1(Double side1) {
        this.side1 = side1;
    }

    public Double getSide2() {
        return side2;
    }

    public void setSide2(Double side2) {
        this.side2 = side2;
    }

    @Override
    public Double getArea(){
        return side1*side2;
    }

}
