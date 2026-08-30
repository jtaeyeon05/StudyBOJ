import java.util.Scanner;

public class boj2563 {
    public static void main(String[] args) {
        final int[][] paper = new int[101][101];
        int result = 0;

        final Scanner scanner = new Scanner(System.in);
        final int paperLength = scanner.nextInt();
        for (int index = 0; index < paperLength; index++) {
            final int x = scanner.nextInt();
            final int y = scanner.nextInt();
            for (int xx = x; xx < x + 10; xx++) {
                for (int yy = y; yy < y + 10; yy++) {
                    if (paper[xx][yy] == 0) result++;
                    paper[xx][yy]++;
                }
            }
        }

        System.out.println(result);
    }
}
