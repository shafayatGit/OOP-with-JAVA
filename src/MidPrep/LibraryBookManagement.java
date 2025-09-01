package MidPrep;

class Book {
    private String title;
    private String author;
    private boolean issued;

    {
        issued = false;
        author = "Unknown";
    }

    public Book(String title) {
        this.title = title;
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean getIssued() {
        return issued;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setIssued(boolean issued) {
        this.issued = issued;
    }

    public void issue() {
        if (!issued) {
            issued = true;
            return;
        }
        System.out.println("Book already issued:" + title);
    }

    public void returnBook() {
        if (issued) {
            issued = false;
            return;
        }
        System.out.println("Book is not issued:" + title);
    }

    public String getDetails() {
        return ("Title:" + title + " Author:" + author + " Issued:" + issued);
    }
}

public class LibraryBookManagement {
    public static void main(String[] args) {
        Book b1 = new Book("Bangla1st");
        Book b2 = new Book("OOP With King", "Avijit");
        Book b3 = new Book("DLD");
        System.out.println(b1.getDetails());
        System.out.println(b2.getDetails());
        System.out.println(b3.getDetails());
        b1.issue();
        b2.issue();
        b1.issue();
        b2.returnBook();
        System.out.println(b1.getDetails());
        System.out.println(b2.getDetails());
        System.out.println(b3.getDetails());
    }
}
