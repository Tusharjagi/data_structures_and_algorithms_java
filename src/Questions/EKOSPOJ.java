package Questions;

public class EKOSPOJ {

    boolean isValidAns (int[] tress, int m, int maxHeight) {
        long woodCollected = 0;

        for (int i = 0; i < tress.length; i++) {
            if (tress[i] > maxHeight) {
                long currentTreeWoodCollected = tress[i] - maxHeight;
                woodCollected += currentTreeWoodCollected;
            }
        }
        if (woodCollected >= m) {
            return true;
        }
        return false;
    }

    int maxSawHeight (int[] tress, int m) {
        int n = tress.length;
        int s = 0;
        int maxi =1;
        for (int i = 0; i < n; i++) {
            if (tress[i] > maxi) {
                maxi = tress[i];
            }
        }

        int e = maxi;
        int ans = -1;

        while (s <= e) {
            int mid = s + (e-s) /2;

            if (isValidAns(tress, m, mid)) {
                ans = mid;
                s = mid+1;
            } else {
                e = mid -1;
            }
        }
        return ans;
    }

    void main () {
        int[] arr = {20, 15, 10, 17};
        int m = 7;
        int ans = maxSawHeight(arr, m);
        System.out.println("Ans: " + ans);
    }
}
