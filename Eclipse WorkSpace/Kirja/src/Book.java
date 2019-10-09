public class Book {
	private String bookName;
	private int releaseDate;
	private String Author;
	private double price;
	
	// Constructor(s)
	public Book () {
		this.bookName = "no name";
		this.releaseDate = 0;
		this.Author = "No Author";
		this.price = 0.0;
	}
	public Book(String bookName) {
		super();
		this.bookName = bookName;
		this.releaseDate = 0;
		this.Author = "No Author";
		this.price = 0.0;
	}
	
	public Book(String bookName, int releaseDate) {
		super();
		this.bookName = bookName;
		this.releaseDate = releaseDate;
		this.Author = "No Author";
		this.price = 0.0;
	}
	
	public Book(String bookName, int releaseDate, String author) {
		super();
		this.bookName = bookName;
		this.releaseDate = releaseDate;
		this.Author = author;
		this.price = 75.0;
	}
	
	public Book(String bookName, int releaseDate, String author, double price) {
		super();
		this.bookName = bookName;
		this.releaseDate = releaseDate;
		this.Author = author;
		this.price = price;
	}	
	// ---------------------------------
	

	// Getters and Setters
	public String getBookName() {
		return bookName;
	}
	
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(int releaseDate) {
		this.releaseDate = releaseDate;
	}
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		Author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	// toString Method
	public String toString() {
		return "Book Name = " + bookName + ", Release Date = " + releaseDate + ", Author = " + Author + ", Price = " + price
				+ "€";
	}
}