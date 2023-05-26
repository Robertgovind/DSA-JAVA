package Recursion;

import java.util.HashSet;

public class RecursionYouTube2 {

    // Q1.Tower of Hanoi-Transfer n disks from source to destation over 3 towers
    public static void towerOfHanoi(int n, String src, String helper, String dest) {
        if (n == 1) {
            System.out.println("Transfer " + n + " from " + src + " to " + dest);
            return;
        }
        towerOfHanoi(n - 1, src, dest, helper);

        System.out.println("Transfer " + n + " from " + src + " to " + helper);

        towerOfHanoi(n - 1, helper, src, dest);
    }

    // Q2.Print a string in reverse order
    public static String reverseString(String str) {
        if (str.length() == 1) {
            return str;
        }
        char currChar = str.charAt(0);
        String neXtString = reverseString(str.substring(1));
        return neXtString + currChar;
    }

    /// Q3.Find the first and last occurence of an element in a string
    public static int first = -1;
    public static int last = -1;

    public static void getOccurence(String str, char element, int index) {
        if (index == str.length()) {
            return;
        }
        if (str.charAt(index) == element) {
            if (first == -1) {
                first = index;
            } else {
                last = index;
            }
        }
        getOccurence(str, element, index + 1);
    }

    // Q4.Check if an array is sorted or not(strictly increasing)=O(n)
    public static boolean isSorted(int arr[], int index) {

        if (index == arr.length - 1) {
            return true;
        }
        if (!isSorted(arr, index + 1)) {
            return false;
        }
        return arr[index] < arr[index + 1];
    }

    // Q5.Move all x to the last of the string -O(n)
    public static String addX(int count) {
        String newString = "x";
        for (int i = 1; i < count; i++) {
            newString += 'x';
        }
        return newString;
    }

    public static String moveAllx(String str, int index, int count) {
        if (index == str.length()) {
            return addX(count);
        }

        if (str.charAt(index) == 'x') {
            return moveAllx(str, index + 1, count + 1);
        } else {
            String newString = moveAllx(str, index + 1, count);
            return str.charAt(index) + newString;
        }
    }

    // Q6.Remove all duplicates in a string
    public static String removeDuplicates(String str, int index, boolean[] tester) {
        if (index == str.length()) {
            return "";
        }
        char curr = str.charAt(index);
        if (tester[curr - 'a']) {
            return removeDuplicates(str, index + 1, tester);
        } else {
            tester[curr - 'a'] = true;
            return curr + removeDuplicates(str, index + 1, tester);
        }
    }

    // Q7.Print all the subsequences of a string.
    public static void printsubsequence(String str, int index, String result) {
        if (index == str.length()) {
            System.out.println(result);
            return;
        }
        // choose
        printsubsequence(str, index + 1, result + str.charAt(index));
        // do not choose
        printsubsequence(str, index + 1, result);
    }

    // Q8.Print all the unique subsequences of a string.
    public static void printUniqueSubsequence(String str, int index, String result, HashSet<String> allSubSeq) {
        if (index == str.length()) {
            if (allSubSeq.contains(result)) {
                return;
            }
            allSubSeq.add(result);
            System.out.println(result);
            return;
        }
        // choose
        printUniqueSubsequence(str, index + 1, result + str.charAt(index), allSubSeq);
        // donot choose
        printUniqueSubsequence(str, index + 1, result, allSubSeq);
    }

    // Q9.Print keyPad combinations
    public static String keyPad[] = { " ", ".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

    public static void printCombinations(String number, int index, String result) {
        if (index == number.length()) {
            System.out.println(result);
            return;
        }
        for (int i = 0; i < keyPad[number.charAt(index) - '0'].length(); i++) {
            char curr = keyPad[number.charAt(index) - '0'].charAt(i);
            printCombinations(number, index + 1, result + curr);
        }
    }

    public static void main(String[] args) {
        towerOfHanoi(2, "A", "B", "C");

        System.out.println(reverseString("abcdefgh"));

        getOccurence("abcdefccacc", 'c', 0);
        System.out.println("first occurence: " + first);
        System.out.println("last occurence: " + last);

        int[] arr = { 1, 2, 3, 4, 5 };
        if (isSorted(arr, 0)) {
            System.out.println("Strictly increasing");
        } else {
            System.out.println("Not Strictly increasing");
        }

        String str = "abcxdxexfxgxxxxxhij";
        String finalString = moveAllx(str, 0, 0);
        System.out.println(finalString);

        String str1 = "abbcccdddefggg";
        boolean[] tester = new boolean[str1.length()];
        System.out.println(removeDuplicates(str1, 0, tester));

        printsubsequence("abcd", 0, "");

        HashSet<String> allsubSub = new HashSet<>();
        printUniqueSubsequence("bbbb", 0, "", allsubSub);

        printCombinations("34", 0, "");
    }
}
