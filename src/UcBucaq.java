package EOlimp;

import java.util.Scanner;

public class UcBucaq {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        if (a==b&&a==c){
            System.out.println("1");
        }
        else if (a!=b&&a!=c&&b!=c){
            System.out.println("3");
        }
        else {
            System.out.println("2");
        }
    }
}
