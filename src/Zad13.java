import java.util.Scanner;

public class Zad13 {
    public static void main(String[] args) {




     System.out.print("1/Ilość kursantów /2 Nazwa Firmy /3 Rok zalozenia firmy 4/ Wyjdz");

     Scanner scanner = new Scanner(System.in);
     int liczba=scanner.nextInt();
     switch(liczba) {
        case 1:
         System.out.println("70");
         break;

         case 2:
             System.out.println("Devs-Mentoring.pl");
             break;
         case 3:
             System.out.println("2021");
             break;
         case 4:
             break;

    }

} }
