import java.util.ArrayList;
import java.util.Scanner;

public class Zad13 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ArrayList<String> Lista=new ArrayList<>();
        String slowo;
        do {
            System.out.println("Podaj słowo");
            slowo=scanner.next();
            Lista.add(slowo);
            System.out.println(Lista);
        }
        while(!slowo.equals("STOP"));


    }
}
