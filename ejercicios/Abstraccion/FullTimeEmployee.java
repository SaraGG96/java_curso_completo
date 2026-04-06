package Abstraccion;

public class FullTimeEmployee extends Employee {

    @Override
    public void calculateSalary() {
        super.salary = super.salary + 1000;
        System.out.println("El salario es: " + super.salary);
    }
    
}
