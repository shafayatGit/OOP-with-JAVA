package MidPrep;

class Vehicle {
    private String Plate;
    private double baseRate;

    public Vehicle(String plate, double baseRate) {
        Plate = plate;
        setBaseRate(baseRate);
    }

    public double getBaseRate() {
        return baseRate;
    }

    public void setBaseRate(double baseRate) {
        if (baseRate >= 0) {
            this.baseRate = baseRate;
        } else {
            System.out.println("Negative baseRate not allowed");
        }
    }

    public double quote(int days) {
        if (days < 0) {
            return 0;
        }
        return days * baseRate;
    }

    public String type() {
        return "Vehicle";
    }
}

class Car extends Vehicle {
    public Car(String plate, double baseRate) {
        super(plate, baseRate);
    }

    public double quote(int days) {
        if (days >= 7) {
            return (0.9 * days * getBaseRate());
        }
        return days * getBaseRate();
    }
}

class Bike extends Vehicle {
    public Bike(String plate, double baseRate) {
        super(plate, baseRate);
    }

    public double quote(int days) {
        return 0.85 * days * getBaseRate();
    }

    public String type() {
        return "Bike";
    }
}

class Truck extends Vehicle {
    public Truck(String plate, double baseRate) {
        super(plate, baseRate);
    }

    public double quote(int days) {
        return days * getBaseRate() + 500;
    }

    public String type() {
        return "Truck";
    }
}

public class VehicleRentalSystem {

    public static void main(String[] args) {

        Car c1 = new Car("Car001", 200000);
        Bike b1 = new Bike("Bike001", 50000);
        Truck t1 = new Truck("Truck001", 100000);

        Vehicle[] vehicles = {c1, b1,t1};

    }

}
