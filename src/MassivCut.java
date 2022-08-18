import java.util.Scanner;

public class MassivCut {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
int c=0;
        int[] i = new int[sc.nextInt()];
        for (int n = 0; n < i.length; n++) {
            i[n] = sc.nextInt();
        }

        for (int n=0;n<i.length;n++){
            if (n%2!=0) {
                c++;
            }
        }
        System.out.println(c);
        for (int n=0;n<i.length;n++){
            if (n%2!=0) {
                System.out.print(i[n]);
            }
        }
    }
}
