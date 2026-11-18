package Exp_4;

public class BankAccount {

    private double balance;

    // Public method
    public void deposit(double amount) {
        balance = balance + amount;
    }

    // Protected method
    protected void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
        }
        else {
            System.out.println("Insufficient balance");
        }
    }

    // Default-access method
    void checkBalance() {
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        account.deposit(5000);

        account.withdraw(1000);

        account.checkBalance();

        // NOT allowed:
        // account.balance = 10000;
    }
}