package Arrays_2D;

public class StairCaseSearch {
    public static void stairCaseSearch(int[][] arr, int key) {
        int row = 0;
        int col = arr[0].length - 1;
        while (row < arr.length && col >= 0) {
            if (arr[row][col] == key) {
                System.out.println("Found at (" + row + "," + col + ")");
                break;
            } else if (arr[row][col] < key) {
                row++;
            } else {
                col--;
            }
        }
    }

    public static void main(String[] args) {
        int[][] arr = { { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 } };
        int key = 32;
        stairCaseSearch(arr, key);
    }
}
