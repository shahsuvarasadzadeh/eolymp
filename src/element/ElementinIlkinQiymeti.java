package element;

import java.util.Scanner;

public class ElementinIlkinQiymeti {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] n = new int[sc.nextInt()];
        int b = 0;
        for (int i = 0; i < n.length; i++) {
            n[i] = sc.nextInt();
        }
        b = n[0];
        for (int i = 0; i < n.length - 1; i++) {
            if (n[i] > n[i + 1]) {
                b = Math.min(b, n[i + 1]);
            } else if (n[i] < n[i + 1]) {
                b = Math.min(b, n[i]);
            }
        }
        b=b/2;
        for (int i=0;i<n.length;i++){
            n[i]=n[i]-b;
        }
        for (int i=0;i<n.length;i++){
            System.out.print(n[i]+" ");
        }
    }
}
