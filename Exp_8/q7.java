
package Exp_8;

import java.io.*;
import java.util.Scanner;

public class q7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Enter student name: ");
            String name = sc.nextLine();

            System.out.print("Enter roll number: ");
            int roll = sc.nextInt();

            sc.nextLine();

            System.out.print("Enter grade: ");
            String grade = sc.nextLine();

            FileWriter fw = new FileWriter("student.txt", true);

            fw.write("Name: " + name + ", Roll Number: " + roll + ", Grade: " + grade + "\n");

            fw.close();

            System.out.println(
                "Student details saved successfully."
            );
        }

        catch (IOException e) {

            System.out.println("Error writing file: " + e.getMessage());
        }

        finally {

            sc.close();
        }
    }
}