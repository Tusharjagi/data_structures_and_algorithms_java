package Questions;

import java.util.Arrays;

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

    void main () {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("Original Matrix:");
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }

        rotate90Clockwise(matrix, matrix.length);

        System.out.println("Rotated Matrix:");
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}
