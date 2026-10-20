package Questions;

public class TwoSum {

    int[] twoSum (int[] num, int target) {
        int size = num.length;

        for (int i = 0; i < size -1; i++) {
            for(int j = 0; j < size; j++) {
                if (num[i] + num[j] == target) {
                    int ans[] = {i, j};
                    return ans;
                }
            }
        }
        int ans[] = {};
        return ans;
    }

    void main () {
        int[] arr = {2 ,7 ,11, 15};
        int[] ans = twoSum(arr, 9);
        for (int i: ans) {
            System.out.println(i + ", ");
        }
    }
}
