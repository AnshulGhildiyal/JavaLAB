package Exp_2;

class Calc {
    public static void main(String[] args) {

        int a = Integer.parseInt(args[0]);
        String operator = args[1];
        int b = Integer.parseInt(args[2]);

        switch (operator) {

            case "+":
                System.out.println("Sum of " + a + " and " + b
                        + " is " + (a + b));
                break;

            case "-":
                System.out.println("Difference of " + a + " and " + b
                        + " is " + (a - b));
                break;

            case "*":
                System.out.println("Product of " + a + " and " + b
                        + " is " + (a * b));
                break;

            default:
                System.out.println("Invalid operator");
        }
    }
}
