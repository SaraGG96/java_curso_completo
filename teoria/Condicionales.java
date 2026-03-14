public class Condicionales {
    public static void main(String[] args) {
        
        //if, else, else if
        var age = 18;
        var name = "Sara";

        if (age > 18) {
        System.out.println("El usuario es mayor de edad");
        } else if (age == 18) {
        System.out.println("Acaba de cumplir la mayoría");
        } else {
        System.out.println("El usuario es menor de edad");
        };

        //switch
        var day = 10;
        switch(day) {

            case 1:
            System.out.println("Lunes");
            break;

            case 2:
            System.out.println("Martes");
            break;

            case 3:
            System.out.println("Miércoles");
            break;

            default:
            System.out.println("No es ni Lunes, ni Martes, ni Miércoles");

        }













    }
}
