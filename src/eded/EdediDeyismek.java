package eded;

import java.util.Scanner;

public class EdediDeyismek {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a = 0;
        int c = 1;
        int b = 0;
        while (n > 0) {//121
            a = n % 10;//1
            n = n / 10;//12
            if (a % 2 == 0) {
                a++;
            } else {
                a--;
            }
            b = b + a * c;
            c = c * 10;
        }
        System.out.println(b);
    }
}
