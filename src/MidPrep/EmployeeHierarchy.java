package MidPrep;

class Employee {
    //    Declaring Field
    private String name;
    private double baseSalary;

    //Constructor
    public Employee(String name, double baseSalary) {
        this.name = name;
        setBaseSalary(baseSalary); // this is doing just because no one can input negative salary. will validate before putting
    }

    //    Getter
    public double getBaseSalary() {
        return baseSalary;
    }

    //    Setter
    public void setBaseSalary(double baseSalary) {
        if (baseSalary >= 0) {
            this.baseSalary = baseSalary;
            return;
        } else {
            System.out.println("Salary cant be negative");
        }
    }

    //    Methode string role
    public String role() {
        return "Employee";
    }

    public double totalComp() {
        return baseSalary;
    }
}

class Manager extends Employee {
    private String department;
    private double allowance;

    public Manager(String name, double baseSalary, String department, double allowance) {
        super(name, baseSalary);
        this.department = department;
        this.allowance = allowance;
    }

    public String role() {
        return "Manager";
    }

    public double totalComp() {
        return (getBaseSalary() + allowance);
    }
}

class Developer extends Employee {
    private String language;
    private double bonus;

    public Developer(String name, double baseSalary, String language, double bonus) {
        super(name, baseSalary);
        this.language = language;
        this.bonus = bonus;
    }

    public String role() {
        return "Developer";
    }

    public double totalComp() {
        return (getBaseSalary() + bonus);
    }
}

public class EmployeeHierarchy {
    public static void main(String[] args) {

    }
}
