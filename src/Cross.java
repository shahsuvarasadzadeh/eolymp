package EOlimp;

import java.util.Scanner;

public class Cross {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i = 0; i < 2 * a - 1; i++) {
            for (int j = 0; j < 2 * a - 1; j++) {
                if (j == i||j == 2 * a - 2 - i) {
                    System.out.print("*");
                }
                 else if (j == a - 1) {
                    System.out.print(" ");
                } else {
                    System.out.print(" ");
                }

            }

            System.out.println();
        }
    }
}
