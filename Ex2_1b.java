package Week2;

import java.util.Scanner;

public class Ex2_1b {
    public static void main(String[] args){
        try(Scanner keyboard = new Scanner(System.in)) {
            System.out.print("Input a degree in Fahrenheit:");
            double fahrenheit = keyboard.nextDouble();
            double celsius = (5 * (fahrenheit - 32.0)) / 9.0;

            System.out.println(fahrenheit + "degree in Fahrenheit is equal to " + celsius + " in Celsius.");
        }
    }
}
