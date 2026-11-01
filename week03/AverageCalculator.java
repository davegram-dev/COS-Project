/*
 * COS 201 - Computer Programming I
 * Week 3 Practical 2: Student Average Calculator
 *
 * Student:   Anoruo-Ibe Chibuke David
 * Matric No: 25/16130
 *
 * Reads a student's name and three course scores, then displays the
 * total and the average score to two decimal places.
 *
 * Extension exercise: every score must be between 0 and 100.
 * Each invalid score is reported by course number, and no result is
 * calculated until the program is run again with valid scores.
 */

import java.util.Scanner;

public class AverageCalculator {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        // Constants for the allowed score range and number of courses
        final double LOWEST_SCORE = 0;
        final double HIGHEST_SCORE = 100;
        final int NUMBER_OF_COURSES = 3;

        // Input: name (String) and three scores (double)
        System.out.print("Enter student name: ");
        String studentName = keyboard.nextLine().trim();

        System.out.print("Enter score for Course 1: ");
        double course1 = keyboard.nextDouble();

        System.out.print("Enter score for Course 2: ");
        double course2 = keyboard.nextDouble();

        System.out.print("Enter score for Course 3: ");
        double course3 = keyboard.nextDouble();

        // Blank line between the prompts and the result
        System.out.println();

        // Validation: check each score and report any that are out of range
        boolean allScoresValid = true;

        if (course1 < LOWEST_SCORE || course1 > HIGHEST_SCORE) {
            System.out.println("Invalid score for Course 1: " + course1);
            allScoresValid = false;
        }
        if (course2 < LOWEST_SCORE || course2 > HIGHEST_SCORE) {
            System.out.println("Invalid score for Course 2: " + course2);
            allScoresValid = false;
        }
        if (course3 < LOWEST_SCORE || course3 > HIGHEST_SCORE) {
            System.out.println("Invalid score for Course 3: " + course3);
            allScoresValid = false;
        }

        if (allScoresValid) {
            // Processing: total and average
            double total = course1 + course2 + course3;
            double average = total / NUMBER_OF_COURSES;

            // Output: student result
            System.out.println("--- STUDENT RESULT ---");
            System.out.println("Student: " + studentName);
            System.out.printf("Total: %.2f%n", total);
            System.out.printf("Average: %.2f%n", average);
        } else {
            System.out.println("Every score must be between 0 and 100.");
            System.out.println("Please run the program again with valid scores.");
        }

        keyboard.close();
    }
}
