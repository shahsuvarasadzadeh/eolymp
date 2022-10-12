package eded;

import java.util.Scanner;

public class EdedinReqemlerinSayi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum = 0;
        int m = a;
        int i = 0;

        while (a > 0) {
            while (a > 0) {
                sum = sum + a % 10;
                a = a / 10;
            }
            a = m - sum;
            sum = 0;
        }

        System.out.println(a);

    }
}
