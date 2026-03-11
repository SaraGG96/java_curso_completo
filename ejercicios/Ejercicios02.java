public class Ejercicios02 {
    public static void main(String[] args) {
        
        // 1. Declara una variable de tipo String y asígnale tu nombre.
        var nameA = "Sara";
        System.out.println(nameA);

        String nameB = "Sara";
        System.out.println(nameB);

        // 2. Crea una variable de tipo int y asígnale tu edad.
        var ageA = 29;
        System.out.println(ageA);

        int ageB = 29;
        System.out.println(ageB);

        // 3. Crea una variable double con tu altura en metros.
        var heightA = 1.80;
        System.out.println(heightA);

        double heightB = 1.80;
        System.out.println(heightB);

        // 4. Declara una variable de tipo boolean que indique si te gusta programar.
        var programmingA = false;
        System.out.println(programmingA);

        boolean programmingB = false;
        System.out.println(programmingB);

        // 5. Declara una constante con tu email.
        final String email = "correo@gmail.com";
        System.out.println(email);

        // 6. Crea una variable de tipo char y guárdale tu inicial.
        char initial = 'a';
        System.out.println(initial);


        // 7. Declara una variable de tipo String con tu localidad, y a continuación cambia su valor y vuelve a imprimirla.
        String city = "Vigo";
        city = "París";
        System.out.println(city);

        // 8. Crea una variable int llamada a, otra b, e imprime la suma de ambas.
        int a = 2;
        int b = 7;
        System.out.println(a + b);
        
        // 9. Imprime el tipo de dos variables creadas anteriormente.
        System.out.println("La variable city es:" + " " + city.getClass());



    }
}
