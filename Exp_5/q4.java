
package Exp_5;

import java.util.Scanner;

public class q4 {

    class TrunkCall {
        double calculateCharge(int minutes) {
            return 0;
        }
    }

    class Ordinary extends TrunkCall {
        double calculateCharge(int minutes) {
            return minutes * 1.0;
        }
    }

    class Urgent extends TrunkCall {
        double calculateCharge(int minutes) {
            return minutes * 2.0;
        }
    }

    class Lightning extends TrunkCall {
        double calculateCharge(int minutes) {
            return minutes * 3.0;
        }
    }

    public static void main(String[] args) {
        q4 outer = new q4();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter duration in minutes: ");
        int minutes = sc.nextInt();

        System.out.print("Enter call type: ");
        String type = sc.next().toLowerCase();

        TrunkCall call;

        switch (type) {
            case "ordinary":
                call = outer.new Ordinary();
                break;

            case "urgent":
                call = outer.new Urgent();
                break;

            case "lightning":
                call = outer.new Lightning();
                break;

            default:
                System.out.println("Invalid call type.");
                sc.close();
                return;
        }

        System.out.println("Total Charge: Rs. " + call.calculateCharge(minutes));

        sc.close();
    }
}
