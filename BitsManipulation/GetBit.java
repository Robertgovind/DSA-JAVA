package BitsManipulation;

public class GetBit {
    public static void getBit(int n, int position) {
        int bitMask = 1 << position;
        if ((n & bitMask) == 0) {
            System.out.println("0");
        } else {
            System.out.println("1");
        }
    }

    public static void main(String[] args) {
        getBit(4, 2);
        getBit(7, 3);
    }
}
