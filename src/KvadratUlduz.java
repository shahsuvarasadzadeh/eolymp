package EOlimp;

import java.util.Scanner;

public class KvadratUlduz {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c=b;
        int d=1;
        while (a>0){
            System.out.println();
            while (b>0){
                System.out.print("* ");
                b--;
            }
            b=c;
            a--;
        }



    }
}
