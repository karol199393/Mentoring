import java.util.Scanner;

public class Zad10 {
    public static void main(String[] args) {

        //Mentor pomoc ??
        double startowyPoziomPaliwa=0;
        int iloscAstronautow=0;
        double wysokoscGdzieRakieta=0;
        Scanner scanner = new Scanner(System.in);
        do {
        System.out.print("Wprowadź początkową ilość paliwa: ");
        startowyPoziomPaliwa=scanner.nextDouble(); }
        while(startowyPoziomPaliwa <5000 && startowyPoziomPaliwa>30000);
        {
            System.out.println(startowyPoziomPaliwa);
        }
        do {
            System.out.print("Wprowadź liczbę astronautów ");
            iloscAstronautow=scanner.nextInt();
        }
        while(iloscAstronautow<0 && iloscAstronautow>=7);
        {
            System.out.println(iloscAstronautow);
        }
        //Symulacja lotu
        System.out.println("Podaj wysokosc na jakiej sie znajduje statek");
        wysokoscGdzieRakieta=scanner.nextDouble();
        double przebytyDystans=0;
        for(double i=wysokoscGdzieRakieta;i>=0;i=i-100)
        {
            double zuzyciePaliwa=300*100*iloscAstronautow;

            System.out.println(wysokoscGdzieRakieta);
        }

        }
    }



