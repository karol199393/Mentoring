package Zad2;

import java.util.ArrayList;
import java.util.List;

class Depot {
    private String name;
    private String type;
    private List<Vehicle> vehicles;

    public Depot(String name, String type) {
        this.name = name;
        this.type = type;
        this.vehicles = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }


}
