package Abstraccion;

public class WashingMachine extends Appliance {

    @Override
    public void turnOn() {
        System.out.println("Encendiendo lavadora");
    }

    @Override
    public void turnOff() {
        System.out.println("Apagando lavadora");
    }
    
}
