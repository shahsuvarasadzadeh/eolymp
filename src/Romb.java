package EOlimp;

import java.util.Scanner;

public class Romb {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();

        for (int i=0;i<a;i++){
            for (int j=1;j<2*a;j++){
                if (j<a-i||j>a+i) {

                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }

            }
            System.out.println();
        }

        for (int i = 0; i < a; i++) {
            for (int j = 2 * a - 1; j > 0; j--) {
                if (j < 2 * a - i && j > i) {
                    System.out.print("*");
                } else System.out.print(" ");
            }
            System.out.println();
        }
}
}
