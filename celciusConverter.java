import javax.swing.JFrame;
import javax.swing.JTextArea;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFileChooser;

public class celciusConverter {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Celcius Converter");
		
		frame.setSize(300,300);
		frame.getContentPane().setLayout(new GridLayout(2, 2, 2, 2));
		
		JTextArea ta = new JTextArea("Celcius");
		ta.setOpaque(false);
		frame.getContentPane().add(ta);
		ta.setColumns(10);
		
		JTextArea ta1 = new JTextArea();
		frame.getContentPane().add(ta1);
		ta1.setColumns(10);
		
		JButton btn = new JButton("Convert");
		frame.getContentPane().add(btn);
		
		JTextArea ta2 = new JTextArea();
		frame.getContentPane().add(ta2);
		ta2.setColumns(10);
		frame.setVisible(true);
		
		 btn.addActionListener(new ActionListener() { 
				public void actionPerformed(ActionEvent e) {
					String celc = ta1.getText();
					int celc1 = Integer.parseInt(celc);
					double far = celc1*9/5+32;
					String app = Double.toString(far);
					ta2.setText(null);
					ta2.append(app);
				}		
				});
	}

}
