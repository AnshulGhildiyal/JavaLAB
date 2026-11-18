
package Exp_7;

import java.util.Scanner;

public class q5 {

    interface StackInterface {

        void push(int value);

        void pop();

        void display();
    }

    static class StackClass implements StackInterface {

        int stack[] = new int[5];

        int top = -1;

        public void push(int value) {

            if (top == stack.length - 1) {

                System.out.println("Stack Overflow");

            } else {

                stack[++top] = value;

                System.out.println("Element inserted.");
            }
        }

        public void pop() {

            if (top == -1) {

                System.out.println("Stack Underflow");

            } else {

                System.out.println("Deleted Element: " + stack[top--]);
            }
        }

        public void display() {

            if (top == -1) {

                System.out.println("Stack is empty.");

            } else {

                System.out.println("Stack Elements:");

                for (int i = top; i >= 0; i--) {

                    System.out.println(stack[i]);
                }
            }
        }

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            StackClass s = new StackClass();

            int choice;

            do {

                System.out.println("\n1. Push");
                System.out.println("2. Pop");
                System.out.println("3. Display");
                System.out.println("4. Exit");

                System.out.print("Enter your choice: ");

                choice = sc.nextInt();

                switch (choice) {

                    case 1:

                        System.out.print("Enter value: ");

                        int value = sc.nextInt();

                        s.push(value);

                        break;

                    case 2:

                        s.pop();

                        break;

                    case 3:

                        s.display();

                        break;

                    case 4:

                        System.out.println("Exiting...");

                        break;

                    default:

                        System.out.println("Invalid choice.");
                }

            } while (choice != 4);

            sc.close();
        }
    }

    public static void main(String[] args) {

        StackClass.main(args);
    }
}