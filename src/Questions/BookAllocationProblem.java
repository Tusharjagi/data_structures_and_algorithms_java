package Questions;

public class BookAllocationProblem {

    boolean isValidAnswer(int[] arr, int k, int maxPages) {
        int studentCount = 1;
        int pages = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxPages) {
                return false;
            }

            if (pages + arr[i] <= maxPages) {
                pages += arr[i];
            } else {
                studentCount++;

                if (studentCount > k) {
                    return false;
                }

                pages = arr[i];
            }
        }

        return true;
    }

    int bookAllocation(int[] arr, int k) {
        int n = arr.length;

        if (k > n || k <= 0 || n == 0) {
            return -1;
        }

        int s = 0;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            s = Math.max(s, arr[i]);
            sum += arr[i];
        }

        int e = sum;
        int ans = -1;

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (isValidAnswer(arr, k, mid)) {
                ans = mid;
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }

        return ans;
    }

    void main() {
        int[] arr = {10, 20, 30, 40, 50};

        int ans = bookAllocation(arr, 2);

        System.out.println(ans);
    }
}
