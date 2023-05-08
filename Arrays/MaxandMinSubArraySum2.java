//kadanes algorithm
package Arrays;

public class MaxandMinSubArraySum2 {
    public static void kadanes(int arr[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];
            if (currSum < 0) {
                currSum = 0;
            }
            maxSum = Math.max(currSum, arr[i]);
        }
        System.out.println("Max subarray sum is: " + maxSum);
        ;

    }

    public static void main(String[] args) {
        int arr[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        kadanes(arr);
    }

}
