package ie.atu.week4;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student st = new Student();
        ArrayList<Student>students = new ArrayList<>();

        System.out.print("How many student do you want to enter?: ");
        int count = scanner.nextInt();
        scanner.nextLine();

        int i = 0;
        while (i < count) {
            System.out.print("Enter your name: ");
            String name = scanner.nextLine();
            System.out.print("Enter your email: ");
            String email = scanner.nextLine();
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
