package eded;

import java.util.Scanner;

public class EdediTapin {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String s= sc.next();

        System.out.println(s.charAt(s.length()-1)+s.substring(0,s.length()-1));
    }
}
