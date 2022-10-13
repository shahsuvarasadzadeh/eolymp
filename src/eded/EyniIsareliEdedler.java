package eded;

import java.util.Scanner;

public class EyniIsareliEdedler {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int a= sc.nextInt();

        if (Math.abs(a+n)==(Math.abs(n)+Math.abs(a))){
            System.out.println(1);
        } else  {
            System.out.println(0);
        }
    }
}
