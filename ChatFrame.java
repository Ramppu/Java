import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.*;
import javax.imageio.*;


public class ChatFrame {
	
	public static void main(String args[]){
		
		
		Album a = new Album(2019, "Fear Inoculum", "Tool");
		JFrame frame = new JFrame("Chat Frame");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Text area
		JTextArea ta = new JTextArea(10,10);
		ta.setEditable(false);
		
		//Menu
		JMenuBar mb = new JMenuBar();
		
		JMenu m1 = new JMenu("File");
		JMenuItem m11 = new JMenuItem("Open Chat Log");
		JMenuItem m12 = new JMenuItem("Save to Chat Log");
		
		JMenu m2 = new JMenu("Help");
		JMenuItem m21 = new JMenuItem("Who?");
		JMenuItem m22 = new JMenuItem("Why?");
		
		m1.add(m11);
		m1.add(m12);
		m2.add(m21);
		m2.add(m22);
		mb.add(m1);
		mb.add(m2);
		
		//panel
		JPanel p = new JPanel(new FlowLayout(FlowLayout.LEFT));
		p.setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().add(p);
		
		//JLabel
		JLabel  l = new JLabel("Enter text");
		l.setFont(new Font("Verdana",20,10));
		p.add(l);
				
		
		//Panel textarea
		JTextArea tp = new JTextArea(1,20);
		tp.setLineWrap(false);
		p.add(tp);
										
		//Buttons
		JButton btn1 = new JButton("Send");
		p.add(btn1);
		JButton btn2 = new JButton("Clear");
		p.add(btn2);
		
		
		frame.getContentPane().setLayout(new BorderLayout()); 
		frame.getContentPane().add(BorderLayout.NORTH,mb); 
		frame.getContentPane().add(BorderLayout.CENTER, ta);
		frame.getContentPane().add(BorderLayout.SOUTH,p);
		
		frame.setSize(430,400);
		frame.setVisible(true);
		frame.setResizable(false);


		
		btn1.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) {
			String text = tp.getText();
			ta.append(text +"\n");
			tp.setText(null);
			}		
			});
		
		btn2.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) {
			ta.setText(null);
			tp.setText(null);
			}
			});
		
		  tp.addKeyListener(new KeyAdapter() {
		        public void keyPressed(KeyEvent e) {
		            if(e.getKeyCode() == KeyEvent.VK_ENTER){
		            	String text = tp.getText();
		    			ta.append(text +"\n");
		    			tp.setText(null);
		            }
		        }
		    });
		  
		  //WHAT HAPPENS WHEN YOU PRESS THE MENU ITEM "WHO?"
		 m21 .addActionListener(new ActionListener() { 
				public void actionPerformed(ActionEvent e) {
				ta.setText(null);
				ta.append("This was made by Ramppu/Rammu/Rasmus whatever you wanna call that being.\nStarted as a layout practice but ended up being something more!\nThis Thing even has some Functionality to it!\n");
				}		
				});
		 
		 //WHAT HAPPENS WHEN YOU PRESS THE MENU ITEM "WHY?"
		 m22 .addActionListener(new ActionListener() { 
				public void actionPerformed(ActionEvent e) {
				ta.setText(null);
				ta.append("Simple, I want to learn how to code and make softwares.\nThis is how i have to begin working on them\n");
				}		
				});
		 
		//WHAT HAPPENS WHEN YOU PRESS THE MENU ITEM "Save To ChatLog"
		 m12 .addActionListener(new ActionListener() { 
				public void actionPerformed(ActionEvent e) {				
					try(FileWriter fw = new FileWriter("ChatLog.txt", true);
						    BufferedWriter bw = new BufferedWriter(fw);
						    PrintWriter out = new PrintWriter(bw)) // GIVES ACCESS TO PRINT COMMAND
						{
						    out.println(ta.getText());
						    out.println("");
						} catch (IOException e1) {
						    //exception handling left as an exercise for the reader
						}
				}		
				});
		 
		//WHAT HAPPENS WHEN YOU PRESS THE MENU ITEM "Open ChatLog"
		 m11 .addActionListener(new ActionListener() { 
				public void actionPerformed(ActionEvent e) {
					String fileName = "ChatLog.txt";
					String line = null;
					try {
						FileReader fr = new FileReader(fileName);
						BufferedReader br = new BufferedReader(fr);
						while((line = br.readLine() ) != null) {
							ta.append(line + "\n");
						}
						br.close();
					}
					 catch(FileNotFoundException ex) {
				           ta.append(fileName + " not found.");               
				        }
				        catch(IOException ex) {
				        }
				}		
				});
	}	
}
