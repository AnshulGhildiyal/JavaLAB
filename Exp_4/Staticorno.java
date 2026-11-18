package Exp_4;

public class Staticorno {

    static String universityName = "Graphic Era University";

    String studentName;

    Staticorno(String name) {
        studentName = name;
    }

    static void displayUniversityName() {
        System.out.println("University: " + universityName);
    }

    void displayStudent() {
        System.out.println("Student: " + studentName);
    }

    public static void main(String[] args) {

        Staticorno s1 = new Staticorno("Rahul");
        Staticorno s2 = new Staticorno("Anshul");
        Staticorno s3 = new Staticorno("Priya");

        // Static method can be called using class name
        Staticorno.displayUniversityName();

        System.out.println();

        s1.displayStudent();
        s2.displayStudent();
        s3.displayStudent();
    }
}
