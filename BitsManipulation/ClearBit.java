package BitsManipulation;

public class ClearBit {
    public static void clearBit(int n, int position) {
        int bitMask = ~(1 << position);
        System.out.println(n & bitMask);
    }

    public static void main(String[] args) {
        clearBit(12, 2);
        clearBit(19, 3);
    }
}
