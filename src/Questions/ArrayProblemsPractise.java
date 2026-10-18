package Questions;

public class ArrayProblemsPractise {

    int largestElement (int[] arr) {
        int res = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > res) {
                res = arr[i];
            }
        }

        return res;
    }

    int getSmallest (int[] arr) {
        int size = arr.length;
        int res = arr[0];

        for (int i = 0; i < size; i++) {
            if (arr[i] < res) {
                res = arr[i];
            }
        }
        return res;
    }

    int sumOfArray (int[] arr) {
        int sum = 0;
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            sum += arr[i];
        }
        return sum;
    }

    double getAverage(int[] arr) {
        double sum = 0;
        int size = arr.length;

        for (int i = 0; i < size; i++) {
            sum += arr[i];
        }
        double avg = sum / size;

        return  avg;
    }

    int[] reverseArray (int[] arr) {
        int size = arr.length;
        int[] result = new int[size];

        int i = 0;
        int j = size -1;

        while (i < size) {
            result[i] = arr[j];
            i++;
            j--;
        }

        return result;
    }

    int secondLargest(int[] arr) {
        int res = 0;
        int temp = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > res) {
                temp = res;
                res = arr[i];
            } else if (arr[i] > temp && arr[i] < res) {
                temp = arr[i];
            }
        }

        return temp == Integer.MIN_VALUE ? -1 : temp;
    }

    void main () {
        int[] arr = {10, 5, 20, 8, 9};
        int ans = secondLargest(arr);
        System.out.println(ans);
//        for (int i : ans) {
//            System.out.println(i + ", ");
//        }

//        int[] arr = {1, 2, 3, 4, 5};
//        int ans = sumOfArray(arr);
//        System.out.println(ans);
    }
}
