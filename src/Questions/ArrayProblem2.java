package Questions;

public class ArrayProblem2 {
    int[] sortArrayBy01(int[] arr) {
        int size = arr.length;

        int i = 0;
        int j = size - 1;

        while (i < j) {
            if (arr[i] == 1 && arr[j] == 0) {
                arr[i] = 0;
                arr[j] = 1;
            }
            if (arr[i] == 0) {
                i++;
            }
            if (arr[j] == 1) {
                j--;
            }
        }
        return arr;
    }

    int getMissingNumber (int[] arr) {
//        int sum = 0;
//
//        for (int i : arr) {
//            sum += i;
//        }
//
//        int result = n - sum;
//        return result;

        int xorSum = 0;
        for (int n: arr) {
            xorSum = xorSum ^n;
        }

        for (int i=0; i<=arr.length; i++) {
            xorSum = xorSum ^ i;
        }

        return xorSum;

    }

    int uniqueElement (int[] arr) {
        int xorSum = 0;
        for (int n: arr) {
            xorSum = xorSum ^ n;
        }
        return xorSum;
    }

    void main () {
        int[] arr =  {2, 5, 5, 4, 4, 3, 3};
        int ans = uniqueElement(arr);
        System.out.println(ans);
//        for (int i: ans) {
//            System.out.println(i + ", ");
//        }
    }
}
