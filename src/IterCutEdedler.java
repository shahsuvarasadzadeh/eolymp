import java.util.Scanner;

public class IterCutEdedler {
        public static void main(String[] args) {
            Scanner sc =new Scanner(System.in);
            int a= sc.nextInt();
            int b=sc.nextInt();
            for (int i=b;i>=a;i--){
                if (i%2==0){
                    System.out.print(i+" ");
                }
            }
        }
}
