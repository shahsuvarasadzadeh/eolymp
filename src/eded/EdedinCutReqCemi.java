package eded;

import java.util.Scanner;

public class EdedinCutReqCemi {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a = 0;
        int c = 0;
        int b = 0;
        while (n > 0) {
            a = n % 10;
            n = n / 10;
            if (a % 2 == 0) {
                c++;
                b = b + a;
            }
        }
        if (c != 0) {
            System.out.println(b);
        } else {
            System.out.println(-1);
        }
    }
}
