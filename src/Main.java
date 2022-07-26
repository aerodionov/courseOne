import java.util.Arrays;

public class Main {


    //Получить список всех сотрудников со всеми имеющимися по ним данными (вывести в консоль значения всех полей (toString))
    public static void printAllData(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                System.out.println(employees[i].toString());
            }
        }
        System.out.println();
    }

    //Посчитать сумму затрат на зарплаты в месяц
    public static float allSalary(Employee[] employees) {
        float sumSalary = 0f;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                sumSalary += employees[i].getSalary();
            }
        }
        return sumSalary;
    }

    //Найти сотрудника с минимальной зарплатой.
    public static Employee minSalaryEmployee (Employee[] employees) {
        float minSalary = -1f;
        int indexEmployee = -1;

        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                continue;
            }
            if (indexEmployee == -1) {
                minSalary = employees[i].getSalary();
                indexEmployee = i;
            } else if (employees[i].getSalary() < minSalary) {
                minSalary = employees[i].getSalary();
                indexEmployee = i;
            }
        }
        return employees[indexEmployee];
    }

    //Найти сотрудника с максимальной зарплатой.
    public static Employee maxSalaryEmployee (Employee[] employees) {
        float maxSalary = -1f;
        int indexEmployee = -1;

        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                if (employees[i].getSalary() > maxSalary) {
                    maxSalary = employees[i].getSalary();
                    indexEmployee = i;
                }
            }
        }
        return employees[indexEmployee];
    }

    //Подсчитать среднее значение зарплат
    public static float midSalaryEmploy(Employee[] employees) {
        float sumSalary = 0;
        int countEmployee = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                sumSalary += employees[i].getSalary();
                countEmployee++;
            }
        }
        return sumSalary / countEmployee;
    }

    //Получить Ф. И. О. всех сотрудников (вывести в консоль).
    public static void printAllFullName(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                System.out.println(employees[i].getFullName());
            }
        }
        System.out.println();
    }

    //Проиндексировать зарплату (вызвать изменение зарплат у всех сотрудников на величину аргумента в %).
    public static void indexingSalary (Employee[] employees, float procSalary) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                employees[i].setSalary(employees[i].getSalary() * (procSalary/100 + 1));
            }
        }
    }

    //Получить в качестве параметра номер отдела (1–5) и найти сотрудника с минимальной зарплатой
    public static Employee minSalaryDepartment(Employee[] employees, int department) {
        float minSalary = -1f;
        int indexEmployee = -1;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                continue;
            }
            if ((employees[i].getDepartment() == department) && ((indexEmployee == -1) || (employees[i].getSalary() < minSalary))) {
                    minSalary = employees[i].getSalary();
                    indexEmployee = i;
            }
        }
        return employees[indexEmployee];
    }

    //Получить в качестве параметра номер отдела (1–5) и найти сотрудника с максимальной зарплатой.
    public static Employee maxSalaryDepartment(Employee[] employees, int department) {
        float maxSalary = -1f;
        int indexEmployee = -1;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                continue;
            }
            if ((employees[i].getDepartment() == department) && (employees[i].getSalary() > maxSalary)) {
                maxSalary = employees[i].getSalary();
                indexEmployee = i;
            }
        }
        return employees[indexEmployee];
    }

    //Получить в качестве параметра номер отдела (1–5) и найти сумму затрат на зарплату по отделу.
    public static float allSalaryDepartment(Employee[] employees, int department) {
        float sumSalary = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                if (employees[i].getDepartment() == department) {
                    sumSalary += employees[i].getSalary();
                }
            }
        }
        return sumSalary;
    }

    //Получить в качестве параметра номер отдела (1–5) и найти среднюю зарплату по отделу
    public static float midSalaryDepartment(Employee[] employees, int department) {
        float sumSalary = 0;
        int countEmployee = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                if (employees[i].getDepartment() == department) {
                    sumSalary += employees[i].getSalary();
                    countEmployee++;
                }
            }
        }
        return sumSalary / countEmployee;
    }

    //Получить в качестве параметра номер отдела (1–5) и проиндексировать зарплату всех сотрудников отдела на процент, который приходит в качестве параметра
    public static void indexingSalaryDepartment (Employee[] employees, float procSalary, int department) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                if (employees[i].getDepartment() == department) {
                    employees[i].setSalary(employees[i].getSalary() * (procSalary/100 + 1));
                }
            }
        }
    }

    //Получить в качестве параметра номер отдела (1–5) и напечатать всех сотрудников отдела (все данные, кроме отдела).
    public static void printDepartmentData (Employee[] employees, int department) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                continue;
            }
            if (employees[i].getDepartment() == department) {
                System.out.println(employees[i].toStringDepartment());
            }
        }
    }

    //Получить в качестве параметра число и найти всех сотрудников с зарплатой меньше числа (вывести id, Ф. И. О. и зарплатой вконсоль)
    public static void printEmployeeSalaryLess (Employee[] employees, float lessThen) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                continue;
            }
            if (employees[i].getSalary() < lessThen) {
                System.out.println(employees[i].toStringDepartment());
            }
        }
    }

    //Получить в качестве параметра число и найти всех сотрудников с зарплатой больше (или равно) числа (вывести id, Ф. И. О. и зарплатой в консоль)
    public static void printEmployeeSalaryMore (Employee[] employees, float moreThen) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                continue;
            }
            if (employees[i].getSalary() >= moreThen) {
                System.out.println(employees[i].toStringDepartment());
            }
        }
    }

    public static void main(String[] args) {
        Employee[] office = new Employee[10];
        office[0] = new  Employee ("Анна Петровна Дворцова",2,100000f);
        office[2] = new  Employee ("Ванна Петровна Дворцова",2,200000f);
        office[3] = new  Employee ("Айфон Айфоныч Коромыслов",3,150000f);
        office[4] = new  Employee ("Банна Петровна Дворцова",5,130000f);
        office[7] = new  Employee ("Банна Петровна Смирнова",5,120000f);
        office[8] = new  Employee ("Педжак Жакетовна Смирнова",5,121000f);

        printAllData(office);
        indexingSalary(office,10);
        printAllData(office);
        System.out.println("Сумма всех ЗП:" + allSalary(office));
        System.out.println("minSalaryEmploy(office).getSalary() = " + minSalaryEmployee(office).getSalary());
        System.out.println("maxSalaryEmploy(office).getSalary() = " + maxSalaryEmployee(office).getSalary());
        System.out.println("midSalaryEmploy(office) = " + midSalaryEmploy(office));
        printAllFullName(office);
        System.out.println("minSalaryDepartment(office,2).salary = " + minSalaryDepartment(office, 2).getSalary());
        System.out.println("minSalaryDepartment(office,2).salary = " + maxSalaryDepartment(office, 2).getSalary());
        System.out.println("allSalaryDepartment(office, 2) = " + allSalaryDepartment(office, 2));
        System.out.println("midSalaryDepartment(office, 2) = " + midSalaryDepartment(office, 2));
        printDepartmentData(office, 2);
        indexingSalaryDepartment(office,10,2);
        printDepartmentData(office, 2);
        System.out.println();
        printEmployeeSalaryMore(office, 144000f);
        System.out.println();
        printEmployeeSalaryLess(office, 144000f);

    }
}