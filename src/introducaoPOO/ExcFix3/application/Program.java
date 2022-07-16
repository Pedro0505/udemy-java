package introducaoPOO.ExcFix3.application;

import java.util.Scanner;

import introducaoPOO.ExcFix3.entites.Student;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student student = new Student();

        System.out.print("Add a name of student: ");
        student.name = sc.nextLine();
        System.out.println("Add a student grades: ");
        student.firstGrade = sc.nextDouble();
        student.secondGrade = sc.nextDouble();
        student.thirdGrade = sc.nextDouble();

        student.calcGrade();

        System.out.print(student);

        sc.close();
    }
}
