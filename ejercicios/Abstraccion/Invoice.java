package Abstraccion;

public class Invoice implements Payable {

    @Override
    public void pay() {
        System.out.println("Pagando la factura...");
    }
    
}
