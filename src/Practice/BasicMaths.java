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

    int reverseNumber (int n) {
        int result = 0;

        while (n != 0) {
            int digit = n % 10;
            result = result * 10 + digit;
            n = n /10;
        }

        return result;
    }

    void main () {
        int n = 12345;
        int ans = reverseNumber(n);
        System.out.println("Ans: " + ans);
    }
}
