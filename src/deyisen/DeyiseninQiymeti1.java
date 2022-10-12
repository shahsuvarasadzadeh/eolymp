package deyisen;

import java.util.Scanner;

public class DeyiseninQiymeti1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y;


        y = (x * x * x - 5 * x * x / 7 + 9 * x - 3 / x + 1);
        System.out.println(y);
    }
}
