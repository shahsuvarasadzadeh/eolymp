import java.util.Scanner;

public class IkininQuvveti {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        int n=2;
        int count=0;
        while(i==n){
            i= sc.nextInt();
            n=2*n;
            count++;
        }

    }
}
