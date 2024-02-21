import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Zad17 {
    public static void main(String[] args) {

        //Mentor pomoc

        HashMap<String,String> mapSong=new HashMap<>();
        mapSong.put("The Sensual World","Kate Bush");
        mapSong.put("Shaday","OfraHaza");
        mapSong.put("AchtungBaby","U2");
        mapSong.put("Aion","DeadCanDance");
        mapSong.put("InvisibleTouch","Genesis");

        for(Map.Entry<String,String> entry:mapSong.entrySet() ){
            String klucz = entry.getKey();
            String wartosc = entry.getValue();
            System.out.println("Klucz: " + klucz + ", Wartość: " + wartosc); }

        System.out.println("Podaj wartość");
        Scanner scanner=new Scanner(System.in);
        String pobranyKlucz=scanner.next();
        if(pobranyKlucz.equals(mapSong.containsValue(pobranyKlucz)))
        {
            System.out.println("wykonawca albumu" +mapSong.toString());
        }

    }

}
