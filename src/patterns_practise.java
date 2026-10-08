void main () {
//    Solid Square
//    int n = 5;
//
//    for (int row = 1; row <= n; row++) {
//        for (int col = 1; col <= n; col++) {
//            System.out.print("* ");
//        }
//        System.out.println();
//    }

//    Hollow Square

//    int n = 5;
//
//    for (int row = 1; row <= n; row++) {
//
//        if (row == 1 || row == n) {
//            for (int col = 1; col <= n; col++) {
//                System.out.print("* ");
//            }
//        } else {
//            System.out.print("* ");
//            for (int col = 1; col <= n - 2; col++) {
//                System.out.print("  ");
//            }
//            System.out.print("* ");
//        }
//        System.out.println();
//    }

//    Number Square

//    int n = 5;
//
//    for (int row = 1; row <= n; row++) {
//        for (int col = 1; col <= n; col++) {
//            System.out.print(col + " ");
//        }
//        System.out.println();
//    }

//    Same Number Square
//    int n = 5;
//
//    for (int row = 1; row <= n; row++) {
//        for (int col = 1; col <= n; col++) {
//            System.out.print(row + " ");
//        }
//        System.out.println();
//    }

    //    Alphabet Square
//    int n = 5;
//
//    for (int row = 1; row <= n; row++) {
//        for (int col = 1; col <= n; col++) {
//            int a = 'A' - 1;
//            int ans = a + col;
//            char finalAns = (char)ans;
//            System.out.print(finalAns + " ");
//        }
//        System.out.println();
//    }

    //   Same Alphabet Square
//    int n = 5;
//
//    for (int row = 1; row <= n; row++) {
//        for (int col = 1; col <= n; col++) {
//            int a = 'A' - 1;
//            int ans = a + row;
//            char finalAns = (char)ans;
//            System.out.print(finalAns + " ");
//        }
//        System.out.println();
//    }

//    Left Triangle

//    int n = 5;
//
//    for (int row = 1; row <= n; row++) {
//        for (int col = 1; col <= row; col++) {
//            System.out.print("* ");
//        }
//        System.out.println();
//    }

//    Number Triangle
//    int n = 5;
//
//    for (int row = 1; row <= n; row++) {
//        for (int col = 1; col <= row; col++) {
//            System.out.print(col + "  ");
//        }
//        System.out.println();
//    }

    //   Same Number Triangle
//    int n = 5;
//
//    for (int row = 1; row <= n; row++) {
//        for (int col = 1; col <= row; col++) {
//            System.out.print(row + "  ");
//        }
//        System.out.println();
//    }

//    Alphabet Triangle

//    int n = 5;
//
//    for (int row = 1; row <= n; row++) {
//        for (int col = 1; col <= row; col++) {
//            char ans = (char)(('A' - 1) + col);
//            System.out.print(ans + " ");
//        }
//        System.out.println();
//    }

//    Repeated Alphabet Triangle

//    int n = 5;
//
//    for (int row = 1; row <= n; row++) {
//        for (int col = 1; col <= row; col++) {
//            char ans = (char)(('A' - 1) + row);
//            System.out.print(ans + " ");
//        }
//        System.out.println();
//    }

//    Continuous Number Triangle
//    int n = 5;
//    int counter = 0;
//
//    for (int row = 1; row <= n; row++) {
//        for (int col = 1; col <= row; col++) {
//            System.out.print(counter + " ");
//            counter++;
//        }
//        System.out.println();
//    }

//    Reverse Star Triangle
//    int n = 5;
//
//    for (int row = 1; row <= n; row++) {
//        for (int col = 1; col <= n - row + 1; col++) {
//            System.out.print("* ");
//        }
//        System.out.println();
//    }

//    Reverse Number Triangle
//    int n = 5;
//
//    for (int row = 1; row <= n; row++) {
//        for (int col = 1; col <= n - row + 1; col++) {
//            System.out.print(col + " ");
//        }
//        System.out.println();
//    }

//    Reverse Same Number

//    int n = 5;
//
//    for (int row = 1; row <= n; row++) {
//        for (int col = 1; col <= n - row + 1; col++) {
//            System.out.print(n + 1 - row  + " ");
//        }
//        System.out.println();
//    }

//    Reverse Alphabet Triangle
//    int n = 5;
//
//    for (int row = 1; row <= n; row++) {
//
//        for (int col = 1; col <= n - row + 1; col++) {
//            char ans = (char)('A' - 1 + col);
//            System.out.print(ans  + " ");
//        }
//        System.out.println();
//    }

//    Right-Aligned Patterns

//    int n = 5;
//
//    for (int row = 1; row <= n; row++) {
//        for (int col = 1; col <= n - row; col++) {
//            System.out.print("  ");
//        }
//        for (int col = 1; col <= row; col++) {
//            System.out.print("* ");
//        }
//        System.out.println();
//    }

//    Reverse Right Triangle

//    int n = 5;
//
//    for (int row = 1; row <= n; row++) {
//        for (int col = 1; col <= row - 1; col++) {
//            System.out.print("  ");
//        }
//        for (int col = 1; col <= n - row + 1; col++) {
//            System.out.print("* ");
//        }
//        System.out.println();
//    }

//    Pyramid Patterns

//    int n = 5;
//
//    for (int row = 1; row <= n; row++) {
//        for (int col = 1; col <= n - row; col++) {
//            System.out.print("  ");
//        }
//        for (int col = 1; col <= 2 * row - 1; col++) {
//            System.out.print("* ");
//        }
//        System.out.println();
//    }

//    Inverted Pyramid

//    int n = 5;
//
//    for (int row = 1; row <= n; row++) {
//        for (int col = 1; col <= row - 1; col++) {
//            System.out.print("  ");
//        }
//        for (int col = 1; col <= 2 * n + 1 - 2 * row; col++) {
//            System.out.print("* ");
//        }
//        System.out.println();
//    }

//    Star Diamond

    int n = 5;

    for (int row = 1; row <= n; row++) {
        for (int col = 1; col <= n - row; col++) {
            System.out.print("  ");
        }
        for (int col = 1; col <= row; col++) {
            System.out.print("* ");
        }
        for (int col = 1; col <=  row -1; col++) {
            System.out.print("* ");
        }
        System.out.println();
    }

    for (int row = 1; row <= n - 1; row++) {
        for (int col = 1; col <= row; col++) {
            System.out.print("  ");
        }
        for (int col = 1; col <= n - row; col++) {
            System.out.print("* ");
        }
        for (int col = 1; col <= n - row - 1; col++) {
            System.out.print("* ");
        }
        System.out.println("  ");
    }














}