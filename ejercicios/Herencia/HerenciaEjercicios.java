package Herencia;

import java.util.ArrayList;
import java.util.List;

public class HerenciaEjercicios {

    public static void main(String[] args) {

    // 1. Crea una clase Vehicle con un método move(). Luego crea una subclase Car que herede de Vehicle y agrega el método honk().
    Car car1 = new Car();
    car1.move();
    car1.honk();

    // 2. Define una clase Person con los atributos name y age. Luego crea una clase Student que agregue el atributo grade y un método study().
    Student student1 = new Student();
    student1.name = "Paco";
    student1.study();

    // 3. Crea una clase Animal con el método makeSound(). Haz que Dog diga “Woof” y Cat diga “Meow” sobrescribiendo ese método.
    Animal animal = new Animal();
    Gato gato = new Gato();
    Perro perro = new Perro();
    Pez pez = new Pez();

    animal.makeSound();
    gato.makeSound();
    perro.makeSound();
    pez.makeSound();

    // 4. La clase Employee tiene los atributos name y salary. Manager hereda de Employee y agrega el atributo department.
    Employee pepe = new Employee();
    System.out.println(pepe.name);
    System.out.println(pepe.salary);

    Manager antonio = new Manager();
    System.out.println(antonio.name);
    System.out.println(antonio.salary);
    System.out.println(antonio.department);

    // 5. Crea una clase abstracta Shape con un método calculateArea(). Luego implementa ese método en Circle y Rectangle.
    Rectangle rectangle = new Rectangle();
    Circle circle = new Circle();

    circle.calculateArea();
    rectangle.calculateArea();

    // 6. Crea una clase Bird con el método fly(). Luego crea Eagle que sobrescriba fly() pero también llame al método original con super.fly().
    Eagle eagle = new Eagle();
    eagle.fly();

    // 7. Haz una clase Device con un constructor que imprima “Device created”. Luego crea Phone que herede de Device y en su constructor imprima “Phone ready”.
    Device device = new Device();
    Phone phone = new Phone();

    // 8. Account tiene un saldo y métodos para deposit() y withdraw(). SavingsAccount hereda y agrega un método addInterest().
    SavingsAccount savings = new SavingsAccount();
    savings.addInterests();

    // 9. Crea una clase Vehicle y tres subclases: Car, Bike y Truck, cada una con un método describe() sobrescrito.
    Vehicle vehicle = new Vehicle();
    Car car = new Car();
    Bike bike = new Bike();
    Truck truck = new Truck();

    vehicle.describe();
    car.describe();
    bike.describe();
    truck.describe();

    // 10. Crea un ArrayList<Animal> que contenga instancias de Dog, Cat y Bird. Recorre la lista y llama a makeSound().
    ArrayList<Animal> animales = new ArrayList<>(List.of(perro, gato, pez));
    for (Animal individuo: animales) {
        individuo.makeSound();
    }

    }






























}
