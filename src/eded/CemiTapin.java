package eded;

import java.util.Scanner;

public class CemiTapin {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        n=((n/10)%10)*111+(n/100)*111+(n%10)*111+n+((n%100)*10+n/100)+(n%10*100+n/10);
        System.out.println(n);
    }
}
