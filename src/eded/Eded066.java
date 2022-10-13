package eded;

import java.util.Scanner;

public class Eded066 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int a= sc.nextInt();

        if (n%a==0){
            System.out.println(1);
        } else  {
            System.out.println(0);
        }
    }
}
