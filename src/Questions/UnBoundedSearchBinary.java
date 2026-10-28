
package Questions;

public class UnBoundedSearchBinary {

    int binarySearch(int[] arr, int s, int e, int target) {
        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }

        return -1;
    }

    int unboundSearch(int[] arr, int target) {
        if (arr == null || arr.length == 0) {
            return -1;
        }

        int s = 0;
        int e = 1;

        while (e < arr.length && arr[e] < target) {
            s = e;
            e = Math.min(e * 2, arr.length - 1);
        }

        return binarySearch(arr, s, e, target);
    }

    public static void main(String[] args) {
        UnBoundedSearchBinary obj = new UnBoundedSearchBinary();

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};

        int target = 6;
        int ans = obj.unboundSearch(arr, target);

        System.out.println("Index: " + ans);
    }
}
