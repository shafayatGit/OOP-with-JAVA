package AbstractAndInterface_Practice;

abstract class Vehicle {

    abstract double fuelEfficiency();

    void printType() {
        System.out.println("Type From Baap:");
    }
}

abstract class MotorVehicle extends Vehicle {
    double engineCapacity;
    double km;
    double l;

    double fuelEfficiency() {
        return km / l;
    }
}

class Car extends MotorVehicle {
    double fuelEfficiency() {
        return km / l;
    }
}

public class Vehicle_System {
    public static void main(String[] args) {

    }
}
