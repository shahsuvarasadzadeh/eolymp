package EOlimp;


import java.util.Scanner;

public class KvadratKok {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int d= sc.nextInt();
        double sum=0;
        while(d>0){
            sum=sum+d%10;
            d=d/10;
        }

    }
}
