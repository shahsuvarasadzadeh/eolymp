package deyisen;

import java.util.Scanner;

public class DeyiseninQiymeti4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y;


        y = (2 * x - 1) / (x * x) + (Math.sqrt(x * x + 1) / 2);
        System.out.println(y);
    }
    }

