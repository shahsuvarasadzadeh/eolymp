import java.util.Scanner;

public class OrtaEded {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
                a= sc.nextInt();
        b= sc.nextInt();
        c= sc.nextInt();
        if ((a<b&&a>c)||(a>b&&a<c)){
            System.out.println(a);
        }
        else if ((c<b&&c>a)||(c>b&&c<a)){
            System.out.println(c);
        }
        else {
            System.out.println(b);
        }
    }
}
