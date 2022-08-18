package EOlimp;

import java.util.Scanner;

public class GuzguSadeEdedler {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b;
        int count=0;
        int d=0;
        int say=0;
        int onluq=0;
        int e;
        int t=0;

    a= sc.nextInt();
     b= sc.nextInt();

        for (int i=a;i<=b;i++){
             say=0;

            if (i%2!=0&&i%3!=0&&i%5!=0){
                System.out.println("sade="+i);
d=i;
e=i;
                while(e>0){

                    e=e/10;
                    onluq=(int) Math.pow(10,say);
                    say=say+1;

                }
                while(e<say){



                    t= (int) (t+(d%10)*(onluq/(Math.pow(10,e))));
                    d= d/10;
                    e++;


                }
                if (t%2!=0&&t%3!=0&&t%5!=0){
                    System.out.println("onun tersi="+t);
                count=count+1;
            }
            }

            else if (i==1||i==2||i==3||i==5||i==7){
                System.out.println("teklik="+i);
                count=count+1;
            }
        }
        System.out.println(count);
    }
}
