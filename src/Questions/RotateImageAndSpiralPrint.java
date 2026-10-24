package Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RotateImageAndSpiralPrint {

    int[][] rotate90Clockwise (int[][] matrix, int N) {
        for (int i = 0; i < N; i++) {
            for (int j = i +1; j <N; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for (int row=0; row < N; row++) {
            int statCol = 0;
            int endCol =N-1;
            while (statCol <= endCol) {
                int temp = matrix[row][statCol];
                matrix[row][statCol] = matrix[row][endCol];
                matrix[row][endCol] = temp;
                statCol++;
                endCol--;
            }
        }
        return matrix;
    }


    List<Integer> spiralOrder(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        List<Integer> result = new ArrayList<>();

        int startingRow = 0;
        int endingRow = n - 1;
        int startingCol = 0;
        int endingCol = m - 1;

        while (startingRow <= endingRow &&
                startingCol <= endingCol) {

            // Traverse top row: left to right
            for (int col = startingCol; col <= endingCol; col++) {
                result.add(matrix[startingRow][col]);
            }
            startingRow++;

            // Traverse right column: top to bottom
            for (int row = startingRow; row <= endingRow; row++) {
                result.add(matrix[row][endingCol]);
            }
            endingCol--;

            // Traverse bottom row: right to left
            if (startingRow <= endingRow) {
                for (int col = endingCol; col >= startingCol; col--) {
                    result.add(matrix[endingRow][col]);
                }
                endingRow--;
            }

            // Traverse left column: bottom to top
            if (startingCol <= endingCol) {
                for (int row = endingRow; row >= startingRow; row--) {
                    result.add(matrix[row][startingCol]);
                }
                startingCol++;
            }
        }

        return result;
    }

    void main () {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println(spiralOrder(matrix));

//        System.out.println("Original Matrix:");
//        for (int[] row : matrix) {
//            System.out.println(Arrays.toString(row));
//        }
//
//        rotate90Clockwise(matrix, matrix.length);
//
//        System.out.println("Rotated Matrix:");
//        for (int[] row : matrix) {
//            System.out.println(Arrays.toString(row));
//        }
    }
}
