package EOlimp;

import java.util.Scanner;

public class NecedefeOlar {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n= input.nextInt();//11
        int sum=0;
        int m=n;
        int c=0;
        System.out.println("RAH");
        if (n<2*1000000*1000){
           while (n>0) {
               while (n>0) {
                   sum = sum + n % 10;
                   n = n / 10;
                   System.out.print("sum1:"+sum+"   ");
                   System.out.println("n1:"+n);
               }

               n = m -sum;
               sum=0;
               System.out.print("sum2:"+sum+"   ");
               System.out.println("n2:"+n);

           }
            System.out.println(sum);
        }

    }


}
