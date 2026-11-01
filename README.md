# COS 201 — Computer Programming I

My Java practical work for COS 201, organised by week.

## Student Details

| | |
|---|---|
| **Name** | Anoruo-Ibe Chibuke David |
| **Matriculation Number** | 25/16130 |
| **Programme** | Computer Science |
| **Course** | COS 201 — Computer Programming I |

## Repository Structure

```
COS-Project/
├── README.md
├── week01/
│   └── FirstProgram.java
├── week02/
│   ├── HelloWorld.java
│   ├── StudentProfile.java
│   ├── PrintExample.java
│   └── ErrorExample.java
└── week03/
    ├── SimpleCalculator.java
    ├── AverageCalculator.java
    └── ItemCost.java
```

## Requirements

- Java Development Kit (JDK) 8 or later. Check the installation with `java -version` and `javac -version`.
- A terminal (Command Prompt, PowerShell, or the VS Code terminal).

---

## Week 1: Introduction to Programming and Problem-Solving

### Practical Exercise

I wrote, compiled and ran my first Java programme. It prints the welcome messages from the practical steps, then my name, course and programme, three reasons programming is important to Computer Science, and my learning goal for COS 201.

Activities A, B and C of Week 1 are written by hand and submitted on paper, so they are not in this repository.

### File

- `week01/FirstProgram.java`

### How to Run

```bash
cd week01
javac FirstProgram.java
java FirstProgram
```

### Output

```
Welcome to COS 201!
I am learning computer programming.
Programming begins with problem-solving.
My programme is running successfully.
I will practise programming every week.

Name: Anoruo-Ibe Chibuke David
Course: COS 201 - Computer Programming I
Programme: Computer Science
Reason 1: Programming is how we give a computer exact steps to solve a problem.
Reason 2: Programming lets us automate tasks and process large amounts of data quickly.
Reason 3: Every area of Computer Science, from AI to cybersecurity, is built with programs.
My goal: To become confident in Java and build programs that solve everyday problems.
```

### Skills Practised

- Structure of a Java class and the `main` method
- Output with `System.out.println()`
- Compiling with `javac` and running with `java`
- Saving work to GitHub

---

## Week 2: Development Environment and First Java Program

### Objective

To set up the Java development environment, write a simple Java program, compile it, run it and submit the source code through GitHub.

### Tools Used

- Java Development Kit (JDK)
- Visual Studio Code
- Git
- GitHub Desktop
- GitHub

### Files

| File | Purpose |
|---|---|
| `week02/HelloWorld.java` | The main practical. Prints three lines of text. |
| `week02/StudentProfile.java` | Personalised program. Prints my name, matric number, course and programme. |
| `week02/PrintExample.java` | Practice exercise showing the difference between `print()` and `println()`. |
| `week02/ErrorExample.java` | "Find and fix the error" exercise. The missing semicolon has been added. |

### How to Run

1. Open a terminal in the `week02` folder.
2. Compile the program: `javac HelloWorld.java`
3. Run the program: `java HelloWorld`

The other programs are compiled and run the same way, for example `javac StudentProfile.java` and then `java StudentProfile`.

### Output

**HelloWorld**

```
Hello, World!
Welcome to COS 201.
I am learning Java programming.
```

**StudentProfile**

```
NAME: Anoruo-Ibe Chibuke David
MATRIC NUMBER: 25/16130
COURSE: COS 201
COURSE TITLE: Computer Programming I
PROGRAMME: Computer Science
WEEK: 2
TOPIC: Development Environment and Java
GOAL: To build a strong foundation in Java programming.
```

**PrintExample**

```
COS 201
Java
```

`print("COS ")` leaves the cursor on the same line, so `println("201")` continues that line. `println("Java")` then starts on a new line.

**ErrorExample**

```
Learning Java
```

The original statement `System.out.println("Learning Java")` failed to compile with `error: ';' expected`. Adding the semicolon at the end of the statement fixed it.

### Learning Outcome

I learned how to create, compile and run a Java program and submit it through GitHub. I also learned the difference between `print()` and `println()`, and how to read a compiler error message to find and fix a mistake.

---

## Week 3: Variables, Data Types, Expressions and Input/Output

### Objectives

- Declare and initialise variables.
- Choose suitable data types (`int`, `double`, `String`).
- Write arithmetic expressions.
- Read keyboard input with the `Scanner` class.
- Display formatted output with `printf`.
- Compile, test and submit Java programs through GitHub.

### Programs

1. **`week03/SimpleCalculator.java`**
   - Reads two numbers and displays their sum, difference, product and quotient to two decimal places.
   - Checks for a zero divisor before dividing.
