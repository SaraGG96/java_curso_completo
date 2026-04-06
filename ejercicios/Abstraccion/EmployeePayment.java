package Abstraccion;

public class EmployeePayment implements Payable {

    @Override
    public void pay() {
        System.out.println("Pagando el contrato del empleado...");
    }
    
}
