package Recursion;

public class PrintNum {
    public static void printDec(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        printDec(n - 1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {

        int n = 10;
        printDec(n);
    }
}
