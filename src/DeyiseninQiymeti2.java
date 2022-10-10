import java.util.Scanner;

public class DeyiseninQiymeti2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y;


        y = (x - (x * x + 4) / 2 + x * x * x - 3 / (x + 7));
        System.out.println(y);
    }
}
