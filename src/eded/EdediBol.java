package eded;

import java.util.Scanner;

public class EdediBol {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int a=2;
        while(n>1){
            if (n%a==0){
                System.out.println(a);
                n=n/a;
            }
            else {
                a++;
            }



        }
    }
}
