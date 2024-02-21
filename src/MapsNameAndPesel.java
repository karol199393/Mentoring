import java.util.HashMap;

public class Zad16 {
    public static void main(String[] args) {
        HashMap<String,String> mapaImioniPeseli=new HashMap<>();
        mapaImioniPeseli.put("Karol","93122406092");
        mapaImioniPeseli.put("Damian","9412406092");
        mapaImioniPeseli.put("Bartek","95124406092");
        mapaImioniPeseli.put("Dominik","94132406092");
        mapaImioniPeseli.put("Maciek","92112406092");

        System.out.println(mapaImioniPeseli.containsValue("Anna"));;
        mapaImioniPeseli.remove("Karol","93122406092");
        mapaImioniPeseli.remove("Damian","9412406092");
        System.out.println(mapaImioniPeseli);
        if(mapaImioniPeseli.size()==3) {
        System.out.println("Wielkosc mapy poprawna " +mapaImioniPeseli.size());; }

        System.out.println(mapaImioniPeseli.get("Euzebiusz"));
        if(mapaImioniPeseli.get("Euzebiusz")==null)
        {
            System.out.println("No such name!");
        }

        System.out.println(mapaImioniPeseli.isEmpty());
        if(!mapaImioniPeseli.isEmpty())
        {
            System.out.println(mapaImioniPeseli.size());
        }


    }
}
