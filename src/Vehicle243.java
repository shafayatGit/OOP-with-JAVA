
class Vehicle{
    protected String brand;
    protected int serial;

     Vehicle(String brand) {
        this.brand = brand;
    }
     Vehicle(int serial) {
        this.serial = serial;
    }
     Vehicle(String brand. int serial){
      this(brand);
    }

}

class Car extends Vehicle{
    private String ModelName;
    Car(String brand, int serial, String modelName) {
        super(,serial);
    }
}


    public class Vehicle243 {
        public static void main(String[] args) {
            Car car1= new Car("Honda", 20245 , "Integra");
            car1.honk();
            System.out.println(car1.brand + " " +car1.modelName);
        }
    }


