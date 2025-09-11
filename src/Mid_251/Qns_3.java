package Mid_251;

class Vehicle {
    void start() {
        System.out.println("Vehicle is starting");
    }

    final void move() {
        System.out.println("Vehicle is moving");
    }
}

class Bus extends Vehicle {

    void needFuel() {
        System.out.println("Bus needs fuel");
    }

    void start() {
        System.out.println("Bus is starting");
    }
}

class Cycle extends Vehicle {
    void pedal() {
        System.out.println("Pedal the cycle");
    }
}

public class Qns_3 {
    public static void main(String[] args) {
        Vehicle bus = new Bus();
        bus.start();
        ((Bus) bus).needFuel();
        Vehicle cycle = new Cycle();
        cycle.move();
        ((Cycle) cycle).pedal();

    }
}
