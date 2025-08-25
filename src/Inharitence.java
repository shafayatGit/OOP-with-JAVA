class Car {

    String name;

    Car(String name) {
        this.name = name;
    }

    void f1() {
        System.out.println("CAR");
    }
}

class Toyota extends Car { //Toyota class gets all variables and functions of Car

    String model;

    Toyota(String name, String model) {
        super(name); // Parent's constructor is called first, then child constructor
        // super() is used to call parent's constructor
        // need to call super() if parent does not have a default constructor
        this.model = model;
    }

    void f2() {
        System.out.println("Toyota");
    }
}

public class Inharitence {
    public static void main(String[] args) {

        Car c1 = new Car("Gari");
        c1.f1();

        Toyota t1 = new Toyota("ToyotaGari", "New Model");
        t1.f1();
        t1.f2();

    }
}