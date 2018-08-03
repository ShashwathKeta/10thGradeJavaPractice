
public class LibraryListRunner {
	public static void main(String[] args) {
		Book martain = new Book();
		martain.setTitle("The Martain");
		martain.setAuthor("Andy Weir");
		martain.setGenre("Science Fiction");
		martain.setPublisher("Scholastic");
		
		Book findBook = new Book();
		findBook.setTitle("The Martain");
		findBook.setAuthor("Andy Weir");
		findBook.setGenre("Science Fiction");
		findBook.setPublisher("Scholastic");
		
		Book b2 = new Book();
		b2.setTitle("Harry Potter");
		b2.setAuthor("J.K. Rowling");
		b2.setGenre("Fiction");
		b2.setPublisher("Scholastic");
		
		Book b3 = new Book();
		b3.setTitle("Interworld");
		b3.setAuthor("Neil Gaiman");
		b3.setGenre("Fiction");
		b3.setPublisher("Penguin");
		
		LibraryList list = new LibraryList();
		list.addBook(martain);
		list.addBook(b2);
		list.addBook(b3);
		
		list.printAllBooks();
		System.out.println();
		list.deleteBook("The Martain");
		list.printAllBooks();
	}
}
