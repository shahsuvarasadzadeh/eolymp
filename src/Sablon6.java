import java.util.Scanner;

public class Sablon6 {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int n= sc.nextInt();
            for (int j=0;j<=n/2;j++){
                for (int i=0;i<n;i++){
                    if (i==(n/2)-j||i==n/2+j){
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }

            for (int j =(n/2)-1; j>=0; j--){
                for (int i=0;i<n;i++){
                    if (i==(n/2)-j||i==n/2+j){//1.5  2.5
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
}
