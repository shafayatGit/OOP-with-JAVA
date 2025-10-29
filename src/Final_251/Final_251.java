package Final_251;

import java.util.ArrayList;
import java.util.Collections;

public class Final_251 implements Comparable<Final_251>{
    String name;
    int amount;
    double unit_price;
    double total;
    public Final_251(String name, int amount,
                   double unit_price) {
        this.name = name;
        this.amount = amount;
        this.unit_price = unit_price;
        this.total = amount * unit_price;
    }


    public int compareTo(Final_251 p){
        if(this.total < p.total) return -1;
        else if (this.total > p.total) {
            return 1;
        }
        return 0;
    }

}
class ProductList{
    public static void main(String[] args) {
        ArrayList<Final_251> products = new ArrayList<>();
        products.add(new Final_251("Mango", 5, 20));
        products.add(new Final_251("Apple", 4, 24));
        products.add(new Final_251("Litchi", 20, 3));

        products.add(1,new Final_251("Banana", 10, 12));

        for(Final_251 p: products){
            if(p.name.equals("Apple")) {
                p.unit_price = 30;
            }
        }

        Collections.sort(products, Collections.reverseOrder());

    }
}