package Thread;

class User extends Thread {
    MovieTheater m;
    int numberOfTickets;

    User(MovieTheater m, int numberOfTickets) {
        super("Thread");
        this.m = m;
        this.numberOfTickets = numberOfTickets;
    }

    public void run() {
        m.bookTickets(numberOfTickets);
    }
}

class MovieTheater {
    int availableSeats;

    MovieTheater(int s) {
        availableSeats = s;
    }

    public synchronized int bookTickets(int numOFseats) {
        int numOfTicketsBooked = 0;
        // The tickets are booked one by one
        for (int i = 1; i <= numOFseats; i++) {
            if (availableSeats > 0) {
                availableSeats--;
                numOfTicketsBooked++;
            }
        }
        return numOfTicketsBooked;
    }
}

public class Practice_3 {
    public static void main(String[] args) {
        MovieTheater m1 = new MovieTheater(15);
        User tina = new User(m1, 6);
        tina.start();

        User farhna = new User(m1, 3);
        farhna.start();

        System.out.println(tina.numberOfTickets);
        System.out.println(farhna.numberOfTickets);
        System.out.println(m1.availableSeats);


    }
}
