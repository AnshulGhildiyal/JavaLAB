
package Exp_7;

public class q1 {

    static abstract class Shape {

        abstract void calculateArea();
    }

    static class Rectangle extends Shape {

        double length;
        double breadth;

        Rectangle(double length, double breadth) {
            this.length = length;
            this.breadth = breadth;
        }

        void calculateArea() {
            double area = length * breadth;

            System.out.println("Area of Rectangle: " + area);
        }
    }

    static class Circle extends Shape {

        double radius;

        Circle(double radius) {
            this.radius = radius;
        }

        void calculateArea() {
            double area = Math.PI * radius * radius;

            System.out.println("Area of Circle: " + area);
        }
    }

    public static void main(String[] args) {

        Shape s1 = new Rectangle(10, 5);
        Shape s2 = new Circle(7);

        s1.calculateArea();
        s2.calculateArea();
    }
}