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

void main () {
    int num = 1234;
    int revNum = reverseNumber(num);
    System.out.println(revNum);
}