package Exp_3;

public class pattern {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {

            char symbol;

            if (i % 2 == 0) {
                symbol = '#';
            }
            else {
                symbol = '?';
            }

            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print(symbol + " ");
            }

            System.out.println();
        }
    }
}