package TermPaper;

import java.util.Objects;

public class Employee {
    private final String firstname;
    private final String middleName;
    private final String lastName;
    private int department;
    private double salary;
    private int id;
    private static int count = -1;

    public Employee(String firstname, String middleName, String lastName, int department, int salary) {
        this.firstname = firstname;
        this.middleName = middleName;
        this.lastName = lastName;
        this.department = department;
        this.salary = salary;
        this.id = counter();
    }
    public int counter(){
        count++;
        return count;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return  "ФИО: " + firstname + ' ' + middleName + ' ' + lastName +
                ". Отдел: " + department +
                ". Зарплата за месяц: " + salary +
                ". ID:" + id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return department == employee.department && Double.compare(employee.salary, salary) == 0 && id == employee.id && Objects.equals(firstname, employee.firstname) && Objects.equals(middleName, employee.middleName) && Objects.equals(lastName, employee.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstname, middleName, lastName, department, salary, id);
    }
}
