import java.util.Scanner;

public class NReqemliEded {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int u=0;
        int prd=1;
        double t= Math.pow(n-1,10);//10
        double b= Math.pow(n,10);//100

        for (double i = t; i<b; i++){
            System.out.println("i="+i);
            while(i>0){
                System.out.println("noooo");
                 u= (int) i;
                sum= (int) (sum+i%10);
                prd= (int) (prd*(i%10));

                i=i/10;
            }
            if (sum==prd){
                System.out.print(u);
            }

        }


    }
}
