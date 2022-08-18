package EOlimp;

import java.util.Scanner;

public class ReqemlerinHasili {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int pr=1;
        while (a>10) {
             int v = a % 10;
             pr=v*pr;
            a = a / 10;
        }
        pr=a*pr;
        System.out.println(pr);
    }

}
