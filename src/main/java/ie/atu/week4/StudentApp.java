package ie.atu.week4;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student>students = new ArrayList<>();

        System.out.println("How many student do you want to enter? ");
        int count = scanner.nextInt();
        scanner.nextLine();

        int i = 0;
        while (i < count) {
            System.out.println();
        }
    }

}
