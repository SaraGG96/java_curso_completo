public class Student {
    
    String name;
    int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public void hasPassed() {
        if (this.score > 60) {
            System.out.println("Está aprobado");
        } else {
            System.out.println("Está suspenso");
        }
    }
}
