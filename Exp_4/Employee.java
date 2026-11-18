package Exp_4;

class Employee {

    int employeeID;
    String name;
    String department;

    private double salary;

    static int totalEmployees = 0;
    static double totalSalary = 0;

    // Default constructor
    Employee() {

        this.employeeID = 0;
        this.name = "Unknown";
        this.department = "Unknown";
        this.salary = 0;

        totalEmployees++;
    }

    // Parameterized constructor
    Employee(int employeeID, String name, String department, double salary) {

        this.employeeID = employeeID;
        this.name = name;
        this.department = department;
        this.salary = salary;

        totalEmployees++;
        totalSalary = totalSalary + salary;
    }

    // Static method
    static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    // Return salary
    double calculateSalary() {
        return salary;
    }

    // Display employee information
    void displayEmployeeInfo() {

        System.out.println("Employee ID: " + employeeID);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {

        // Object using default constructor
        Employee e1 = new Employee();

        // Objects using parameterized constructor
        Employee e2 = new Employee(
            101,
            "Rahul",
            "Data Science",
            50000
        );

        Employee e3 = new Employee(
            102,
            "Anshul",
            "Analytics",
            60000
        );

        // Display total employees
        Employee.displayTotalEmployees();

        System.out.println();

        // Employee 1
        System.out.println("Employee 1:");
        e1.displayEmployeeInfo();

        System.out.println();

        // Employee 2
        System.out.println("Employee 2:");
        e2.displayEmployeeInfo();

        System.out.println();

        // Employee 3
        System.out.println("Employee 3:");
        e3.displayEmployeeInfo();

        System.out.println();

        // Salary details
        System.out.println("Salary of Employee 1: "
                + e1.calculateSalary());

        System.out.println("Salary of Employee 2: "
                + e2.calculateSalary());

        System.out.println("Salary of Employee 3: "
                + e3.calculateSalary());

        System.out.println();

        System.out.println("Total Salary Expenditure: "
                + Employee.totalSalary);
    }
}