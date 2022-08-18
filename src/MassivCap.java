import java.util.Scanner;

public class MassivCap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int [] i=new int[sc.nextInt()];
        for (int t=0;t<i.length;t++){
            i[t]= sc.nextInt();
        }
        for (int n=0;n<i.length;n++){
            System.out.println(i[n]);
        }

    }
}
