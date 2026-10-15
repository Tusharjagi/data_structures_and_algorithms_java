package Oops;

public class Vehicle {
    protected String name;
    public String model;
    public  int tyre;

    Vehicle() {
        this.name = "";
        this.model = "";
        this.tyre = -1;
    }

    Vehicle(String name, String model, int tyre) {
        this.name = name;
        this.model = model;
        this.tyre = tyre;
    }

    void startEngine() {
        System.out.printf("Engine is starting of %s : %s\n", name, model);
    }

    void  stopEngine() {
        System.out.printf("Engine is stoping of %s : %s\n", name, model);
    }
}
