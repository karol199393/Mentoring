import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Zad18  {
    public static void main(String[] args) {
        HashMap<String,String> mapSong=new HashMap<>();
        mapSong.put("The Sensual World","Kate Bush");
        mapSong.put("Shaday","OfraHaza");
        mapSong.put("AchtungBaby","U2");
        mapSong.put("Aion","DeadCanDance");
        mapSong.put("InvisibleTouch","Genesis");

        System.out.println("1/Dodaj nowe albumy do mapy 2/Koniec");
        Scanner scanner=new Scanner(System.in);
        int liczba=scanner.nextInt();
        String pierwszyS=scanner.next();
        String drugiS=scanner.next();
        switch (liczba) {
            case 1:
                mapSong.put(pierwszyS,drugiS);
            case 2:
                break;
        }
        for (Map.Entry<String,String>entry:mapSong.entrySet()) {
        System.out.println(mapSong);
    }
}}