2. **`week03/AverageCalculator.java`**
   - Reads a student's name and three course scores, then displays the total and the average.
   - Extension exercise: every score must be between 0 and 100. Each invalid score is reported by course number and no result is calculated.
3. **`week03/ItemCost.java`**
   - Reads an item name, the quantity and the unit price, then calculates `total cost = quantity × unit price`.
   - Rejects a quantity below 1 or a negative unit price, with a separate message for each.

### How to Run

Open a terminal in the `week03` folder:

```bash
cd week03
```

Simple calculator:

```bash
javac SimpleCalculator.java
java SimpleCalculator
```

Average calculator:

```bash
javac AverageCalculator.java
java AverageCalculator
```

Item cost:

```bash
javac ItemCost.java
java ItemCost
```

Type each value when prompted and press **Enter**.

### Sample Runs

**SimpleCalculator**

```
Enter the first number: 45
Enter the second number: 9
Sum: 54.00
Difference: 36.00
Product: 405.00
Quotient: 5.00
```

**AverageCalculator**

```
Enter student name: Anoruo-Ibe Chibuke David
Enter score for Course 1: 68
Enter score for Course 2: 74
Enter score for Course 3: 81

--- STUDENT RESULT ---
Student: Anoruo-Ibe Chibuke David
Total: 223.00
Average: 74.33
```

**AverageCalculator (invalid scores)**

```
Enter student name: Test Student
Enter score for Course 1: -1
Enter score for Course 2: 60
Enter score for Course 3: 120

Invalid score for Course 1: -1.0
Invalid score for Course 3: 120.0
Every score must be between 0 and 100.
Please run the program again with valid scores.
```

**ItemCost**

```
Enter item name: Textbook
Enter quantity: 2
Enter unit price: 4500

--- PURCHASE SUMMARY ---
Item: Textbook
Quantity: 2
Unit price: 4500.00
Total cost: 9000.00
```

### Testing

I tested each program with normal values, boundary values and invalid values, and checked every result against a hand calculation.

| # | Program | Input | Expected result | Result |
|---|---|---|---|---|
| 1 | SimpleCalculator | 45, 9 | Sum 54.00, Difference 36.00, Product 405.00, Quotient 5.00 | Pass |
| 2 | SimpleCalculator | 20, 4 | Sum 24.00, Difference 16.00, Product 80.00, Quotient 5.00 | Pass |
| 3 | SimpleCalculator | 12.5, -2.5 (decimal and negative) | Sum 10.00, Difference 15.00, Product -31.25, Quotient -5.00 | Pass |
| 4 | SimpleCalculator | -8, 3 (non-whole quotient) | Sum -5.00, Difference -11.00, Product -24.00, Quotient -2.67 | Pass |
| 5 | SimpleCalculator | 30, 0 (zero divisor) | No quotient; "Division is undefined for a zero divisor." | Pass |
| 6 | AverageCalculator | 68, 74, 81 | Total 223.00, Average 74.33 | Pass |
| 7 | AverageCalculator | 70, 80, 90 | Total 240.00, Average 80.00 | Pass |
| 8 | AverageCalculator | 0, 100, 100 (boundary values) | Total 200.00, Average 66.67 | Pass |
| 9 | AverageCalculator | 55.5, 62, 79.5 (decimal scores) | Total 197.00, Average 65.67 | Pass |
| 10 | AverageCalculator | 101, 60, 70 (just above 100) | "Invalid score for Course 1"; no result | Pass |
| 11 | AverageCalculator | -1, 60, 120 (two invalid scores) | Course 1 and Course 3 reported; no result | Pass |
| 12 | ItemCost | Textbook: 2 × 4500 | Total cost 9000.00 | Pass |
| 13 | ItemCost | Exercise Book: 3 × 1500 | Total cost 4500.00 | Pass |
| 14 | ItemCost | Biro: 12 × 250.75 | Total cost 3009.00 | Pass |
| 15 | ItemCost | Quantity 1, price 0 (boundary) | Total cost 0.00 | Pass |
| 16 | ItemCost | Quantity 0 | "Invalid quantity"; no result | Pass |
| 17 | ItemCost | Unit price -50 | "Invalid unit price"; no result | Pass |

### Notes

- Type numbers only where a number is asked for. Letters or symbols such as `₦` cause Java to stop with an `InputMismatchException`.
- In `ItemCost`, the quantity is an `int`, so it must be a whole number (`3`, not `3.5`).

### Learning Outcome

I learned how to store values in variables of the right data type, build arithmetic expressions, read input with `Scanner`, format output with `printf`, and use `if` statements to reject invalid input before calculating.
