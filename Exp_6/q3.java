
package Exp_6;

public class q3 {

    static class MathConstants {

        final double PI = 3.14159;

        final void displayPI() {
            System.out.println("PI = " + PI);
        }
    }

    static class Circle extends MathConstants {

        void calculateArea(double radius) {

            double area = PI * radius * radius;

            System.out.println("Radius: " + radius);
            System.out.println("Area of Circle: " + area);
        }
    }

    public static void main(String[] args) {

        Circle obj = new Circle();

        obj.displayPI();

        obj.calculateArea(5);
    }
}