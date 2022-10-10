import java.util.Scanner;

public class IfadeninQiymeti3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double sum = 0;

        sum = ((2 * x + y) / (x * x - x * y + 4 * y * y) + (2 * x * x - x * y + y * y) / (x + 4 * y));
        System.out.println(sum);
    }
}
