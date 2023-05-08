package Arrays;

public class TrappingRainWater {
    public static int trappingRainWater(int arr[]) {

        // left maximum boundary
        int leftMax[] = new int[arr.length];
        leftMax[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            leftMax[i] = Math.max(arr[i], leftMax[i - 1]);
        }

        // right maximum boudary
        int rightMax[] = new int[arr.length];
        rightMax[arr.length - 1] = arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 0; i--) {
            rightMax[i] = Math.max(arr[i], rightMax[i + 1]);
        }

        int totalVolume = 0;
        int width = 1;
        for (int i = 0; i < arr.length; i++) {
            int waterlevel = Math.min(leftMax[i], rightMax[i]);
            totalVolume += (waterlevel - arr[i]) * width;
        }
        return totalVolume;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 2, 0, 6, 3, 2, 5 };
        int volume = trappingRainWater(arr);
        System.out.println("The total volume of water trapped is: " + volume);
    }
}