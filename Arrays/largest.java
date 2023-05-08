package Arrays;

public class largest {
    public static int Largest(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 2, 1, 5, 6, 4, 8, 9 };
        int largest = Largest(arr);
        System.out.println("The largest value is: " + largest);
    }
}
