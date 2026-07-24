# Grade Calculator

A simple Java console application that calculates a student's average mark, assigns a letter grade, and displays whether the student passed or failed.

> 🚧 **Work in Progress:** This project is still under development and will be improved over time as I learn and implement better Java practices.

## Features

* Accepts a student's name
* Takes marks for:

  * Mathematics
  * English
  * Physics
* Calculates the average percentage
* Assigns a letter grade based on the average:

  * **A** (80%+)
  * **B** (70–79%)
  * **C** (60–69%)
  * **D** (50–59%)
  * **F** (Below 50%)
* Displays a report showing:

  * Student name
  * Average percentage
  * Letter grade
  * Pass/Fail status

## Technologies Used

* Java
* Java Scanner (console input)

## Example

```text
Enter your name: John

Hello John please enter your marks for these subjects to get your average grade.

Enter your Math Mark: 85
Enter your English Mark: 74
Enter your Physics Mark: 90

=================
John's Report:
Your overall average percentage is: 83%
Your average Grade is: A
You PASS
```

## How to Run

1. Clone the repository.

```bash
git clone https://github.com/your-username/grade-calculator.git
```

2. Navigate to the project folder.

```bash
cd grade-calculator
```

3. Compile the program.

```bash
javac src/Main.java
```

4. Run the program.

```bash
java -cp src Main
```

## Planned Improvements

* Input validation for marks (0–100)
* Support for more subjects
* Configurable grading scale
* GPA calculation
* Save reports to a file
* Menu-driven interface
* Improved code structure using classes and methods

## Purpose

This project is part of my Java learning journey. It focuses on practicing:

* Variables and data types
* User input with `Scanner`
* Conditional statements (`if` / `else if`)
* Arithmetic calculations
* Console output formatting

Feedback and suggestions are always welcome.
