package TermPaper;

public class Main {
    public static void main(String[] args){
        Employee [] Employees = new Employee[10];
        Employees[0] = new Employee("ivan", "ivanovich", "ivanov", 2, 25000);
        Employees[1] = new Employee("petya", "ivanovich", "ivanov", 1, 60000);
        Employees[2] = new Employee("lana", "ivanovich", "ivanov", 5, 30000);

        System.out.println(salaryAmount(Employees));
        System.out.println(minSalary(Employees));
        System.out.println(meanSalary(Employees));
        displayFullName(Employees);
    }
//    Получить Ф. И. О. всех сотрудников
    public static void displayFullName(Employee[] args){
        System.out.println("ФИО всех сотрудников: ");
        for (int i = 0; i < args.length; i++) {
            if (args[i] != null && i != args.length - 1) {
                System.out.println(args[i].getFirstname() + ' ' + args[i].getMiddleName()+ ' ' + args[i].getLastName());
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
    public static int minSalary(Employee[] args) {
        int minSalary = 1_000_000;
        for (Employee arg : args) {
            if (arg != null) {
                if (minSalary > arg.getSalary()) {
                    minSalary = arg.getSalary();
                }
            }
        }
        return minSalary;
    }
//    Найти сотрудника с максимальной зарплатой
    public static int maxSalary(Employee[] args) {
        int maxSalary = 0;
        for (Employee arg : args) {
            if (arg != null) {
                if (maxSalary < arg.getSalary()) {
                    maxSalary = arg.getSalary();
                }
            }
        }
        return maxSalary;
    }
//    Подсчитать среднее значение зарплат
    public static int meanSalary(Employee[] args) {
        int sumSalary = 0;
        int meanSalary;
        int count = 0;
        for (Employee arg : args) {
            if (arg != null) {
                sumSalary += arg.getSalary();
                count++;
            }
        }
        meanSalary = sumSalary / count;
        return meanSalary;
    }
}
