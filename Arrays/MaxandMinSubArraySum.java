package Arrays;

//Brute force  technique
public class MaxandMinSubArraySum {
    public static void subarrays(int arr[]) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int currentSum = 0;
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    currentSum += arr[k];
                }
                if (currentSum > max) {
                    max = currentSum;
                }
                if (currentSum < min) {
                    min = currentSum;
                }
                currentSum = 0;
            }
        }
        System.out.println("Max sum is: " + max);
        System.out.println("Min sum is: " + min);
    }
    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };
        subarrays(arr);
    }
}
