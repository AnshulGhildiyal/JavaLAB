
package Exp_8;

public class q2 {

    static class Car {

        class Engine {

            void start() {
                System.out.println("Engine started");
            }

            void stop() {
                System.out.println("Engine stopped");
            }
        }

        void drive() {

            Engine obj = new Engine();

            obj.start();
            obj.stop();
        }
    }

    public static void main(String[] args) {

        Car obj = new Car();

        obj.drive();
    }
}