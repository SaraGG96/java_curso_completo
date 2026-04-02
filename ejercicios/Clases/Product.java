package Clases;

public class Product {
    
    String name;
    double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void discount(int percentage) {
        double d = this.price * (percentage / 100.0);
        this.price = this.price - d;
        System.out.println("El precio de " + this.name + " es ahora: " + this.price);
    }
    
}
