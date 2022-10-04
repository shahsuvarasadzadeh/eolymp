import java.util.Scanner;

public class ReqemYerdeyisme2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int z=n%1000;
        int t=0;
        while (z>0){

            t=t*10+z%10;
            z=z/10;
        }

        n=(n/1000)*1000+t;

        System.out.println(n);


    }
}
