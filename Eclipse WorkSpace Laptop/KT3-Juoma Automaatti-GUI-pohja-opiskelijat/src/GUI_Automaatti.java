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
import java.time.chrono.JapaneseChronology;
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
	// Esitellään täällä jotta komponentteihin voidaan viitata mistä tahansa luokan
	// sisältä

	JPanel contentPane;
	private JMenuItem mntmTallennaAutomaatinTila;
	private JMenuItem mntmLataaAutomaatti;
	private JTextField txtKaakao;
	private JTextField txtTee;
	private JTextField txtKahvi;
	private JTextField txtKahvia;
	private JTextField txtTeeta;
	private JTextField txtKaakaota;

	/**
	 * Main-metodi, joka käynnistää sovelluksen
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					// Luodaan ensmin uusi JuomaAutomaatti-olio
					JuomaAutomaatti ja = new JuomaAutomaatti();

					// Käyttöliittymä saa parametrina olion, jonka tiedot se näyttää
					GUI_Automaatti frame = new GUI_Automaatti(ja);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Konstruktorissa rakennetaan käyttöliittymä. Huomaa, että otetaan parametrina
	 * vastaan alussa luotu juoma-automaatti. Tämä siksi, että voidaan näyttää sen
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
		JMenu mnYllpito = new JMenu("Ylläpito");
		menuBar.add(mnYllpito);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Aseta kahvin määrä");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String kahvi = JOptionPane.showInputDialog(null,"Aseta kahvin määrä");
				int määrä = Integer.parseInt(kahvi);
				ja.setKahvi(määrä);
				txtKahvia.setText("Kahvia: " + ja.getKahvi());
				if(ja.getKahvi() > 10) {
					txtKahvia.setDisabledTextColor(Color.BLACK);
				}
				else {
					txtKahvia.setDisabledTextColor(Color.RED);
				}
			}
		});
		mnYllpito.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Aseta teen määrä");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String tee = JOptionPane.showInputDialog(null,"Aseta teen määrä");
				int määrä = Integer.parseInt(tee);
				ja.setTee(määrä);
				txtTeeta.setText("Teetä: " + ja.getTee());
				if(ja.getTee() > 10) {
					txtTeeta.setDisabledTextColor(Color.BLACK);
				}
				else {
					txtTeeta.setDisabledTextColor(Color.RED);
				}
			}
		});
		mnYllpito.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Aseta kaakaon määrä");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String kaakao = JOptionPane.showInputDialog(null,"Aseta kaakaon määrä");
				int määrä = Integer.parseInt(kaakao);
				ja.setKaakao(määrä);
				txtKaakaota.setText("Kaakaota: " + ja.getKaakao());
				if(ja.getKaakao() > 10) {
					txtKaakaota.setDisabledTextColor(Color.BLACK);
				}
				else {
					txtKaakaota.setDisabledTextColor(Color.RED);
				}
			}
		});
		mnYllpito.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Tallenna automaatin tila");
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				try {
					Sarjallistamista.kirjoitaTiedostoon(ja);
				} 
				catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});
		mnYllpito.add(mntmNewMenuItem_3);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Lataa automaatti");
		mntmNewMenuItem_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					JuomaAutomaatti uusi = Sarjallistamista.lueTiedostosta();
					txtKahvia.setText("Kahvia: " + uusi.getKahvi());
					txtTeeta.setText("Teetä: " + uusi.getTee());
					txtKaakaota.setText("Kaakaota: " + uusi.getKaakao());
				} 
				catch (FileNotFoundException e1) {
					e1.printStackTrace();
				}
			}
		});
		mnYllpito.add(mntmNewMenuItem_4);
		
		JMenuItem mntmLopeta = new JMenuItem("Lopeta");
		mntmLopeta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		mnYllpito.add(mntmLopeta);
		
		JMenu mnTietojaOhjelmasta = new JMenu("Tietoja Ohjelmasta");
		menuBar.add(mnTietojaOhjelmasta);
		
		JMenuItem mntmVersiotiedot = new JMenuItem("Versiotiedot");
		mntmVersiotiedot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Versiotiedot lol = new Versiotiedot();
				lol.setVisible(true);
			}	
		});
		mnTietojaOhjelmasta.add(mntmVersiotiedot);
		
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
				txtTeeta.setText("Teetä: " + ja.getTee());
				if(ja.getTee() < 10) {
					txtTeeta.setDisabledTextColor(Color.RED);
				}
				
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
				if(ja.getKaakao() < 10) {
					txtKaakaota.setDisabledTextColor(Color.RED);
				}
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
		txtKahvi.setEditable(false);
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
		
		txtTeeta = new JTextField();
		txtTeeta.setEnabled(false);
		txtTeeta.setOpaque(false);
		txtTeeta.setDisabledTextColor(Color.BLACK);
		txtTeeta.setEditable(false);
		txtTeeta.setBorder(null);
		txtTeeta.setText("Teetä: " + ja.getTee());
		txtTeeta.setBounds(209, 309, 96, 20);
		contentPane.add(txtTeeta);
		txtTeeta.setColumns(10);
		
		txtKaakaota = new JTextField();
		txtKaakaota.setEnabled(false);
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
