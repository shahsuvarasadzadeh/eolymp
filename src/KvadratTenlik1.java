package EOlimp;

import java.util.Scanner;

public class KvadratTenlik1 {
        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            Double []a={sc.nextDouble(), sc.nextDouble(), sc.nextDouble()};

            Double d=(a[1]*a[1])-(4*a[0]*a[2]);


            if (d>0){
                int x1= (int) ((-a[1]+Math.sqrt(a[1]*a[1]-4*a[0]*a[2]))/(2*a[0]));
                int x2= (int) ((-a[1]-Math.sqrt(a[1]*a[1]-4*a[0]*a[2]))/(2*a[0]));

                if (x1>x2){
                    System.out.println("Two roots: "+x2+" "+x1);
                }
                else {
                    System.out.println("Two roots: "+x1+" "+x2);
                }
            }

            else if (d==0){
                int x1=(int) ((-a[1])/2*a[0]);
                System.out.println("One root: "+x1);
            }
            else{
                System.out.println("No roots");
            }

        }
    }
