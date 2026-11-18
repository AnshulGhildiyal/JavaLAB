
package Exp_5;

public class q3 {

    class Worker {
        String name;
        double salaryRate;

        Worker(String name, double salaryRate) {
            this.name = name;
            this.salaryRate = salaryRate;
        }

        double computePay(int hours) {
            return salaryRate * hours;
        }
    }

    class DailyWorker extends Worker {
        DailyWorker(String name, double salaryRate) {
            super(name, salaryRate);
        }

        double computePay(int hours) {
            return salaryRate * hours;
        }
    }

    class SalariedWorker extends Worker {
        SalariedWorker(String name, double salaryRate) {
            super(name, salaryRate);
        }

        double computePay(int hours) {
            return salaryRate * 40;
        }
    }

    public static void main(String[] args) {
        q3 outer = new q3();

        Worker w1 = outer.new DailyWorker("Aman", 100);
        Worker w2 = outer.new SalariedWorker("Rahul", 100);

        System.out.println("Daily Worker Pay: " + w1.computePay(32));
        System.out.println("Salaried Worker Pay: " + w2.computePay(32));
    }
}
