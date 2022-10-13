package eded;

import java.util.Scanner;

public class EdedinIsaresi {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();

        if (n>0){
            System.out.println(1);
        }
        else if (n==0){
            System.out.println(0);
        }
        else {
            System.out.println(-1);
        }
    }
}
