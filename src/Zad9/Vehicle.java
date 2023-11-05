package Zad9;
import java.util.ArrayList;
import java.util.List;

abstract class Vehicle {
    protected String name;

    public Vehicle(String name) {
        this.name = name;
    }

    public abstract void start();
}