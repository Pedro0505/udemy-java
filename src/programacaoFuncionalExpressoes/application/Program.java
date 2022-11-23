package programacaoFuncionalExpressoes.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import programacaoFuncionalExpressoes.entities.Employee;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter full file path: ");
        String path = sc.nextLine();

        System.out.print("Enter salary: ");
        double initialSalary = sc.nextDouble();

        List<Employee> employees = new ArrayList<>();

        System.out.println(path);

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String itemCsv = br.readLine();

            while(itemCsv != null) {
                String[] line = itemCsv.split(",");
                String name = line[0];
                String email = line[1];
                Double salary = Double.parseDouble(line[2]);

                Employee employee = new Employee(name, email, salary);

                employees.add(employee);

                itemCsv = br.readLine();
            }

            
            System.out.println("Email of people whose salary is more than " + initialSalary);

            List<String> lEmployees = employees.stream()
                .filter((e) -> e.getSalary() > initialSalary)
                .map((e) -> e.getEmail())
                .sorted()
                .collect(Collectors.toList());

            lEmployees.forEach(System.out::println);

            Double sumSalary = employees.stream()
                .filter((e) -> e.getName().toLowerCase().charAt(0) == 'm')
                .map((e) -> e.getSalary())
                .reduce(0.0, (x, y) -> x + y);

            System.out.println("Sum of salary of people whose name starts with 'M': " + sumSalary);
        } catch (IOException e) {
            System.out.println("Error in: " + e.getMessage());
        }

        sc.close();
    }
}
