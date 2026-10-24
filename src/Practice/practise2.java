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


    int[] unionArray(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        int count = 0;

        for (int i = 0; i < arr1.length; i++) {
            boolean found = false;

            for (int j = 0; j < count; j++) {
                if (result[j] == arr1[i]) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                result[count] = arr1[i];
                count++;
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            boolean found = false;

            for (int j = 0; j < count; j++) {
                if (result[j] == arr2[i]) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                result[count] = arr2[i];
                count++;
            }
        }

        return java.util.Arrays.copyOf(result, count);
    }



    void main () {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {3, 4, 5, 6};
        int[] ans = unionArray(arr1, arr2);

//        System.out.println(ans);

        for (int i : ans) {
            System.out.print(i + ", ");
        }
    }
}
