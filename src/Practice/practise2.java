package Practice;

public class practise2 {
    int[] moveAllZeros(int[] arr) {
        int n = arr.length;
        int j = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }

        return arr;
    }

    int missingNumber (int[] arr) {
        int n = arr.length;
        int sumOfSequence = 0;
        int arraySum = 0;

        for (int i = 0; i <= 5; i++) {
            sumOfSequence =  sumOfSequence + i;
        }
        for (int i = 0; i < n; i++) {
            arraySum = arraySum + arr[i];
        }
        return sumOfSequence - arraySum;
    }

    int findSingleNumber (int[] arr) {
        int n = arr.length;
        int result = 0;

        for (int i = 0; i < n; i++) {
            result = result ^ arr[i];
        }

        return result;
    }


    void main () {
        int[] arr = {1, 1, 2, 2, 3, 4, 4, 5, 5};
        int ans = findSingleNumber(arr);

        System.out.println(ans);

//        for (int i : ans) {
//            System.out.print(i + ", ");
//        }
    }
}
