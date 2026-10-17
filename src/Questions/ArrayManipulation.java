package Questions;

public class ArrayManipulation {
    int[] reverseArray (int arr[]) {
        int size = arr.length;

        int i = 0;
        int j = size -1;

        while (i <= j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        return arr;
    }

    void main () {
        int arr[] = {2, 4, 6, 8, 9};
        int[] ans =  reverseArray(arr);
        for(int i : ans) {
            System.out.print(i + ", ");
        }

    }
}
