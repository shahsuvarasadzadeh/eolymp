import java.util.Scanner;

public class IfadeninQiymeti5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double sum = 0;

        sum = ((Math.sqrt(x*x+y*y)/((x-y)*(x-y)))-2*x*y/(Math.sqrt(x*x+y*y)));
        System.out.println(sum);
    }
}
