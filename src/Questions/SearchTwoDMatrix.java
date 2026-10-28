package Questions;

public class SearchTwoDMatrix {
    boolean searchMatric (int[][] matrix, int target) {
        int totalRow = matrix.length;
        int totalCol = matrix[0].length;

        int n = totalRow * totalCol -1;
        int s = 0;
        int e = n - 1;

        while (s <= e) {
            int mid = s + (e -s) / 2;
            int rowIndex = mid / totalCol;
            int colIndex = mid % totalCol;

            if (matrix[rowIndex][colIndex] == target) {
                return true;
            } else if (matrix[rowIndex][colIndex] > target) {
                e = mid -1;
            } else {
                s = mid + 1;
            }
        }
        return false;
    }

    boolean searchInMatric(int[][] matrix, int target) {
        int totalRow = matrix.length;
        int totalCol = matrix[0].length;

        int row = 0;
        int col = totalCol - 1;

        while (row < totalRow && col >= 0) {
            if (matrix[row][col] == target) {
                return true;
            } else if (matrix[row][col] > target) {
                col--;
            } else {
                row++;
            }
        }

        return false;

    }



    void main () {
        int[][] arr = {{1,4,7,11},
                       {2, 5, 8, 12},
                       {3,6, 9, 16},
                       {10,21,23,26, 30}};
        boolean ans = searchInMatric(arr, 10);
        System.out.println("Ans: " + ans);
    }
}
