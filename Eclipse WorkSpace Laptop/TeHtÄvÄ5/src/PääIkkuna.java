import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import database.Connection;
import database.Exception;
import database.Object;
import database.ResultSet;
import database.Statement;
import database.String;

import java.awt.event.*;
import java.sql.*;

import javax.swing.JButton;



public class P‰‰Ikkuna extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					P‰‰Ikkuna frame = new P‰‰Ikkuna();
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
	public P‰‰Ikkuna() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 632, 414);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		LuoTaulu();
	
		
		JButton btnNewButton = new JButton("Lis\u00E4ys ");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Lis‰ysIkkuna Aa = new Lis‰ysIkkuna();
				Aa.setVisible(true);
				System.out.println(Aa.getPPaikka());
				LuoTaulu();

			}		
		});			 
		btnNewButton.setBounds(29, 251, 135, 70);
		contentPane.add(btnNewButton);
		
		JButton btnPoisto = new JButton("Poisto");
		btnPoisto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 try {			 
					  String URL = "jdbc:mysql://sql7.freemysqlhosting.net:3306/sql7311675";
					  String USERID = "sql7311675";
					  String PASSWORD = "rcv4C45n1M";
					
					  Connection con = DriverManager.getConnection(URL, USERID, PASSWORD);
					 
					  System.out.println("Yhteys tietokantaan on luotu.");
				  } 
				  catch (SQLException e1) {
				 	System.out.println("Virhe tietokannan k‰ytˆss‰!");
				 	System.out.println(e1);
				  } // catch

			}		
		});
		btnPoisto.setBounds(243, 251, 135, 70);
		contentPane.add(btnPoisto);
		
		JButton btnPivitys = new JButton("P\u00E4ivitys");
		btnPivitys.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LuoTaulu();
			}
		});
		btnPivitys.setBounds(445, 251, 135, 70);
		contentPane.add(btnPivitys);
	}
	
	public void LuoTaulu() {
		String [] KolumnienNimet = {"Pelaajan nimi", "Pelaajan pelipaikka", "Pelaajan pelinumero"};
		DefaultTableModel model = new DefaultTableModel(KolumnienNimet, 0);
		contentPane.setLayout(null);
		JTable table = new JTable(model);
		table.setBorder(null);
		table.setDefaultEditor(Object.class, null);
		table.setBounds(0, 0, 388, 295);
		JScrollPane sp = new JScrollPane(table);
		sp.setBorder(null);
		sp.setBounds(0, 0, 614, 209);
		contentPane.add(sp);
		
		  String SQL = "SELECT * FROM Pelaajat";
		  System.out.print(SQL);
		  updateTable(SQL, model, table);
	}

	private void updateTable(String SQL, DefaultTableModel model, JTable table) {
		// TODO Auto-generated method stub
		 try {			 
			  String URL = "jdbc:mysql://sql7.freemysqlhosting.net:3306/sql7311675";
			  String USERID = "sql7311675";
			  String PASSWORD = "rcv4C45n1M";
			
			  Connection con = DriverManager.getConnection(URL, USERID, PASSWORD);
			  System.out.println("Yhteys tietokantaan on luotu.");
			  Statement stmt = con.createStatement();
			  ResultSet rs = stmt.executeQuery(SQL);
			  
			  while (rs.next()) {
				  System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getInt(3));
				  	model.addRow(new Object[] {rs.getString(1),rs.getString(2),rs.getString(3)});
			  }
		 }
		 catch(Exception e) {
			 e.printStackTrace();
		 }
	}
}
