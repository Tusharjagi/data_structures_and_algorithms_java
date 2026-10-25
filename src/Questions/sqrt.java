package Questions;

public class sqrt {
//    binary search on answer
    double sqrt (int x) {
        int s = 1;
        int e = x;
        double ans = -1;

        if (x == 0) {
            return 0;
        }

        while (s <= e) {
            int mid = s + (e-s) / 2;
            if (mid == x/ mid) {
                return mid;
            } else if(mid > x/mid) {
                e = mid - 1;
            } else {
                ans = mid;
                s = mid + 1;
            }
        }

        double factor = 1;
        int totalPrecision = 3;
        for (int round = 1; round <= totalPrecision; round++) {
            factor = factor /10;
            for (int i =1; i<= 10; i++) {
                double newAns = ans + factor;

                if (newAns * newAns == x) {
                    return newAns;
                } else if (newAns * newAns < x) {
                    ans = newAns;
                } else {
                    break;
                }
            }
        }

        return Math.round(ans * 1000.0)/ 1000.0;
    }

    void main () {
        double ans = sqrt(56);
        System.out.println("Ans: " + ans);
    }
}
