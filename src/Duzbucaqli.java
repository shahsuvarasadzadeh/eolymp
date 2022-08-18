import java.util.Scanner;

public class Duzbucaqli {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        String [][] n = new String[a][3];
        for (int j = 0; j <a; j++) {
            for (int i=0;i<3;i++){
                n[j][i]="#";
            }
        }
        for (int j = 0; j <a; j++) {
            for (int i=0;i<3;i++){
                System.out.print(n[j][i]);
            }
            System.out.println();
        }
    }
}
