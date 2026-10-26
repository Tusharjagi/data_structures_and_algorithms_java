package Questions;

public class PainterPartition {
    boolean isValidSolution (int[] board, int k, int maxLength) {
        int painter = 1;
        int paintedLength = 0;

        for (int i = 0; i < board.length; i++) {
            if (paintedLength + board[i] <= maxLength) {
                paintedLength = paintedLength + board[i];
            } else {
                painter++;
                if (painter > k || board[i] > maxLength) {
                    return false;
                } else {
                    paintedLength = board[i];
                }
            }
        }
        return true;
    }

    int painterPartitionProblem (int[] boards, int k) {
        int sum = 0;
        for (int i =0; i< boards.length; i++) {
            sum += boards[i];
        }

        int s = 0;
        int e = sum;
        int ans = -1;

        while ( s <= e) {
            int mid  = s + (e -s) / 2;

            if (isValidSolution(boards, k, mid)) {
                ans = mid;
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return ans;
    }
    void main () {
        int[] arr = {10, 20, 30, 40};
        int k = 2;
        int ans = painterPartitionProblem(arr, k);
        System.out.println("Ans: " + ans);
    }
}
