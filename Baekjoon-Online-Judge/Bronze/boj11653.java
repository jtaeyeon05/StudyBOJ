import java.util.Scanner;

public class boj11653 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        int target = scanner.nextInt();
        for (int index = 2; index <= target; index++) {
            while (target % index == 0) {
                System.out.println(index);
                target /= index;
            }
        }
    }
}
