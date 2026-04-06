package Abstraccion;

public class PartTimeEmployee extends Employee {

    @Override
    public void calculateSalary() {
        super.salary = super.salary + 500;
        System.out.println("El salario es: " + super.salary);
    }
    
}
