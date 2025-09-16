package MidPrep;

class Chada {
    public String serviceName;
    public double baseChada;

    public Chada(String serviceName, double baseChada) {
        this.serviceName = serviceName;
        this.baseChada = baseChada;
    }

    public void displayInfo() {
        System.out.println("Service Name:" + serviceName + " Amount:" + baseChada);
    }

    public double calculateChada() {
        return baseChada;
    }

    public double calculateChada(int quantity) {
        return baseChada * quantity;
    }

    public double calculateChada(int quantity, double extraPercent) {
        extraPercent /= 100;
        return baseChada + (baseChada * extraPercent);
    }
}

class BusChada extends Chada {
    public BusChada(String serviceName, double baseChada) {
        super(serviceName, baseChada);
    }

    public void displayInfo() {
        System.out.println("Service Type:" + serviceName + " Amount:" + baseChada);
    }
}

class AutoStand extends Chada {
    public AutoStand(String serviceName, double baseChada) {
        super(serviceName, baseChada);
    }

    public void displayInfo() {

        System.out.println("Service Type:" + serviceName + " Amount:" + baseChada);
        System.out.println("Includes: Extra 10% for prio ovivabok + singara coke costs");
    }
}

public class ChadaCalculatorForBNP {
    public static void main(String[] args) {
    BusChada b1 = new BusChada("Sayed Nogore Bus Stand", 100000);
    AutoStand a1 = new AutoStand("Satarkul Auto Stand",50000);
        System.out.println(b1.calculateChada());
        System.out.println(b1.calculateChada(3));
        System.out.println(b1.calculateChada(3,12));

        System.out.println(a1.calculateChada());
        System.out.println(a1.calculateChada(2));
        System.out.println(a1.calculateChada(2,10));

        Chada c1 = b1;
        Chada c2 = a1;
        c1.displayInfo();
        c2.displayInfo();
    }


}
