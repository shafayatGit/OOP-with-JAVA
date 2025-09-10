package Mid_243;

class Vehicle {
    protected String brand;
    protected int serial;


    public Vehicle(String brand) {
        this.brand = brand;
    }

    public Vehicle(int serial) {
        this.serial = serial;
    }

    public Vehicle(String brand, int serial) {
        this.brand = brand;
        this.serial = serial;

    }

    public boolean honk() {
        System.out.println("Tuut, tuut!");
        return true;
    }


}

class Car extends Vehicle {
    private String modelName;

    public Car(String brand, String modelName) {
        super(brand);
        this.modelName = modelName;
    }

    public Car(int serial, String modelName) {
        super(serial);
        this.modelName = modelName;
    }

    public Car(String brand, int serial, String modelName) {
        super(brand, serial);
        this.modelName = modelName;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public boolean honk() {
        System.out.println("A Vehicle in Horning");
        return super.honk();
    }

    public static void main(String[] args) {
        Car car1 = new Car("Honda", 20245, "Integra");
        car1.honk();
        System.out.println(car1.brand + " " + car1.getModelName());
    }
}

