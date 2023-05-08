package Arrays;

//import java.util.*;

public class binarySearch {

    public static int binarysearch(int arr[], int key) {
        int s = 0, e = arr.length - 1;
        while (s <= e) {
            int mid = (s + e) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) { // second half
                s = mid + 1;
            } else {
                e = mid - 1;
                // first half
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        int arr[] = { 1, 3, 5, 7, 8, 12, 14, 15, 28, 19 };
        int key = 14;
        int val = binarysearch(arr, key);
        System.out.println("The index is : " + val);

    }
}
