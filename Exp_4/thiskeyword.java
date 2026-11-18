package Exp_4;

public class thiskeyword {

    String courseName;
    String courseCode;

    thiskeyword(String courseName, String courseCode) {

        this.courseName = courseName;
        this.courseCode = courseCode;
    }

    void displayCourse() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Course Code: " + courseCode);
    }

    public static void main(String[] args) {

        thiskeyword c1 = new thiskeyword("Data Science", "DS101");

        c1.displayCourse();
    }
}
