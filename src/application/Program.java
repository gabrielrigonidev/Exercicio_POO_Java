package application;

import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Your name: ");
        String name = sc.nextLine();

        System.out.print("First Grade: ");
        double grade1 = sc.nextDouble();
        System.out.print("Second Grade: ");
        double grade2 = sc.nextDouble();
        System.out.print("Third Grade: ");
        double grade3 = sc.nextDouble();

        Student student = new Student(name, grade1, grade2, grade3);
        System.out.println("FINAL GRADE = " + student.totalPoints());

        if (student.totalPoints() >= 60.0) {
            System.out.println("PASS");
        } else {
            System.out.println("FAILED");
            System.out.println("MISSING = " + student.missingPoints());
        }
    }
}