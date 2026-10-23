package Practice;

public class practise {
    int largetElement(int[] arr) {
        int size = arr.length;
        int largestEle = arr[0];

        for (int i = 0; i < size; i++) {
            if (arr[i] < largestEle) {
                largestEle = arr[i];
            }
        }
        return largestEle;
    }

    int[] reverseArray(int[] arr) {
        int n = arr.length;
        int i = 0;
        int j = n-1;

        while (j >= i) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return arr;
    }

    int[] moveZero (int[] arr) {
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


    int removeDuplicate(int[] arr) {
        int n = arr.length;

        if (n == 0) {
            return 0;
        }

        int j = 0;

        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[j]) {
                j++;
                arr[j] = arr[i];
            }
        }

        return j + 1;
    }


    void main(String[] args) {
        int[] arr = {1, 2, 2, 2 ,4 , 4, 4,3, 5};
        int ans = removeDuplicate(arr);
//        for (int i: ans) {
//            System.out.print(i+", ");
//        }
        System.out.println(ans);
    }
}
