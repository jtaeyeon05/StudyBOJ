import java.util.Scanner;

public class boj2775 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();

        int[][] house = new int[15][15];
        for (int i = 1; i <= 14; i++) house[0][i] = i;
        for (int k = 1; k <= 14; k++) {
            for (int n = 1; n <= 14; n++) {
                for (int nn = 1; nn <= n; nn++) {
                    house[k][n] += house[k - 1][nn];
                }
            }
        }

        for (int testCase = 0; testCase < testCases; testCase++) {
            System.out.println(house[scanner.nextInt()][scanner.nextInt()]);
        }
    }
}
