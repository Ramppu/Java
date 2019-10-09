import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;


public class celciusConverter {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Celcius Converter");
		
		frame.setSize(300,300);
		frame.getContentPane().setLayout(new GridLayout(2, 2, 2, 2));
		
		JTextArea ta = new JTextArea("\n\n\tCelcius");
		ta.setOpaque(false);
		ta.setEditable(false);
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
		ta2.setEditable(false);
		
		frame.setVisible(true);
		frame.setSize(430,220);
		frame.setResizable(false);
		
		 btn.addActionListener(new ActionListener() { 
				public void actionPerformed(ActionEvent e) {
					String celc = ta1.getText();
					try { //IF STRING IS NOT AN INTEGER, THROW EXCEPTION
						int celc1 = Integer.parseInt(celc.trim()); //To prevent unnecessary errors, spaces are trimmed out of
						double far = celc1*9/5+32;							   // the 'celc' string, so for example " 12 " doesn't give out an error
						String app = Double.toString(far);	
						ta2.setText(null);
						ta2.append(app);
					}
					catch(Exception e1) {
						ta2.setText(null);
						ta2.append("Invalid input, Integer numbers\nonly please!");
					}
		 		}});
	}

}
