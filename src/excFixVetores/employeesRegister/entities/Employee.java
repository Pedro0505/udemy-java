package excFixVetores.employeesRegister.entities;

public class Employee {
    public Integer id;
    public String name;
    private Double salary;

    public Employee(Integer id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void increaseSalary(double percentage) {
        this.salary = this.salary + (this.salary * (percentage / 100));
    }

    public Double getSalary() {
      return salary;
    }
}
