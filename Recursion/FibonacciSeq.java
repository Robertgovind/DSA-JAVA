package Recursion;

public class FibonacciSeq {
    public static void printFiboancci(int a, int b, int n) {
        if (n == 0) {
            return;
        }
        int next = a + b;
        System.out.print(a + " ");
        printFiboancci(b, next, n - 1);
    }

    public static void main(String[] args) {
        int a = 0, b = 1;
        printFiboancci(a, b, 10);

    }
}
