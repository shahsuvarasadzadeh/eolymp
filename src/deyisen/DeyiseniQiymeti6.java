package deyisen;

import java.util.Scanner;

public class DeyiseniQiymeti6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y;


        y = Math.sqrt(x*x*x*x+1)/(x*x)-Math.sqrt((x*x)/(x*x+1));
        System.out.println(y);
    }
}
