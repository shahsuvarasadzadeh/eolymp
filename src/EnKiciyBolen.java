import java.util.Scanner;

public class EnKiciyBolen {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long n = s.nextLong();
        long a = 1;
        if (n == 1) {
            System.out.println(1);
        } else {
            while (n > 1) {
                a++;
                if (n % a == 0) {
                    n = 1;

                }

            }
            System.out.println(a);

        }
    }
}
