import java.util.ArrayList;
import java.util.Scanner;

public class boj9020 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> primeNumbers = new ArrayList<>();
        for (int i = 2; i <= 10000; i++) {
            boolean result = true;
            for (int ii : primeNumbers) {
                if (i % ii == 0) {
                    result = false;
                    break;
                }
            }
            if (result) primeNumbers.add(i);
        }

        int testCases = scanner.nextInt();
        for (int testCase = 0; testCase < testCases; testCase++) {
            final int target = scanner.nextInt();
            int[] result = {0, 10000}; 
            for (int primeNumber : primeNumbers) {
                if (primeNumber >  target / 2) break;
                int second = target - primeNumber;
                if (primeNumbers.contains(second) && result[1] - result[0] > second - primeNumber) {
                    result[0] = primeNumber;
                    result[1] = second;
                }
            }
            System.out.println(result[0] + " " + result[1]);
        }
    }
}
