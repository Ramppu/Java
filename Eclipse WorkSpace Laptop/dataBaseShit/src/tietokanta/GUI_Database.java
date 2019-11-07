package tietokanta;
import java.awt.BorderLayout;
import java.awt.EventQueue;
 
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JScrollBar;
 
public class GUI_Database extends JFrame {
 
 private JPanel contentPane;
 private JTextField textField;
 private JTextField textField_1;
 private JTextField textField_2;
 private JTextField textField_3;
 private JTable table;
 private DefaultTableModel model;
 
 /**
  * Launch the application.
  */
 public static void main(String[] args) {
  EventQueue.invokeLater(new Runnable() {
	  public void run() {
		  try {
			  GUI_Database frame = new GUI_Database();
			  frame.setTitle("Title");
			  frame.setVisible(true);
		  } 
		  catch (Exception e) {
			  e.printStackTrace();
		  }
	  }
  });
 }
 
 /**
  * Create the frame.
  */
 public GUI_Database() {
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  setBounds(100, 100, 627, 356);
  contentPane = new JPanel();
  contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
  setContentPane(contentPane);
  contentPane.setLayout(null);
 
 
  JLabel lblJulkaisuvuosi = new JLabel("Artist");
  lblJulkaisuvuosi.setBounds(38, 111, 73, 14);
  contentPane.add(lblJulkaisuvuosi);
 
  textField_1 = new JTextField();
  textField_1.setColumns(10);
  textField_1.setBounds(121, 108, 86, 20);
  contentPane.add(textField_1);
 
  JButton btnNewButton = new JButton("Search");
  btnNewButton.addActionListener(new ActionListener() {
  public void actionPerformed(ActionEvent e) {
 
  String artist = textField_1.getText();
  String album = textField_2.getText();
  String rDate = textField_3.getText();
 
  String SQL = "SELECT * FROM album_artist WHERE artistName LIKE '"+artist+ "' OR albumName LIKE '"+album+"' OR releaseDate LIKE '"+rDate+"';";
 System.out.print(SQL);
  hae( SQL, model);
 
 
  }
  });
  btnNewButton.setBounds(22, 172, 185, 23);
  contentPane.add(btnNewButton);
 
  JLabel lblNimi = new JLabel("Album Name");
  lblNimi.setBounds(21, 83, 73, 14);
  contentPane.add(lblNimi);
 
  textField_2 = new JTextField();
  textField_2.setColumns(10);
  textField_2.setBounds(121, 77, 86, 20);
  contentPane.add(textField_2);
 
  textField_3 = new JTextField();
  textField_3.setColumns(10);
  textField_3.setBounds(121, 139, 86, 20);
  contentPane.add(textField_3);
 
  JLabel label = new JLabel("Release Date");
  label.setBounds(21, 142, 73, 14);
  contentPane.add(label);
  
  String columns[]= {"Artist","Album Name","Release Date"};
  model = new DefaultTableModel(columns, 0);
  table = new JTable(model);
  table.setBounds(0, 0, 388, 295);
  JScrollPane scrollPane = new JScrollPane(table);
  scrollPane.setBounds(217, 11, 384, 306);
  contentPane.add(scrollPane);
  
    
    JPanel panel = new JPanel();
    scrollPane.setColumnHeaderView(panel);
    panel.setLayout(null);
 }
 
 public static void hae( String SQL, DefaultTableModel model) {
 
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
 
  // Tässä kohtaa voitaisiin alkaa luomaan kyselyitä
 
  // Suoritetaan kysely ja otetaan tulokset talteen
  Statement stmt = con.createStatement();
  ResultSet rs = stmt.executeQuery(SQL);
 
  // Tulosjoukko on taulukko-tyyppinen rakenne, joka
  // voidaan käydä läpi esim. while silmukalla
 
  while (rs.next()) {
  System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getInt(3));
  	model.addRow(new Object[] {rs.getString(1),rs.getString(2),rs.getString(3)});
  }
  // Tulostetaan myös palautuneiden rivien määrä (hieman hankalasti)
  // hyppäämällä viimeiselle tulosriville ja tulostamalla sen indeksi
  rs.last();
  System.out.println("Tuloksia palautui: " + rs.getRow() + " riviä.");
 
  // Suljetaan yhteys
  con.close();
 
  } catch (SQLException e) {
  System.out.println("Virhe tietokannan käytössä!");
  System.out.println(e);
  } // catch
 } // main
} 
