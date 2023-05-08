package Strings;

public class ShortestPath {
    public static float shortestPath(String str) {
        int x = 0, y = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'N') {
                y++;
            } else if (str.charAt(i) == 'S') {
                y--;
            } else if (str.charAt(i) == 'E') {
                x++;
            } else {
                x--;
            }
        }
        return (float) (Math.sqrt(x * x + y * y));
    }

    public static void main(String[] args) {
        String path = "EEE";
        float sdist = shortestPath(path);
        System.out.println("The shortest distance is : " + sdist);
    }
}
