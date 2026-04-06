package Abstraccion;

public class Duck implements Flyable, Swimable {

    public void fly() {
        System.out.println("El pato vuela");
    }

    public void swim() {
        System.out.println("El pato nada");
    }
    
}
