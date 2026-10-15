package Oops;

public class Circle extends Shape {
    @Override
    public  void draw () {
        System.out.println("Circle drawing...");
    }

    public void personalMethod () {
        System.out.println("do personal stuff");
    }
}
