package Search;

public class BinarySearch {
    int binarySearch(int[] arr, int target) {
        // T.C ->   O(log n)
        int n = arr.length;
        int start = 0;
        int end = n -1;
        int mid = start + (end - start) /2;

        while (start <= end) {
            if (arr[mid] == target) {
                return mid;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
            mid = start + (end - start) /2;
        }

        return -1;
    }

    void main () {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        int ans = binarySearch(arr, 60);
        System.out.println(ans);
//        for (int i: ans) {
//            System.out.print(i + ", ");
//        }
    }
}
