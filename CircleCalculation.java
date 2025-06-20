package Week2;

import java.util.Scanner;

public class CircleCalculation {
    public static void main(String[] args){
        double radius; // in inches
        double area; // in square inches
        
        try(Scanner keyboard = new Scanner(System.in)) {
            System.out.println("Enter the radius of a circle in inches:");
            radius = keyboard.nextDouble();
            area = 3.14159 * radius * radius;
            System.out.println("A circle of radius " + radius + " inches");
            System.out.println("has an area of " + area + " square inches.");
        }
    }
}
