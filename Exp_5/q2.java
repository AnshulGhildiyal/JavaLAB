
package Exp_5;

public class q2 {

    class Player {
        String name;
        int age;
        String position;

        Player(String name, int age, String position) {
            this.name = name;
            this.age = age;
            this.position = position;
        }

        void play() {
            System.out.println(name + " is playing.");
        }

        void train() {
            System.out.println(name + " is training.");
        }
    }

    class Cricket_Player extends Player {
        Cricket_Player(String name, int age, String position) {
            super(name, age, position);
        }

        void play() {
            System.out.println(name + " is playing Cricket.");
        }
    }

    class Football_Player extends Player {
        Football_Player(String name, int age, String position) {
            super(name, age, position);
        }

        void play() {
            System.out.println(name + " is playing Football.");
        }
    }

    class Hockey_Player extends Player {
        Hockey_Player(String name, int age, String position) {
            super(name, age, position);
        }

        void play() {
            System.out.println(name + " is playing Hockey.");
        }
    }

    public static void main(String[] args) {
        q2 outer = new q2();

        Cricket_Player c = outer.new Cricket_Player("Virat", 36, "Batsman");
        Football_Player f = outer.new Football_Player("Messi", 38, "Forward");
        Hockey_Player h = outer.new Hockey_Player("Manpreet", 34, "Midfielder");

        c.play();
        c.train();

        f.play();
        f.train();

        h.play();
        h.train();
    }
}