
package Exp_7;

public class q2 {

    static abstract class Employee {

        String name;

        Employee(String name) {
            this.name = name;
        }

        abstract double calculateSalary();

        abstract void displayDetails();
    }

    static class Manager extends Employee {

        double salary;

        Manager(String name, double salary) {
            super(name);
            this.salary = salary;
        }

        double calculateSalary() {
            return salary;
        }

        void displayDetails() {
            System.out.println("Employee Name: " + name);
            System.out.println("Role: Manager");
            System.out.println("Salary: " + calculateSalary());
        }
    }

    static class Developer extends Employee {

        int hours;
        double hourlyRate;

        Developer(String name, int hours, double hourlyRate) {
            super(name);
            this.hours = hours;
            this.hourlyRate = hourlyRate;
        }

        double calculateSalary() {
            return hours * hourlyRate;
        }

        void displayDetails() {
            System.out.println("Employee Name: " + name);
            System.out.println("Role: Developer");
            System.out.println("Salary: " + calculateSalary());
        }
    }

    public static void main(String[] args) {

        Employee e1 = new Manager("Rahul", 60000);
        Employee e2 = new Developer("Aman", 160, 300);

        e1.displayDetails();

        System.out.println();

        e2.displayDetails();
    }
}