import java.util.Scanner;

public class biteParty2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] binaryes = new String[8];
        for (int i = 0; i < 8; i++) {

            String binary = String.format("%32s"
                    ,Integer.toBinaryString(Integer.parseInt(scanner.nextLine())))
                    .replace(' ','0');
            binaryes[i] = binary;
        }
        int counter = 0;
        for (int i = 0; i < binaryes.length-2; i++) {
            for (int j = 0; j < binaryes[i].length()-2; j++) {
                String a = binaryes[i].charAt(j) + "" + binaryes[i].charAt(j +1) + binaryes[i].charAt(j + 2);
                String b = binaryes[i + 1].charAt(j) + "" + binaryes[i + 1].charAt(j +1) + binaryes[i + 1].charAt(j + 2);
                String c = binaryes[i + 2].charAt(j) + "" + binaryes[i + 2].charAt(j +1) + binaryes[i + 2].charAt(j + 2);
                if (a.equals("101") && b.equals("010") && c.equals("101")) {
                    counter++;
                }
            }
        }
        System.out.println(counter);
    }

}
