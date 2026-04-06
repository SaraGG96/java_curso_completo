package Abstraccion;

public class TV extends Appliance {

    @Override
    public void turnOn() {
        System.out.println("Encendiendo televisor");
    }

    @Override
    public void turnOff() {
        System.out.println("Apagando televisor");
    }
    
}
