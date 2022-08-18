import java.util.Scanner;

public class Sablon7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double n= sc.nextDouble();
        for (int j=0;j<n/2;j++){
            for (int i=0;i<n;i++){
                if (i>(n/2)-j-1&&i<n/2+j){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for (int j = (int) (n/2)-1; j>=0; j--){
            for (int i=0;i<n;i++){
                if (i>(n/2)-j-1&&i<n/2+j){//1.5  .5
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
