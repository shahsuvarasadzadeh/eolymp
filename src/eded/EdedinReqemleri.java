package eded;

import java.util.Scanner;

public class EdedinReqemleri {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        while(a>0) {
            System.out.println(a % 10);
            a = a / 10;
        }
    }
}
