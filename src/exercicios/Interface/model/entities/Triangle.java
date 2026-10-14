package exercicios.Interface.model.entities;

public class Triangle implements Shape {

    private Double base;
    private Double height;

    public Triangle(){
    }

    public Triangle(Double base, Double height){
        this.base = base;
        this.height = height;
    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getHeight() {
        return height;
    }



    public void setHeight(Double height) {
        this.height = height;
    }

    @Override
    public Double getArea() {
        return (base*height)/2;
    }
}
