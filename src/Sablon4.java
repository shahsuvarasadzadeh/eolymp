import java.util.Scanner;

public class Sablon4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i <= n / 2; i++) {
            for (int j = 1; j <=n; j++) {
                if (j>i && j<=n-i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for (int i = n/2-1; i >=0; i--) {
            for (int j =n; j >=1; j--) {
                if (j<=n-i&&j>i){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            }
    }
}
