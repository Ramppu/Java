import javax.swing.*;
import java.awt.BorderLayout;

public class Window{

	public static void main(String args[]){
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
	
	JTextArea ta = new JTextArea(10,10);
	frame.add(ta);
	
	frame.getContentPane().setLayout(new BorderLayout()); 
	frame.getContentPane().add(BorderLayout.NORTH,btn1); 
	frame.getContentPane().add(BorderLayout.SOUTH, btn2);
	frame.getContentPane().add(BorderLayout.EAST, btn3);
	frame.getContentPane().add(BorderLayout.CENTER, ta);
	
	
	frame.setVisible(true);
	}
}



