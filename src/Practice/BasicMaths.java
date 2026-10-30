package Practice;

public class BasicMaths {
    int countDigits (int n) {
        int counter = 0;

        if (n == 0) {
            return 1;
        }

        while (n != 0) {
            int digit = n % 10;
            n = n / 10;
            counter++;

        }
        return counter;
    }

    void main () {
        int n = 12345;
        int ans = countDigits(n);
        System.out.println("Ans: " + ans);
    }
}
