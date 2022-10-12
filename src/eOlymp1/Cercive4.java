package eOlymp1;

import java.util.Scanner;

public class Cercive4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s= sc.nextInt();
        for (int j = 0; j < n; j++) {
            if (j == 0 || j == n - 1) {
                for (int i = 0; i < s; i++) {
                    System.out.print("*");
                }
                System.out.println();
            } else {
                for (int i = 0; i < s; i++) {
                    if (i == 0 || i == s - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}
