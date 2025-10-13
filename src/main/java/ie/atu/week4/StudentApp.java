package ie.atu.week4;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {
        // Initialize scanner for input and list to store students
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student>students = new ArrayList<>();

        // Ask user how many students they want to enter
        System.out.print("How many student do you want to enter?: ");
        int count = scanner.nextInt();
        scanner.nextLine();

        // Loop to gather student details
        int i = 0;
        while(i < count) {

            // Input student name and email
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your email: ");
        String email = scanner.nextLine().toLowerCase();

        // Check for duplicate emails and prompt again if needed
        for (Student s : students) {
             while (s.getEmail().equals(email)) {
                System.out.print("Entered email exists. Enter again: ");
                email = scanner.nextLine().toLowerCase();
            }
        }
        // Input course name
        System.out.print("Enter the name of your course: ");
        String course = scanner.nextLine();
        // Add new student to the list
        students.add(new Student(name, email, course));
        System.out.println();
            i++;
        }
        // Display all entered students
        System.out.println("Student list:");
        for(Student student : students) {
            System.out.println(student);
        }
    }
}
