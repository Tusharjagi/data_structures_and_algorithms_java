void main() {
//    int dailyPractice = 12;

//    if (dailyPractice >= 10) {
//        System.out.println("Good consistency");
//    }
    int score = 42;

    if (score >= 50) {
        System.out.println("Pass");
    } else {
        System.out.println("Fail");
    }

    if (score >= 50) {
        System.out.println("Pass");
    } else if(score >= 6) {
        System.out.println("Fail");
    }

    switch (score) {
        case 4:
            System.out.println("no");
            break;
        case 5:
            System.out.println("yes");
            break;
        default:
            System.out.println("not found");

    }
}