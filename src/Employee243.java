
class EmployeeNew {
    public String name;
    private int employee_id;
    private double salary;

    EmployeeNew(String name, int employee_id, double salary) {
        this.name = name;
        this.employee_id = employee_id;
        this.salary = salary;
    }

    int getEmployee_id() {
        return this.employee_id;
    }

    double getSalary() {
        return this.salary;
    }

    void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;

    }

    void setSalary(double salary) {
        this.salary = salary;

    }


}

public class Employee243 {
    public static void main(String[] args) {
        EmployeeNew e1 = new EmployeeNew("Prof. Albert Einstein",
                19, 2000.50);
        e1.setEmployee_id(20);
        e1.setSalary(500);
        System.out.println(e1.getEmployee_id());
        System.out.println(e1.getSalary());
    }

}