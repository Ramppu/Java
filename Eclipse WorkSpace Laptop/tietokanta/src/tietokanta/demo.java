package tietokanta;

import java.sql.*;

class MysqlCon {
	public static void main(String args[]) {
	
		// Varaudutaan poikkeuksiin; esim. jos tietokantaan ei saada yhteyttä
		try {
			// Määritellään tietokannan yhteysosoite sekä tietokannan nimi
			String URL = "jdbc:mysql://localhost:3306/database";
			// Määritellään käyttäjätiedot yhteyden luomista varten
			String USERID = "root";
			String PASSWORD = "";
			
			// Luodaan yhteys käyttäen edellänmainittuja tietoja
			Connection con = DriverManager.getConnection(URL, USERID, PASSWORD);
			
			System.out.println("Yhteys tietokantaan on luotu.");
			
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM Artist");
			while (rs.next()){
				System.out.println("Artist: " + rs.getString(2));
			}
			
			ResultSet rs1 = stmt.executeQuery("SELECT * FROM Album");
			while (rs1.next()) {
				System.out.println("Album: " + rs1.getString(2));
			}

		
			// Suljetaan yhteys
			con.close();

		} catch (SQLException e) {
			System.out.println("Virhe tietokannan käytössä!");
			System.out.println(e);
		} // catch
	} // main
} // class
