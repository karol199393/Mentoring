import java.util.*;

public class Zad20 {
    public static void main(String[] args) {
        List<String> listaKolorow = new ArrayList<>();
        listaKolorow.add("zielony");
        listaKolorow.add("czerwony");
        listaKolorow.add("niebieski");
        listaKolorow.add("czarny");
        listaKolorow.add("fioletowy");
        listaKolorow.add("granatowy");
        listaKolorow.add("niebieski");
        listaKolorow.add("czarny");
        listaKolorow.add("czarny");
        listaKolorow.add("zielony");
        listaKolorow.add("cytrynowy");
        listaKolorow.add("granatowy");
        listaKolorow.add("niebieski");
        listaKolorow.add("indygo");
        listaKolorow.add("zielony");
        listaKolorow.add("czerwony");
        System.out.println(listaKolorow.size());
        Set<String> zbior=new HashSet<>(listaKolorow);
        System.out.println(listaKolorow.size());

        //Wyswietl każdy z elementow zbioru w odzielnej liniii
        for(String element:listaKolorow)
        {
            System.out.println(element);
        }

        //Liczenie ile kolorow zostało użytych,Ale jak policzyc kolory które się powtarzają??
        listaKolorow.size();

        //Dodaj cos do zbioru

        zbior.add("purpurowy");
        for(String element:zbior)
        {
            System.out.println(element);
        }
        //Usun jakis kolor
        zbior.remove("purpurowy");
        for(String element:zbior)
        {
            System.out.println(element);
        }
    }
}
