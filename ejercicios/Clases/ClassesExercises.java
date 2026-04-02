package Clases;
import java.util.ArrayList;



public class ClassesExercises {

    public static void main(String[] args) {


        // 1. Crea una clase Book con atributos title y author. Crea un objeto y muestra sus datos.
        // 3. Añade un constructor a la clase Book que reciba title y author.
        Book libro1 = new Book("Alicia en el país de las maravillas", "Pepe");
        System.out.println(libro1.title);
        System.out.println(libro1.author);

        // 2. Crea una clase Dog con un método bark() que imprima su sonido.
        Dog perro1 = new Dog();
        perro1.bark();

        // 4. Crea una clase Car con atributos brand y model y un método showData().
        Car coche1 = new Car("Opel", "Corsa");
        coche1.showData();

        // 5. Crea una clase Student con atributo score y un método que diga si aprobó (mayor o igual a 60).
        Student alumno1 = new Student("Pepe", 50);
        Student alumno2 = new Student("Pepa", 70);
        alumno1.hasPassed();
        alumno2.hasPassed();

        // 6. Crea una clase BankAccount con atributo balance y un método deposit() que sume el saldo.
        BankAccount cuentaDeManolo = new BankAccount();
        cuentaDeManolo.deposit(580);
        cuentaDeManolo.getBalance();

        // 7. Crea una clase Rectangle con métodos para calcular el área y el perímetro.
        Rectangle rectangulo1 = new Rectangle(50, 100, 50, 100);
        rectangulo1.getArea();
        rectangulo1.getPerimeter();

        // 8. Crea una clase Worker que reciba nombre y salario, y un método para mostrar su salario.
        Worker paco = new Worker("Paco", 1500);
        paco.getSalario();

        // 9. Crea varios objetos Person y guárdalos en un ArrayList.
        Person maria = new Person("Maria", 56);
        Person merche = new Person("Merche", 22);
        Person antonio = new Person("Antonio", 12);
        Person teresa = new Person("Teresa", 34);

        ArrayList<Person> personas = new ArrayList<>();
        personas.add(maria);
        personas.add(merche);
        personas.add(antonio);
        personas.add(teresa);

        for (Person persona : personas) {
            System.out.println(persona.name + ", que tiene " + persona.age);
        }

        // 10. Crea una clase Product y un método que aplique un descuento sobre su precio.
        Product naranja = new Product("Naranja", 3.0);
        Product vino = new Product("Vino", 50.0);
        naranja.discount(50);
        vino.discount(20);











    }
}