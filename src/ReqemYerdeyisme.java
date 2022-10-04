import java.util.Scanner;

public class ReqemYerdeyisme {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int z=n%100;
        n=(n/100)*100+(z%10)*10+z/10;

        System.out.println(n);


    }
}
