import java.util.Scanner;

public class EnBoyuklerSaga {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s= sc.nextInt();
        int[] n = new int[s];
       int c=0;
        int t=n.length-1;
        int [] d=new int[s];
        for (int i = 0; i < n.length; i++) {
            n[i] = sc.nextInt();
        }
        c = n[0];
        for (int i = 0; i < n.length - 1; i++) {
            if (n[i] < n[i + 1]) {
                c = Math.max(c, n[i + 1]);
            } else if (n[i] > n[i + 1]) {
                c = Math.max(c, n[i]);
            }
        }
        for (int i = 0; i < n.length; i++) {
if (n[i]==c){
    d[t]=c;
    t--;
}
        }
        for (int i=n.length-1;i>=0;i--){
            if (n[i]!=c){
                d[t]=n[i];
                t--;
            }
        }
        for (int i=0;i<n.length;i++){
            System.out.print(d[i]+" ");
        }

    }
}
