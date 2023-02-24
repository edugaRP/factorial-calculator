package main.calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long  a;

        while (true) {
            System.out.println("Enter a number to factor:");
            System.out.println("OR");
            System.out.println("Enter a negative number to stop:");
            a = scanner.nextLong();
            if (a < 0) {
                break;
            }

            long factorial = 1;
            for(int i = 1; i <= a; ++i) {
                factorial *= i;
            }

            System.out.printf("Factorial of %d = %d\n", a, factorial);
        }

        scanner.close();
    }
}