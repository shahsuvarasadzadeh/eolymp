import java.util.Scanner;

public class EnKiciklerSola {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s= sc.nextInt();
        int[] n = new int[s];
        int b = 0;
        int t=0;
        int [] c=new int[s];
        for (int i = 0; i < n.length; i++) {
            n[i] = sc.nextInt();
        }
        b = n[0];
        for (int i = 0; i < n.length - 1; i++) {
            if (n[i] > n[i + 1]) {
                b = Math.min(b, n[i + 1]);
            } else if (n[i] < n[i + 1]) {
                b = Math.min(b, n[i]);
            }
        }
        for (int i = 0; i < n.length; i++) {
if (n[i]==b){
    c[t]=b;
    t++;
}
        }
        for (int i=0;i<n.length;i++){
            if (n[i]!=b){
                c[t]=n[i];
                t++;
            }
        }
        for (int i=0;i<n.length;i++){
            System.out.print(c[i]+" ");
        }

    }
}
