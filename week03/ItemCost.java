/*
 * COS 201 - Computer Programming I
 * Week 3 Practical 3: Total Cost of Items
 *
 * Student:   Anoruo-Ibe Chibuke David
 * Matric No: 25/16130
 *
 * Reads the name of an item, the quantity bought and the price of one
 * unit, then calculates and displays the total cost:
 *
 *     total cost = quantity x unit price
 *
 * The quantity must be at least 1 and the unit price cannot be negative.
 */

import java.util.Scanner;

public class ItemCost {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        // Input: item name (String), quantity (int) and unit price (double)
        System.out.print("Enter item name: ");
        String item = keyboard.nextLine().trim();

        System.out.print("Enter quantity: ");
        int quantity = keyboard.nextInt();

        System.out.print("Enter unit price: ");
        double unitPrice = keyboard.nextDouble();

        // Validation: report each problem separately
        if (quantity <= 0) {
            System.out.println("\nInvalid quantity: " + quantity
                    + ". The quantity must be at least 1.");
        } else if (unitPrice < 0) {
            System.out.printf("%nInvalid unit price: %.2f. The price cannot be negative.%n",
                    unitPrice);
        } else {
            // Processing: an int multiplied by a double gives a double
            double totalCost = quantity * unitPrice;

            // Output: purchase summary
            System.out.println("\n--- PURCHASE SUMMARY ---");
            System.out.println("Item: " + item);
            System.out.println("Quantity: " + quantity);
            System.out.printf("Unit price: %.2f%n", unitPrice);
            System.out.printf("Total cost: %.2f%n", totalCost);
        }

        keyboard.close();
    }
}
