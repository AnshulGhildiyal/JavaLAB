package Exp_4;

public class Calculator {

    // Adding two integers
    int add(int a, int b) {
        return a + b;
    }

    // Adding two doubles
    double add(double a, double b) {
        return a + b;
    }

    // Adding three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {

        Calculator c = new Calculator();

        System.out.println("Two integers: " + c.add(10, 20));

        System.out.println("Two doubles: " + c.add(10.5, 20.5));

        System.out.println("Three integers: " + c.add(10, 20, 30));
    }
}
