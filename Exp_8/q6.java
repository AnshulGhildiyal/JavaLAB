
package Exp_8;

import java.io.*;
import java.util.Scanner;

public class q6 {

    static void readFile(String filename)
            throws FileNotFoundException {

        FileReader fr = new FileReader(filename);

        BufferedReader br = new BufferedReader(fr);

        try {

            String line;

            while ((line = br.readLine()) != null) {

                System.out.println(line);
            }
        }

        catch (IOException e) {

            System.out.println("Error reading file.");
        }

        finally {

            try {
                br.close();
            }

            catch (IOException e) {
                System.out.println("Error closing file.");
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Enter filename: ");

            String filename = sc.nextLine();

            readFile(filename);
        }

        catch (FileNotFoundException e) {

            System.out.println("File not found.");
        }

        finally {

            System.out.println("File operation attempted");

            sc.close();
        }
    }
}