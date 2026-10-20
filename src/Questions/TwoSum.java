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

    int removeDuplicate(int[] nums) {
        int i = 0;
        int j = 1;
        int n = nums.length;

        while (j < n) {
            if (nums[i] == nums[j]) {
                j++;
            } else {
                i++;
                nums[i] = nums[j];
                j++;
            }
        }
        return i + 1;
    }

    int firstFirstRepeating (int[] nums) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int num: nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        for (int i: nums) {
            if (freq.get(i) > 1) {
                return i;
            }
        }
        return -1;
    }

    int pivotIndex (int[] arr) {
        int n = arr.length;
        int leftSum[] = new int[n];
        int rightSum[] = new int[n];

        leftSum[0] = arr[0];

        for (int i = 1; i < n; i++) {
            leftSum[i] = leftSum[i -1] + arr[i];
        }
        rightSum[n-1] = arr[n-1];
        for (int i = n -2; i >= 0; i--) {
            rightSum[i] = rightSum[i+1] + arr[i];
        }

        for (int i = 0; i<n; i++) {
            if (leftSum[i] == rightSum[i]) {
                return i;
            }
        }
        return -1;
    }

    void main () {
        int[] arr = {1, 7 ,3 ,6 , 5, 6};
        System.out.println(pivotIndex(arr));


//        int[] arr = {2 ,7 ,11, 15};
//        int[] ans = twoSum(arr, 9);
//        for (int i: ans) {
//            System.out.println(i + ", ");
//        }
    }
}
