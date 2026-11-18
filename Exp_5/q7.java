
package Exp_5;

public class q7 {

    class Person {
        String name;
        int age;
        String address;

        Person(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        void display() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Address: " + address);
        }
    }

    class Staff extends Person {
        int staffId;
        String department;

        Staff(String name, int age, String address, int staffId, String department) {
            super(name, age, address);
            this.staffId = staffId;
            this.department = department;
        }

        void display() {
            super.display();
            System.out.println("Staff ID: " + staffId);
            System.out.println("Department: " + department);
        }
    }

    class Professor extends Staff {
        String specialization;

        Professor(String name, int age, String address, int staffId, String department, String specialization) {
            super(name, age, address, staffId, department);
            this.specialization = specialization;
        }

        void conductLecture() {
            System.out.println(name + " is conducting a lecture.");
        }

        void display() {
            super.display();
            System.out.println("Specialization: " + specialization);
        }
    }

    class Student extends Person {
        int studentId;
        String course;

        Student(String name, int age, String address,
                int studentId, String course) {
            super(name, age, address);
            this.studentId = studentId;
            this.course = course;
        }

        void display() {
            super.display();
            System.out.println("Student ID: " + studentId);
            System.out.println("Course: " + course);
        }
    }

    class GraduateStudent extends Student {
        String researchTopic;

        GraduateStudent(String name, int age, String address,
                        int studentId, String course, String researchTopic) {
            super(name, age, address, studentId, course);
            this.researchTopic = researchTopic;
        }

        void submitThesis() {
            System.out.println(name + " submitted thesis on " + researchTopic);
        }

        void display() {
            super.display();
            System.out.println("Research: " + researchTopic);
        }
    }

    public static void main(String[] args) {
        q7 outer = new q7();

        Person[] people = {
            outer.new Professor("Rahul", 45, "Delhi",
                                101, "Computer Science", "AI"),

            outer.new GraduateStudent("Anshul", 23, "Dehradun", 201, "MCA", "Machine Learning")
        };

        for (Person p : people) {
            System.out.println("\n----------------");
            p.display();

            if (p instanceof Professor) {
                ((Professor) p).conductLecture();
            }

            if (p instanceof GraduateStudent) {
                ((GraduateStudent) p).submitThesis();
            }
        }
    }
}