
package Exp_10;

import java.util.ArrayList;

public class q2 {

    static class Employee {

        String name;
        int id;
        double salary;

        Employee(String name, int id, double salary) {
            this.name = name;
            this.id = id;
            this.salary = salary;
        }

        void display() {

            System.out.println(
                "Name: " + name +
                ", ID: " + id +
                ", Salary: " + salary
            );
        }
    }

    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();

        // Adding three employees
        employees.add(new Employee("Aman", 101, 30000));
        employees.add(new Employee("Rahul", 102, 40000));
        employees.add(new Employee("Anshul", 103, 50000));

        // Updating salary of employee ID 102
        for (Employee e : employees) {

            if (e.id == 102) {
                e.salary = 60000;
            }
        }

        // Removing employee with ID 101
        employees.removeIf(e -> e.id == 101);

        // Displaying remaining employees
        System.out.println("Remaining Employees:");

        for (Employee e : employees) {
            e.display();
        }
    }
}
