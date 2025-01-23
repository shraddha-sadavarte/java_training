package secondDay;
import java.util.Scanner;

public class ticketBooking {


    static int[][] seats = new int[5][5];

    public static void displaySeats() {
        System.out.println("Seating Arrangement:");
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                if (seats[i][j] == 0) {
                    System.out.print("[A] "); 
                } else {
                    System.out.print("[B] "); 
                }
            }
            System.out.println();
        }
    }

  
    public static boolean bookSeat(int row, int col) {
        if (row >= 0 && row < seats.length && col >= 0 && col < seats[row].length) {
            if (seats[row][col] == 0) {
                seats[row][col] = 1; 
                System.out.println("Seat booked successfully.");
                return true;
            } else {
                System.out.println("Seat is already booked.");
                return false;
            }
        } else {
            System.out.println("Invalid seat number.");
            return false;
        }
    }

    public static boolean cancelBooking(int row, int col) {
        if (row >= 0 && row < seats.length && col >= 0 && col < seats[row].length) {
            if (seats[row][col] == 1) {
                seats[row][col] = 0; 
                System.out.println("Booking cancelled successfully.");
                return true;
            } else {
                System.out.println("Seat was not booked.");
                return false;
            }
        } else {
            System.out.println("Invalid seat number.");
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("\n--- Ticket Booking System ---");
            System.out.println("1. Display seats");
            System.out.println("2. Book a seat");
            System.out.println("3. Cancel a booking");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    displaySeats();
                    break;

                case 2:
                    System.out.print("Enter row number (0-4): ");
                    int bookRow = scanner.nextInt();
                    System.out.print("Enter column number (0-4): ");
                    int bookCol = scanner.nextInt();
                    bookSeat(bookRow, bookCol);
                    break;

                case 3:
                    System.out.print("Enter row number (0-4): ");
                    int cancelRow = scanner.nextInt();
                    System.out.print("Enter column number (0-4): ");
                    int cancelCol = scanner.nextInt();
                    cancelBooking(cancelRow, cancelCol);
                    break;

                case 4:
                    System.out.println("Exiting system.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
