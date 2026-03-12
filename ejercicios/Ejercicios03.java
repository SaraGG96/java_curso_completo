public class Ejercicios03 {
    public static void main(String[] args) {
         

        // 2. Crea una variable para cada tipo de operación de asignación.
        int a = 5;
        a += 1;
        a -= 1;
        a /= 1;
        a *= 1;
        a %= 1;
        
        // 3. Imprime 3 comparaciones verdaderas con diferentes operadores de comparación.

        System.out.println(1 == 1);
        System.out.println(2 > 1);
        System.out.println(3 - 1 < 6);


        // 4. Imprime 3 comparaciones falsas con diferentes operadores de comparación.

        System.out.println(3 == 4);
        System.out.println(3 >= 4);
        System.out.println(4 <= 3);

        // 7. Combina ambos operadores lógicos.
        System.out.println((1 == 1) && (2 > 1));

        // 8. Añade alguna negación.

        System.out.println(!true);


        // 9. Imprime 3 ejemplos de uso de operadores unarios.
        int unario = 5; 
        System.out.println(-unario);
        System.out.println(unario++);
        System.out.println(unario);


        // 10. Combina operadores aritméticos, de comparación y lógicos.
        int x = 5;
        int y = 10;
        System.out.println((x < y) && (x > 0));


    }
}
