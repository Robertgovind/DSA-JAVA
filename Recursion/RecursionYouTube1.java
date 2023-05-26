package Recursion;

public class RecursionYouTube1 {
    public static void printNumDec(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n + " ");
        printNumDec(n - 1);
    }

    public static void printNumInc(int index, int n) {
        if (index == n) {
            return;
        }
        System.out.print(index + " ");
        printNumInc(index + 1, n);
    }

    public static void sumToN(int n, int sum) {
        if (n == 0) {
            System.out.println(sum);
            return;
        }
        sum += n;
        sumToN(n - 1, sum);
    }

    public static void factorialOfN(int n, int fact) {
        if (n == 0) {
            System.out.println("factorial is: " + fact);
            return;
        }
        fact = fact * n;
        factorialOfN(n - 1, fact);
    }

    public static void printFibonacci(int a, int b, int n) {
        if (n == 0) {
            return;
        }
        System.out.print(a + " ");
        printFibonacci(b, a + b, n - 1);
    }

    // x^n
    // with stack height = n
    public static int printPower(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }
        int x_ = printPower(x, n - 1);
        int xn = x * x_;
        return xn;
    }

    // x^n
    // with stack height = logn
    public static int printPowerOptmz(int x, int n) {

        if (n == 0) {
            return 1;
        }
        if (n % 2 == 0) {
            return printPowerOptmz(x, n / 2) * printPowerOptmz(x, n / 2);
        } else {
            return x * printPowerOptmz(x, n / 2) * printPower(x, n / 2);
        }
    }

    public static void main(String[] args) {
        printNumDec(10);
        System.out.println();
        printNumInc(1, 10);
        System.out.println();
        sumToN(10, 0);
        factorialOfN(5, 1);
        printFibonacci(0, 1, 10);
        System.out.println();
        int val = printPower(5, 2);
        System.out.println("The value is : " + val);
        val = printPowerOptmz(3, 3);
        System.out.println("The value is : " + val);
    }
}
