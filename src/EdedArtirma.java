package EOlimp;

import java.util.Scanner;

public class EdedArtirma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[sc.nextInt()];//{}//N
        String s = "";
        for (int i = 0; i < a.length; i++)
        {//{5,5,65565}/n
            a[i] = sc.nextInt();

        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] >= 0) {
                a[i] = a[i] + 2;
            }
          s=s+a[i]+" ";

        }
        System.out.println(s.trim());

        /*for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }*/

    }
}
