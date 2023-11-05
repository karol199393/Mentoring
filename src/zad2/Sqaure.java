package zad2;

public class Sqaure extends Shape {
    float lenght;

    public Sqaure(float lenght) {
        this.lenght = lenght; // Popraw przypisanie do pola
    }

    @Override
    public int calcArea() {
        return (int) (lenght * lenght); // Oblicz pole kwadratu na podstawie długości boku
    }

    public static void main(String[] args) {
        Sqaure square = new Sqaure(4);
        int area = square.calcArea();
        System.out.println("Pole kwadratu: " + area);
    }
}
