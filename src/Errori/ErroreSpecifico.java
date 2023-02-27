package Errori;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Window.Type;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;

public class ErroreSpecifico extends JFrame {

	private JPanel contentPane;
	private JTextField MessaggioDiErrore;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	

	/**
	 * Create the frame.
	 */
	public ErroreSpecifico(String Errore) {
		setIconImage(Toolkit.getDefaultToolkit().getImage(ErroreSpecifico.class.getResource("/Textures/icona errore.png")));
		setType(Type.UTILITY);
		
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 900, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setUndecorated(true);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("OK\r\n");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton.setBounds(680, 419, 149, 71);
		contentPane.add(btnNewButton);
		
		MessaggioDiErrore = new JTextField();
		MessaggioDiErrore.setBackground(Color.WHITE);
		MessaggioDiErrore.setFont(new Font("Tahoma", Font.PLAIN, 20));
		MessaggioDiErrore.setEditable(false);
		MessaggioDiErrore.setBounds(29, 46, 614, 89);
		contentPane.add(MessaggioDiErrore);
		MessaggioDiErrore.setColumns(10);
		MessaggioDiErrore.setText(Errore);
		
		lblNewLabel_1 = new JLabel("Per continuare premere OK.");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1.setBounds(40, 426, 369, 61);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(ErroreSpecifico.class.getResource("/Textures/Errore.png")));
		lblNewLabel.setBounds(0, 0, 900, 500);
		contentPane.add(lblNewLabel);
		

	}
}
