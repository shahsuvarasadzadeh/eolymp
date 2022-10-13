package eded;

import java.util.Scanner;

public class EdediTapin4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();

        n=(n%10)*100+(n/10%10)*10+n/100;
        System.out.println(n);
    }
}
