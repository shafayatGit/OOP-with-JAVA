package Java_Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student implements Comparable<Student> //implement to compare Student
{
    int id;
    double cgpa;
    String name;

    public Student(int id, double cgpa, String name) {
        this.id = id;
        this.cgpa = cgpa;
        this.name = name;
    }

    public String toString() //override this from parent class Object, to print your class object in sout
    {
        return "Name: " + name + ", ID: " + id + ", CGPA: " + cgpa;
        // return the string that you want to print in sout from this function
    }

    public int compareTo(Student s) //override to compare this object with Student s
    {
        if (this.id < s.id) return -1;
        else if (this.id == s.id) return 0;
        else return 1;

        // this < s -> - ve
        // this > s -> + ve
        // this == s -> 0
    }
}

class NameComparator implements Comparator<Student> //to create other comparators, create new classes
{
    public int compare(Student s1, Student s2) // compares s1 with s2
    {
        return s1.name.compareTo(s2.name); // for comparing Strings, directly use the built-in compareTo of Strings

        // s1 < s2 -> - ve
        // s1 > s2 -> + ve
        // s1 == s2 -> 0
    }
}

public class Comparable_And_Comparator {

    public static void main(String[] args) {

        ArrayList<Student> arr1 = new ArrayList<>();
        Student s1 = new Student(10, 3.5, "ALice");
        arr1.add(s1); // s1 reference and 0 index of arr1 points to the same object
        arr1.add(new Student(5, 3.6, "Bob")); // can directly create object without reference in the add function
        arr1.add(new Student(9, 3.65, "Cathy"));

        System.out.println("arr1 = " + arr1);
        System.out.println("1st Line Ends----------------------");
        Collections.sort(arr1); //to sort Students, you need to tell how to compare Students
        System.out.println("arr1 = " + arr1);
        System.out.println("2nd Line Ends----------------------");
        System.out.println("arr1 = " + arr1);
        System.out.println("3rd Line Ends----------------------");
        Collections.sort(arr1, new NameComparator()); //for other ways of comparison, give comparator object as 2nd parameter
        System.out.println("arr1 = " + arr1);
        System.out.println("4th Line Ends----------------------");

        Collections.sort(arr1, Collections.reverseOrder(new NameComparator())); //to get reverse sorting of your comparator class
        System.out.println("arr1 = " + arr1);
        System.out.println("5th Line Ends------------------------");


    }

}
