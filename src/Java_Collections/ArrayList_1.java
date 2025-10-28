package Java_Collections;

import java.util.ArrayList;

public class ArrayList_1 {

    public static void main(String[] args) {

        ArrayList<Object> arr1 = new ArrayList<>(); //can store any type of data
        arr1.add("Hello"); // add(element) -> adds at the end of the list
        arr1.add(1);
        arr1.add(4.5f);

        System.out.println("arr1 = " + arr1);
        System.out.println("----------------------------------");


        //        Specified ArrayList
        ArrayList<String> arr2 = new ArrayList<>(); //arraylist of strings
        arr2.add("Alice");
        arr2.add("Bob");
        arr2.add("Jim");
        arr2.add("Jim");
        // arr2.add(2); //cannot add integer in this list

        System.out.println("arr2 = " + arr2);
        System.out.println("----------------------------------");


        ArrayList<Integer> arr3 = new ArrayList<>(); //use reference class of primitive type for primitive type arraylist
        arr3.add(2);
        arr3.add(5);

        System.out.println("arr3 = " + arr3);
        System.out.println("-------------------------------------");


        arr3.add(1, 100); // add(index,element) -> insert the element at given index, shift other elements to right
        System.out.println("arr3 = " + arr3);

        arr3.add(3, 20); // 0 <= index <= no of current elements
        System.out.println("arr3 = " + arr3); // there was no element in 3rd index. so new index will be added to the list

        //arr3.add(100,30); // index out of bounds (IndexOutOfBoundsException)

        System.out.println("arr2 elements: ");
        for (int i = 0; i < arr2.size(); i++) // size() gives no of elements. here size() is just like length.
            System.out.println(arr2.get(i)); // get(index) returns the value of the element (does not remove it from list)

        System.out.println("arr3 = " + arr3);
        arr3.set(2, 450); // set(index, element) -> replace element at given index with new element(ager ta remove kore nije boshe jabe)
        System.out.println("arr3 = " + arr3);

        System.out.println("arr2 = " + arr2);
        String s1 = arr2.remove(1); // remove(index) -> removes element at given index and returns it
        System.out.println("arr2 = " + arr2 + ", removed string = " + s1);
        arr2.remove("Jim"); // remove(element) -> removes first occurrence of given element (does not return it, only returns true/false)
        System.out.println("arr2 = " + arr2);
        arr2.remove("Bob");
        System.out.println("arr2 = " + arr2);

        System.out.println("arr3 = " + arr3);
        arr3.remove(2); // for an integer arraylist, remove(x) -> x is a index not a number here
        System.out.println("arr3 = " + arr3);
        arr3.remove(Integer.valueOf(2)); // use Integer.valueOf(x) to mean the number x not index x
        System.out.println("arr3 = " + arr3);

    }

}