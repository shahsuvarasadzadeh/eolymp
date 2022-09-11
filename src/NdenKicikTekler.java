import java.util.Scanner;

public class NdenKicikTekler {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a = 1;
        while (a<n) {
            if (a % 2 != 0) {
                System.out.print(a + " ");
            }
            a++;
        }
    }
}
