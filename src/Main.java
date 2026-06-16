import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name;
        String performance = "";
        double MathMark;
        double EnglishMark;
        double PhysicsMark;
        double average;
        char grade = ' ';

        System.out.print("Enter your name: ");
        name = scanner.nextLine();

        System.out.println("Hello " + name + " please enter your marks for these subjects to get your average grade.");

        System.out.print("Enter your Math Mark: ");
        MathMark = scanner.nextDouble();

        System.out.print("Enter your English Mark: ");
        EnglishMark = scanner.nextDouble();

        System.out.print("Enter your Physics Mark: ");
        PhysicsMark = scanner.nextDouble();


        average = (MathMark + EnglishMark + PhysicsMark)/3;


        if(average >= 80){
            grade = 'A';
            performance = "PASS";
        }
        else if(average >= 70 && average <= 79){
            grade = 'B';
            performance = "PASS";
        }
        else if(average >= 60 && average <= 69){
            grade = 'C';
            performance = "PASS";
        }
        else if(average >= 50 && average <= 59){
            grade = 'D';
            performance = "PASS";
        }
        else if(average < 50){
            grade = 'F';
            performance = "FAILED";
        }

        System.out.println("\n=================");
        System.out.println( name + "'s Report: ");
        System.out.printf("Your overall average percentage is: %.0f%% ", average);
        System.out.println("\nYour average Grade is: " + grade);
        System.out.println("You " + performance);

        scanner.close();
    }
}
