package secao17.model.entities;

import java.util.Objects;

public class Product02 implements Comparable<Product02> {

    private String name;
    private Double price;

    public Product02(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Product02 product02 = (Product02) o;
        return Objects.equals(name, product02.name) && Objects.equals(price, product02.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    @Override
    public String toString() {
        return "Product [name=" + name + ", price=" + price + "]";
    }

    @Override
    public int compareTo(Product02 other) {
        return name.toUpperCase().compareTo(other.getName().toUpperCase());
    }
}
