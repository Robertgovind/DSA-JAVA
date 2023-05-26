package Recursion;

public class Factorial {
    public static void printFactorial(int n, long fact) {
        if (n == 1) {
            fact *= n;
            System.out.println(fact);
            return;
        }
        fact *= n;
        printFactorial(n - 1, fact);
    }

    public static void main(String[] args) {
        int n = 5;
        printFactorial(n, 1);
    }
}