
class Vehicle{
    protected String brand;
    protected int serial;


    String getBrand() {
        return brand;
    }
    void setBrand(String brand) {
        this.brand = brand;
    }
    Vehicle(String brand) {
        this.brand = brand;
    }
     Vehicle(int serial) {
        this.serial = serial;
    }
     Vehicle(String brand. int serial){
      this(brand);
    }


    void setSerial(int serial) {
         this.serial = serial;
    }
    int getSerial() {
         return serial;
    }

}

class Car extends Vehicle{
    private String ModelName;
    Car(String brand, int serial, String modelName) {
        super(serial);
    }
}


    public class Vehicle243 {
        public static void main(String[] args) {

        }
    }


