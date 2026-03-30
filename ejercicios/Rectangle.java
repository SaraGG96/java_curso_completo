public class Rectangle {

    int ladoA;
    int ladoB;
    int ladoC;
    int ladoD;

    public Rectangle(int ladoA, int ladoB, int ladoC, int ladoD) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
        this.ladoD = ladoD;
    }

    public void getPerimeter() {
        System.out.println(this.ladoA + this.ladoB + this.ladoC + this.ladoD);
    }

    public void getArea() {
        System.out.println(ladoA * ladoB);
    }


}   
