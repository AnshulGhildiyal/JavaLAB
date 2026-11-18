
package Exp_5;

public class q1 {

    class Parent {
        private int number = 100;

        public int getNumber() {
            return number;
        }
    }

    class Child extends Parent {
        void display() {
            // System.out.println(number); // Error: private member
            System.out.println("Number: " + getNumber());
        }
    }

    public static void main(String[] args) {
        q1 outer = new q1();
        Child obj = outer.new Child();
        obj.display();
    }
}
