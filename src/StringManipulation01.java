import com.sun.org.apache.bcel.internal.generic.I2F;

import java.util.Scanner;

public class StringManipulation01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
           int num = Integer.parseInt(scanner.nextLine());
           String a = scanner.nextLine();
           if (a.equals("A")){
               int[][] matrix = new int[num][num];
               // matrix[0][0] = 1;
               int start = 1;
               for (int i = 0; i < matrix.length; i++) {
                   for (int j = 0; j < matrix[i].length; j++) {
                       matrix[i][j] =(i + start) + (j * num);
                   }
               }
               for (int[] ints : matrix) {
                   for (int anInt : ints) {
                       System.out.print(anInt + " ");
                   }
                   System.out.println();
               }
           }else{
               int[][] matrix = new int[num][num];
               // matrix[0][0] = 1;
               int start = 1;
               for (int i = 0; i < matrix.length; i++) {
                   for (int j = 0; j < matrix[i].length; j++) {
                       if (j % 2 != 0){
                           matrix[i][j] =(i + start) + ((2 *(j * num)) - (i + (start + i * j)));
                            if (j == 3){
                                matrix[i][j] = matrix[i][j] - 2-(j - (i - (j - i)));
                            }
                       }else{
                           matrix[i][j] =(i + start) + (j * num);
                       }
                   }
               }
               for (int[] ints : matrix) {
                   for (int anInt : ints) {
                       System.out.print(anInt + " ");
                   }
                   System.out.println();
               }
           }
        }
    }
