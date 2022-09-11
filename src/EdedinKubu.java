import java.util.Scanner;

public class EdedinKubu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int d = scanner.nextInt();
        int n = 1;
        int i;
        if (d > 1) {
            while (n <= d) {
                i = n * n * n;
                if (i <=d) {
                    System.out.print(i + " ");
                }
                n++;
            }

        }
    }
}
