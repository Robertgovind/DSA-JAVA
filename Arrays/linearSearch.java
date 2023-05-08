package Arrays;

public class linearSearch {
    public static int linearsearch(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 5, 3, 7, 8, 10, 23, 22, 1 };
        int key = 10;
        int index = linearsearch(arr, key);
        System.out.println("the index is: " + index);

    }
}
