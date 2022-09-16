package introducaoPOO.ExcFix2.application;

import java.util.Scanner;

import introducaoPOO.ExcFix2.entities.Employee;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee employee = new Employee();

        System.out.print("Name: ");
        employee.name = sc.nextLine();
        System.out.print("Gross Salary: ");
        employee.grossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        employee.tax = sc.nextDouble();

        System.out.printf("Employee: %s, $ %.2f\n", employee.name, employee.netSalary());

        System.out.print("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();
        employee.increaseSalary(percentage);

        System.out.printf("Updated data: %s, $ %.2f\n", employee.name, employee.netSalary());

        sc.close();
    }
}
