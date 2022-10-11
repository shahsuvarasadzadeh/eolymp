import java.util.Scanner;

public class NReqemliCutEdedSayi2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 1;
        for (int i = 1; i < n; i++) {
            count = count * 10;
        }
        n = 0;
        for (int i = count; i < count * 10; i += 2) {
            n += 1;
        }

        if (count == 1) {
            System.out.println(n - 1);
        } else if(count>1){
            System.out.println(n);
        }
    }
}
