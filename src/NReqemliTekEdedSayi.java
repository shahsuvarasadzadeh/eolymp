import java.util.Scanner;

public class NReqemliTekEdedSayi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long t=1;
        long count = 1;
        for (long i = 1; i < n; i++) {
            count = count * 10;
        }
        n = 0;
        for (long i = count; i < (count * 10); i+=2) {
            n += 1;
            t++;
        }


            System.out.println(n);

    }
}
