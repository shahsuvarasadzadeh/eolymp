package EOlimp;

import java.util.Scanner;

public class BlunenEdedler {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[sc.nextInt()];
        int sum=0;
        int say=0;

        for (int i=0;i<a.length;i++){
            a[i]= sc.nextInt();
            if (a[i]%6==0&&a[i]>=0) {
                sum = sum + a[i];
                say = say + 1;
            }
        }
        System.out.println(say+" "+sum);
    }
}
