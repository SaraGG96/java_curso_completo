package Extras;
import Extras.UnaClase;
import java.util.Random;

public class ExtrasExercises {

    static String message = "Mensaje global";
    public static void main(String[] args) {

        // 1. Crea una variable de tipo String inicializada como null y verifica que no esté vacía antes de usarla.
        String ej1 = null;

        if (ej1 != null) {
            System.out.println("La variable no está vacía: " + ej1);
        } else {
            System.out.println("La variable está vacía o es null.");
        }


        // 3. Declara una constante final llamada MAX_SCORE con valor 100 y muéstrala.

        final int MAX_SCORE = 100;
        System.out.println(MAX_SCORE);

        // 4. Crea una variable global message y otra local message dentro del método main(). Muestra ambas.

        String message = "Mensaje local";
        System.out.println(message);
        System.out.println(ExtrasExercises.message);


        // 6. Declara una variable static en una clase y accede a ella desde main() sin crear un objeto.

        System.out.println(UnaClase.unaVariable);

        // 7. Importa java.util.Random y genera un número aleatorio del 1 al 10.

        Random random = new Random();
        int numeroAleatorio = random.nextInt(10) + 1;
        System.out.println(numeroAleatorio);

        // 9. Define una clase User con una constante APP_NAME, una variable global username y una función que imprima ambas.

        User user = new User();
        user.getData();

        
    }


}
