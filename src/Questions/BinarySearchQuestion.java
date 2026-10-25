package Questions;

public class BinarySearchQuestion {
    int pivotIndexRotateArray (int[] arr) {
        int n = arr.length;
        int s = 0;
        int e = n-1;
        int ans = -1;

        if (arr[s] < arr[e]) {
            return -1;
        }

        while (s <= e) {
            int mid = s + (e-s) /2;
            if (arr[mid] <= arr[n-1]) {
                e = mid -1;
            } else {
                ans =mid;
                s=mid + 1;
            }
        }
        return ans;

    }

    int binarySearch(int[] arr, int s, int e, int target) {
        while (s <= e) {
            int mid = s + (e -s) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (target > arr[mid]) {
                s = mid + 1;
            } else {
                e = mid -1;
            }
        }
        return -1;
    }

    int searchInRotateArray (int[] arr, int target) {
        int pivotIndex = pivotIndexRotateArray(arr);
        int n = arr.length;
        int ans = -1;

        if (pivotIndex == -1) {
            ans = binarySearch(arr, 0, n-1, target);
        } else {
            int startArray1 = 0;
            int endArray1 = pivotIndex;

            if (target >= arr[startArray1] && target <= arr[endArray1]) {
                ans = binarySearch(arr, startArray1, endArray1, target);
            }

            int startArray2 = pivotIndex;
            int endArray2 = n-1;

            if (target >= arr[endArray2] && target <= arr[endArray2]) {
                ans = binarySearch(arr, startArray2, endArray2, target);
            }

        }
        return  ans;

    }

    void main(String[] args) {
        int[] arr = {50, 60, 70, 10, 20, 30, 40};
        int ans = searchInRotateArray(arr, 70);
        System.out.println("Ans: " + ans);
    }
}
