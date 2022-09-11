import java.util.Scanner;

public class Tort {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int []a = new int[31];
        a[1]=2;
        a[2]=4;
        int n= s.nextInt();

        for (int i=3;i<=n;i++) {
            a[i]=a[i-1]+a[i-2];
        }
            System.out.println(a[n]);
        }
    }
