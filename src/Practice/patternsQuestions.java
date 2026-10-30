package Practice;

public class patternsQuestions {
    void squareStartPattern (int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    void rightTriangle(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    void invertedRightTriangle (int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < (n - row); col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    void leftAlignedTriangle (int n) {
        for (int row = 1; row <= n; row++) {
//            ye space print krega
            for (int col = 1; col <= n - row; col++) {
                System.out.print("  ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }

    void leftInvertedAlignedTriangle (int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col < row; col++) {
                System.out.print("  ");
            }
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }

    void main () {
        int n = 5;
        leftInvertedAlignedTriangle(n);
    }
}
