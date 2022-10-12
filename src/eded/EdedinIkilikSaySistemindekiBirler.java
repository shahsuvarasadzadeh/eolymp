package eded;

import java.util.Scanner;

public class EdedinIkilikSaySistemindekiBirler {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i= sc.nextInt();
        int n=0;
        int birler=0;
        while (i>0){
            n=i%2;
            if (n==1){
                birler=birler+1;
            }
            i=i/2;
        }
        System.out.println(birler);
    }
}
