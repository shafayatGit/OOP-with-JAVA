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

    public String getName() {
        return name;
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
//        Manager object m1
        Manager m1 = new Manager("Shafayat", 10000, "CSE", 1000);

//    Developer objects d1 d2
        Developer d1 = new Developer("ShafayatDev1", 20000, "JS", 1000);
        Developer d2 = new Developer("ShafayatDev2", 25000, "React", 2000);

        System.out.println("Role Management--->");
        Employee[] emp = {m1,d1,d2};
        for(Employee employee: emp){
            System.out.println(employee.role());
            System.out.println(employee.totalComp());
        }
//    Salary --->

        System.out.println(d1.getName()+" salary before updating"+ d1.getBaseSalary());
        d1.setBaseSalary(30000);
        System.out.println(d1.getName()+" salary before updating"+ d1.getBaseSalary());


//        Last overridden methode


    }
}
