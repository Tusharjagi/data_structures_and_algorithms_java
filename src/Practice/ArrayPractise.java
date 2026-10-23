package Practice;

public class ArrayPractise {
    int largestElement (int[] arr) {
        int max = 0;
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            if (arr[i] < max) {
                max = arr[i];
            }
        }
        return max;

    }

    int[] reverseArray (int[] arr) {
//        int size = arr.length;
//        int[] result = new int[size];
//        int j = 0;
//
//        for (int i = size - 1; i >= 0; i--) {
//            result[j] = arr[i];
//            j++;
//        }
//
//        return result;
//        Two pointer

        int size = arr.length;
        int i = 0;
        int j = size - 1;

        while (j >= i) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return arr;
    }

    int secondLargestElement(int[] arr) {
        int firstLargest = 0;
        int secondLargest = 0;
        int size = arr.length;

        for (int i = 0; i < size; i++) {
            if (arr[i] > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] < firstLargest) {
                secondLargest = arr[i];

            }
        }

        return secondLargest;
    }

    boolean isSorted (int[] arr) {
        for (int i = 0; i < arr.length -1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    int removeDuplicates (int[] arr) {
        if (arr.length == 0) {
            return 0;
        }

        int j = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[j]) {
                j++;
                arr[j] = arr[i];
            }
        }
        return j + 1;
    }

    int[] rotateByOne (int[] arr) {
        int size = arr.length;
        int[] result = new int[size];
        int temp = arr[size - 1];
        result[0] = temp;

        for (int i = 0; i < size -1; i++) {
            result[i + 1] = arr[i];
        }

        return result;
    }

    int[] rotateByK (int[] arr, int k) {
        int n = arr.length;

        if (n == 0) {
            return arr;
        }
        k = k % n;
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            result[i] = arr[(i + k) % n];
        }

        return result;
    }

    void main () {
        int[] arr = {1, 2, 3, 4, 5};
        int[] ans = rotateByK(arr, 2);

        for (int i : ans) {
            System.out.println(i + ", ");
        }
//        System.out.println(ans);
    }
}
