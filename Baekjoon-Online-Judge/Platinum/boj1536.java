import java.util.Scanner;

public class boj1536 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cycle = scanner.nextInt();

        float[] grades = new float[cycle];
        float max = 0f;

        for (int i = 0; i < cycle; i++) {
            grades[i] = scanner.nextFloat();
            if (grades[i] > max) max = grades[i];
        }

        float result = 0;

        for (float grade : grades) {
            result += grade / max * 100f / cycle;
        }

        System.out.println(result);
    }
}
