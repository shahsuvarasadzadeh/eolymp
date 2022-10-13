package eded;

import java.util.Scanner;

public class EyniCutluk {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int n= sc.nextInt();
            int a= sc.nextInt();

            if ((a+n)%2==0){
                System.out.println(1);
            } else  {
                System.out.println(0);
            }
        }
}
