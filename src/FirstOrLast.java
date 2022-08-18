package EOlimp;

import java.util.Scanner;

public class FirstOrLast {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b=a/100;
        a=a%10;

        if (a>b){
            System.out.println(a);
        }
        else if(a<b) {
            System.out.println(b);
        }
        else {
            System.out.println("=");
        }
    }
}
