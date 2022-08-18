package EOlimp;

import java.util.Scanner;

public class Cevrilme {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a=0;
        if (n>=1 && n<=1000000*1000){
            while (n > 1) { if (n%2>0){
                n++;
                a++;
            }
            else {
            n=n/2;
            a++;
        }
            }
            System.out.println(a);
        }


    }
}
