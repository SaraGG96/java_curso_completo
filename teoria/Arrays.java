public class Arrays {
    public static void main(String[] args) {
        
        //declaración
        int[] numbers = new int[3];
        System.out.println(numbers);

        String[] names = {"Patricio", "Lucas", "Marisa", "Manola", "Pepe"};
        System.out.println(names);

        //acceso
        System.out.println(names[0]);
        System.out.println(numbers[0]);

        //meter datos
        numbers[0] = 5;
        numbers[1] = 15;
        numbers[2] = 25;
        numbers[3] = 35;  //no se puede, reservaste 3
        System.out.println(numbers[0]);

        //eliminar datos
        numbers[0] = 0;
        // puedes poner valor null, pero nunca
        // "des-reservar" el hueco que le mandas a memoria










    }
}
