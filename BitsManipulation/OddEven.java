package BitsManipulation;

public class OddEven {
    public static void isOddEven(int n) {
        int bitMask = 1;
        if ((n & bitMask) == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }

    public static void main(String[] args) {
        isOddEven(5);
        isOddEven(10);
    }
}
