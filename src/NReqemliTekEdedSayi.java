import java.util.Scanner;

public class NReqemliTekEdedSayi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t=1;
        int count = 1;
        for (int i = 1; i < n; i++) {
            count = count * 10;
        }
        n = 0;
        for (int i = count; i < (count * 10); i=2*t) {
            n += 1;
            t++;
            System.out.println(10000);// ??
        }


            System.out.println(n);

    }
}
