package Questions;

public class NonDuplicateElement {
    int singleNonDuplicate (int[] nums) {
        int n = nums.length;
        int s = 0;
        int e = n -1;

        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (s == e) {
                return nums[s];
            }
            int currentValue = nums[mid];
            int prevValue = -1;
            if (mid -1 >= 0) {
                prevValue = nums[mid -1];
            }
            int nextValue = -1;
            if (mid + 1 < n) {
                nextValue = nums[mid + 1];
            }
            if (currentValue != prevValue && currentValue != nextValue) {
                return currentValue;
            }
            if (currentValue != prevValue && currentValue == nextValue) {
                int statingIndexOfPair = mid;
                if ((statingIndexOfPair & 1) == 1){
                    e = mid -1;
                } else {
                    s = mid + 1;
                }
            } else if (currentValue == prevValue && currentValue != nextValue) {
                int endingIndexOfPair = mid;
                if ((endingIndexOfPair & 1) == 1) {
                    s = mid + 1;
                } else {
                    e = mid - 1;
                }
            }
        }
        return -1;
    }

    void main () {
        int[] arr = {1, 1, 2, 3, 3, 4, 4, 8, 8};
        int ans = singleNonDuplicate(arr);
        System.out.println("Ans: " + ans);
    }
}
