import java.util.Scanner;

public class TestBookList {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String title = "";
		String author = "";
		String genre = "";
		String input = "";
		boolean searchCheck = false;
		LibraryList libList = new LibraryList();
		
		for(int i = 0; i<100000; i++){
			title = "";
			author = "";
			genre = "";
			input = "";
			
			System.out.println("Welcome to your own personal fake library");
		    System.out.println("-----------------------------------------");
		    System.out.println("(1) To add a book");
		    System.out.println("(2) To delete a book");
		    System.out.println("(3) To Print book list");
		    System.out.println("(4) Search a book by title");
		    System.out.print("\nChoose yout input choice: ");
		    
			input = scan.nextLine();
			
			if(input.equals("1")) {
				System.out.print("Which book would you like to add ");
				
				Book book = new Book();
				title = scan.nextLine();
				book.setTitle(title);
				
				System.out.print("Who wrote this book? ");
				author = scan.nextLine();
				book.setAuthor(author);
				
				System.out.print("What genre is this book? ");
				genre = scan.nextLine();
				book.setGenre(genre);
				
				libList.addBook(book);
				System.out.println();
			}
			
			else if(input.equals("2")) {
				System.out.print("Which book would you like to delete: ");
				title = scan.nextLine();
				try {
					libList.deleteBook(title);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					System.out.println("----- ERROR ----- " + e.getMessage());
				}
			}
			
			else if(input.equals("3")) {
				libList.printAllBooks();
			}
			
			else if(input.equals("4")) {
				System.out.print("Which book would you like to search for: ");
				title = scan.nextLine();
				searchCheck = libList.search(title);
				System.out.println();
				
				if(searchCheck == true) {
					System.out.println("The book you are searching for exists\n");
				}
				else {
					System.out.println("The book you are searching for does not exist\n");
				}
			}
		}
	}

}
