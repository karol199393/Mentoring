import java.util.Random;
import java.util.Scanner;

public class Zad14 {
    public static void main(String[] args) {

        System.out.println("Ile liczb chcesz wylosować");
        Scanner scanner = new Scanner(System.in);
        Random generator = new Random();
        int liczba=scanner.nextInt();
        int sumadodatnich=0;
        int sumaujemnych=0;
        int max=0;
        int min=0;

        for(int i=0;i<liczba;i++)
        {
            int losowaLiczba = generator.nextInt(201) - 100;
            System.out.println(losowaLiczba);
            if(losowaLiczba>0){
                sumadodatnich=sumadodatnich+1;
                System.out.println("Liczby dodatnie " +sumadodatnich);
            }
            if(losowaLiczba<0)
            {
                sumaujemnych=sumaujemnych+1;
                System.out.println("Liczby ujemne " +sumaujemnych);
            }
            if(max<losowaLiczba)
            {
                max=losowaLiczba;
                System.out.println("Wartość maksymalna " +max);
            }

            if(min>losowaLiczba)
            {
                min=losowaLiczba;
                System.out.println("Wartość minimalna " +min);
            }

        }



    }
}
