package secondDay;
import java.util.Scanner;

public class Book {
    String title;
    String author;
    double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayBookDetails() {
        System.out.println("Book Title: " + title);
        System.out.println("Book Author: " + author);
        System.out.println("Book Price: " + price);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of books: ");
        int numberOfBooks = scanner.nextInt();
        scanner.nextLine(); 

        Book[] books = new Book[numberOfBooks];
        
        for (int i = 0; i < numberOfBooks; i++) {
            System.out.println("\nEnter details for Book " + (i + 1));

            System.out.print("Enter book title: ");
            String title = scanner.nextLine();

            System.out.print("Enter book author: ");
            String author = scanner.nextLine();

            System.out.print("Enter book price: ");
            double price = scanner.nextDouble();
            scanner.nextLine(); 
            books[i] = new Book(title, author, price);
        }

        System.out.println("\nBook Details:");
        for (int i = 0; i < books.length; i++) {
            System.out.println("\nBook " + (i + 1) + ":");
            books[i].displayBookDetails();
        }

    }
}
