
package Exp_10;

import java.util.ArrayList;
import java.util.HashSet;

public class q5 {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        // Adding elements
        numbers.add(3);
        numbers.add(5);
        numbers.add(3);
        numbers.add(8);
        numbers.add(2);
        numbers.add(5);

        System.out.println("Original List: " + numbers);

        // Converting ArrayList into HashSet
        HashSet<Integer> uniqueNumbers =
            new HashSet<>(numbers);

        // Calculating sum
        int sum = 0;

        for (int num : uniqueNumbers) {
            sum += num;
        }

        System.out.println("Unique Values: " + uniqueNumbers);

        System.out.println("Sum: " + sum);
    }
}