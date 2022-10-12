package eOlymp1;

import java.util.Scanner;

public class Cercive2 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            for (int j = 0; j <n; j++) {
                if (j==0||j==n-1){
                    for (int i = 0; i < 3; i++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                else {
                    for (int i=0;i<3;i++){
                        if (i==0||i==2){
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
