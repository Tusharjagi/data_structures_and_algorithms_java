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

    void main () {

        int[] arr = {10, 50, 20, 80, 30, 40};
        int ans = secondLargestElement(arr);

//        for (int i : ans) {
//            System.out.println(i + ", ");
//        }
        System.out.println(ans);
    }
}
