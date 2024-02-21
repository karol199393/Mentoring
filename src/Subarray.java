public class Zad11 {
    public static void main(String[] args) {
        //Mentor pomoc?
        String[][] names2D = {{"John", "Jasper"}, {"Casper", "Jonathan"}, {"Unknown", "Unknown"}, {"Alice", "Bob"}, {"Stanley", "Unknown"}};

        for (String[] podtablica : names2D) {
            boolean zawieraUnknown = false;
            for (String element : podtablica) {
                if (element.contains("Unknown")) {
                    zawieraUnknown = true;
                    break; // Jeśli znaleziono "Unknown", to nie ma potrzeby sprawdzania reszty elementów w tej podtablicy
                }
            }

            if (!zawieraUnknown) {
                // Wyświetl podtablicę, jeśli nie zawiera "Unknown"
                for (String element : podtablica) {
                    System.out.print(element + " ");
                }
                System.out.println();
            }
    }
} }
