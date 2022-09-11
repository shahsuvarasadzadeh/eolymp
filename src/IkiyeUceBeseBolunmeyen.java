import java.util.Scanner;

public class IkiyeUceBeseBolunmeyen {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int a=1;
        int c=1;
        while(c<=n){
            if (a%2!=0&&a%3!=0&&a%5!=0){
                c++;
                System.out.print(a+" ");
            }
            a++;
        }
    }
}
