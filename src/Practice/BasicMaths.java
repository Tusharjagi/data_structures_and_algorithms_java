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

    int largestOfThree (int a, int b, int c) {
        int result = 0;

        if (a >= b && a >= c) {
            result = a;
        } else if (b >= a && b >= c) {
            result = b;
        } else {
            result = c;
        }

        return result;
    }

    int [] swapTwoNumber (int a, int b) {
        int[] arr = new int[2];
        int temp = a;
        a = b;
        b = temp;
        arr[0] = a;
        arr[1] = b;
        return arr;
    }

    int powerOfNumber (int a, int b) {
        int cal = 1;

        for (int i = 1; i <= b; i++) {
            cal = cal * a;
        }
        return cal;
    }

    boolean primeNumber (int n) {
        if (n <= 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        if (n % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= n/i; i+=2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    void printPrimeNumber(int n) {
        for (int num = 2; num <= n; num++) {
            boolean isPrime = true;

            for (int i = 2; i <= num / i; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(num + " ");
            }
        }
    }


    void main () {
        int a = 10;
        int b = 5;
        printPrimeNumber(20);

//        boolean ans = printPrimeNumber(a);

//        for (int i: ans) {
//            System.out.println(i + ", ");
//        }

//        System.out.println("Ans: " + ans);
    }
}
