package EOlimp;

import java.util.Scanner;

public class KibritKub {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = (n * 12) - 4 * (n - 1);
        System.out.println(a);
    }
}
