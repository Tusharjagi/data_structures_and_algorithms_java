package Oops.Abstract;

interface Bird {
    void fly();
    void eat();

    default void sleep () {
        System.out.println("Bird sleep");
    }
}

interface Walk {
    int legs = 4;
    void walking();
}

class Sparrow implements Bird, Walk {

    @Override
    public void fly() {
        System.out.println("Sparrow flying alag way se ");
    }

    @Override
    public void eat() {
        System.out.println("Sparrow Eating");
    }

    @Override
    public void walking() {

        System.out.println("Sparrow waling" + legs);
    }
}

class Crow implements Bird {

    @Override
    public void fly() {
        System.out.println("Crow flyingfdsfadfasfd");
    }

    @Override
    public void eat() {
        System.out.println("Crow Eating");
    }
}

public class main {
    public  static void doBirdStuff(Bird b) {
        b.eat();
        b.fly();
        b.sleep();

    }

    public static void main() {
        doBirdStuff(new Sparrow());
        doBirdStuff(new Crow());

    }

//    Interface


}
