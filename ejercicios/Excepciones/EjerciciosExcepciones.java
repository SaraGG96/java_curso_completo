import java.lang.reflect.Array;

public class EjerciciosExcepciones {
    public static void main(String[] args) {




        // 1. Divide dos números almacenados en dos variables. Maneja la división por cero con try-catch.
        int num1 = 2;
        int num2 = 4;

        try {
            System.out.println(num1 + num2 / 0);
        } catch (ArithmeticException e) {
            System.out.println("Error, división por 0");
        }


        // 2. Crea un array de 3 elementos e intenta acceder al índice 5. Captura el ArrayIndexOutOfBoundsException.

        int[] ej2 = {1, 2, 3};
        
        try {
            System.out.println(ej2[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("No existe el index");
        }

        // 3. Crea una variable String nula e intenta imprimir su longitud. Maneja el NullPointerException.

        String ej3 = null;

        try {
            System.out.println(ej3.length());
        } catch (NullPointerException e) {
            System.out.println("No tiene una longitud, es nulo");
        }

        // 4. Escribe una función que transforma texto a número. Usa try-catch para manejar entradas no válidas (NumberFormatException).

        String ej4 = "Hola";

        try {
            int num = Integer.parseInt(ej4);
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println("No es un número válido");
        }

        // 5. Escribe un programa con un bloque finally que se ejecute siempre, haya o no error.

        int[] ej5 = {1, 2, 3};
        
        try {
            System.out.println(ej5[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("No existe el index");
        } finally {
            System.out.println("Y hasta aquí llegamos");
        }

        // 6. Usa throw para lanzar un IllegalArgumentException si un número introducido es negativo.

        int ej6 = 6;

        if (ej6 < 0) {
            throw new IllegalArgumentException("El número no debe ser negativo");
        } else {
            System.out.println("El número seleccionado es positivo");
        }

        // 7. Crea una clase TemperatureChecker que lanza una excepción personalizada si la temperatura es menor a -50 o mayor a 50.

        TemperatureChecker olla = new TemperatureChecker(-50);

        try {
            olla.checkTemperature();
        } catch (TemperatureOutOfRange e) {
            System.out.println(e.getMessage());
        }

        // 8. Crea un programa con varios bloques catch: uno para ArithmeticException, otro para ArrayIndexOutOfBoundsException.

        try {
            System.out.println(ej5[2]);
            System.out.println(num1 + num2);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("No existe el index.");
        }
        catch (ArithmeticException e) {
            System.out.println("No se divide entre cero, animal.");
        }

        // 9. Crea una función checkPassword(String pass) que lance una excepción si la contraseña es demasiado corta.

        PasswordChecker passchecker = new PasswordChecker();
        
        try {
            passchecker.checkPassword("Mememe");
        } catch (PasswordisTooShort e) {
            System.out.println(e.getMessage());
        }

        // 10. Implementa una clase LoginSystem que use una excepción personalizada LoginFailedException si el usuario o contraseña son incorrectos.
        LoginSystem login = new LoginSystem();

        try {
            login.userLogin("Manolo", "Manolo123");
        } catch (LoginFailedException e) {
            System.out.println(e.getMessage());
        }












    }
}