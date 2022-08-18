import java.util.Scanner;

public class Matris {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int a= sc.nextInt();
            int b= sc.nextInt();
            int c=1;
            int[][] n = new int[a][b];
            for (int j = 0; j <a; j++) {
                for (int i=0;i<b;i++){
                    n[j][i]=c;
                    c++;
                }
            }
            for (int j = 0; j <a; j++) {
                for (int i=0;i<b;i++){
            System.out.print(n[j][i]+" ");
                }
                System.out.println();
            }
        }
}
