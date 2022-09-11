import java.util.Scanner;

public class ASumB {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a= s.nextInt();
        int sum=0;
        int i=1;
        int b= s.nextInt();
        while (a>0){
            sum=sum+(a%10)*i;
            a=a/10;
            i*=2;
        }
        System.out.println(a);
        i=1;
        while (b>0){
            sum=sum+(b%10)*i;
            b=b/10;
            i*=2;
        }
        System.out.println(sum);

        a=0;
        i=1;
        while (sum>0){
            a=a+(sum%2)*i;
            sum=sum/2;
            i*=10;
        }

        System.out.println(a);
    }
}
