package Java_Collections;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylist_sort {

    public static void main(String[] args) {

        ArrayList<Integer> arr1 = new ArrayList<>();
        arr1.add(50);
        arr1.add(45);
        arr1.add(20);
        arr1.add(36);

        ArrayList<String> arr2 = new ArrayList<>();
        arr2.add("Bob");
        arr2.add("Alice");
        arr2.add("Baseball");

        System.out.println("arr1 = " + arr1);
        Collections.sort(arr1); // sorts the arraylist in ascending order (small to big)
        System.out.println("arr1 = " + arr1);

        System.out.println("arr2 = " + arr2);
        Collections.sort(arr2); // sorts alphabetically/dictionary order
        System.out.println("arr2 = " + arr2);

        System.out.println("arr1 = " + arr1);
        Collections.sort(arr1, Collections.reverseOrder()); // used to sort in descending order
        System.out.println("arr1 = " + arr1);

    }

}
