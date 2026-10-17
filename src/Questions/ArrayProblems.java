package Questions;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayProblems {
    double getAverage(int[] arr) {
        double sum = 0;
        for (int i : arr){
            sum += i;
        }
        int size = arr.length;
        double avg = sum / size;
        return avg;
    }

    int[] multiplyByTen(int[] arr) {
        int size = arr.length;
        int newArray[] = new int[size];
        for (int i = 0; i<size; i++) {
            int element = arr[i];
            int newElement = element * 10;
            newArray[i] = newElement;
        }
        return newArray;
    };

    boolean findTargetElement (int arr[], int target) {
        boolean result = false;
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            int element = arr[i];
            if (element == target){
                result = true;
            }
        }
        return result;
    };

    int maximumElement (int arr[]) {
        int max = 0;
        int size = arr.length;
//        for (int i = 0; i < size; i++) {
//            if (arr[i] > max) {
//                max = arr[i];
//            }
//        }
//        return max;
        int temp = 0;
        for (int i = 0; i < size; i++) {
            temp = Math.max(max, arr[i]);
        }
        return temp;
    }

    int[] sumPositiveAndNegative (int[] arr) {
        int result[] = new int[2];
        int positive = 0;
        int negative = 0;
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            if (arr[i] > 0) {
                positive = positive + arr[i];
            } else {
                negative = negative + arr[i];
            }
        }
        result[0] = positive;
        result[1] = negative;
        return result;
    }

    int[] getZeroAndOneCount(int[] arr) {
        int result[] = new int[2];
        int oneCount = 0;

        for (int i : arr) {
            if (arr[i] == 1) {
                oneCount++;
            }
        }

        result[0] = oneCount;
        result[1] = arr.length - oneCount;
        return result;
    }

    int getFirstUnsortedElement(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i+1] <= arr[i]) {
                return  arr[i + 1];
            }
        }
        return -1;
    }

    int[] getSwapAlternate (int arr[]) {
        int size = arr.length;
        int result[] = new int[size];

        for (int i = 0; i < size - 1; i+=2) {
            int temp = arr[i];
            result[i] = arr[i+ 1];
            result[i+ 1] = temp;
        }

        return result;
    }

    int[] getIntersectionElement(int arr1[], int arr2[]) {
        int result[] = new int[Math.min(arr1.length, arr2.length)];
        int k = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    result[k] = arr1[i];
                    k++;
                    break;
                }
            }
        }
        return Arrays.copyOf(result, k);
    }

    int[] getAlternateExtreme (int arr[]) {
        int size = arr.length;
        int result[] = new int[size];

        for (int i = 0; i < size; i+=2) {
            result[i] = arr[i/2];

            if (i + 1 < size) {
                result[i + 1] = arr[size -1 - (i/2)];
            }
        }
        return result;

    }


    void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
//        int array[] = {2, 3, 5, 9, 0};
        int ans[] = getAlternateExtreme(arr);
        for (int i : ans) {
            System.out.println(i);
        }

//        System.out.println("One count: " + ans[0]);
//        System.out.println("zero count: " + ans[1]);

//        int[] ans = sumPositiveAndNegative(arr);
//        System.out.println("Positive number sum: " + ans[0]);
//        System.out.println("Negative number sum: " + ans[1]);

//        int ans = maximumElement(arr);
//        System.out.println(ans);

//        int ans[] = multiplyByTen(arr);
//        for (int i : ans) {
//            System.out.println("Print array: " + i);
//        }
//        boolean ans = findTargetElement(arr, 7);
//        System.out.println("Ans: " + ans);

    }
}
