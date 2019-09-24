import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;
import java.io.*;
import java.util.Scanner;
import javax.imageio.*;
import java.awt.event.InputEvent;

public class textEditor {
	
	public static void main(String args[]){	
		JFrame frame = new JFrame("Chat Frame");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Menu
			JMenuBar mb = new JMenuBar();
			mb.setBackground(UIManager.getColor("Button.background"));
			JMenu m1= new JMenu("File");
			JMenu m2= new JMenu("Edit");
			JMenu m3= new JMenu("Details");
		
		//m1 Items
			JMenuItem m11 = new JMenuItem("Open");
			m11.setIcon(new ImageIcon("C:\\Users\\rasmu\\OneDrive\\Desktop\\Eclipse WorkSpace\\ChatBox\\Images\\open.png"));
			JMenuItem m12 = new JMenuItem("Save");
			m12.setIcon(new ImageIcon("C:\\Users\\rasmu\\OneDrive\\Desktop\\Eclipse WorkSpace\\ChatBox\\Images\\save.png"));
			JMenuItem m13 = new JMenuItem("Clear");
			JMenuItem m14 = new JMenuItem("Quit");
			m1.add(m11);
			m1.add(m12);
			m1.add(m13);
			m1.add(m14);
			
		//m2 Items
			JMenuItem m21 = new JMenuItem("Search");
			JMenuItem m22 = new JMenuItem("Replace");
			m2.add(m21);
			m2.add(m22);
			
		//m3 Items
			JMenuItem m31 = new JMenuItem("About");
			m3.add(m31);
			
			mb.add(m1);
			mb.add(m2);
			mb.add(m3);
			
			
		//Panel and it's content
			JPanel panel = new JPanel(new BorderLayout());
			JToolBar tb = new JToolBar();
			JTextArea ta = new JTextArea();
			panel.add(tb, BorderLayout.NORTH);
			panel.add(ta, BorderLayout.CENTER);
			
			JButton btn1 = new JButton("");
			JButton btn2 = new JButton("");	
			JButton btn3 = new JButton("");
			
			btn1.setIcon(new ImageIcon("C:\\Users\\rasmu\\OneDrive\\Desktop\\Eclipse WorkSpace\\ChatBox\\Images\\open.png"));
			btn2.setIcon(new ImageIcon("C:\\Users\\rasmu\\OneDrive\\Desktop\\Eclipse WorkSpace\\ChatBox\\Images\\save.png"));
			btn3.setIcon(new ImageIcon("C:\\Users\\rasmu\\OneDrive\\Desktop\\Eclipse WorkSpace\\TextEditor\\src\\resources\\cut.png"));
			
			tb.add(btn1);
			tb.add(btn2);
			tb.add(btn3);
			
		//Frame Content
			frame.getContentPane().setLayout(new BorderLayout());
			frame.getContentPane().add(mb, BorderLayout.NORTH);
			frame.getContentPane().add(panel, BorderLayout.CENTER);
			
		
		//frame modifiers
			frame.setSize(400,400);
			frame.setResizable(false);
			frame.setVisible(true);
			
			//Opening a file with the "open" - AND A TOOLBAR QUICK BUTTON
			 m11.addActionListener(new ActionListener() { 
					public void actionPerformed(ActionEvent e) {
						JFileChooser fc = new JFileChooser();
						fc.showOpenDialog(null);
						String newFile = fc.getSelectedFile().getAbsolutePath();
												
							File file = new File(newFile);
							try {
								Scanner reader = new Scanner(file);
								while(reader.hasNextLine()) {
									String txt = reader.nextLine();
									ta.append(txt + "\n");
								}
							}
							 catch (FileNotFoundException e1) {
								e1.printStackTrace();
							}											
					}		
					});
			 
			 
			 btn1.addActionListener(new ActionListener() { 
					public void actionPerformed(ActionEvent e) {
						JFileChooser fc = new JFileChooser();
						fc.showOpenDialog(null);
						String newFile = fc.getSelectedFile().getAbsolutePath();
												
							File file = new File(newFile);
							try {
								Scanner reader = new Scanner(file);
								while(reader.hasNextLine()) {
									String txt = reader.nextLine();
									ta.append(txt + "\n");
								}
							}
							 catch (FileNotFoundException e1) {
								e1.printStackTrace();
							}											
					}		
					});
			 //------------------------------------------------------------------------------------------------------
			 
			 //SAVE TEXT TO FILE
			 m12 .addActionListener(new ActionListener() { 
					public void actionPerformed(ActionEvent e) {				
								JFileChooser fc = new JFileChooser();
								fc.showOpenDialog(null);
								String newFile = fc.getSelectedFile().getAbsolutePath();
								File file = new File(newFile);
								
								try {
									PrintWriter pw = new PrintWriter(file);
									String content = ta.getText();
									pw.println(content);
									
									pw.flush();
									pw.close();
								}
								catch (IOException e1) {
		
								}
					}		
					});
			 
			 
			 btn2 .addActionListener(new ActionListener() { 
					public void actionPerformed(ActionEvent e) {				
								JFileChooser fc = new JFileChooser();
								fc.showOpenDialog(null);
								String newFile = fc.getSelectedFile().getAbsolutePath();
								File file = new File(newFile);
								
								try {
									PrintWriter pw = new PrintWriter(file);
									String content = ta.getText();
									pw.println(content);
									
									pw.flush();
									pw.close();
								}
								catch (IOException e1) {
		
								}
					}		
					});
			 //--------------------------------------------------------------------------------------------
			 
			 
			 m13.addActionListener(new ActionListener() {  // Clear
					public void actionPerformed(ActionEvent e) {	
						ta.setText(null);
					}		
					});
			 
			 m14.addActionListener(new ActionListener() {  // Quit
					public void actionPerformed(ActionEvent e) {	
						frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
					}		
					});
			 
			 m31.addActionListener(new ActionListener() {  //About
					public void actionPerformed(ActionEvent e) {	
						JOptionPane.showMessageDialog(null, "Made By Rasmus" + "\nKarjalainen", "About", JOptionPane.INFORMATION_MESSAGE); 
					}		
					});
			 
	
			 m21.addActionListener(new ActionListener() {  //Search
					public void actionPerformed(ActionEvent e) {	
							String content = ta.getText();
							String word = JOptionPane.showInputDialog(null,"Which word do you want to find?");
							int index = content.indexOf(word);
									
							ta.setSelectedTextColor(Color.YELLOW);
							ta.setSelectionStart(index);
							ta.setSelectionEnd(index + word.length() );
					}		
					});
			 
			 m22.addActionListener(new ActionListener() {  // Replace
					public void actionPerformed(ActionEvent e) {	
							String content = ta.getText();
							String word = JOptionPane.showInputDialog(null,"Which word do you want to replace?");
							String word1 = JOptionPane.showInputDialog(null,"Which word do you want to put in?");
							int index = content.indexOf(word);
							try {
								ta.replaceRange(word1, index,(index + word.length()));
							}
							catch (IllegalArgumentException i) {
								ta.append("bruv");
							}
					}		
					});
	}
}
