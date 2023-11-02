import java.util.Scanner;

public class Zad8 {
    public static void main(String[] args) {
        int suma = 0;
        int poprzedniaSuma = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Wprowadź liczby całkowite. Suma zostanie zaktualizowana po wprowadzeniu każdej liczby.");


        while (true) {
            System.out.print("Wprowadź liczbę całkowitą: ");
            int liczba = scanner.nextInt();

            suma += liczba;

            if (suma > poprzedniaSuma) {
                poprzedniaSuma = suma;
            } else {
                break; // Zakończ pętlę, gdy suma nie zwiększa się
            }
        }

        System.out.println("Ostateczna suma: " + poprzedniaSuma);
    }
}
