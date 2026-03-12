public class Operadores {
    public static void main(String[] args) {
        
        //Arigméticos
        var a = 5;
        var b = 3;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);


        //Asignación

        a = b;
        System.out.println(a);

        a = b * 2;
        System.out.println(a);

        a += 1; // a = a + 1

        a += 1;
        System.out.println(a);

        a -= 1;
        System.out.println(a);

        a *= 1;
        System.out.println(a);

        a /= 1;
        System.out.println(a);

        a %= 1;
        System.out.println(a);

        //Comparación
        System.out.println(a == a);
        System.out.println(a == 0);
        System.out.println(a != b);

        System.out.println(a > a);
        System.out.println(a >= 0);
        System.out.println(a < b);
        System.out.println(a <= b);

        // AND
        System.out.println(true && true);
        System.out.println(false && true);
        System.out.println(false && false);

        // OR
        System.out.println(true || true);
        System.out.println(false || true);
        System.out.println(false || false);

        // NOT
        System.out.println(!true);
        System.out.println(!false);
        System.out.println(!(3 > 2 || 5 == 2));


        // Unarios
        System.out.println(+b);
        System.out.println(-b);
        System.out.println(++b); //incrementa, luego imprime
        System.out.println(b++); //imprime, luego incrementa
        System.out.println(b);


    }
    
}
