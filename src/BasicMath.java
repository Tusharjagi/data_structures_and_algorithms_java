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

void reverseNumber (int nun) {

}

void main () {
    int num = 1234;
    sumOfNumber(num);
}