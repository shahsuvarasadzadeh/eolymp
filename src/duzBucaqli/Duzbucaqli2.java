package duzBucaqli;

import java.util.Scanner;

public class Duzbucaqli2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        String [][] n = new String[4][a];
        for (int j = 0; j <4; j++) {
            for (int i=0;i<a;i++){
                n[j][i]="#";
            }
        }
        for (int j = 0; j <4; j++) {
            for (int i=0;i<a;i++){
                System.out.print(n[j][i]);
            }
            System.out.println();
        }
    }
}
