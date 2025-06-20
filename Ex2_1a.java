package Week2;

import java.util.Scanner;

public class Ex2_1a {
    public static void main(String[] args) {
        try(Scanner keyboard = new Scanner(System.in)) {
            int n, n1, n2;

            n = keyboard.nextInt();

            n1 = n / 1000;
            n2 = n % 1000;
            System.out.println(n1);

            n1 = n2 / 100;
            n2 = n2 % 100;
            System.out.println(n1);

            n1 = n2 / 10;
            n2 = n2 % 10;
            System.out.println(n1);
            System.out.println(n2);
        }
    }
}
