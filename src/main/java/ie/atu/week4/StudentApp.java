package ie.atu.week4;
import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student>students = new ArrayList<>();
        Set<String> emails = new HashSet<>();


        System.out.print("How many student do you want to enter?: ");
        int count = scanner.nextInt();
        scanner.nextLine();

        int i = 0;

        while (i < count) {
            System.out.print("Enter your name: ");
            String name = scanner.nextLine();

            String email;
            do {
                System.out.print("Enter your email: ");
                email = scanner.nextLine().toLowerCase();

                if (emails.contains(email)) {
                    System.out.println("Email " + email + " is already in use. Please enter a different one.");
                }
            } while (emails.contains(email));

            emails.add(email);

            System.out.print("Enter the name of your course: ");
            String course = scanner.nextLine();
            students.add(new Student(name, email, course));
            System.out.println();
            i++;
        }
        System.out.println("Student list:");
        for(Student student : students) {
            System.out.println(student);
        }
    }

}
