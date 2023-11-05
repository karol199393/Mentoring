package Zad2;

public abstract class Vehicle {
    private int number;
    private double maxSpeed;
    private Depot depot;

    public Vehicle(int number, double maxSpeed, Depot depot) {
        this.number = number;
        this.maxSpeed = maxSpeed;
        this.depot = depot;
    }

    public int getNumber() {
        return number;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public Depot getDepot() {
        return depot;
    }

    // Możemy dodać abstrakcyjne metody, które będą implementowane przez konkretne rodzaje pojazdów
    public abstract double calculateFuelConsumption();
}
