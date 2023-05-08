package SortingAlgorithm;

public class CountingSort {
    public static void countingSort(int arr[]) {
        int max = Integer.MIN_VALUE;

        // find max value in aray
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // counting array
        int count[] = new int[max + 1]; // if 7 then array size must be 7+1
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        // sorting
        int i = 0;
        for (int j = 0; j < count.length; j++) {
            while (count[j] > 0) {
                arr[i] = j;
                i++;
                count[j]--; // decrease frequency
            }
        }
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 4, 3, 2, 1, 2, 3, 6, 3, 2, 1, 7 };
        countingSort(arr);
        printArray(arr);
    }
}
