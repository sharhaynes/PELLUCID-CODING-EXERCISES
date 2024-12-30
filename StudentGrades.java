//scanner class to take in user input
import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        // Declare variables
        int numStudents;
        int[] grades;

        //new scanner object created
        Scanner scanner = new Scanner(System.in);

        //get a prompt for the number of students
        System.out.print("Enter the number of students: ");
        numStudents = scanner.nextInt();

        //make the array fro the student's grades
        grades = new int[numStudents];

        //input the grades for teh students
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter the grade for student " + (i + 1) + ": ");
            grades[i] = scanner.nextInt();
        }

        //variables for the average, min grade and max grade
        int sum = 0;
        int min = grades [0];
        int max = grades [0];


        for (int i = 0; i < grades.length; i++) {
            sum += grades[i]; 
        

            if (grades[i] < min) {
                min = grades[i];
            }

            if (grades[i] > max) {
                max = grades[i];
            }
        }
        //equation to find average. wrote it after sum to not get an answer of 0.0
        double average = (double) sum / numStudents;

         // print out the results
        System.out.println("The average is: " + average);
        System.out.println("The minimum is: " + min);
        System.out.println("The maximum is: " + max);

         // finally close the scanner
        scanner.close();
    }
}