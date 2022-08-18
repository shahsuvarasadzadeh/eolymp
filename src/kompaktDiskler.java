import java.util.Scanner;

public class kompaktDiskler {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        if (n<1000) {
            int sum = 0;
            sum = sum + (n / 100) * 100;
            n = n % 100;
            sum = sum + (n / 20) * 30;
            n = n % 20;
            sum = sum + n * 2;
            System.out.println(sum);
        }
    }
}
