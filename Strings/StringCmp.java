package Strings;

public class StringCmp {
    public static void main(String[] args) {
        String s1 = "Govind";
        String s2 = "Govind";
        String s3 = new String("Govind");
        if (s1.compareTo(s3) == 0) {
            System.out.println("strings are equal.");
        } else {
            System.out.println("stings are not equal.");
        }
        if (s1.equals(s3)) {
            System.out.println("strings are equal.");
        } else {
            System.out.println("strings are not equal.");
        }
    }
}
