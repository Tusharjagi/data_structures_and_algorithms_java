package Bitwise;

public class checkOfPowerTwo {
    void main () {
//        int n = 13123;
//        int count = 0;
//
//        while (n != 0) {
//            if((n&1) != 0) {
//                count++;
//            }
//            n = n >> 1;
//        }
//        System.out.println("Set bit count: " + count );
        int n = 15;

        if ((n & (n-1)) == 0) {
            System.out.println("Power of 2");
        } else {
            System.out.println("Not a power of 2");
        }
    }
}
