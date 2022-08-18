package EOlimp;
import java.util.Scanner;
public class KvadratTenlik2 {

        public static void main(String args[]) {
            int secondRoot, firstRoot;

            Scanner sc = new Scanner(System.in);
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();
            if (-100 <= a && a <= 100 && -100 <= b && b <= 100 && -100 <= c && c <= 100) {
                double determinant = (b * b) - (4 * a * c);
                double sqrt = Math.sqrt(determinant);

                if (determinant > 0) {
                    firstRoot = (int) ((-b + sqrt) / (2 * a));
                    secondRoot = (int) ((-b - sqrt) / (2 * a));
                    if (firstRoot < secondRoot) {
                        System.out.println("Two roots:" + " " + firstRoot + " " + secondRoot);
                    } else {
                        System.out.println("Two roots:" + " " + secondRoot + " " + firstRoot);
                    }
                } else if (determinant == 0) {
                    System.out.println("One root:" + " " + (int) (-b + sqrt) / (2 * a));
                } else {
                    System.out.println("No roots");
                }
            }
        }
    }

