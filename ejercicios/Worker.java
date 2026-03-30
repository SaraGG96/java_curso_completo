public class Worker {
    
    String name;
    int salario;

    public Worker(String name, int salario) {
        this.name = name;
        this.salario = salario;
    }

    public void getSalario() {
        System.out.println(this.name + " gana al mes: " + this.salario + " euros");
    }
}
