package Exp_2;

import java.util.Scanner;

class NumberCheck {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int n = sc.nextInt();

            if (n > 0) {
                System.out.println("Positive");
            }
            else if (n < 0) {
                System.out.println("Negative");
            }
            else {
                System.out.println("Zero");
            }
        }
    }
}
