package TermPaper;
//нужно добавить проверку на ошибку ввода отдела,
public class Employee {
    private final String firstname;
    private final String middleName;
    private final String lastName;
    private int department;
    private int salary;
    private int id;
    private static int count = 0;

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

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
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
                ". Порядковый номер:" + id;
    }

}
