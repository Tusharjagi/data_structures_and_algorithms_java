package Practice;

public class practise {
    int largestElement (int[] arr) {
        int largest = arr[0];
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }

    int[] reverseArray (int[] arr) {
        int n = arr.length;
//        int[] result = new int[n];
//        int i = 0;
//
//        while (i != n) {
//            result[i] = arr[n-i-1];
//            i++;
//        }
        int i = 0;
        int j = n-1;
        while (j >= i) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        return arr;
    }

    int secondLargestElement (int[] arr) {
        int n = arr.length;
        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = arr[i];
            } else if (firstLargest > arr[i] && secondLargest < arr[i]) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }

    int removeDuplicates (int[] arr) {
        int n = arr.length;
        int j = 0;

        for (int i = 1; i < n; i++) {
            if (arr[j] != arr[i]) {
                j++;
                arr[j] = arr[i];
            }
        }
        return j + 1;
    }

    int[] leftRotateByOne (int[] arr) {
        int n = arr.length;
        int firstEle = arr[0];
        int[] result = new int[n];

        for (int i = 1; i < n; i++) {
            result[i-1] = arr[i];
        }
        result[n-1] = firstEle;

        return result;
    }

    int[] leftRotateByk (int[] arr, int k) {
        int n = arr.length;

        if (n == 0) return arr;
        int[] result = new int[n];

        k = k % n;
        for (int i = 0; i < n; i++) {
            result[(i - k +n) % n] = arr[i];
        }

        return result;
    }

    void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] ans = leftRotateByk(arr, 2);
        for (int i: ans) {
            System.out.print(i+", ");
        }
//        System.out.println(ans);
    }
}
