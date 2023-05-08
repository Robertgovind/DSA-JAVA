package Arrays;

public class reveseArray {
    public static void reversearray(int arr[]) {
        int s = 0;
        int e = arr.length - 1;
        while (s < e) {
            int temp;
            temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;

            s++;
            e--;

        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 4, 3, 6, 5, 7, 8, 9 };
        System.out.println("Berore: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        reversearray(arr);
        System.out.println("After: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
