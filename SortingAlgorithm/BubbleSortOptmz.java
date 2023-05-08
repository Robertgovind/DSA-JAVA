package SortingAlgorithm;

public class BubbleSortOptmz {
    public static void bubbleSort(int arr[]) {
        int n = arr.length;
        for (int turn = 0; turn < n - 1; turn++) {
            int swap = 0;
            for (int j = 0; j < n - 1 - turn; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap++;
                }
            }
            if (swap == 0) {
                System.out.println("Already sorted.");
                break;
            }
        }
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        bubbleSort(arr);
        printArray(arr);
    }

}
