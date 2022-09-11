import java.util.Scanner;

public class Oyun {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t = s.nextInt();
        int n = t;
        int pow = 0;

        while (n > 1) {
            n = n / 2;
            pow++;
        }

        if (n % 2 == 0) {
            System.out.println(0);
        } else {
            t = (int) (t - Math.pow(2, pow));
        }
        System.out.println(t);
    }
}
