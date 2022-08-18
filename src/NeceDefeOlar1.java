package EOlimp;

import java.util.Scanner;

public class NeceDefeOlar1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum;
        int count = 0;
        int i = a;
        if (a != 0) {
            while (a > 0) {
                count++;
                sum = 0;
                while (a > 0) {
                    sum = sum + a % 10;
                    a = a / 10;
                }
                a = i - sum;
                i = a;
            }
        }
        else {
            count=1;
        }
        System.out.println(count);

    }


}
