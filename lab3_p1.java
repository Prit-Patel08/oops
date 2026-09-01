class Employee {
    String name;
    int empID;
    double salary;
    Employee(String name, int empID, double salary) {
        this.name = name;
        this.empID = empID;
        this.salary = salary;
    }
    void displayDetails() {
        System.out.println("Name       : " + name);
        System.out.println("Employee ID: " + empID);
        System.out.println("Salary     : " + salary);
    }
    double calculateBonus() {
        return salary * 0.10;
    }
}

class Faculty extends Employee {
    String department;
    Faculty(String name, int empID, double salary, String department) {
        super(name, empID, salary);
        this.department = department;
    }
    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Department : " + department);
    }
    @Override
    double calculateBonus() {
        return salary * 0.20;
    }
}

class AdministrativeStaff extends Employee {
    String department;
    AdministrativeStaff(String name, int empID, double salary, String designation, String department) {
        super(name, empID, salary);
        this.department = department;
    }
    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Department : " + department);
    }
    @Override
    double calculateBonus() {
        return salary * 0.15;
    }
}

class Main {
    public static void main(String args[]) {
        Employee emp = new Employee("Prit", 100, 1000000);
        Faculty fac = new Faculty("Pranshu", 101, 500000, "CSE");
        AdministrativeStaff adstaff = new AdministrativeStaff("Aashray", 102, 50000, "HOD", "ECE");

        System.out.println("Employee");
        emp.displayDetails();
        System.out.println("Bonus      : " + emp.calculateBonus());

        System.out.println("Faculty");
        fac.displayDetails();
        System.out.println("Bonus      : " + fac.calculateBonus());

        System.out.println("AdministrativeStaff");
        adstaff.displayDetails();
        System.out.println("Bonus      : " + adstaff.calculateBonus());
    }
}
