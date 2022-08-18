package EOlimp;

import java.util.Scanner;

public class KvadratTenlik {

        public static void main(String[] Strings) {

            Scanner input = new Scanner(System.in);


            double a = input.nextDouble();

            double b = input.nextDouble();

            double c = input.nextDouble();
            int r1,r2;

            if (a != 0) {

                double result = b * b - 4.0 * a * c;
                double sqrt=Math.sqrt(result);

                if (result > 0.0) {
                 r1 = (int) ((-b + sqrt) / (2.0 * a));
                  r2 = (int) ((-b - sqrt) / (2.0 * a));
if (r1>r2){
    System.out.println("Two roots"+" "+r2+" "+r1);
}
else {
    System.out.println("Two roots"+" "+r1+" "+r2);
}
                    }

                else if (result == 0.0) {

                    r1 = (int) ((-b +sqrt)/ (2.0 * a));
                    System.out.println("One root"+" "+r1);
                } else {
                    System.out.println("No roots");
                }

            }
            else {
                r1= (int) (-c/b);
                System.out.println(r1);
            }

        }
    }
