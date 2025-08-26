class Burger {
    private String name;
    private String size;

    public Burger(String name, String size) {
        this.name = name;
        this.size = size;
    }

    public void prepare() {
        System.out.println("Preparing " + name + " " + size + " burger");
    }

}

class BeefBurger extends Burger {
    String flavor;
    double price;

    BeefBurger(String name, String size, String flavor, double price) {
        super(name, size);
        this.flavor = flavor;
        this.price = price;
    }
}

class VeggieBurger extends BeefBurger {

    VeggieBurger(String name, String size, String flavor, double price) {
        super(name, size, flavor, price);
        this.flavor = flavor;
        this.price = price;
    }
}

public class BurgerClass {
    public static void main(String[] args) {
        Burger beefBurger = new BeefBurger("Double Decker", "Large", "Spicy", 400);
        beefBurger.prepare();


        Burger veggieBurger = new VeggieBurger("Mushroom Delight", "Small", "Sweet", 300);
        veggieBurger.prepare();


    }
}
