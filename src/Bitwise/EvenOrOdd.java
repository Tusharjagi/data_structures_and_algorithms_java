package Bitwise;

public class EvenOrOdd {
    void main () {
        int n = 10;
        if ((n&1) == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
