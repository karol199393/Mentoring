package Zad9;

class Motorcycle extends Vehicle {
    public Motorcycle(String name) {
        super(name);
    }

    @Override
    public void start() {
        System.out.println("Rozpoczynam jazdę na motocyklu " + name);
    }
}
