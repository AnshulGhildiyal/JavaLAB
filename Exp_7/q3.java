
package Exp_7;

public class q3 {

    interface Bank {

        void deposit(double amount);

        void withdraw(double amount);
    }

    static class Account implements Bank {

        double balance = 1000;

        public void deposit(double amount) {

            balance += amount;

            System.out.println("Deposited: " + amount);
        }

        public void withdraw(double amount) {

            if (amount > 0 && amount <= balance) {

                balance -= amount;

                System.out.println("Withdrawn: " + amount);

            } else {

                System.out.println("Insufficient Balance.");
            }
        }

        void displayBalance() {

            System.out.println("Current Balance: " + balance);
        }
    }

    public static void main(String[] args) {

        Account acc = new Account();

        acc.displayBalance();

        acc.deposit(500);

        acc.withdraw(200);

        acc.displayBalance();
    }
}