package Sortings;

public class BubbleSort {
    int[] bubbleSort(int[] arr) {
//        T.C -> O(n^2)
        int n = arr.length;
        for (int i =0; i<n-1; i++) {
            for (int j =0; j < n-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] =temp;
                }
            }
        }
        return arr;
    }

    void main () {
        int[] arr = {5, 3, 6, 2, 4, 1};
        int[] ans = bubbleSort(arr);
        for (int i: ans) {
            System.out.print(i + ", ");
        }
    }
}
