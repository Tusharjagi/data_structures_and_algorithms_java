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

    void main () {

        int[] arr = {1, 2, 3, 4, 5};
        int ans = sumOfArrayElements(arr);

//        for (int i : ans) {
//            System.out.println(i + ", ");
//        }
        System.out.println(ans);
    }
}
