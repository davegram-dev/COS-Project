/*
 * COS 201 - Computer Programming I
 * Week 3 Practical 1: Simple Calculator
 *
 * Student:   Anoruo-Ibe Chibuke David
 * Matric No: 25/16130
 *
 * Reads two numbers from the keyboard and displays their sum,
 * difference, product and quotient to two decimal places.
 * Division is only carried out when the second number is not zero.
 */

import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        // Input: two numbers (double, so decimals are accepted)
        System.out.print("Enter the first number: ");
        double num1 = keyboard.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = keyboard.nextDouble();

        // Processing: arithmetic expressions
        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;

        // Output: results formatted to two decimal places
        System.out.printf("Sum: %.2f%n", sum);
        System.out.printf("Difference: %.2f%n", difference);
        System.out.printf("Product: %.2f%n", product);

        // A zero divisor is checked first, because dividing by zero is undefined
        if (num2 == 0) {
            System.out.println("Division is undefined for a zero divisor.");
        } else {
            double quotient = num1 / num2;
            System.out.printf("Quotient: %.2f%n", quotient);
        }

        keyboard.close();
    }
}
