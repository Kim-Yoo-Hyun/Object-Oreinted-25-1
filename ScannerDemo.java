package Week2;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args){
        try(Scanner keyboard = new Scanner(System.in)) {
            System.out.println("Enter two whole numbers");
            System.out.println("separated by one or more spaces:");

            int n1, n2;
            n1 = keyboard.nextInt(); // reads one int value from the keyboard
            n2 = keyboard.nextInt();
            System.out.println("You entered " + n1 + " and " + n2);

            System.out.println("Next enter two numbers.");
            System.out.println("A decimal point is OK.");

            double d1, d2;
            d1 = keyboard.nextDouble(); // reads one double value from the keyboard
            d2 = keyboard.nextDouble();
            System.out.println("You entered " + d1 + " and " + d2);

            System.out.println("Next enter two words:");

            String s1, s2;
            s1 = keyboard.next();
            s2 = keyboard.next();
            System.out.println("You enterd \"" + s1 + "\" and \"" + s2 + "\"");
            s1 = keyboard.nextLine();

            System.out.println("Next enter a line of text:");
            s1 = keyboard.nextLine();
            System.out.println("You entered: \"" + s1 + "\"");
        }
    }
}
