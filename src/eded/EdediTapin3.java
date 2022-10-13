package eded;

import java.util.Scanner;

public class EdediTapin3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
         n=((n/10)%10)+((n/100)*100+(n%10)*10);
        System.out.println(n);

    }
}

