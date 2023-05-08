package Strings;

public class SubString {
    public static void subString(String st, int start, int end) {
        for (int i = start; i < end; i++) {
            System.out.print(st.charAt(i));
        }
    }

    public static void main(String[] args) {
        String st = "Govind Kumar Yadav";
        System.out.println(st.substring(5));
        System.out.println(st.substring(5, 10));
        subString(st, 5, 10);
    }
}
