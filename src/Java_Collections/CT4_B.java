package Java_Collections;

import java.util.ArrayList;
import java.util.Collections;

class Book implements Comparable<Book>{
    int isbn;
    String title, author;
    public Book(int i, String t, String a) {
        isbn = i;
        title = t;
        author = a;
    }

    public String toString(){
        return "ISBN: "+ isbn + " Title:" + title + " Author:"+ author;
    }

    public int compareTo(Book b){
        if(this.isbn < b.isbn) return -1;
        else if (this.isbn> b.isbn) {
            return 1;
        }
        return 0;
    }
}

public class CT4_B {
    public static void main(String[] args) {
        ArrayList<Book> books= new ArrayList<>();
        books.add(new Book(123456, "Titanic", "James Cameron"));
        books.add(new Book(789012, "1984", "George Orwell"));
        books.add(new Book(345678, "The Prestige", "Chris Nolan"));

        System.out.println(books.getFirst()); // or can use .get(0)

        books.get(1).author = "Eric Arthur Blair";

        Collections.sort(books, Collections.reverseOrder());

    }
}
