package Mid_251;

class Burger {
    private String name;
    private String size;

    public Burger(String name, String size) {
        this.name = name;
        this.size = size;
    }

    // always print the base message
    public void prepare() {
        System.out.println("Preparing " + name + " " + size + " burger");
    }
}

class BeefBurger extends Burger {
    String flavor;
    int price;

    public BeefBurger(String name, String size, String flavor, int price) {
        super(name, size);
        this.flavor = flavor;
        this.price = price;
        super.prepare();
    }

    public void prepare() {
        System.out.println("Flavor: " + flavor + "\nPrice: " + price);
    }
}

class VeggieBurger extends Burger{
    String flavor;
    int price;
    public VeggieBurger(String name, String size, String flavor, int price){
        super(name,size);
        this.flavor = flavor;
        this.price = price;
        super.prepare();
    }
    public void prepare() {
        System.out.println("Flavor: " + flavor + "\nPrice: " + price);
    }

}

public class Qns_2 {
    public static void main(String[] args) {
        Burger beefBurger = new BeefBurger("Double Decker", "Large", "Spicy", 400);
        beefBurger.prepare();
        Burger veggieBurger = new VeggieBurger("Mushroom Delight", "Small", "Sweet",
                300);
        veggieBurger.prepare();
    }
}
