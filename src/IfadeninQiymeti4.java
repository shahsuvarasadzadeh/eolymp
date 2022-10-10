import java.util.Scanner;

public class IfadeninQiymeti4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double sum = 0;

        sum = (2*x*y/(Math.sqrt(x*x+y*y))-(x+y-1)*(x+y-1)/(x*y));
        System.out.println(sum);
    }
}
