package eded;

import java.util.Scanner;

public class EdediTapin2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();

        n=(n%100)*10+n/100;
        System.out.println(n);
    }
}
