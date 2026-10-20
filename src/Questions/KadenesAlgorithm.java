package Questions;

public class KadenesAlgorithm {

    int maxSumContiguousSubArray (int[] arr) {
        int sum = 0;
        int maxi = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            maxi = Math.max(maxi, sum);

            if (sum < 0) {
                sum = 0;
            }
        }
        return maxi;
    }

    void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSumContiguousSubArray(arr));

    }
}
