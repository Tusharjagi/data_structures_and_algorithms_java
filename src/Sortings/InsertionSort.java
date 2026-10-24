package Sortings;

public class InsertionSort {
    int[] insertionSort(int[] arr) {
        //            T.C -> O(n^2)
        int n = arr.length;
        for (int i =1; i< n; i++) {
            int prev = i -1;
            int currValue = arr[i];
            while (prev >=0 && currValue < arr[prev]) {
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = currValue;
        }
        return arr;
    }

    void main() {
        int[] arr = {5, 3, 6, 2, 4, 1};
        int[] ans = insertionSort(arr);
        for (int i: ans) {
            System.out.print(i + ", ");
        }
    }
}
