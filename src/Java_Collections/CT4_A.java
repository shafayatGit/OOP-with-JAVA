package Java_Collections;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

class Player implements Comparable<Player> {
    int jersey;
    String name, type;

    public Player(int j, String n, String t) {
        jersey = j;
        name = n;
        type = t;
    }


    public int compareTo(Player p) {
        if (this.jersey < p.jersey) return -1;
        else if (this.jersey > p.jersey) {
            return 1;
        } else return 0;
    }

    public String toString(){
        return "Jersey:" + jersey + " Name:" + name + " Type:" + type;
    }

}

class NameComparator2 implements Comparator<Player>
{
    public int compare(Player p1, Player p2){
        return p1.type.compareTo(p2.type);
    }
}

public class CT4_A {
    public static void main(String[] args) {
        ArrayList<Player> player1 = new ArrayList<>();
        player1.add(new Player(75, "Sakib", "Bangladesh"));
        player1.add(new Player(14, "Ponting", "Australia"));
        player1.add(new Player(18, "Virat", "India"));

        for (Player p : player1) {
            if (p.name.equals("sakib")) {
                p.jersey = 76;
            }
        }
        System.out.println(player1);
        player1.remove(2);
        Collections.sort(player1);
        System.out.println(player1);
        player1.sort(new NameComparator2());
        System.out.println(player1);

    }
}
