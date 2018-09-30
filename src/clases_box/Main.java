package clases_box;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            Box box = new Box();
            try {

                double lenght = Double.parseDouble(scanner.nextLine());


                double width = Double.parseDouble(scanner.nextLine());


                double height = Double.parseDouble(scanner.nextLine());
                box = new Box(lenght,width,height);

            }catch (IllegalArgumentException ie){
                System.out.println(ie.getMessage());
            }
            System.out.printf("Surface Area - %.2f%n",box.surface());
            System.out.printf("Lateral Surface Area - %.2f%n",box.lateral());
            System.out.printf("Volume - %.2f%n",box.volume());
    }


}
