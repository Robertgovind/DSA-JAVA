package Recursion;

public class SumToN {
    public static void sumToN(int index, int n, int sum) {
        if (index == n) {
            sum += index;
            System.out.println("The sum is:" + sum);
            return;
        }
        sum += index;
        sumToN(index + 1, n, sum);
    }

    public static void main(String[] args) {
        int n = 10;
        sumToN(0, n, 0);

    }
}
