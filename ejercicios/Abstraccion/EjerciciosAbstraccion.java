package Abstraccion;

public class EjerciciosAbstraccion {
    
    public static void main(String[] args) {


        // 1. Crea una clase abstracta Shape con el método calculateArea(). Luego implementa dos subclases: Circle y Rectangle, y haz que cada una calcule su propia área.
        Rectangle rectangle = new Rectangle();
        Circle circle = new Circle();

        rectangle.area();
        circle.area();

        // 2. Crea una interfaz Playable con el método play(). Luego implementa esa interfaz en dos clases: Guitar y Piano. Cada una debe mostrar un mensaje diferente al ejecutarse.
        Guitar guitar = new Guitar();
        Piano piano = new Piano();

        piano.play();
        guitar.play();

        // 3. Define una clase abstracta Animal con el método makeSound(). Implementa Dog y Cat para que hagan sonidos distintos. Crea un array de Animal para mostrar polimorfismo.
        Animal[] animales = new Animal[2];
        animales[0] = new Dog();
        animales[1] = new Cat();
        for (Animal animal : animales) {
            animal.makeSound();
        }
        

        // 4. Crea una interfaz Drawable. Implementa las clases Circle, Square, y Triangle que muestren cómo se dibuja cada figura usando draw().
        Circledraw circledraw = new Circledraw();
        Squaredraw squaredraw = new Squaredraw();

        circledraw.draw();
        squaredraw.draw();

        // 5. Crea una clase abstracta Employee con un método calculateSalary(). Implementa FullTimeEmployee y PartTimeEmployee con lógica diferente para calcular el salario.
        PartTimeEmployee manolo = new PartTimeEmployee();
        FullTimeEmployee paco = new FullTimeEmployee();

        manolo.calculateSalary();
        paco.calculateSalary();



        // 6. Crea una interfaz Movable con el método move(). Haz que las clases Car y Robot implementen ese método con comportamientos diferentes.
        Car car = new Car();
        Robot robot = new Robot();

        car.move();
        robot.move();


        // 7. Crea una clase abstracta Appliance con método turnOn() y turnOff(). Implementa TV y WashingMachine con mensajes diferentes al encender y apagar.
        TV tv = new TV();
        WashingMachine lavadora = new WashingMachine();

        tv.turnOn();
        tv.turnOff();
        lavadora.turnOn();
        lavadora.turnOff();

        // 8. Crea dos interfaces Flyable y Swimmable. Crea una clase Duck que implemente ambas interfaces y muestre cómo puede volar y nadar.
        Duck duck = new Duck();

        duck.fly();
        duck.swim();


        // 9. Crea una clase abstracta Document con el método print(). Luego crea PDFDocument y WordDocument, cada una con su forma de imprimir.
        PDFDocument pdf = new PDFDocument();
        WordDocument word = new WordDocument();

        pdf.print();
        word.print();

        // 10. Crea una interfaz Payable con el método pay(). Luego implementa las clases Invoice y EmployeePayment, cada una mostrando un mensaje de pago diferente.
        Invoice invoice = new Invoice();
        EmployeePayment employeePayment = new EmployeePayment();

        invoice.pay();
        employeePayment.pay();


    }


}
