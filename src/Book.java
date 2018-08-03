
public class Book {
	
	private String title;
	private String publisher;
	private String author;
	private String genre;
	private int shelfLife;
	
	protected String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}	
	public int computeShelfLife(String title) {
		return shelfLife;
	}
	
	public String toString() {
		return "Title: " + title + " " +  " Author: " + author;
	}
}
