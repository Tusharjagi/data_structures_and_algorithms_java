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

    boolean palindromeNumber (int n) {
        int temp = n;
        int reverse = 0;
        if (n < 0) {
            return false;
        }

        while (n != 0) {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n = n /10;
        }
        return temp == reverse;
    }

    int sumOfDigits (int n) {
        int sum = 0;

        while (n != 0) {
            int digit = n % 10;
            sum += digit;
            n = n / 10;
        }
        return sum;
    }

    int productOfDigit (int n) {
        int multiplication = 1;

        while (n != 0) {
            int digit = n % 10;
            multiplication = multiplication * digit;
            n = n /10;
        }
        return multiplication;
    }

    String eventOrOdd (int n) {
        if (n == 0) {
            return "Odd";
        }
        if (n == 1) {
            return "Even";
        }

        if ((n & 1) == 0) {
            return "Even";
        }
        return "Odd";
    }

    String positiveOrNegative (int n) {
        if (n > 0) {
            return "Positive";
        }
        return "negative";
    }

    void main () {
        int n = -15;
        String ans = positiveOrNegative(n);
        System.out.println("Ans: " + ans);
    }
}
