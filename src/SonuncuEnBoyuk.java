import java.util.Scanner;

public class SonuncuEnBoyuk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] n = new int[sc.nextInt()];
        int b = 0;
        int c = 0;
        for (int i = 0; i < n.length; i++) {
            n[i] = sc.nextInt();
        }

        c = n[0];
        for (int i = 0; i < n.length - 1; i++) {
            if (n[i] < n[i + 1]) {
                c = Math.max(c, n[i + 1]);
            } else if (n[i] > n[i + 1]) {
                c = Math.max(c, n[i]);
            }
        }
        for (int i = n.length-1; i>0; i--) {
            if (c==n[i]){
               n[i]=n[n.length-1];
                n[n.length-1]=c;
               break;
            }
        }
        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i]+" ");
        }
    }
}
