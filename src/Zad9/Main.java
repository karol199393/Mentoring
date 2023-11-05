package Zad9;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Motorcycle("Yamaha"));
        vehicles.add(new Car("Toyota"));
        vehicles.add(new Tram("Tramwaj 123"));
        vehicles.add(new Car("Ford"));
        vehicles.add(new Motorcycle("Harley-Davidson"));
        vehicles.add(new Tram("Tramwaj 456"));

        // Wywołanie metody start() z każdego obiektu w liście
        for (Vehicle vehicle : vehicles) {
            vehicle.start();
        }
    }
}
