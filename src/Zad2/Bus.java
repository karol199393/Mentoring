package Zad2;

public class Bus extends Vehicle implements FuelConsumptionCalculator {
    private double fuelConsumed;

    public Bus(int number, double maxSpeed, Depot depot, double fuelConsumed) {
        super(number, maxSpeed, depot);
        this.fuelConsumed = fuelConsumed;
    }

    public double getFuelConsumed() {
        return fuelConsumed;
    }

    @Override
    public double calculateFuelConsumption() {
        return fuelConsumed;
    }
}