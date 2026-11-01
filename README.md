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
└── week02/
    ├── HelloWorld.java
    ├── StudentProfile.java
    ├── PrintExample.java
    └── ErrorExample.java
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

