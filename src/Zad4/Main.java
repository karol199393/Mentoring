package Zad4;

public class Main {
    public static void main(String[] args) {
        Depot tramDepot = new Depot("Tram Depot A", "tramwajowa");
        Depot busDepot = new Depot("Bus Depot B", "autobusowa");

        Tram tram1 = new Tram(101, 60.0, tramDepot, 2);
        Tram tram2 = new Tram(102, 55.0, tramDepot, 3);
        Bus bus1 = new Bus(201, 50.0, busDepot, 250.0);
        Bus bus2 = new Bus(202, 45.0, busDepot, 270.0);

        tramDepot.addVehicle(tram1);
        tramDepot.addVehicle(tram2);
        busDepot.addVehicle(bus1);
        busDepot.addVehicle(bus2);

        // Inne operacje związane z pojazdami i zajezdniami
    }
}