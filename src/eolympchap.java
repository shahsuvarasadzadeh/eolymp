import java.util.Scanner;
    public class eolympchap{
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int n=sc.nextInt();
            int f[]=new int[n];
            for (int i=0;i<n;i++){
                f[i]=sc.nextInt();
            }
            for (int i=n-1;i>=0;i--){
                System.out.print(f[i]+" ");
            }

        }


    }
