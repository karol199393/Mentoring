import java.util.Scanner;

public class Zad3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Podaj liczbę całkowitą");
        int y=scanner.nextInt();

        for(int i=0;i<=y;i++)
        {
            System.out.println(i);
        }


        int i=0;
        while(i<=y)
        {
            System.out.println(i);
            i++;
        }

    }
}
