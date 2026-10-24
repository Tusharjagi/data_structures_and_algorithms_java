package Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoDArray {
    List<Integer> printRowSum (int[][] arr) {

        List<Integer> result = new ArrayList<>();

        int m = arr.length;
        int n = arr[0].length;
        for (int row = 0; row < m; row++) {
            int sum =0;
            for (int col = 0; col < n; col++) {
                int value = arr[row][col];
                sum += value;
            }
            result.add(sum);
        }

        return result;
    }

    List<Integer> printSumOfColumn (int[][] arr) {
        List<Integer> result = new ArrayList<>();
        int m = arr.length;
        int n = arr[0].length;

        for (int col = 0; col<n; col++) {
            int sum =0;
            for (int row = 0; row < m; row++) {
                int value = arr[row][col];
                sum += value;
            }
            result.add(sum);
        }

        return result;
    }

    List<Integer> wavePrintMatrix(int[][] arr, int m, int n) {
        List<Integer> result = new ArrayList<>();


        for (int col=0; col <n; col++) {
            if ((col & 1) == 1) {
                for (int row = m -1; row >=0; row--) {
                    result.add(arr[row][col]);
                }
            } else {
                for (int row = 0; row < m; row++) {
                    result.add(arr[row][col]);
                }
            }
        }
        return result;
    }

    int[][] transposeMatrix(int[][] arr) {
        if (arr == null || arr.length == 0) {
            return new int[0][0];
        }
        int totalRows = arr.length;
        int totalCols = arr[0].length;
        int newTotalRows = totalCols;
        int newTotalCols = totalRows;

        int[][] ans = new int[newTotalRows][newTotalCols];

        for (int row = 0; row < totalRows; row++) {
            for (int col =0; col < totalCols; col++) {
                ans[col][row] = arr[row][col];
            }
        }
        return ans;
    }

    void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] result = transposeMatrix(arr);

        System.out.println(Arrays.deepToString(result));
    }
}
