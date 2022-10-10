import java.util.Scanner;

public class IfadeninQiymeti2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double sum = 0;

        sum = ((x - y) * (x - y) + 3 * y * y) / (x + 5) + ((3 * x * x - y * y) / (y - 7));
        System.out.println(sum);
    }
}
