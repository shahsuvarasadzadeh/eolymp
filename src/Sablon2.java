import java.util.Scanner;

public class Sablon2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c=0;

        for (int i = 0; i < n; i++) {
            if (i%2==0){
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
                System.out.println();
            }
            else {
                if (c%2==0) {
                    c++;
                    for (int j = 0; j < n ; j++) {
                        if (j<n-1){
                        System.out.print(" ");}
                        else {
                            System.out.print("*");
                        }
                    }
                    System.out.println();
                }
                else {
                    c++;
                    for (int j = n; j > 0 ; j--) {
                        if (j==n){
                            System.out.print("*");}
                        else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
            }
        }
    }
}
