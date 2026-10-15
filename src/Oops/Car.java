package Oops;

public class Car extends Vehicle {
    public int noOfDoors;
    public String transmissionType;

    Car(String name, String model, int noOfTyres, int noOfDoors, String transmissionType) {
        super(name, model, noOfTyres);
        this.noOfDoors = noOfDoors;
        this.transmissionType = transmissionType;
        super.startEngine();
    }

    public  void startAc () {
        System.out.println("AC started of " + name);
    }
}
