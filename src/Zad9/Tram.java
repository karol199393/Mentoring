package Zad9;

class Tram extends Vehicle {
    public Tram(String name) {
        super(name);
    }

    @Override
    public void start() {
        System.out.println("Rozpoczynam jazdę tramwajem " + name);
    }
}
