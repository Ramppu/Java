
public class Album {
	private int releaseYear;
	private String name;
	private String artist;
	private String genre;
	
	
	
	public Album(int releaseYear, String name, String artist) {
		super();
		this.releaseYear = releaseYear;
		this.name = name;
		this.artist = artist;
		this.genre = "Prog";
	}
	public Album(int releaseYear, String name, String artist, String genre) {
		super();
		this.releaseYear = releaseYear;
		this.name = name;
		this.artist = artist;
		this.genre = genre;
	}
	public Album() {
		super();
	}
	public int getReleaseYear() {
		return releaseYear;
	}
	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	@Override
	public String toString() {
		return artist + " " + name + " " + releaseYear;
	}
	
	
	
}
