package Zad4;

class Tram extends Vehicle {
    private int numOfWagons;

    public Tram(int number, double maxSpeed, Depot depot, int numOfWagons) {
        super(number, maxSpeed, depot);
        this.numOfWagons = numOfWagons;
    }

    public int getNumOfWagons() {
        return numOfWagons;
    }
}
