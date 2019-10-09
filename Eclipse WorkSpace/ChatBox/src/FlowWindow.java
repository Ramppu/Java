import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FlowWindow{

	public static void main(String args[]){
	Album a = new Album(2019, "Fear Inoculum", "Tool");
	JFrame frame = new JFrame("Album Window");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	frame.setSize(300,300);
	
	//Adding a button
	JButton btn1 = new JButton("Try this");
	frame.add(btn1);
	JButton btn2 = new JButton("Try this one aswell");
	frame.add(btn2);
	JButton btn3 = new JButton("I think you should try this one instead");
	frame.add(btn3);
	
	//Text Area
	JTextArea ta = new JTextArea(10,10);
	frame.add(ta);
	
	//Menu
	JMenuBar mb = new JMenuBar();
	JMenu m1 = new JMenu("Albums");
	JMenuItem m11 = new JMenuItem(a.toString());
	m1.add(m11);
	mb.add(m1);
	
	frame.getContentPane().setLayout(new FlowLayout()); 
	frame.getContentPane().add(btn1); 
	frame.getContentPane().add(btn2);
	frame.getContentPane().add( btn3);
	frame.getContentPane().add( ta);
	frame.getContentPane().add(mb);
	
	
	frame.setVisible(true);
	
	
	
	m11.addActionListener(new ActionListener() { 
		public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(m11, "Tracklist:\n01. Fear Inoculum\n02. Pneuma\n03. Invincible\n05. Descending\n06. Culling Voices\n07. 7empest");
		}
			
		});

		
	}
}