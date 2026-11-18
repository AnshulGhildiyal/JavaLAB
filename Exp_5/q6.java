
package Exp_5;

public class q6 {

    class Vehicle {
        String brand, model;
        double price;

        Vehicle(String brand, String model, double price) {
            this.brand = brand;
            this.model = model;
            this.price = price;
        }

        void displayDetails() {
            System.out.println("Brand: " + brand);
            System.out.println("Model: " + model);
            System.out.println("Price: " + price);
        }
    }

    class Car extends Vehicle {
        int seatingCapacity;
        String fuelType;

        Car(String brand, String model, double price,
            int seatingCapacity, String fuelType) {
            super(brand, model, price);
            this.seatingCapacity = seatingCapacity;
            this.fuelType = fuelType;
        }

        void displayDetails() {
            super.displayDetails();
            System.out.println("Seats: " + seatingCapacity);
            System.out.println("Fuel: " + fuelType);
        }
    }

    class ElectricCar extends Car {
        double batteryCapacity;
        double chargingTime;

        ElectricCar(String brand, String model, double price,
                    int seats, String fuelType,
                    double batteryCapacity, double chargingTime) {
            super(brand, model, price, seats, fuelType);
            this.batteryCapacity = batteryCapacity;
            this.chargingTime = chargingTime;
        }

        void displayDetails() {
            super.displayDetails();
            System.out.println("Battery: " + batteryCapacity + " kWh");
            System.out.println("Charging Time: " + chargingTime + " hours");
        }
    }

    class Motorcycle extends Vehicle {
        int engineCapacity;
        String type;

        Motorcycle(String brand, String model, double price,
                   int engineCapacity, String type) {
            super(brand, model, price);
            this.engineCapacity = engineCapacity;
            this.type = type;
        }

        void displayDetails() {
            super.displayDetails();
            System.out.println("Engine: " + engineCapacity + " CC");
            System.out.println("Type: " + type);
        }
    }

    public static void main(String[] args) {
        q6 outer = new q6();

        Vehicle v1 = outer.new ElectricCar(
            "Tata", "Nexon EV", 1500000,
            5, "Electric", 40, 6
        );

        Vehicle v2 = outer.new Motorcycle(
            "Royal Enfield", "Classic 350",
            200000, 350, "Cruiser"
        );

        System.out.println("Electric Car Details:");
        v1.displayDetails();

        System.out.println("\nMotorcycle Details:");
        v2.displayDetails();
    }
}