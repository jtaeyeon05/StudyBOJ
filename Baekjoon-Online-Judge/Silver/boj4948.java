import java.util.ArrayList;
import java.util.Scanner;

public class boj4948 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] primeNumbers = new int[246914];
        ArrayList<Integer> primeNumberArrayList = new ArrayList<>();
        primeNumbers[1] = 1;
        for (int i = 2; i <= 246913; i++) {
            for (int ii : primeNumberArrayList) {
                if (i % ii == 0) {
                    primeNumbers[i] = 1;
                    break;
                }
            }
            if (primeNumbers[i] == 0) primeNumberArrayList.add(i);
        }

        while (true) {
            final int n = scanner.nextInt();
            int result = 0;
            if (n == 0) break;
            for (int i = n + 1; i <= 2 * n; i++) result += 1 - primeNumbers[i];
            System.out.println(result);
        }
    }
}
