package Questions;

import java.util.HashMap;

public class ArrayManipulation {
    int[] reverseArray (int arr[]) {
        int size = arr.length;

        int i = 0;
        int j = size -1;

        while (i <= j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        return arr;
    }

    int[] rightShiftByOne (int arr[]) {
        int size = arr.length;
        int temp = arr[size -1];

        for (int i = size-1; i > 0; i--) {
            arr[i] = arr[i-1];
        }
        arr[0] = temp;
        return arr;
    }

    void printAlternate(int arr[]) {
        int size = arr.length;
        int i = 0;
        int j = size-1;
        while ( i <= j) {
            if (i == j) {
                System.out.println(arr[i]);
                return;
            } else {
                System.out.println(arr[i]);
                i++;
                System.out.println(arr[j]);
                j--;
            }
        }

    }

    int getMode (int arr[]) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int num: arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

//        for (int i : freq.keySet()) {
//            System.out.println(i + " -> " + freq.get(i));
//        }

        int maxFreq = -1;
        int maxFreqKey = -1;

        for (int key: freq.keySet()) {
            int currentKey = key;
            int currentKeyFreq = freq.get(key);

            if (currentKeyFreq > maxFreq) {
                maxFreq = currentKeyFreq;
                maxFreqKey = currentKey;
            }
        }
        return maxFreqKey;
    }

    int[] getHighestLowestFreqElement (int arr[]) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        int highest = Integer.MIN_VALUE;
        int highestNum = -1;

        for (int key: freq.keySet()) {
            int currentkey = key;
            int currentFreq = freq.get(key);
            if (currentFreq > highest) {
                highest = currentFreq;
                highestNum = currentkey;
            }
        }
        int lowestFreq = Integer.MAX_VALUE;
        int lowsetNum = -1;
        for (int key: freq.keySet()) {
            int currentkey = key;
            int currentFreq = freq.get(key);
            if (currentFreq < lowestFreq) {
                lowestFreq = currentFreq;
                lowsetNum = currentkey;
            }
        }
        int ans[] = {highest, lowestFreq};
        return ans;
    }

    int[] getUnion(int[] arr1, int[] arr2) {
        int[] temp = new int[arr1.length + arr2.length];
        int k = 0;
        for (int i = 0; i < arr1.length; i++) {
            boolean found = false;

            for (int j = 0; j < k; j++) {
                if (temp[j] == arr1[i]) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                temp[k++] = arr1[i];
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            boolean found = false;

            for (int j = 0; j < k; j++) {
                if (temp[j] == arr2[i]) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                temp[k++] = arr2[i];
            }
        }

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = temp[i];
        }
        return result;
    }

    int [] shiftElementByk(int arr[], int k) {
        int size = arr.length;

        if (size == 0) {
            return arr;
        }

        k = k % size;
        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            result[(i+k) % size] = arr[i];
        }
        return result;
    }

    void main () {
        int arr1[] = {1, 2, 3, 4, 5, 6};
        int ans[] = shiftElementByk(arr1, 2);
        for (int i: ans) {
            System.out.print(i+ ", ");
        }

//        int ans[] = getHighestLowestFreqElement(arr);
//        System.out.println(ans[0]);
//        System.out.println(ans[1]);

//        int[] ans =  rightShiftByOne(arr);
//        for(int i : ans) {
//            System.out.print(i + ", ");
//        }

    }
}
