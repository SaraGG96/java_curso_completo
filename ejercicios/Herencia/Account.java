package Herencia;

public class Account {

    int saldo = 500;

    public void deposit(int deposit) {
        this.saldo = this.saldo + deposit;
        System.out.println("Saldo es ahora: " + this.saldo);
    }

    public void withdraw(int withdraw) {
        this.saldo = this.saldo - withdraw;
        System.out.println("Saldo es ahora: " + this.saldo);
    }
    
}
