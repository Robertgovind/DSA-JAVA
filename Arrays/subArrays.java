package Arrays;

public class subArrays {
    public static void subarrays(int arr[]) {
        int totalsubArrays = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");

                }
                totalsubArrays++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total subArrays: " + totalsubArrays);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };
        subarrays(arr);
    }
}
