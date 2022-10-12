package enBoyukVsEnKicik;

import java.util.Scanner;

public class EnBoyukBolen {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long n = s.nextLong();
        long a = n;
        while (n > 1) {
            a--;
            if (n % a == 0) {
                n = 0;

            }
        }
        System.out.println(a);
    }
}
