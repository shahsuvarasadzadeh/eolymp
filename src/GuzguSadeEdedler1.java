package EOlimp;

import java.util.Scanner;

public class GuzguSadeEdedler1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();//10
        int b = sc.nextInt();//25
        int c = 0;
        int d=0;
        int count = 0;
        for (int i = a; i <= b; i++) {//15
            if (i % i == 0 && i % 2 != 0 && i % 3 != 0 && i % 5 != 0) {
                System.out.println("i: "+i);
                d=i;
                c=0;
                while (d > 0) {
                    System.out.println("d : "+d);
                    c = c * 10 + (d % 10);
                    d = d / 10;
                    System.out.println("c: "+c);
                }


                if (c % c == 0 && c % 2 != 0 && c % 3 != 0 && c % 5 != 0&& c%7!=0) {
                    System.out.println("c--"+c);
                    count = count + 1;
                }

            } else if (i == 2 || i == 3 || i == 5) {
                count=count+1;
            }
            }
        System.out.println(count);
        }
    }
