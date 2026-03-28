import java.util.ArrayList;
import java.util.List;

public class FunctionsExercises {



        // 1. Crea una función que imprima "¡Te doy la bienvenida al curso de Java desde cero!".

        public static void ejercicio1() {
            System.out.println("Te doy la bienvenida bla bla");
        }

        // 2. Escribe una función que reciba un nombre como parámetro y salude a esa persona.
        public static void ejercicio2(String nombre) {
            System.out.println("Saludos, " + nombre);
        }

        // 3. Haz un método que reciba dos números enteros y devuelva su resta.
        public static void ejercicio3(int numero1, int numero2) {
            System.out.println(numero1 - numero2);
        }

        // 4. Crea un método que calcule el cuadrado de un número (n * n).
        public static void ejercicio4(int numero) {
            System.out.println(numero * numero);
        }

        // 5. Escribe una función que reciba un número y diga si es par o impar.
        public static void ejercicio5(int numero) {
            if (numero % 2 == 0) {
                System.out.println("Es par");
            } else {
                System.out.println("NO es par");
            }
        }

        // 6. Crea un método que reciba una edad y retorne true si es mayor de edad (y false en caso contrario).
        public static boolean ejercicio6(int edad) {
            if (edad >= 18) {
                return true;
            } else {
                return false;
            }
        }

        // 7. Implementa una función que reciba una cadena y retorne su longitud.
        public static int ejercicio7(String cadena) {
            return cadena.length();
        }

        //  8. Crea un método que reciba un array de enteros, calcula su media y lo retorna.
        public static int ejercicio8(int[] enteros) {
            int total = 0;
            for (int numero: enteros) {
                total += numero;
            }
            return total / enteros.length;
        }

        // 9. Escribe un método que reciba un número y retorna su factorial.
        public static int ejercicio9(int numero) {
            int factorial = 1;
            for (int i = 1; i <= numero; i++) {
                factorial = i  * factorial;
            }
            return factorial;
        }

        // 10. Crea una función que reciba un ArrayList<String> y lo recorra mostrando cada elemento.
        public static void ejercicio10(ArrayList<String> array) {
            for (String nombre: array) {
                System.out.println(nombre);
            }
        }


        public static void main(String[] args) {
            ejercicio1();
            ejercicio2("Sara");
            ejercicio3(5,2);
            ejercicio4(10);
            ejercicio5(13);
            System.out.println(ejercicio6(12));
            System.out.println(ejercicio7("Esdrújula"));
            int[] enteros = {1,2,3,4,5};
            System.out.println(ejercicio8(enteros));
            System.out.println(ejercicio9(5));
            ArrayList<String> array = new ArrayList<String>(List.of("Pepe","Benito","Alfonso"));
            ejercicio10(array);
        }








    }
