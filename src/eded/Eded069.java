package eded;

import java.util.Scanner;

public class Eded069 {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int n= sc.nextInt();
            int a= sc.nextInt();

            if (n>a){
                System.out.println(a+" "+n);
            } else  {
                System.out.println(n+" "+a);
            }
        }
    }
