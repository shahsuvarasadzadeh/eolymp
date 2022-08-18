package EOlimp;

import java.util.Scanner;

public class Exercise2 {


    public static void main(String[] Strings) {

        Scanner input = new Scanner(System.in);


        double a = input.nextDouble();

        double b = input.nextDouble();

        double c = input.nextDouble();

        double result = b * b - 4.0 * a * c;

        if (result > 0.0) {
            double r1 = (-b + Math.pow(result, 0.5)) / (2.0 * a);
            double r2 = (-b - Math.pow(result, 0.5)) / (2.0 * a);


        } else if (result == 0.0) {
            double r1 = -b / (2.0 * a);
            System.out.println("One root: " + r1);
        } else {
            System.out.println("No roots");
        }

    }

}

