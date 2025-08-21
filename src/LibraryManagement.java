import java.util.Scanner;

 class Book{
    int id;
    String title;
    String author;
    boolean isIssued;

     {
         System.out.println("New Book Added To Library");
     }

    public Book(int id, String title, String author, boolean isIssued) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isIssued = isIssued;
    }



    boolean issueBook() {
        if(!isIssued){
            return true;
        }
        else  {
            return false;
        }
    }


}

public class LibraryManagement
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Book[] books = new Book[5];
        for(Book b: books){
            System.out.print("Enter Book ID:");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Book Title:");
            String title = sc.nextLine();
            System.out.print("Enter Book Author:");
            String author = sc.nextLine();
            System.out.print("Enter Book ISSUED:");
            boolean isIssued = sc.nextBoolean();
        }
    }
}
