package exercises;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Area {
    private static final double PI = 3.14;
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("Enter  radius: ");
            double inputRadius = scanner.nextDouble();
            double area = calculateArea(inputRadius);

            System.out.println("Area of your circle is: " + area);

        } catch (InputMismatchException ex) {
            System.out.println("You must enter a number");


        }

    }

    private static double calculateArea(double radius){
        return PI * radius * radius;


    }
}
