package Exp_2;

import java.util.Scanner;

class Greatest {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter first number: ");
            int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        int greatest;

        if (a > b) {

            if (a > c) {
                greatest = a;
            }
            else {
                greatest = c;
            }

        }
        else {

            if (b > c) {
                greatest = b;
            }
            else {
                greatest = c;
            }
        }

        System.out.println("Greatest = " + greatest);
    }
}

}
