import java.util.Scanner;

public class UzunEded {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int c= s.nextInt();
        int d=1;
        String t="";
        while(d%c!=0){
      t=t+String.valueOf(a);
      d=Integer.parseInt(t);
      a++;
        }
        int b=a-1;
        System.out.println(b);
    }
}
