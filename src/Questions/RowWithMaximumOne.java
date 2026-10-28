package Questions;

public class RowWithMaximumOne {
    int getFirstOccIndex(int[][] arr, int rowIndex) {
        int totalRow = arr.length;
        int totalCol = arr[0].length;
        int ans = -1;

        if (arr[rowIndex][totalCol -1] == 0) {
            return totalCol;
        } else {
            int s = 0;
            int e = totalCol -1;
            while (s <= e) {
                int mid = s + (e-s) /2;
                if (arr[rowIndex][mid] == 0) {
                    s = mid + 1;
                } else {
                    ans = mid;
                    e = mid - 1;
                }
            }
        }
        return ans;
    }

    int rowWithMaxOnes(int[][] mat) {
        int totalRow = mat.length;
        int totalCol = mat[0].length;
        int maxi = -1;
        int maxOneRowIndex = -1;

        for (int row = 0; row < totalRow; row++) {
            int firstOccIndex = getFirstOccIndex(mat, row);
            int oneCount = totalCol - firstOccIndex;
            if (oneCount > maxi) {
                maxi = oneCount;
                maxOneRowIndex = row;
            }
        }

        return maxOneRowIndex;
    }

    void main(String[] args) {
        int[][] arr = {{0,0,0,1}, {0,0,1,1}, {0,1,1,1}, {1,1,1,1}};
        int ans = rowWithMaxOnes(arr);
        System.out.println("Ans: " + ans);
    }
}
