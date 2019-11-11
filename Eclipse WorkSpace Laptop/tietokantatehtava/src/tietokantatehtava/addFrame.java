package tietokantatehtava;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;

public class addFrame extends JFrame {

	private JPanel contentPane;
	private JTextField txtArtist;
	private JTextField txtArt;
	private JTextField txtAlb;
	private JTextField txtRD;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					addFrame frame = new addFrame();
					frame.setTitle("Add an album");
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
	public addFrame() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtArtist = new JTextField();
		txtArtist.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		txtArtist.setDisabledTextColor(Color.BLACK);
		txtArtist.setHorizontalAlignment(SwingConstants.CENTER);
		txtArtist.setBorder(null);
		txtArtist.setEnabled(false);
		txtArtist.setEditable(false);
		txtArtist.setText("Add an Album");
		txtArtist.setBounds(10, 11, 130, 34);
		contentPane.add(txtArtist);
		txtArtist.setColumns(10);
		
		JLabel lblArt = new JLabel("Artist");
		lblArt.setBounds(38, 82, 47, 34);
		contentPane.add(lblArt);
		
		txtArt = new JTextField();
		txtArt.setBounds(95, 89, 96, 20);
		contentPane.add(txtArt);
		txtArt.setColumns(10);
		
		JLabel lblAlb = new JLabel("Allbum Name");
		lblAlb.setBounds(21, 141, 65, 14);
		contentPane.add(lblAlb);
		
		txtAlb = new JTextField();
		txtAlb.setBounds(95, 138, 96, 20);
		contentPane.add(txtAlb);
		txtAlb.setColumns(10);
		
		txtRD = new JTextField();
		txtRD.setBounds(95, 194, 96, 20);
		contentPane.add(txtRD);
		txtRD.setColumns(10);
		
		JLabel lblReleaseDate = new JLabel("Release Date");
		lblReleaseDate.setBounds(10, 197, 75, 14);
		contentPane.add(lblReleaseDate);
		
		JButton add = new JButton("Add to Database");
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String rd = txtRD.getText();
				String art = txtArt.getText();
				String alb = txtAlb.getText();
				String SQL = "INSERT INTO album VALUES ('"+art+"','"+alb+"','"+rd+"')";
				
				  try {			 
					  String URL = "jdbc:mysql://sql7.freemysqlhosting.net:3306/sql7311114";
					  String USERID = "sql7311114";
					  String PASSWORD = "xi3Lf6E5Iz";
					
					  Connection con = DriverManager.getConnection(URL, USERID, PASSWORD);
					 
					  System.out.println("Yhteys tietokantaan on luotu.");
					 
					  Statement stmt = con.createStatement();
					  int results = stmt.executeUpdate(SQL);
					  System.out.println("Update Affected "+results+ " rows.");
					  // Suljetaan yhteys
					  con.close();
					  JOptionPane.showMessageDialog(null,"Added an Artist to the database.", "Success!",JOptionPane.PLAIN_MESSAGE);
				  } 
				  catch (SQLException e1) {
				 	System.out.println("Virhe tietokannan k�yt�ss�!");
				 	System.out.println(e1);
				  } // catch

			}		
		});			 
		add.setBounds(238, 166, 121, 50);
		contentPane.add(add);
	}
}

