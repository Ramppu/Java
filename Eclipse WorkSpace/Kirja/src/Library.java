
public class Library {

	public static void main(String[] args) {
	//Adding books with the constructors
	Book b1 = new Book("Brave New World", 1932, "Aldos Huxley", 24.96);
	Book b2 = new Book("1984", 1949, "George Orwell");
	Book b3 = new Book("Thus spoke Zarathustra", 1883);
	Book b4 = new Book("Ethics of Ambiguity");
	Book b5 = new Book();
	
	//Adding the missing info
	b2.setPrice(25.00);
	
	b3.setAuthor("Friedrich Nietzsche");
	b3.setPrice(35.00);
	
	b4.setReleaseDate(1947);
	b4.setAuthor("Simone De Beavuoir");
	b4.setPrice(23.00);
	
	b5.setBookName("Myth of Sisyphus");
	b5.setReleaseDate(1942);
	b5.setAuthor("Albert Camus");
	b5.setPrice(15.00);
	
	System.out.println(b1.toString());
	System.out.println(b2.toString());
	System.out.println(b3.toString());
	System.out.println(b4.toString());
	System.out.println(b5.toString());
	}
}
