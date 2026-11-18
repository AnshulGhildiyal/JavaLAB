
package Exp_8;

public class q3 {

    interface EventHandler {

        void handleEvent();
    }

    static class EventDemo {

        void registerEvent() {

            class LocalHandler implements EventHandler {

                public void handleEvent() {

                    System.out.println(
                        "Event handled by local inner class"
                    );
                }
            }

            EventHandler local = new LocalHandler();

            local.handleEvent();

            EventHandler anonymous = new EventHandler() {

                public void handleEvent() {

                    System.out.println(
                        "Event handled by anonymous inner class"
                    );
                }
            };

            anonymous.handleEvent();
        }
    }

    public static void main(String[] args) {

        EventDemo obj = new EventDemo();

        obj.registerEvent();
    }
}