package net.andreu;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;;

public class Calculadora {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora window = new Calculadora();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculadora() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 474, 473);
		GridBagLayout gridBagLayout = new GridBagLayout();
		frame.getContentPane().setLayout(gridBagLayout);
		
		JLabel pantalla = new JLabel(" ");
		pantalla.setOpaque(true);
		pantalla.setBackground(Color.BLACK);
		GridBagConstraints mida = new GridBagConstraints();
		mida.fill = GridBagConstraints.BOTH;
		mida.weightx = 1;
		mida.weighty = 1;
		mida.gridwidth = 3;
		mida.gridx = 0;
		mida.gridy = 0;
		frame.getContentPane().add(pantalla, mida);

		JButton igual = new JButton("=");
		mida.fill = GridBagConstraints.BOTH;
		mida.gridwidth = 1;
		mida.gridx = 4;
		mida.gridy = 1;
		frame.getContentPane().add(igual, mida);
		
	}
}
