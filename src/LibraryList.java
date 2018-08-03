import java.util.ArrayList;

public class LibraryList {
	private ArrayList <Book> libList;
	private int num;
	private String name;
	
	public LibraryList(int passNum, String passName) {
		num = passNum;
		name = passName;
	}
	
	public ArrayList<Book> getLibList(){
		return libList;
	}

	public void setLibList(ArrayList<Book> libList) {
		this.libList = libList;
	}

	public LibraryList() {
		this.libList = new ArrayList <Book>();
	}
	
	public boolean addBook(Book book) {
		if(book == null || book.getTitle() == "") {
			throw new NullPointerException("Need book names");
		}
		libList.add(book);
		return true;
	}
	
	public void deleteBook(String title) {
		int bookIndex = -1;
		
		if(title.equals("")) {
			throw new NullPointerException("Need Book to wipe from existence");
		}
		
		for(Book b: libList) {
			if(title.equals(b.getTitle())) {
				Book book = b;
				bookIndex = libList.indexOf(book);
				break;
			}
		}
		
		if(bookIndex == -1) {
			throw new NullPointerException("Book not found");
		}
		libList.remove(bookIndex);
	}
	
	public void printAllBooks() {
		System.out.println();
		for(int i = 0; i<libList.size(); i++) {
			System.out.println(libList.get(i).getTitle());
		}
		
		if(libList.isEmpty()) {
			System.out.println("No books in library");
		}
		System.out.println();
	}
	
	public boolean search(String title) {
		for(Book b: libList) {
			if(b.getTitle().equals(title)){
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		LibraryList list = new LibraryList(9,"");
		System.out.println(list);
	}
}