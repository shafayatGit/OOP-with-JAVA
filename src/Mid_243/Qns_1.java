package Mid_243;

class Employee {
    public String name;
    private int employee_id;
    private double salary;

    public Employee(String name, int employee_id, double salary) {
        this.employee_id = employee_id;
        this.name = name;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

public class Qns_1 {
    public static void main(String[] args) {
        Employee e1 = new Employee("Prof. Albert Einstein",
                19, 2000.50);
        System.out.println(e1.name);
    }
}
