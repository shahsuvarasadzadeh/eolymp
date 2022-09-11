import java.util.Scanner;

public class Saatlar {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        double h1=s.nextDouble();
        double h2= s.nextDouble();
        double h3= s.nextDouble();

        double h=1/h1+1/h2+1/h3;
        System.out.println(1/h);
    }
}
