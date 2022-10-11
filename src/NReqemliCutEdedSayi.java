import java.util.Scanner;

public class NReqemliCutEdedSayi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        double sum = 0;
            sum =(Math.pow(9,n)*5/9);
            if (n==1) {
                System.out.println(sum-1);
            }
            else {
                System.out.println(sum);
            }
    }
}
