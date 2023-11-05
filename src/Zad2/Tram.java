package Zad2;

public class Tram extends Vehicle implements FuelConsumptionCalculator {
    private int numOfWagons;

    public Tram(int number, double maxSpeed, Depot depot, int numOfWagons) {
        super(number, maxSpeed, depot);
        this.numOfWagons = numOfWagons;
    }

    public int getNumOfWagons() {
        return numOfWagons;
    }

    @Override
    public double calculateFuelConsumption() {
        // Tutaj możesz dodać logikę obliczania zużycia paliwa dla tramwaju
        return 0.0; // Przykładowa implementacja
    }
}
