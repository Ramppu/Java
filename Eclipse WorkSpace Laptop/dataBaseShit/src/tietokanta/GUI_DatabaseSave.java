package tietokanta;
import java.awt.BorderLayout;
import java.awt.EventQueue;
 
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
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
 
public class GUI_DatabaseSave extends JFrame {
 
 private JPanel contentPane;
 private JTextField textAlbn;
 private JTextField textRD;
 private JTextField textArtist;
 private JTextField textInfo;
 
 /**
  * Launch the application.
  */
 public static void main(String[] args) {
  EventQueue.invokeLater(new Runnable() {
  public void run() {
  try {
	  GUI_DatabaseSave  frame = new  GUI_DatabaseSave ();
	  frame.setTitle("Sarkastinen hymynaama vesipyssy osoittaa sit‰ p‰in");
  frame.setVisible(true);
  } catch (Exception e) {
  e.printStackTrace();
  }
  }
  });
 }
 
 /**
  * Create the frame.
  */
 public  GUI_DatabaseSave () {
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  setBounds(100, 100, 450, 300);
  contentPane = new JPanel();
  contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
  setContentPane(contentPane);
  contentPane.setLayout(null);
 
  textAlbn = new JTextField();
  textAlbn.setBounds(121, 77, 86, 20);
  contentPane.add(textAlbn);
  textAlbn.setColumns(10);
 
  JLabel lblHakuehto = new JLabel("Album Name");
  lblHakuehto.setBounds(21, 80, 73, 14);
  contentPane.add(lblHakuehto);
 
  JLabel lblJulkaisuvuosi = new JLabel("Release Date");
  lblJulkaisuvuosi.setBounds(21, 108, 73, 14);
  contentPane.add(lblJulkaisuvuosi);
 
  textRD = new JTextField();
  textRD.setColumns(10);
  textRD.setBounds(121, 108, 86, 20);
  contentPane.add(textRD);
 
  JButton btnNewButton = new JButton("Tallenna");
  btnNewButton.addActionListener(new ActionListener() {
  public void actionPerformed(ActionEvent e) {
 
  String rd = textRD.getText();
  String art = textArtist.getText();
  String alb = textAlbn.getText();
  String info = textInfo.getText();
  
 String SQL = "INSERT INTO album_artist VALUES ('"+art+"','"+alb+"','"+rd+"','"+info+"')";
 
  save( SQL );
 
 
  }
  });
  btnNewButton.setBounds(22, 172, 185, 23);
  contentPane.add(btnNewButton);
 
  JLabel lblNimi = new JLabel("Artist ");
  lblNimi.setBounds(21, 51, 46, 14);
  contentPane.add(lblNimi);
 
  textArtist = new JTextField();
  textArtist.setColumns(10);
  textArtist.setBounds(121, 48, 86, 20);
  contentPane.add(textArtist);
 
  textInfo = new JTextField();
  textInfo.setColumns(10);
  textInfo.setBounds(121, 139, 86, 20);
  contentPane.add(textInfo);
 
  JLabel lblInfo = new JLabel("Info");
  lblInfo.setBounds(21, 142, 73, 14);
  contentPane.add(lblInfo);
 }
 
 public static void save( String SQL) {
 
  // Varaudutaan poikkeuksiin; esim. jos tietokantaan ei saada yhteytt‰
  try {
  // M‰‰ritell‰‰n tietokannan yhteysosoite sek‰ tietokannan nimi
  String URL = "jdbc:mysql://localhost:3306/database";
  // M‰‰ritell‰‰n k‰ytt‰j‰tiedot yhteyden luomista varten
  String USERID = "root";
  String PASSWORD = "";
 
  // Luodaan yhteys k‰ytt‰en edell‰nmainittuja tietoja
  Connection con = DriverManager.getConnection(URL, USERID, PASSWORD);
 
  System.out.println("Yhteys tietokantaan on luotu.");
 
  // T‰ss‰ kohtaa voitaisiin alkaa luomaan kyselyit‰
 
  // Suoritetaan kysely ja otetaan tulokset talteen
  Statement stmt = con.createStatement();
  int results = stmt.executeUpdate(SQL);
  System.out.println("Update Affected "+results+ " rows.");
  // Suljetaan yhteys
  con.close();
 
  } catch (SQLException e) {
  System.out.println("Virhe tietokannan k‰ytˆss‰!");
  System.out.println(e);
  } // catch
 } // main
 
} 