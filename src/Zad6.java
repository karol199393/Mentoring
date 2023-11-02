import java.util.Scanner;

public class Zad6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę całkowitą");
        int n = scanner.nextInt();

        double potegadwojki = Math.pow(2, n);
        System.out.println(potegadwojki);
    }
}
