package Arrays;

public class passingArray {
    public static void update(int marks[]) { // always passs by referece
        for (int i = 0; i < marks.length; i++) {
            marks[i] += 30;
        }
    }

    public static void main(String[] args) {
        int marks[] = { 44, 43, 23, 29 };
        update(marks);
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
    }
}
