public class Employee {
    private String fullName;
    private int department;
    private float salary;
    private static int counter = 1;
    private int id;

    public String getFullName() {
        return fullName;
    }
    public float getSalary() {
        return salary;
    }
    public int getDepartment() {
        return department;
    }
    public void setDepartment(int department) {
        this.department = department;
    }
    public void setSalary(float salary) {
        this.salary = salary;
    }
    public Employee(String fullName, int department, float salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        this.id = counter;
        counter++;

    }

    public String toString() {
        return "ФИО: " + this.fullName + ", Отдел: " + this.department + ", Зарплата: " + this.salary + ", ID: " + this.id;
    }
    public String toStringDepartment() {
        return "ФИО: " + this.fullName + ", Зарплата: " + this.salary + ", ID: " + this.id;
    }

}

