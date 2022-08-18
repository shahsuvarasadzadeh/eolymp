package EOlimp;

import java.util.Scanner;

public class DersNeticesi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        if (a==1||a==2||a==3){
            System.out.println("Initial");
        }
        else if (a==4||a==5||a==6){

            System.out.println("Average");
        }
        else if (a==7||a==8||a==9){

            System.out.println("Sufficient");
        }
        else if (a==10||a==11||a==12){

            System.out.println("High");
        }
        else{

            System.out.println("Coppy");
        }

    }
}
