import java.util.ArrayList;

public class LoopsExercises {

    public static void main(String[] args) {


        // 1. Imprime los números del 1 al 10 usando while.
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }


        // 2. Usa do-while para mostrar todos los valores de un ArrayList.
       ArrayList<String> ejercicio2 = new ArrayList<String>();
       ejercicio2.add("Manolo");
       ejercicio2.add("Paco");
       ejercicio2.add("Benito");
       ejercicio2.add("Pablete");
       System.out.println(ejercicio2);

       i = 0;
        do {
            System.out.println(ejercicio2.get(i));
            i++;
        } while (i < ejercicio2.size());


        // 3. Imprime los múltiplos de 5 del 1 al 50 usando for.
        for (int number = 0; number <= 50; number += 5) {
            System.out.println(number);
        };


        // 4. Recorre un Array de 5 números e imprime la suma total.
        int[] ejercicio4 = {2, 7, 8, 9, 12};
        System.out.println(ejercicio4[0] + ejercicio4[1] + ejercicio4[2] + ejercicio4[3] + ejercicio4[4]);

        // 5. Usa un for para recorrer un Array y mostrar sus valores.
        for (int valor: ejercicio4) {
            System.out.println(valor);

        };

        // 6. Usa for-each para recorrer un HashSet y un HashMap.
        

        // 7. Imprime los números del 10 al 1 (descendiente) con un bucle for.

        // 8. Usa continue para saltar los múltiplos de 3 del 1 al 20.

        // 9. Usa break para detener un bucle cuando encuentres un número negativo en un array.

        // 10. Crea un programa que calcule el factorial de un número dado.
    }
}