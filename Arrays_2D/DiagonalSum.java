package Arrays_2D;

public class DiagonalSum {
    public static void diagonalSum(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (i == j) {
                    sum += arr[i][j];
                }
                if (i + j == arr.length - 1) {
                    sum += arr[i][j];
                }
            }
        }
        System.out.println("The diagonal sum is : " + sum);
    }

    public static void diagonalSumOptmz(int arr[][]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][i];
            if (i != arr.length - 1 - i) {
                sum += arr[i][arr.length - 1 - i];
            }
        }
        System.out.println("The diagonal sum by optimized method is : " + sum);
    }

    public static void printArray(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
        printArray(matrix);
        diagonalSum(matrix);
        diagonalSumOptmz(matrix);

    }
}
