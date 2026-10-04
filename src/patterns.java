void main() {
//    solid square pattern
//    int n = 4;
//
//    for (int row = 1; row <= n; row++) {
//        for (int col = 1; col <= n; col++) {
//            System.out.print("* ");
//        }
//        System.out.println();
//    }

//    rectangle
//    for (int row = 0; row < 3; row++){
//        for (int col = 0; col < 5; col++) {
//            System.out.print("* ");
//        }
//        System.out.println();
//    }

//    right angle
//    int n = 5;
//    for (int row = 0; row < n; row++) {
//        for (int col = 0; col < row; col++){
//            System.out.print("* ");
//        }
//        System.out.println();
//    }

//    solid rombus
//    int n = 5;
//
//    for (int row = 0; row < 5; row++) {
//        for (int col =0; col < n - row; col++) {
//            System.out.print(" ");
//        }
//        for (int col = 0; col < n; col++) {
//            System.out.print("* ");
//        }
//        System.out.println();
//    }

//    reverse  right triangle

//    int n = 5;
//
//    for (int row = 0; row < n; row++) {
//        for (int col = 0; col < n - row; col++) {
//            System.out.print("* ");
//        }
//        System.out.println();
//    }

//    primid

//    int n = 5;
//
//    for (int row = 0; row < n; row++) {
//        for (int col = 0; col < n - (row + 1); col++){
//            System.out.print("  ");
//        }
//        for (int col = 0; col < 2 * row + 1; col++){
//            System.out.print("* ");
//        }
//        System.out.println();
//    }

//    rever triangle

//    int n = 4;
//
//    for (int row = 1; row <= n;  row++) {
//        for (int col = 1; col <= row - 1; col++) {
//            System.out.print("  ");
//        }
//        for (int col = 1; col <= 2 * n - 2 * row + 1; col++) {
//            System.out.print("* ");
//        }
//        System.out.println();
//    }

//    hollow rectangle

    int n = 4;

    for (int row = 1; row <= n; row++ ){
        for (int col = 1; col <= 6; col++) {
            if (row == 1 || row == n){
                System.out.print("* ");
            } else {
                if (col == 1) {
                    System.out.print("* ");
                } else if (col == 6) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

            }
        }
        System.out.println();
    }















}