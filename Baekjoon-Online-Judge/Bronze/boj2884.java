import java.util.Scanner;

public class boj2884 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = scanner.nextInt();
        int minute = scanner.nextInt();

        System.out.print(minute < 45? hour  == 0? 23 : hour - 1 : hour);
        System.out.print(" ");
        System.out.print((minute < 45? 60 : 0) + minute - 45);
    }
}
