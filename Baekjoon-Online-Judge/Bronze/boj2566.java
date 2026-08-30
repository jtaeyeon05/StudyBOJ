import java.util.Scanner;

public class boj2566 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        int max = -1;
        int x = 0;
        int y = 0;

        for (int yy = 1; yy <= 9; yy++) {
            for (int xx = 1; xx <= 9; xx++) {
                int value = scanner.nextInt();
                if (value > max) {
                    max = value;
                    x = xx;
                    y = yy;
                }
            }
        }

        System.out.println(max);
        System.out.println(y + " " + x);
    }
}
