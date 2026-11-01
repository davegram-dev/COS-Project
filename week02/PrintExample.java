/*
 * COS 201 - Computer Programming I
 * Week 2 Practice Exercise: print() versus println()
 *
 * Student:   Anoruo-Ibe Chibuke David
 * Matric No: 25/16130
 *
 * print()   prints the text and stays on the same line.
 * println() prints the text and then moves to the next line.
 *
 * My prediction of the output, confirmed by running the program:
 *     COS 201
 *     Java
 */

public class PrintExample {

    public static void main(String[] args) {
        System.out.print("COS ");   // cursor stays on this line
        System.out.println("201");  // "201" joins "COS ", then the line ends
        System.out.println("Java"); // printed on its own line
    }
}
