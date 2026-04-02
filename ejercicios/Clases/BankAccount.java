package Clases;
public class BankAccount {

    int balance = 0;

    public BankAccount() {};

    public void deposit(int numero) {
        this.balance += numero;
    }

    public void getBalance() {
        System.out.println(this.balance);
    }
    
}
