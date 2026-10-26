package Questions;

public class RotiPrata {

    boolean isValidAns (int totalParatha, int[] cooks, int totalCooks, long timeLimit) {
        int parathaCount = 0;
        for (int i =0 ; i < cooks.length; i++) {
            int currentCookRank = cooks[i];
            int timeTaken = 0;
            int j = 1;

            while (timeTaken + (long) j * currentCookRank <= timeLimit) {
                timeTaken += (long) j * currentCookRank;
                parathaCount++;
                j++;

                if (parathaCount >= totalParatha) {
                    return true;
                }
            }
        }
        return false;
    }

    long rotiParatha (int p, int[] cook, int n) {
        if (p == 0) {
            return 0;
        }
        int minRank = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            minRank = Math.min(minRank, cook[i]);
        }

        long s = 0;
        long e = (long) minRank * p * (p + 1) / 2;
        long ans = e;

        while (s <= e) {
            long mid = s + (e - s) / 2;

            if (isValidAns(p, cook, n, mid)) {
                ans = mid;
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }

        return ans;
    }

    void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int prata = 10;
        int cooks = 4;
        long ans = rotiParatha(prata, arr, cooks);
        System.out.println("Ans: " + ans);
    }
}
