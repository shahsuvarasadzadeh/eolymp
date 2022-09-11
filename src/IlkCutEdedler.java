import java.util.Scanner;

public class IlkCutEdedler {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n= s.nextInt();
        int a=1;
        int i=1;
        while(i<=n){
            if (a%2==0){
                System.out.print(a+" ");
                i++;
            }
            a++;
        }
    }
}
