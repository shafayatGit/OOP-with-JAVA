import java.util.Scanner;

class Employee {
    int id;
    String name;
    double basicSalary;
    static String companyName = "TechCorp";

    public Employee(int id, String name, double basicSalary) {

        this.id = id;

        this.name = name;

        this.basicSalary = basicSalary;
        System.out.println("ID: " + id + " Name:" + name + " BasicSalary:" + basicSalary);

    }

    double calculateBonus() {
        return Math.round(basicSalary * 0.1);
    }

    void displaySalarySlip() {
        System.out.println("Salary: " + basicSalary + " Bonus:" + calculateBonus());
    }

    static double calculateTotalPayroll(Employee[] e){
        double total = 0;
        for(Employee x: e){
            total += x.basicSalary + x.calculateBonus();
        }
        return total;
    }
}

public class EmployPayroll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee[] employees = new Employee[3];

        for (int i = 0; i < employees.length; i++) {
            System.out.print("Enter Employee ID:");
            int id = sc.nextInt();
            System.out.print("Enter Employee Name:");
            String name = sc.next();
            System.out.print("Enter Employee Salary:");
            double basicSalary = sc.nextDouble();
            employees[i] = new Employee(id, name, basicSalary);
        }
        for (Employee e : employees) {
            e.displaySalarySlip();
        }

        double totalPayRoll = Employee.calculateTotalPayroll(employees);
        System.out.println("Total Payroll: " + totalPayRoll);

    }
}
