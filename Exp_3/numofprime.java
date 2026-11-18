package Exp_3;

public class numofprime {
    public static void main(String[] args) {

        int count = 0;

        for (int n = 2; n <= 1000; n++) {

            boolean prime = true;

            for (int i = 2; i < n; i++) {

                if (n % i == 0) {
                    prime = false;
                    break;
                }
            }

            if (prime) {
                count++;
            }
        }

        System.out.println("Total prime numbers = " + count);
    }
}
