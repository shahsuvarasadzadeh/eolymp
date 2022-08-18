import java.util.Scanner;

public class IlkinArdicilliq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        int[] n = new int[t];
        int [] a=new int[t];
        for (int i = 0; i < n.length; i++) {
            n[i] = sc.nextInt();
        }
        for (int i=0;i<n.length;i++){
            a[n.length-i-1]=n[i];
        }
        for (int i=0;i<n.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
