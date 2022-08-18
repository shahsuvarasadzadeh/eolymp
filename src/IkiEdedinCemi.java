package EOlimp;

import java.util.Scanner;

public class IkiEdedinCemi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b, c, sum;
        int n = 0;
        int[] i = new int[a];
        while (a > 0) {
            b = sc.nextInt();
            c = sc.nextInt();
            sum = c + b;
            i[n] = sum;
            a--;
            n++;
        }
        for (int e = 0; e <i.length; e++) {
            System.out.println(i[e]);
        }
    }
}
