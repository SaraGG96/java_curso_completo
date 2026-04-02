package Herencia;

public class Car extends Vehicle {

    public void honk() {
        System.out.println("piip piip");
    }

    @Override
    public void describe() {
        System.out.println("Es un coche");
    }
    
}
