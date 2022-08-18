import java.util.Scanner;

public class EnBoyukVeEnKiciyFerq {
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
        b=n[0];
        for (int i = 0; i < n.length - 1; i++) {
            if (n[i] > n[i + 1]) {
                b = Math.min(b, n[i + 1]);
            } else if (n[i] < n[i + 1]) {
                b = Math.min(b, n[i]);
            }
        }

        System.out.println(c - b);
    }
}
