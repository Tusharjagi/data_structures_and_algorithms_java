void PrintDigits(int num) {
    while (num != 0) {
        int digit = num % 10;
        System.out.println(digit);
        num = num/10;
    }
}

void CountDigit(int num) {
    int counter = 0;

    while (num != 0) {
        int digit = num % 10;
        counter++;
        num = num / 10;
    }
    System.out.println(counter);
}

void sumOfNumber (int num) {
    int sum = 0;

    while (num != 0) {
        int digit = num % 10;
        sum += digit;
        num = num / 10;
    }
    System.out.println(sum);
}

int reverseNumber (int num) {
    int revNum = 0;

    while (num != 0) {
        int digit = num % 10;
        revNum = revNum * 10 + digit;
        num = num / 10;
    }
    return  revNum;
}

String isPalindrome (int num) {
    int originalNum = num;
    int reveredNum = reverseNumber(num);
    if (originalNum == reveredNum) {
        return "Its a palindrome";
    } else {
        return "Its not a palindrome";
    }
}

boolean isPrimeNumber (int num) {
//    for (int i = 2; i <= num -1; i++) {
//        if (num%i == 0) {
//            return false;
//        }
//    }
//    return true;
    for (int i =2; i*i<=num; i++) {
                if (num%i == 0) {
            return false;
        }
    }
    return true;
}

int getGCD (int a, int b) {
//    gcd(a,b) = gcd(b,a%b)
    while (b != 0) {
        int temp = b;
        b = a%b;
        a = temp;
    }
    return a;
}

int getLCM (int a, int b) {
    int gcd = getGCD(a, b);
    int prod = a*b;
    int lcm = prod/gcd;
    return lcm;
}

boolean isArmstrongNumber (int num) {
    int sum = 0;
    int originalNum = num;

    while (num != 0) {
        int digit = num % 10;
        int cubeOfdigit = digit*digit*digit;
        sum += cubeOfdigit;
        num = num / 10;
    }
    if (sum == originalNum) {
        return true;
    } else {
        return false;
    }
}

void main () {
    int num = 3;
    boolean result = isArmstrongNumber(153);
    System.out.println(result);
}