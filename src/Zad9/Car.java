package Zad9;

class Car extends Vehicle {
    public Car(String name) {
        super(name);
    }

    @Override
    public void start() {
        System.out.println("Rozpoczynam jazdę samochodem " + name);
    }
}
