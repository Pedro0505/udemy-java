package excFixVetores.employeesRegister.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import excFixVetores.employeesRegister.entites.Employee;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.err.print("How many employees will be registered? ");
        int numberEmployees = sc.nextInt();
        List<Employee> listOfEmployees = new ArrayList<Employee>();


        for (int i = 0; i < numberEmployees; i += 1) {
            System.err.printf("Emplyoee #%d:\n", i + 1);

            System.out.println();

            System.err.print("Id:");
            int id = sc.nextInt();
            System.err.print("Name:");
            String name = sc.next();
            System.err.print("Salary:");
            double salary = sc.nextDouble();

            Employee employee = new Employee(id, name, salary);

            listOfEmployees.add(employee);
        }

        System.out.print("Enter the employee id that will have salary increase: ");
        int idToIncress = sc.nextInt();

        Employee employeeFind = listOfEmployees.stream().filter(x -> x.id == idToIncress).findFirst().orElse(null);

        if (employeeFind == null) {
            System.out.println("This id does not exist!");
        } else {
            System.out.print("Enter the percentage: ");
            double percentage = sc.nextDouble();
            
            employeeFind.increaseSalary(percentage);
        }

        System.out.println();

        for (Employee employee : listOfEmployees) {
            System.out.println("List of employees:");
            System.out.printf("%d, %s, %.2f\n", employee.id, employee.name, employee.getSalary());
        }

        sc.close();
    }
}
