package EOlimp;

import java.util.Scanner;

public class MusbetEdedlerinEdediOrtasi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double a[]=new double[sc.nextInt()];
        int say=0;
        double sum=0;
        for (int i=0;i<a.length;i++) {
            a[i] = sc.nextDouble();
            if (a[i] > 0) {
                say = say + 1;
                sum = (a[i] + sum) / say;
            }
        }
            if (sum>0){
                System.out.println(say+" "+sum);
            }
            else {
                System.out.println("Not Found");
            }
        }
    }

