import java.util.ArrayList;

public class Zad15 {
    public static void main(String[] args) {
        ArrayList<String> listaKolorow=new ArrayList<>();
        listaKolorow.add("red");
        listaKolorow.add("yelllow");
        listaKolorow.add("blue");
        listaKolorow.add("purple");
        listaKolorow.add("white");
        listaKolorow.add("black");
        listaKolorow.add("orange");
        listaKolorow.add("gray");
        /*for(String element:listaKolorow)
        {
            System.out.println(element);
        } */
       listaKolorow.set(4,"lilac");
       /* for(String element:listaKolorow)
        {
            System.out.println(element);
        } */
      listaKolorow.add(0,"turqoise");
       /* for(String element:listaKolorow)
        {
            System.out.println(element);
        }  */


       ArrayList<String> reservedColours=new ArrayList<>();
        for (int i = listaKolorow.size() - 1; i >= 0; i--) {
            reservedColours.add(listaKolorow.get(i));
        }

        for (String element : reservedColours) {
            System.out.println(element);
        }


    }
}
