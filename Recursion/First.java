package Recursion;

public class First {
    public static void printNumbers(int num) {
        if (num == 0) { // Base condition
            return;
        }
        System.out.print(num + " "); // Work to be done
        printNumbers(num - 1); // Recurisve call
    }

    public static void main(String[] args) {
        printNumbers(10);
    }
}
