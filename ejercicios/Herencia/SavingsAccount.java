package Herencia;

public class SavingsAccount extends Account {
    
    public void addInterests() {
        this.saldo = (int) (this.saldo * 1.05);
        System.out.println("Saldo es ahora: " + this.saldo);
    }

}
