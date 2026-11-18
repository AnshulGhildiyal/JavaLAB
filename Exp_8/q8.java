
package Exp_8;

import java.io.*;

public class q8 {

    public static void main(String[] args) {

        try {

            FileReader fr = new FileReader("student.txt");

            int ch;

            while ((ch = fr.read()) != -1) {

                System.out.print((char) ch);
            }

            fr.close();
        }

        catch (FileNotFoundException e) {

            System.out.println("Student file not found.");
        }

        catch (IOException e) {

            System.out.println("Error reading file.");
        }
    }
}