package deyisen;

import java.util.Scanner;

public class DeyiseninQiymeti5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y;


        y = (2 * x) / Math.sqrt(x * x + 1) - (Math.sqrt(x * x + 1) / (x * x * x));
        System.out.println(y);
    }
}
