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

    void main () {

        int[] arr = {1,2,3,4,5,6,7};
        int[] ans = countEventOrOdd(arr);

        for (int i : ans) {
            System.out.println(i + ", ");
        }
//        System.out.println(ans);
    }
}
