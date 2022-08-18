package EOlimp;

import java.util.Scanner;

public class BoyukOlmayanIlkElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a[] = new double[sc.nextInt()];
        int x = -1;
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextDouble();
            if (a[i] <= 2.5) {
                x = i;
                break;
            }
        }
          if (x>=0){
              System.out.println(x+" "+a[x]);
          }
          else {
              System.out.println("Not Found");
          }
    }
}
