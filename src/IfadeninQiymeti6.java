import java.util.Scanner;

public class IfadeninQiymeti6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double sum = 0;

        sum = (((x-y)*(x-y))/(Math.sqrt(x*x+y*y-1))+(Math.sqrt(x*x+y*y-1)/(2*x*y)));
        System.out.println(sum);
    }
}
