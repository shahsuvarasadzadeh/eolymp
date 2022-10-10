import java.util.Scanner;

public class IfadeninQiymeti {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double sum = 0;
        sum=2*(x-y)*(x-y)+y*y+(x+y)/7;

        System.out.println(sum);
    }
}
