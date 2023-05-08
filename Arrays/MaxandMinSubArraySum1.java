//using prefix sum method
package Arrays;

public class MaxandMinSubArraySum1 {
    public static void maxandminSubarraySum(int arr[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;

        // pefix array
        int psum[] = new int[arr.length];
        psum[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            psum[i] = psum[i - 1] + arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                currSum = start == 0 ? psum[end] : psum[end] - psum[start - 1];
                if (currSum > maxSum) {
                    maxSum = currSum;
                }
                if (currSum < minSum) {
                    minSum = currSum;
                }
            }
        }
        System.out.println("Max sum: " + maxSum);
        System.out.println("Min sum: " + minSum);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };
        maxandminSubarraySum(arr);
    }
}
