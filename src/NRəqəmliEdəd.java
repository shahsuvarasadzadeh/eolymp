package EOlimp;

import java.util.Scanner;

public class NRəqəmliEdəd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int prd=1;
        int t=0;
        for (int i = (int) Math.pow(10,n-1); i<Math.pow(10,n); i++){
            while(i>0){
                sum=sum+i%10;
                prd=prd*(i%10);

                i=i/10;
            }
            if (sum==prd){
                System.out.print(i);
            }
        }


    }
}
