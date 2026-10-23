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

    void main () {
        int[] arr = {1, 2, 3, 4, 2};
        boolean ans = isSorted(arr);
        System.out.println(ans);
    }
}
