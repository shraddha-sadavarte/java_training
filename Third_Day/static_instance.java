package Third_Day;

class Book{
	static int totalBooks;
	String title;
	String author;
	int bookId;
	
	//static block which will execute only once
	static {
		totalBooks=0;
		System.out.println("Static block executed: totalBooks initialized to "+totalBooks);
		System.out.println("\n=======================================");
	}
	//instance block which will execute every time when object is created
	{
		bookId=totalBooks+1;
		totalBooks++;
		System.out.println("Instance block executed: BookId is: "+bookId);
	}
	
	Book(String title,String author){
		this.title=title;
		this.author=author;
	}
	
	public void displayBookDetails() {
		System.out.println("BookId: "+bookId);
		System.out.println("Book Title: "+title);
		System.out.println("Book author: "+author);
	}
	
	public static void TotalBooks(){
		System.out.println("Total books in library: "+totalBooks);
	}
}

public class static_instance {

	public static void main(String[] args) {
		Book b1=new Book("1984","George orwell");
		b1.displayBookDetails();
		System.out.println("\n=======================================");
		
		Book b2=new Book("To kill a mockingBird","Harper");
		b2.displayBookDetails();
		System.out.println("\n=======================================");
		
		Book b3=new Book("The Great Gatsby","Scott");
		b3.displayBookDetails();
		System.out.println("\n=======================================");
		
		Book b4=new Book("Harry Potter","Harry");
		b4.displayBookDetails();
		System.out.println("\n=======================================");
		
		Book.TotalBooks();
	}

}
