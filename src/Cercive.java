import java.util.Scanner;

public class Cercive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int j = 0; j <3; j++) {
            if (j==0||j==2){
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
                System.out.println();
            }
            else {
                for (int i=0;i<n;i++){
                    if (i==0||i==n-1){
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
}
