package Sortings;

public class SelectionSort {
    int[] selectionSort(int[] arr) {
//            T.C -> O(n^2)
        int n = arr.length;

        for (int i = 0; i< n-1; i++) {
            int minIndex = i;
            for (int j =i+1; j< n; j++) {
                if(arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        return arr;
    }

    void main () {
        int[] arr = {5, 3, 6, 2, 4, 1};
        int[] ans = selectionSort(arr);
        for (int i: ans) {
            System.out.print(i + ", ");
        }
    }
}
