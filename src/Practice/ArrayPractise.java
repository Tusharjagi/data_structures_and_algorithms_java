package Practice;

public class ArrayPractise {

    int sumOfArrayElements (int[] arr) {
        int sum = 0;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }

    int averageOfNumber (int[] arr) {
        int sum = 0;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        return sum / n;
    }

    int largestElement(int[] arr) {
        int max = arr[0];
        int n = arr.length;

        for (int i =0; i < n; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    int secondLargestElement (int[] arr) {
        int n = arr.length;
        int largestElement = Integer.MIN_VALUE;
        int secondElement = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] > largestElement) {
                secondElement = largestElement;
                largestElement = arr[i];
            }
            if (arr[i] > largestElement && arr[i] < secondElement) {
                secondElement = arr[i];
            }
        }
        return secondElement;
    }

    int[] countEventOrOdd (int[] arr) {
        int n = arr.length;
        int[] result = new int[2];
        int odd = 0;
        int event = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                odd++;
            } else {
                event++;
            }

        }
        result[0] = odd;
        result[1] = event;
        return result;

    }

    int searchElement (int[] arr, int target){
        int n = arr.length;

        for (int i : arr) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    int[] reverseArray (int[] arr) {
        int n = arr.length;
        int i =0;
        int j = n -1;

        while (j >= i) {
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
            i++;
            j--;
        }

        return arr;
    }

    int[] swapFirstAndLastElement(int[] arr) {
        int n = arr.length;
        int temp = arr[n-1];
        arr[n-1] = arr[0];
        arr[0] = temp;
        return arr;
    }

    void main () {

        int[] arr = {10, 20, 30, 40};
        int[] ans = swapFirstAndLastElement(arr);

        for (int i : ans) {
            System.out.println(i + ", ");
        }
//        System.out.println(ans);
    }
}
