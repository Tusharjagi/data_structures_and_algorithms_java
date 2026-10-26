package Questions;

import java.util.Arrays;

public class AggressiveCows {
    boolean isValidAns (int[] stalls, int minDistance, int k) {
        int cowCount = 1;
        int lastPosition = 0;

        for (int i = 1; i < stalls.length; i++) {
            if (stalls[i] - stalls[lastPosition] >= minDistance) {
                cowCount++;
                lastPosition = i;

                if (cowCount == k) {
                    return true;
                }
            }
        }

        return false;
    }


    int aggressiveCows (int[] stalls, int k) {
        Arrays.sort(stalls);
        int n = stalls.length;

        int s = 0;
        int e = stalls[n-1] - stalls[0];
        int ans = -1;

        while (s <= e) {
            int mid = s + (e - s) /2;

            if (isValidAns(stalls, mid, k)) {
                ans = mid;
                s = mid + 1;
            } else {
                e = mid -1;
            }
        }
        return ans;
    }


    void main () {
        int[] arr = {1, 2, 8, 4, 9};
        int k = 3;
        int ans = aggressiveCows(arr, k);
        System.out.println("Ans: " + ans);

    }
}
