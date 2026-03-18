import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Bucles {
    public static void main(String[] args) {
        
        //BUCLE FOR

        for (int counter = 0; counter < 5; counter++) {
            System.out.println("Hola, Java");
        };
        //creamos el contador , "hasta cuando se repite" , "cómo aumenta en cada bucle"



        String[] names = {"Sara", "Pepe", "Benito", "Oscar"};

        for (int index = 0; index < names.length; index++) {
            System.out.println(names[index]);
        };        
        //counter < names.length, se repite hasta "número de longitud de names" veces
        //si la lista se modifica, se asegura de que siempre printe todo


        for (String name: names) {
            System.out.println(name);
        };  
        //for each, ideal para estructuras




        var numbers = new HashSet<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        for (Integer number: numbers) {
            System.out.println(number);
        };  


        var emails = new HashMap<String, String>();
        emails.put("Sara", "correosara@gmail.com");
        emails.put("Jorge", "correojorge@gmail.com");
        emails.put("Pepe", "correopepe@gmail.com");
        emails.put("Benito", "correobenito@gmail.com");
        emails.put("Paco", "correopaco@gmail.com");


        for (Map.Entry<String, String> email: emails.entrySet()) {
            System.out.println(email);
        };  
        // para maps, hay que traducir los pares a map.entry

        for (Map.Entry<String, String> email: emails.entrySet()) {
            System.out.println(email.getKey());
        };  
        // sólo la key

        for (Map.Entry<String, String> email: emails.entrySet()) {
            System.out.println(email.getValue());
        };  
        // sólo la value






        //BUCLE WHILE

        int index = 0;
        while (index < 5) {
            System.out.println("Hola, Java");
            index++;
        };

        index = 0;
        boolean find = false;
        while (find == false) {
            System.out.println(names[index]);
            if (names[index] == "Sara") {
                find = true;
            }
            index++;
        };
        // hasta que encuentra "Sara"


        //BUCLE DO-WHILE: como while, 
        // pero la primera vez se ejecuta siempre

        index = 0;
        do {
            System.out.println("Hola, Java");
            index++;
        } while (index < 5);

        for (String name: names) {
            if (name.equals("Sara")) {
                break;
            }
            System.out.println(name);
        }

        //continue

        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println(i);
        };

























    }
}
