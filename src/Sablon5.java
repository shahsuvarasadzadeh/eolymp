import java.util.Scanner;

public class Sablon5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
        for (int j = 0; j <= n / 2; j++) {
            for (int i = 0; i <n; i++) {
                if (i <j+1 || i>=n-j-1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for (int j = 1; j <=n/2; j++) {
            for (int i = 0; i < n; i++) {
                if (i > (n / 2) - j && i < n / 2 + j) {//1.5  .5
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
