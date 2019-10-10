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
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class GUI_Automaatti extends JFrame {

	// Luokkamuuttujat
	// Esitell‰‰n t‰‰ll‰ jotta komponentteihin voidaan viitata mist‰ tahansa luokan
	// sis‰lt‰

	JPanel contentPane;
	private JMenuItem mntmTallennaAutomaatinTila;
	private JMenuItem mntmLataaAutomaatti;
	private JTextField txtKaakao;
	private JTextField txtTee;
	private JTextField txtKahvi;
	private JTextField txtKahvia;
	private JTextField txtTeet;
	private JTextField txtKaakaota;

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
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 449, 22);
		contentPane.add(menuBar);
		
		// Menu items
		JMenu mnYllpito = new JMenu("Yll‰pito");
		menuBar.add(mnYllpito);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Aseta kahvin m‰‰r‰");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String kahvi = JOptionPane.showInputDialog(null,"Aseta kahvin m‰‰r‰");
				int m‰‰r‰ = Integer.parseInt(kahvi);
				ja.setKahvi(m‰‰r‰);
				txtKahvia.setText("Kahvia: " + ja.getKahvi());
				if(ja.getKahvi() > 10) {
					txtKahvia.setDisabledTextColor(Color.BLACK);
				}
			}
		});
		mnYllpito.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Aseta teen m‰‰r‰");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String tee = JOptionPane.showInputDialog(null,"Aseta teen m‰‰r‰");
				int m‰‰r‰ = Integer.parseInt(tee);
				ja.setTee(m‰‰r‰);
				txtTeet.setText("Teet‰: " + ja.getTee());
			}
		});
		mnYllpito.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Aseta kaakaon m‰‰r‰");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String kaakao = JOptionPane.showInputDialog(null,"Aseta kaakaon m‰‰r‰");
				int m‰‰r‰ = Integer.parseInt(kaakao);
				ja.setKaakao(m‰‰r‰);
				txtKaakaota.setText("Kaakaota: " + ja.getKaakao());
			}
		});
		mnYllpito.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Tallenna automaatin tila");
		mnYllpito.add(mntmNewMenuItem_3);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Lataa automaatti");
		mnYllpito.add(mntmNewMenuItem_4);
		
		JMenuItem mntmLopeta = new JMenuItem("Lopeta");
		mnYllpito.add(mntmLopeta);
		
		JMenu mnTietojaOhjelmasta = new JMenu("Tietoja Ohjelmasta");
		menuBar.add(mnTietojaOhjelmasta);
		
		JButton button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ja.valmistaKahvi();
				txtKahvia.setText("Kahvia: " + ja.getKahvi());
				if(ja.getKahvi() < 10) {
					txtKahvia.setDisabledTextColor(Color.RED);
				}
			}
		});
		button.setIcon(new ImageIcon(GUI_Automaatti.class.getResource("/resources/coffee.jpg")));
		button.setBounds(21, 62, 121, 112);
		contentPane.add(button);
		
		JButton button_1 = new JButton("");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ja.valmistaTee();
				txtTeet.setText("Teet‰: " + ja.getTee());
			}
		});
		button_1.setIcon(new ImageIcon(GUI_Automaatti.class.getResource("/resources/tea.jpg")));
		button_1.setBounds(21, 269, 121, 112);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("");
		button_2.setIcon(new ImageIcon(GUI_Automaatti.class.getResource("/resources/cocoa.jpg")));
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ja.valmistaKaakao();
				txtKaakaota.setText("Kaakaota: " + ja.getKaakao());
			}
		});
		button_2.setBounds(21, 483, 121, 112);
		contentPane.add(button_2);
		
		txtKaakao = new JTextField();
		txtKaakao.setBorder(null);
		txtKaakao.setEditable(false);
		txtKaakao.setDisabledTextColor(Color.BLACK);
		txtKaakao.setHorizontalAlignment(SwingConstants.CENTER);
		txtKaakao.setOpaque(false);
		txtKaakao.setText("Kaakao");
		txtKaakao.setBounds(31, 614, 96, 20);
		contentPane.add(txtKaakao);
		txtKaakao.setColumns(10);
		
		txtTee = new JTextField();
		txtTee.setEditable(false);
		txtTee.setBorder(null);
		txtTee.setDisabledTextColor(Color.BLACK);
		txtTee.setOpaque(false);
		txtTee.setHorizontalAlignment(SwingConstants.CENTER);
		txtTee.setText("Tee");
		txtTee.setBounds(31, 392, 96, 20);
		contentPane.add(txtTee);
		txtTee.setColumns(10);
		
		txtKahvi = new JTextField();
		txtKahvi.setDisabledTextColor(Color.BLACK);
		txtKahvi.setBorder(null);
		txtKahvi.setEnabled(false);
		txtKahvi.setOpaque(false);
		txtKahvi.setHorizontalAlignment(SwingConstants.CENTER);
		txtKahvi.setText("Kahvi");
		txtKahvi.setBounds(31, 185, 96, 20);
		contentPane.add(txtKahvi);
		txtKahvi.setColumns(10);
		
		txtKahvia = new JTextField();
		txtKahvia.setBorder(null);
		txtKahvia.setDisabledTextColor(Color.BLACK);
		txtKahvia.setEnabled(false);
		txtKahvia.setOpaque(false);
		txtKahvia.setText("Kahvia: " + ja.getKahvi());
		txtKahvia.setBounds(209, 103, 96, 20);
		contentPane.add(txtKahvia);
		txtKahvia.setColumns(10);
		
		txtTeet = new JTextField();
		txtTeet.setOpaque(false);
		txtTeet.setDisabledTextColor(Color.BLACK);
		txtTeet.setEditable(false);
		txtTeet.setBorder(null);
		txtTeet.setText("Teet‰ " + ja.getTee());
		txtTeet.setBounds(209, 309, 96, 20);
		contentPane.add(txtTeet);
		txtTeet.setColumns(10);
		
		txtKaakaota = new JTextField();
		txtKaakaota.setBorder(null);
		txtKaakaota.setEditable(false);
		txtKaakaota.setDisabledTextColor(Color.BLACK);
		txtKaakaota.setOpaque(false);
		txtKaakaota.setText("Kaakaota: " + ja.getKaakao());
		txtKaakaota.setBounds(209, 533, 96, 20);
		contentPane.add(txtKaakaota);
		txtKaakaota.setColumns(10);
	}
}
