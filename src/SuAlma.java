package EOlimp;

import java.util.Scanner;

public class SuAlma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double d = sc.nextDouble();
        int alindi = 0;
        int count = 0;
        while (d >= 1.20) {
            if (d >= 1.20) {
                alindi = (int) (d / 1.20);
                d = d - (alindi * 1.20);
            }
            d = d + (alindi * 0.2);
            count = count + alindi;
        }
        System.out.println(count);
    }
}
