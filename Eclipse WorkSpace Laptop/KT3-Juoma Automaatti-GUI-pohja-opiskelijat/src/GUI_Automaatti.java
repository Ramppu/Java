import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class GUI_Automaatti extends JFrame {

	// Luokkamuuttujat
	// Esitell‰‰n t‰‰ll‰ jotta komponentteihin voidaan viitata mist‰ tahansa luokan
	// sis‰lt‰

	JPanel contentPane;
	private JMenuItem mntmTallennaAutomaatinTila;
	private JMenuItem mntmLataaAutomaatti;

	/**
	 * Main-metodi, joka k‰ynnist‰‰ sovelluksen
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					// Luodaan ensmin uusi JuomaAutomaatti-olio
					JuomaAutomaatti ja = new JuomaAutomaatti();

					// K‰yttˆliittym‰ saa parametrina olion, jonka tiedot se n‰ytt‰‰
					GUI_Automaatti frame = new GUI_Automaatti(ja);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Konstruktorissa rakennetaan k‰yttˆliittym‰. Huomaa, ett‰ otetaan parametrina
	 * vastaan alussa luotu juoma-automaatti. T‰m‰ siksi, ett‰ voidaan n‰ytt‰‰ sen
	 * tiedot GUI:ssa
	 */
	public GUI_Automaatti(JuomaAutomaatti ja) {

		// Ikkunan otsikko ja koko

		setTitle("Kahviautomaatti GUI v. 1.0");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 465, 705);

	 
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	}
}
