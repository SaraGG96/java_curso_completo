import java.util.HashMap;

public class Maps {
    public static void main(String[] args) {
        
        //declaración
        var names = new HashMap<String, Integer>();
        System.out.println(names.size());

        //modificación
        names.put("Sara", 5);
        names.put("Manolo", 5);
        names.put("Benito", 5);
        names.put("Pepe", 5);
        System.out.println(names.size());
        System.out.println(names);

        //acceso
        System.out.println(names.get("Sara"));

        //verificación
        System.out.println(names.containsKey("Benito"));
        System.out.println(names.containsValue(5));

        //eliminación
        names.remove("Pepe");
        System.out.println(names);

        //limpieza
        names.clear(); //se carga las key/value pero el map sigue existiendo
        System.out.println(names);





    }
}
