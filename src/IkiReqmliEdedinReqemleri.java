package EOlimp;

import java.util.Scanner;

public class IkiReqmliEdedinReqemleri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        if (a>9&a<100){
            System.out.println((a/10)+" "+(a%10));
        }
    }
}
