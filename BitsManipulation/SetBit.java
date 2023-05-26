package BitsManipulation;

public class SetBit {
    public static void setBit(int n, int position) {
        int bitMask = 1 << position;
        System.out.println(n | bitMask);
    }

    public static void main(String[] args) {
        setBit(14, 2);
        setBit(16, 3);
    }
}
