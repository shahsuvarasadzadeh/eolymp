import java.util.Scanner;

public class ReqemiSilme {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
    char [] c=s.toCharArray();

    for (int i=0;i<c.length;i++){
        if(i!=1&&i!=3){
            System.out.print(c[i]);
        }
    }

    }
}
