package Final_243;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Cow implements Comparable<Cow> {
    String name;
    int price;

    public Cow(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String toString() {
        return name + " costs " + price + " taka.";
    }

    public int compareTo(Cow other) {
        if (this.price < other.price) return -1;
        else if (this.price > other.price) {
            return 1;
        }
        return 0;
    }
}


class nameComaprator implements Comparator<Cow> {
    public int compare(Cow c1, Cow c2) {
       return c1.name.compareTo(c2.name);
    }
}

public class Qns_5b {
    public static void main(String[] args) {
        ArrayList<Cow> cows = new ArrayList<>();

        cows.add(new Cow("Raja Babu", 2700000));
        cows.add(new Cow("Hero Alom", 1500000));
        cows.add(new Cow("Sultan", 1800000));
        cows.add(new Cow("Minister", 1200000));
        cows.add(new Cow("Shahid", 2200000));
        System.out.println("Before Sorting:");
        for (
                Cow c : cows) {
            System.out.println(c);
        }
        Collections.sort(cows);
        System.out.println("\nAfter Sorting by Price:");
        for (
                Cow c : cows) {
            System.out.println(c);
        }
        // answer to question (iii) here
        Collections.sort(cows, new nameComaprator());

        System.out.println("\nAfter Sorting by Name:");
        for (
                Cow c : cows) {
            System.out.println(c);
        }
    }
}
