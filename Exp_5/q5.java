
package Exp_5;

public class q5 {

    class Employee {
        String name;
        int empid;
        double salary;

        Employee() {
            name = "Unknown";
            empid = 0;
            salary = 0;
        }

        Employee(String name, int empid, double salary) {
            this.name = name;
            this.empid = empid;
            this.salary = salary;
        }

        String getName() {
            return name;
        }

        double getSalary() {
            return salary;
        }

        void increaseSalary(double percentage) {
            salary += salary * percentage / 100;
        }
    }

    class Manager extends Employee {
        String department;

        Manager(String name, int empid, double salary, String department) {
            super(name, empid, salary);
            this.department = department;
        }

        void display() {
            System.out.println("Name: " + getName());
            System.out.println("ID: " + empid);
            System.out.println("Department: " + department);
            System.out.println("Salary: " + getSalary());
        }
    }

    public static void main(String[] args) {
    q5 outer = new q5();

        Manager m = outer.new Manager("Anshul", 101, 50000, "IT");

        System.out.println("Before Increment:");
        m.display();

        m.increaseSalary(10);

        System.out.println("\nAfter Increment:");
        m.display();
    }
}