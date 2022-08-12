package TermPaper;

public class Main {
    public static void main(String[] args){
        Employee [] Employees = new Employee[10];
        Employees[0] = new Employee("ivan", "ivanovich", "ivanov", 2, 25000);
        Employees[1] = new Employee("petya", "ivanovich", "ivanov", 1, 60000);
        Employees[2] = new Employee("lana1", "ivanovich", "ivanov", 5, 30000);
        Employees[3] = new Employee("lana2", "ivanovich", "ivanov", 2, 34000);
        Employees[4] = new Employee("lana3", "ivanovich", "ivanov", 3, 36000);
        Employees[5] = new Employee("lana5", "ivanovich", "ivanov", 4, 32000);
        Employees[6] = new Employee("lana6", "ivanovich", "ivanov", 2, 4000);
        Employees[7] = new Employee("lana7", "ivanovich", "ivanov", 1, 35000);

//        System.out.println(salaryAmount(Employees));
//        System.out.println(minSalary(Employees));
//        System.out.println(meanSalary(Employees));
//        minSalary(Employees);
//        maxSalary(Employees);
//        displayFullName(Employees);
//        indexSalary(4.1, Employees);
//        for (int i = 0; i < Employees.length; i++) {
//            if (Employees[i] != null) {
//                System.out.println(Employees[i].getSalary());
//            }
//        }
//        minSalaryDepartment(1, Employees);
//        System.out.println(salaryAmountDepartment(1, Employees));
//        System.out.println(meanAmountDepartment(1, Employees));
//        displayFullNameDepartment(5, Employees);
        findEmployeesWithLessSalary(30_000, Employees);
    }
//    Получить Ф. И. О. всех сотрудников
    public static void displayFullName(Employee[] args){
        System.out.println("ФИО всех сотрудников: ");
        for (int i = 0; i < args.length; i++) {
            if (args[i] != null) {
                System.out.println(args[i].getFirstname() + ' ' + args[i].getMiddleName() + ' ' + args[i].getLastName());
            }
        }
    }
//    Посчитать сумму затрат на зарплаты.
    public static int salaryAmount(Employee[] args) {
        int sumSalary = 0;
        for (Employee arg : args) {
            if (arg != null) {
                sumSalary += arg.getSalary();
            }
        }
        return sumSalary;
    }
    //    Найти сотрудника с минимальной заплатой
    public static void minSalary(Employee[] args) {
        double minSalary = 1_000_000;
        int count = 0;
        for (int i = 0; i < args.length; i++) {
            if (args[i] != null) {
                if (minSalary > args[i].getSalary()) {
                    minSalary = args[i].getSalary();
                    count = i;
                }
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой: " + args[count]);
    }
//    Найти сотрудника с максимальной зарплатой
    public static void maxSalary(Employee[] args) {
        double maxSalary = 0;
        int count = 0;
        for (int i = 0; i < args.length; i++) {
            if (args[i] != null) {
                if (maxSalary < args[i].getSalary()) {
                    maxSalary = args[i].getSalary();
                    count = i;
                }
            }
        }
        System.out.println("Сотрудник с максимальной зарплатой: " + args[count] + ' ' + maxSalary);
    }
//    Подсчитать среднее значение зарплат
    public static void meanSalary(Employee[] args) {
        double sumSalary = 0;
        double meanSalary;
        int count = 0;
        for (Employee arg : args) {
            if (arg != null) {
                sumSalary += arg.getSalary();
                count++;
            }
        }
        meanSalary = sumSalary / count;
        System.out.println("Среднее значение зарплат составляет " + meanSalary + " рублей");
    }
//    Проиндексировать зарплату
    public static void indexSalary(double percentageIndex, Employee[] args) {
        for (int i = 0; i < args.length; i++) {
            if (args[i] != null) {
                args[i].setSalary(args[i].getSalary() * (1+percentageIndex/100));
            }
        }
    }
//    Найти сотрудника с минимальной зарплатой из определенного отдела
    public static void minSalaryDepartment(int department, Employee[] args) {
        double minSalary = 1_000_000;
        int count = 0;
        for (int i = 0; i < args.length; i++) {
            if (args[i] != null) {
                if (department == args[i].getDepartment()) {
                    if (minSalary > args[i].getSalary()) {
                        minSalary = args[i].getSalary();
                        count = i;
                    }
                }
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой из " + department + " отдела : " + args[count]);
    }
//    Найти сотрудника с максимальной зарплатой из определенного отдела
    public static void maxSalaryDepartment(int department, Employee[] args) {
        double maxSalary = 0;
        int count = 0;
        for (int i = 0; i < args.length; i++) {
            if (args[i] != null) {
                if (department == args[i].getDepartment()) {
                    if (maxSalary < args[i].getSalary()) {
                        maxSalary = args[i].getSalary();
                        count = i;
                    }
                }
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой из " + department + " отдела : " + args[count]);
    }
//    Найти сумму затрат на зарплату по отделу
    public static int salaryAmountDepartment(int department,Employee[] args) {
        int sumSalary = 0;
        for (int i = 0; i < args.length; i++) {
            if (args[i] != null) {
                if (department == args[i].getDepartment()) {
                    sumSalary += args[i].getSalary();
                }
            }
        }
        return sumSalary;
    }
//    Найти среднюю зарплату по отделу
    public static double meanAmountDepartment(int department,Employee[] args) {
        int sumSalary = 0;
        double meanSalary;
        int count = 0;
        for (int i = 0; i < args.length; i++) {
            if (args[i] != null) {
                if (department == args[i].getDepartment()) {
                    sumSalary += args[i].getSalary();
                    count++;
                }
            }
        }
        meanSalary = sumSalary / count;
        return meanSalary;
    }
//    Проиндексировать зарплату всех сотрудников отдела на процент
    public static void indexSalaryDepartment(double percentageIndex, int department, Employee[] args) {
        for (int i = 0; i < args.length; i++) {
            if (args[i] != null) {
                if (department == args[i].getDepartment()) {
                    args[i].setSalary(args[i].getSalary() * (1+percentageIndex/100));
                }
            }
        }
    }
//    Напечатать всех сотрудников отдела
    public static void displayFullNameDepartment(int department,Employee[] args){
        System.out.println("ФИО всех сотрудников, их зарплата и порядковый номер: ");
        for (int i = 0; i < args.length; i++) {
            if (department == args[i].getDepartment()) {
                if (args[i] != null) {
                    System.out.println(args[i].getFirstname() + ' ' + args[i].getMiddleName()+ ' ' + args[i].getLastName() + ' ' + args[i].getSalary() + ' ' + args[i].getId());
                }
            }
        }
    }
//    Найти всех сотрудников с зарплатой меньше числа (вывести id, Ф. И. О. и зарплатой в консоль)
    public static void findEmployeesWithLessSalary(double number,Employee[] args){
        System.out.println("Сотрудники с зарплатой меньше " + number);
        for (int i = 0; i < args.length; i++) {
            if (args[i] != null) {
                if (args[i].getSalary() < number) {
                    System.out.println("ID : " + args[i].getId() + " ФИО " + args[i].getLastName() +' ' + args[i].getFirstname() + ' ' + args[i].getMiddleName() + " Зарплата: " + args[i].getSalary());
                }
            }
        }
    }
//    Найти вотрудников с зарплатой больше (или равно) числа (вывести id, Ф. И. О. и зарплатой в консоль).
    public static void findEmployeesWithMoreSalary(double number,Employee[] args){
        System.out.println("Сотрудники с зарплатой больше " + number);
        for (int i = 0; i < args.length; i++) {
            if (args[i] != null) {
                if (args[i].getSalary() > number) {
                    System.out.println("ID : " + args[i].getId() + " ФИО " + args[i].getLastName() +' ' + args[i].getFirstname() + ' ' + args[i].getMiddleName() + " Зарплата: " + args[i].getSalary());
                }
            }
        }
    }
}
