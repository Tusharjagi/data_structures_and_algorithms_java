package Questions;

import java.util.ArrayList;
import java.util.List;

public class MissingElement {

    List<Integer> missingElement (int[] arr) {
        int n = arr.length;
        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int value = Math.abs(arr[i]);
            int position = value - 1;
            if (arr[position] > 0) {
                arr[position] = -arr[position];
            }
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                int valueAtThisIndex = i+1;
                ans.add(valueAtThisIndex);
            }
        }
        return ans;
    }


    void main(String[] args) {
        int[] arr = {3, 2, 3 ,4, 5, 5};
        System.out.println(missingElement(arr));

    }
}
