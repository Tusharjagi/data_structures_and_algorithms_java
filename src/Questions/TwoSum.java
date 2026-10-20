package Questions;

import java.util.*;

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

    List<List<Integer>> threeSum (int[] arr, int target) {
        int n = arr.length;
        Set<List<Integer>> output = new HashSet<>();
        for (int i=0; i < n-2; i++) {
            for (int j=i+1; j < n-1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] == target){
                        List<Integer> temp = new ArrayList<>();
                        temp.add(arr[i]);
                        temp.add(arr[j]);
                        temp.add(arr[k]);
                        Collections.sort(temp);
                        output.add(temp);
                    }
                }
            }
        }
        return new ArrayList<>(output);
    }

    void main () {
        int[] arr = {-1, 0, 1, 2, -1, -4};
        System.out.println(threeSum(arr, 0));


//        int[] arr = {2 ,7 ,11, 15};
//        int[] ans = twoSum(arr, 9);
//        for (int i: ans) {
//            System.out.println(i + ", ");
//        }
    }
}
