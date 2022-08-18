package EOlimp;

import java.util.Scanner;

public class GuzguEdedler {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();//10
        int b = sc.nextInt();//25
        int count=0;
        while (a<=b){
            //first sade
            if(test(a)){
                int t=0;
                int o=a;
               while (o>0){
                   t=t*10+o%10;
                   o/=10;
               }
               if(test(t)){
                  count++;
               }
            };
            a++;
        }
        System.out.println(count);
    }

    public static Boolean test(int a){
        int count=0;
        for (int i=1;i<=a;i++){
            if(a%i==0){
                count++;
            }
        }
        if(count==2) return true;
        else return false;
    }
}
