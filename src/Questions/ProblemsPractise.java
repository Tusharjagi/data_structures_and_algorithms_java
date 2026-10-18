package Questions;

import java.util.ArrayList;

public class ProblemsPractise {
    String getOddOrEven(int num) {
        if (num % 2 == 0) {
            return "Even";
        }
        return "Odd";
    }

    int getLargetNumber(int[] arr) {
        int ans = 0;
        int size = arr.length;

        for (int i = 0; i < size; i++) {
            if (arr[i] > ans) {
                ans = arr[i];
            }
        }
        return ans;

    }

    String gerNegativeOrZero(int n) {
        if (n > 0) {
            return "Positive";
        }
        return "Negative";
    }

    int getFactorial (int n) {
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        return result;
    }

    ArrayList<Integer> getMultiplication (int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            int temp = n * i;
            arr.add(temp);
        }
        return arr;
    }

    int sumOfDigits (int n) {
        int sum = 0;

//        int i = 0;
        while (n !=0 ) {
            int digit = n % 10;
            sum += digit;
            n /= 10;
//            i++;
        }
        return sum;
    }

    int reverseNumber (int n) {
        int ans = 0;

        while (n != 0) {
            int digit = n % 10;
            ans = ans * 10 + digit;
            n /= 10;
        }
        return ans;
    }

    boolean isPalindrome (int n) {
        int original = n;
        int reverse = 0;

        if (n < 0) {
            return false;
        }

        while (n != 0) {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n /= 10;
        }

        return original == reverse;
    }

    boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= n / i; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }



    void main () {
        boolean ans = isPrime(7);
        System.out.println(ans);

//        ArrayList<Integer> ans = getMultiplication(3);

//        for (int i: ans) {
//            System.out.println("Multiplication: " + i);
//        }


//        int[] arr = {10, 29, 15, 2, 40};
//        int ans = getLargetNumber(arr);
//        System.out.println("Print: " + ans);

//        String ans = getOddOrEven(11);

    }
}
