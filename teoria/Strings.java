public class Strings {
    public static void main(String[] args) {
        
        //Cadenas de texto
        String name = "Marmota";
        var surname = new String("Caballo"); //redundante

        //operaciones
        System.out.println(name + " " + surname);
        System.out.println(name.length());
        System.out.println(name.charAt(name.length() - 1));
        System.out.println(name.substring(1,3));

        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name); //no se guardó, sigue siendo Marmota

        //comprobar si contiene
        System.out.println("Hola, Java".contains("Java"));

        //comparar
        System.out.println(name.equals("Marmota"));
        System.out.println(name.equals("marmota"));
        System.out.println(name.equalsIgnoreCase("marmota"));

        //reemplazo, trim, format
        System.out.println(" Hola, buenos dias ".trim()); //limpia
        System.out.println(" Hola, buenos dias ".replace(" ","")); //reemplaza
        var age = 33;
        System.out.println(String.format("Hola, %s %d", name, age));
        















    }
}
