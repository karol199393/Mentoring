package Zad4;

class Bus extends Vehicle{
    private double fuelConsumed;

    public Bus(int number, double maxSpeed, Depot depot, double fuelConsumed) {
        super(number, maxSpeed, depot);
        this.fuelConsumed = fuelConsumed;
    }

    public double getFuelConsumed() {
        return fuelConsumed;
    }
}
