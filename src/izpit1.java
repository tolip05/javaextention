import javafx.util.converter.BigIntegerStringConverter;

import java.math.BigInteger;
import java.util.Scanner;

public class izpit1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //BigInteger asec = new BigInteger(scanner.nextLine());
        Long p = Long.parseLong(scanner.nextLine());
        String ar = Long.toBinaryString(p);
        char[]a = ar.toCharArray();

        int counter = 0;
        for (int i = 1; i <= 61; i++) {
            if (a[i - 1] == a[i]){
                counter++;
                if (counter > 1){
                    if (a[i] == 1){
                        a[i - 2] = 0;
                        a[i - 1] = 0;
                        a[i] = 0;
                        counter = 0;
                        i += 2;
                    }else{
                        a[i - 2] = 1;
                        a[i - 1] = 1;
                        a[i] = 1;
                        counter = 0;
                        i += 2;
                    }
                }
            }
        }

        String c = "";
        for (int i = 0; i < a.length; i++) {
               c+=a[i];
        }


        //String c = "100110";
        Long b = post(c);
        System.out.println(b);
    }

    private static Long post(String str) {
        double j=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)== '1'){
                j=j+ Math.pow(2,str.length()-1-i);
            }

        }
        return (long) j;
    }
}
