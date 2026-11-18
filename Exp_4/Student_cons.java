package Exp_4;

public class Student_cons {

    String name;
    int age;

    // Default constructor
    Student_cons() {
        name = "Unknown";
        age = 0;
    }

    // Parameterized constructor
    Student_cons(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {

        // Object using default constructor
        Student_cons s1 = new Student_cons();

        // Object using parameterized constructor
        Student_cons s2 = new Student_cons("Anshul", 23);

        System.out.println("Student 1:");
        s1.display();

        System.out.println();

        System.out.println("Student 2:");
        s2.display();
    }
}
