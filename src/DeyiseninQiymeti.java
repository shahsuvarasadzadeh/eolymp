import java.util.Scanner;

public class DeyiseninQiymeti {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y;


        y = (x * x + 3 * x - 4) / (2 * x - 3) - (x + 2) / (x * x - 5 * x + 7);
        System.out.println(y);
    }
}
