
package Exp_10;

import java.util.HashMap;

public class q3 {

    public static void main(String[] args) {

        HashMap<Integer, Integer> inventory = new HashMap<>();

        // Adding three products
        inventory.put(101, 10);
        inventory.put(102, 20);
        inventory.put(103, 30);

        System.out.println("Initial Inventory:");
        System.out.println(inventory);

        // Updating quantity of product 102
        inventory.put(102, 50);

        // Removing product 101
        inventory.remove(101);

        // Displaying final inventory
        System.out.println("\nFinal Inventory:");

        for (Integer id : inventory.keySet()) {

            System.out.println(
                "Product ID: " + id +
                ", Quantity: " + inventory.get(id)
            );
        }
    }
}
