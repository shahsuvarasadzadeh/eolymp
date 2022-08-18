import java.util.Scanner;

public class MassivUc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
int c=0;
        int [] i=new int[sc.nextInt()];
        for (int n=0;n<i.length;n++){
            i[n]= sc.nextInt();
        }
        for (int n=0;n<i.length;n++){
            if (i[n]%2!=0) {
                c++;
            }
        }
        if (c==0){ System.out.println("NO");}
        else {
            System.out.println(c);
        }
        for (int n=i.length-1;n>=0;n--){
            if (i[n]%2!=0) {
                System.out.print(i[n]+" ");            }
        }

    }
}
