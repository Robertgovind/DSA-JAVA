package Recursion;

public class RecursionYouTube3 {
    // Q1.Print all the premutations of a string.
    public static void printPermutations(String str, int index, String premn) {
        if(str.length()==0){
            System.out.println(premn);
            return;
        }

        for(int i=0;i<str.length();i++){
            char currentChar=str.charAt(index);
            String newStr=str.substring(0, index)+str.substring( index+1);
            printPermutations(newStr, index+1, premn+currentChar);
        }
    }

    public static void main(String[] args) {
        String str="abc";
        printPermutations(str, 0, "");
    }
}
