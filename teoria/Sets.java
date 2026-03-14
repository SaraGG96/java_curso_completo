import java.util.HashSet;

public class Sets {
    public static void main(String[] args) {
        
        //declaración
        var names = new HashSet<String>();

        //operaciones
        names.add("Sara");
        names.add("Benito");
        names.add("Pepe");
        names.add("Zariguella");
        System.out.println(names);
        System.out.println(names.size());
        // es desordenado, la manera en la que mete elementos
        // es mediante hash, no por orden de entrada

        names.remove("Zariguella");
        System.out.println(names);  
        // no va por index, sino por el elemento exacto
        // con las listas sólo le decías el index

        //comprobación
        if (names.contains("Sara")) {
            System.out.println("Sara está en la lista.");
        } else {
            System.out.println("Sara no está.");
        };

        //elementos únicos
        names.add("Sara");
        names.add("Benito");
        names.add("Benito");
        names.add("Benito");
        names.add("Pepe");
        names.add("Zariguella");
        System.out.println(names);
        System.out.println(names.size());
        // si ya existe el elemento, no va a añadirlo de nuevo
        // los sets no almacenan duplicados


        //trabajo con conjuntos
        var countries = new HashSet<String>();
        countries.add("España");
        countries.add("Francia");
        countries.add("Argentina");
        countries.add("Alemania");
        countries.add("Italia");
        countries.add("Rusia");
        System.out.println(countries);
        System.out.println(countries.size());

        countries.addAll(names);  //volcamos names a countries
        System.out.println(countries); //ahora tiene todo
        System.out.println(countries.size());     
        
        countries.removeAll(names);
        System.out.println(countries); //ahora le quitaste nombres
        System.out.println(countries.size());            

        countries.retainAll(names);
        System.out.println(countries); //retiene SÓLO los elementos comunes
        System.out.println(countries.size());    





    }
}
