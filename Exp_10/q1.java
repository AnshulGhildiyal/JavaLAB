
package Exp_10;

import java.util.ArrayList;

public class q1 {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        // Autoboxing
        numbers.add(2);
        numbers.add(4);
        numbers.add(7);
        numbers.add(9);
        numbers.add(11);
        numbers.add(15);

        for (Integer num : numbers) {

            // Unboxing
            int n = num;

            boolean prime = true;

            if (n <= 1) {
                prime = false;
            } else {

                for (int i = 2; i <= n / i; i++) {

                    if (n % i == 0) {
                        prime = false;
                        break;
                    }
                }
            }

            if (prime) {
                System.out.println(n + " is Prime");
            } else {
                System.out.println(n + " is Not Prime");
            }
        }
    }
}
