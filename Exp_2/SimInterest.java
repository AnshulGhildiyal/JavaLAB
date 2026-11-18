package Exp_2;

import java.util.Scanner;

class SimpleInterest {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter principal: ");
            double p = sc.nextDouble();

            System.out.print("Enter rate: ");
            double r = sc.nextDouble();

            System.out.print("Enter time: ");
            double t = sc.nextDouble();

            double si = (p * r * t) / 100;

            System.out.println("Simple Interest = " + si);
        }
    }
}
