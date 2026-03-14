import java.util.ArrayList;

public class Listas {
    public static void main(String[] args) {
        
        //declaración
        ArrayList<String> names = new ArrayList<String>();  //clásica
        var numbers = new ArrayList<Integer>();             //moderna

        //añadir
        names.add("Sara");
        names.add("Benito");
        names.add("Pepe");
        names.add("Zariguella");
        System.out.println(names);
        System.out.println(names.size());
        System.out.println(names.getFirst());
        System.out.println(names.getLast());
        System.out.println(names.get(1)); //mejor opción

        names.set(2, "Manola"); //modificas
        System.out.println(names.get(2)); 

        names.remove(1);
        System.out.println(names);  
        // si nos cargamos el index por el medio
        // los siguientes ocupan su lugar 
        // si te cargas el último, se limpia
        // su espacio en memoria (a diferencia del array)

        //comprobación
        if (names.contains("Sara")) {
            System.out.println("Sara está en la lista.");
        } else {
            System.out.println("Sara no está.");
        };













    }
}
