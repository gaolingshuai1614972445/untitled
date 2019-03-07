package 类和对象;

import java.time.LocalDate;

public class Employee {
    private String name ;
    private  double salary;
    private LocalDate hireday;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public LocalDate getHireday() {
        return hireday;
    }

    public void setHireday(LocalDate hireday) {
        this.hireday = hireday;
    }

    public Employee(String name, double salary, LocalDate hireday) {
        this.name = name;
        this.salary = salary;
        this.hireday = hireday;
    }

    public Employee() {
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", hireday=" + hireday +
                '}';
    }
}
