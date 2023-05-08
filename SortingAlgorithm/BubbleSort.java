package SortingAlgorithm;

public class BubbleSort {
    public static void bubbleSort(int arr[]) {
        int n = arr.length;
        for (int turn = 0; turn < n - 1; turn++) {
            for (int j = 0; j < n - 1 - turn; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 8, 3, 2, 7, 9, 4, 6 };
        bubbleSort(arr);
        printArray(arr);
    }
}
