import java.util.Scanner;
import java.util.regex.Pattern;

public class SozlerinSayi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s = sc.nextLine();
        String[] strArray = null;
        Pattern ptr = Pattern.compile(" ");
        strArray = ptr.split(s);

        System.out.println(strArray.length);

    }
    }

//        for (int i = 0; i < strArray.length; i++) {
//            System.out.println(strArray[i]);
//        }
//
//        String str = "Hello #a1Ben #a1how #a1are #a1you ?";
//        String[] strArray = null;
////splitting the string with delimiter as #a1
//        String patternStr = "#a1";
//        Pattern ptr = Pattern.compile(patternStr);
////storing the string elements in array after splitting
//        strArray = ptr.split(str);
////printing the converted string array
//        for (int i = 0; i< strArray.length; i++){
//            System.out.println(strArray[i]);
//        }
//        String str = "Converting string to string array using ";
////declaring an empty string array
//        String[] strArray = null;
////parsing white space as a parameter
//        Pattern ptr = Pattern.compile(" ");
////storing the string elements in array after splitting
//        strArray = ptr.split(str);
////printing the converted string array
//        for (int i = 0; i< strArray.length; i++){
//            System.out.println(strArray[i]);
//        }
