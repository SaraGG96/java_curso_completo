import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

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
        Map<Integer, Integer> maps = Map.of(
            10, 1,
            20, 2,
            30, 3,
            40, 4,
            50, 5
        );

        Set<Integer> sets = Set.of(
            1,
            2,
            3,
            4,
            5
        );

        for (Map.Entry<Integer, Integer> map: maps.entrySet()) {
            System.out.println(map);
        }

        for (Integer set: sets) {
            System.out.println(set);
        }


        // 7. Imprime los números del 10 al 1 (descendiente) con un bucle for.
        for (int ej7 = 10; ej7 >= 1; ej7 -= 1) {
            System.out.println(ej7);
        }

        // 8. Usa continue para saltar los múltiplos de 3 del 1 al 20.
        for (int ej8 = 0; ej8 <= 20; ej8 += 1) {
            if (ej8 % 3 == 0) {
                continue;
            }
            System.out.println("ejercicio8: " + ej8);
        }

        // 9. Usa break para detener un bucle cuando encuentres un número negativo en un array.
        int[] ej9 = {1, -1, 2, -2, 3, -3, 4, -4, 5, -5};

        // 8. Usa continue para saltar los múltiplos de 3 del 1 al 20.
        for (int numero: ej9) {
            if (numero < 0) {
                break;
            }
            System.out.println("ejercicio9: " + numero);
        }

        // 10. Crea un programa que calcule el factorial de un número dado.
        int factorial = 1;
        for (int ej10 = 1; ej10 <= 5; ej10++) {
            factorial *= ej10;
        }
        System.out.println("Factorial de 5: " + factorial);

 
    }
}