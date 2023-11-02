import java.util.Scanner;

public class Zad7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę całkowitą");
        int k = scanner.nextInt();
        for(int i=50;i<=100;i++)
        {  if(i%k==0)
            System.out.println(i);
        }
    } }
