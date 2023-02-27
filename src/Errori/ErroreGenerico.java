package Errori;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import PackageController.Controller;

import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Window.Type;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;



public class ErroreGenerico extends JFrame {

	private JPanel contentPane;
	private final JLabel lblNewLabel = new JLabel("New label");

	
	/**
	 * Create the frame.
	 */
	public ErroreGenerico() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(ErroreGenerico.class.getResource("/Textures/icona errore.png")));
		setType(Type.UTILITY);
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 900, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setUndecorated(true);


		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("OK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
			}
		});
		

		JLabel lblNewLabel_1 = new JLabel("Qualcosa è andato storto!");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_1.setBounds(26, 0, 548, 75);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Assicurati di aver inserito i dati correttamente");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_2.setBounds(26, 111, 548, 55);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("e di non aver lasciato caselle vuote.");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_2_1.setBounds(26, 162, 548, 55);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("(Alternativamente il DataBase potrebbe essere offline)");
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2_1_1.setBounds(26, 265, 868, 55);
		contentPane.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("Per continuare permere OK.");
		lblNewLabel_2_1_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_2_1_2.setBounds(26, 394, 548, 55);
		contentPane.add(lblNewLabel_2_1_2);
		
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton.setBounds(634, 385, 150, 69);
		contentPane.add(btnNewButton);
		lblNewLabel.setIcon(new ImageIcon(ErroreGenerico.class.getResource("/Textures/Errore.png")));
		lblNewLabel.setBounds(0, 0, 900, 500);
		contentPane.add(lblNewLabel);
		
		
		
	}
}
