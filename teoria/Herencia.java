public class Herencia {





    public static void main(String[] args) {

        Animal animal = new Animal("Mi animal");
        animal.comer();


        Perro perro = new Perro("Rodolfo");
        perro.comer();
        //nombre y comer vienen de Animal

        Gato gato = new Gato("Misifú");
        gato.comer();
        //nombre y comer vienen de Animal

        Pajaro pajaro = new Pajaro("Agustín");
        pajaro.comer();
        pajaro.volar();



    }




    public static class Animal {

        String nombre;

        public Animal(String nombre) {
            this.nombre = nombre;
        }

        public void comer() {
            System.out.println("El animal con nombre " + nombre + " está comiendo");
        }



    }


    public static class Perro extends Animal {

        public Perro(String nombre) {
            super(nombre);
        }

        @Override  //sobreescribe/especializa la comer() de la heredada
        public void comer() {
            System.out.println("El perro con nombre " + nombre + " está comiendo");
        }

    }


    public static class Gato extends Animal {

        public Gato(String nombre) {
            super(nombre);
        }

        @Override  //sobreescribe/especializa la comer() de la heredada
        public void comer() {
            System.out.println("El gato con nombre " + nombre + " está comiendo");
        }

    }


    public static class Pajaro extends Animal {

        public Pajaro(String nombre) {
            super(nombre);
        }

        @Override  //sobreescribe/especializa la comer() de la heredada
        public void comer() {
            System.out.println("El pájaro con nombre " + nombre + " está comiendo");
        }

        public void volar() {
            System.out.println(nombre + " está volando");
        }
    }







}
