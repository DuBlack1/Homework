package TermPaper;

public class EmployeeBook {
    Employee [] Employees = new Employee[10];
    public EmployeeBook (){
        Employees[1] = new Employee("petya", "ivanovich", "ivanov", 1, 60000);
        Employees[2] = new Employee("lana1", "ivanovich", "ivanov", 5, 30000);
        Employees[3] = new Employee("lana2", "ivanovich", "ivanov", 2, 34000);
        Employees[4] = new Employee("lana3", "ivanovich", "ivanov", 3, 36000);
        Employees[5] = new Employee("lana5", "ivanovich", "ivanov", 4, 32000);
        Employees[6] = new Employee("lana6", "ivanovich", "ivanov", 2, 4000);
        Employees[7] = new Employee("lana7", "ivanovich", "ivanov", 1, 35000);
    }
//    Добавить нового сотрудника
    public void addNewEmployee(String firstname, String middleName, String lastName, int department, int salary){
        for (int i = 0; i < Employees.length; i++) {
            if (Employees[i] == null) {
                Employees[i] = new Employee(firstname, middleName, lastName, department, salary);
            }
        }
    }
//    Удалить сотрудника
    public void deleteEmployee(int ID){
        Employees[ID] = null;
    }
//    Изменить зарплату сотрудника
    public void changeSalary(String firstname, String middleName, String lastName, int salary){
        for (int i = 0; i < Employees.length; i++) {
            if (Employees[i].getFirstname() == firstname && Employees[i].getMiddleName() == middleName && Employees[i].getLastName() == lastName) {
                Employees[i].setSalary(salary);
            }
        }
    }
    //    Изменить отдел сотрудника
    public void changedepartment(String firstname, String middleName, String lastName, int department){
        for (int i = 0; i < Employees.length; i++) {
            if (Employees[i].getFirstname() == firstname && Employees[i].getMiddleName() == middleName && Employees[i].getLastName() == lastName) {
                Employees[i].setDepartment( department);
            }
        }
    }
//    Получить Ф. И. О. всех сотрудников по отделам
    public void getAllEmployeesByDepartment(){
        for (int c = 1; c <= 5; c++){
            for (int i = 0; i < Employees.length; i++) {
                if (Employees[i] != null){
                    if (c == Employees[i].getDepartment()) {
                        System.out.println("ФИО" + Employees[i].getFirstname() + ' ' + Employees[i].getMiddleName() + ' ' + Employees[i].getLastName() + ", отдел: " +Employees[i].getDepartment());
                    }
                }
            }
        }
    }
    //    Получить Ф. И. О. всех сотрудников
    public void displayFullName(){
        System.out.println("ФИО всех сотрудников: ");
        for (int i = 0; i < Employees.length; i++) {
            if (Employees[i] != null) {
                System.out.println(Employees[i].getFirstname() + ' ' + Employees[i].getMiddleName() + ' ' + Employees[i].getLastName());
            }
        }
    }
    //    Посчитать сумму затрат на зарплаты.
    public void salaryAmount() {
        int sumSalary = 0;
        for (int i = 0; i < Employees.length; i++) {
            if (Employees[i] != null) {
                sumSalary += Employees[i].getSalary();
            }
        }
        System.out.println("Сумма затрат на зарплату составит " + sumSalary + "рублей");
    }
    //    Найти сотрудника с минимальной заплатой
    public void minSalary() {
        double minSalary = 1_000_000;
        int count = 0;
        for (int i = 0; i < Employees.length; i++) {
            if (Employees[i] != null) {
                if (minSalary > Employees[i].getSalary()) {
                    minSalary = Employees[i].getSalary();
                    count = i;
                }
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой: " + Employees[count]);
    }
    //    Найти сотрудника с максимальной зарплатой
    public void maxSalary() {
        double maxSalary = 0;
        int count = 0;
        for (int i = 0; i < Employees.length; i++) {
            if (Employees[i] != null) {
                if (maxSalary < Employees[i].getSalary()) {
                    maxSalary = Employees[i].getSalary();
                    count = i;
                }
            }
        }
        System.out.println("Сотрудник с максимальной зарплатой: " + Employees[count] + ' ' + maxSalary);
    }
    //    Подсчитать среднее значение зарплат
    public void meanSalary() {
        double sumSalary = 0;
        double meanSalary;
        int count = 0;
        for (Employee arg : Employees) {
            if (arg != null) {
                sumSalary += arg.getSalary();
                count++;
            }
        }
        meanSalary = sumSalary / count;
        System.out.println("Среднее значение зарплат составляет " + meanSalary + " рублей");
    }
    //    Проиндексировать зарплату
    public void indexSalary(double percentageIndex) {
        for (int i = 0; i < Employees.length; i++) {
            if (Employees[i] != null) {
                Employees[i].setSalary(Employees[i].getSalary() * (1+percentageIndex/100));
            }
        }
    }
    //    Найти сотрудника с минимальной зарплатой из определенного отдела
    public void minSalaryDepartment(int department) {
        double minSalary = 1_000_000;
        int count = 0;
        for (int i = 0; i < Employees.length; i++) {
            if (Employees[i] != null) {
                if (department == Employees[i].getDepartment()) {
                    if (minSalary > Employees[i].getSalary()) {
                        minSalary = Employees[i].getSalary();
                        count = i;
                    }
                }
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой из " + department + " отдела : " + Employees[count]);
    }
    //    Найти сотрудника с максимальной зарплатой из определенного отдела
    public void maxSalaryDepartment(int department) {
        double maxSalary = 0;
        int count = 0;
        for (int i = 0; i < Employees.length; i++) {
            if (Employees[i] != null) {
                if (department == Employees[i].getDepartment()) {
                    if (maxSalary < Employees[i].getSalary()) {
                        maxSalary = Employees[i].getSalary();
                        count = i;
                    }
                }
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой из " + department + " отдела : " + Employees[count]);
    }
    //    Найти сумму затрат на зарплату по отделу
    public void salaryAmountDepartment(int department) {
        int sumSalary = 0;
        for (int i = 0; i < Employees.length; i++) {
            if (Employees[i] != null) {
                if (department == Employees[i].getDepartment()) {
                    sumSalary += Employees[i].getSalary();
                }
            }
        }
        System.out.println("Сумма затрат на зарплату из " + department + " отдела составит " + sumSalary + "рублей");
    }
    //    Найти среднюю зарплату по отделу
    public void meanAmountDepartment(int department) {
        int sumSalary = 0;
        double meanSalary;
        int count = 0;
        for (int i = 0; i < Employees.length; i++) {
            if (Employees[i] != null) {
                if (department == Employees[i].getDepartment()) {
                    sumSalary += Employees[i].getSalary();
                    count++;
                }
            }
        }
        meanSalary = sumSalary / count;
        System.out.println("Средняя зарплата из " + department + " отдела составит " + meanSalary + "рублей");
    }
    //    Проиндексировать зарплату всех сотрудников отдела на процент
    public void indexSalaryDepartment(double percentageIndex, int department) {
        for (int i = 0; i < Employees.length; i++) {
            if (Employees[i] != null) {
                if (department == Employees[i].getDepartment()) {
                    Employees[i].setSalary(Employees[i].getSalary() * (1+percentageIndex/100));
                }
            }
        }
    }
    //    Напечатать всех сотрудников отдела
    public void displayFullNameDepartment(int department){
        System.out.println("ФИО всех сотрудников, их зарплата и порядковый номер: ");
        for (int i = 0; i < Employees.length; i++) {
            if (department == Employees[i].getDepartment()) {
                if (Employees[i] != null) {
                    System.out.println(Employees[i].getFirstname() + ' ' + Employees[i].getMiddleName()+ ' ' + Employees[i].getLastName() + ' ' + Employees[i].getSalary() + ' ' + Employees[i].getId());
                }
            }
        }
    }
    //    Найти всех сотрудников с зарплатой меньше числа (вывести id, Ф. И. О. и зарплатой в консоль)
    public void findEmployeesWithLessSalary(double number){
        System.out.println("Сотрудники с зарплатой меньше " + number);
        for (int i = 0; i < Employees.length; i++) {
            if (Employees[i] != null) {
                if (Employees[i].getSalary() < number) {
                    System.out.println("ID : " + Employees[i].getId() + " ФИО " + Employees[i].getLastName() +' ' + Employees[i].getFirstname() + ' ' + Employees[i].getMiddleName() + " Зарплата: " + Employees[i].getSalary());
                }
            }
        }
    }
    //    Найти вотрудников с зарплатой больше (или равно) числа (вывести id, Ф. И. О. и зарплатой в консоль).
    public void findEmployeesWithMoreSalary(double number){
        System.out.println("Сотрудники с зарплатой больше " + number);
        for (int i = 0; i < Employees.length; i++) {
            if (Employees[i] != null) {
                if (Employees[i].getSalary() >= number) {
                    System.out.println("ID : " + Employees[i].getId() + " ФИО " + Employees[i].getLastName() +' ' + Employees[i].getFirstname() + ' ' + Employees[i].getMiddleName() + " Зарплата: " + Employees[i].getSalary());
                }
            }
        }
    }
}
