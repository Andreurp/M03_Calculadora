package net.andreu;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridBagConstraints;;

public class Calculadora {

	private JLabel pantalla = new JLabel("");
	private double num1 = 0;
	private double num2 = 0;
	private String valorPantalla;
	private String operador = "";
	private boolean hiHaPunt = false;
	private boolean esborra=false;

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

		pantalla.setOpaque(true);
		pantalla.setForeground(Color.white);
		pantalla.setBackground(Color.BLACK);
		GridBagConstraints mida = new GridBagConstraints();
		mida.fill = GridBagConstraints.BOTH;
		mida.weightx = 1;
		mida.weighty = 1;
		mida.gridwidth = 3;
		mida.gridheight = 1;
		mida.gridx = 1;
		mida.gridy = 1;
		frame.getContentPane().add(pantalla, mida);

		ImageIcon img = new ImageIcon("foto.png");
		JButton imatge = new JButton(" ");
		imatge.setIcon(img);
		mida.fill = GridBagConstraints.BOTH;
		mida.gridwidth = 1;
		mida.gridheight = 1;
		mida.gridx = 4;
		mida.gridy = 1;
		frame.getContentPane().add(imatge, mida);
		imatge.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				valorPantalla = "";
				pantalla.setText(valorPantalla);
				hiHaPunt = false;
				operador = "";
			}
		});

		JButton set = new JButton("7");
		mida.fill = GridBagConstraints.BOTH;
		mida.gridwidth = 1;
		mida.gridheight = 1;
		mida.gridx = 1;
		mida.gridy = 2;
		frame.getContentPane().add(set, mida);
		accioButo(set);

		JButton vuit = new JButton("8");
		mida.fill = GridBagConstraints.BOTH;
		mida.gridwidth = 1;
		mida.gridheight = 1;
		mida.gridx = 2;
		mida.gridy = 2;
		frame.getContentPane().add(vuit, mida);
		accioButo(vuit);

		JButton nou = new JButton("9");
		mida.fill = GridBagConstraints.BOTH;
		mida.gridwidth = 1;
		mida.gridheight = 1;
		mida.gridx = 3;
		mida.gridy = 2;
		frame.getContentPane().add(nou, mida);
		accioButo(nou);

		JButton menys = new JButton("-");
		mida.fill = GridBagConstraints.BOTH;
		mida.gridwidth = 1;
		mida.gridheight = 1;
		mida.gridx = 4;
		mida.gridy = 2;
		frame.getContentPane().add(menys, mida);
		accioButo(menys);

		JButton quatre = new JButton("4");
		mida.fill = GridBagConstraints.BOTH;
		mida.gridwidth = 1;
		mida.gridheight = 1;
		mida.gridx = 1;
		mida.gridy = 3;
		frame.getContentPane().add(quatre, mida);
		accioButo(quatre);

		JButton cinc = new JButton("5");
		mida.fill = GridBagConstraints.BOTH;
		mida.gridwidth = 1;
		mida.gridheight = 1;
		mida.gridx = 2;
		mida.gridy = 3;
		frame.getContentPane().add(cinc, mida);
		accioButo(cinc);

		JButton sis = new JButton("6");
		mida.fill = GridBagConstraints.BOTH;
		mida.gridwidth = 1;
		mida.gridheight = 1;
		mida.gridx = 3;
		mida.gridy = 3;
		frame.getContentPane().add(sis, mida);
		accioButo(sis);

		JButton suma = new JButton("+");
		mida.fill = GridBagConstraints.BOTH;
		mida.gridwidth = 1;
		mida.gridheight = 2;
		mida.gridx = 4;
		mida.gridy = 3;
		frame.getContentPane().add(suma, mida);
		accioButo(suma);

		JButton un = new JButton("1");
		mida.fill = GridBagConstraints.BOTH;
		mida.gridwidth = 1;
		mida.gridheight = 1;
		mida.gridx = 1;
		mida.gridy = 4;
		frame.getContentPane().add(un, mida);
		accioButo(un);

		JButton dos = new JButton("2");
		mida.fill = GridBagConstraints.BOTH;
		mida.gridwidth = 1;
		mida.gridheight = 1;
		mida.gridx = 2;
		mida.gridy = 4;
		frame.getContentPane().add(dos, mida);
		accioButo(dos);

		JButton tres = new JButton("3");
		mida.fill = GridBagConstraints.BOTH;
		mida.gridwidth = 1;
		mida.gridheight = 1;
		mida.gridx = 3;
		mida.gridy = 4;
		frame.getContentPane().add(tres, mida);
		accioButo(tres);

		JButton cero = new JButton("0");
		mida.fill = GridBagConstraints.BOTH;
		// mida.weighty = 2;
		mida.gridwidth = 2;
		mida.gridheight = 1;
		mida.gridx = 1;
		mida.gridy = 5;
		frame.getContentPane().add(cero, mida);
		accioButo(cero);

		JButton punt = new JButton(".");
		mida.fill = GridBagConstraints.BOTH;
		mida.gridwidth = 1;
		mida.gridheight = 1;
		mida.gridx = 3;
		mida.gridy = 5;
		frame.getContentPane().add(punt, mida);
		accioButo(punt);

		JButton igual = new JButton("=");
		mida.fill = GridBagConstraints.BOTH;
		mida.gridwidth = 1;
		mida.gridheight = 1;
		mida.gridx = 4;
		mida.gridy = 5;
		frame.getContentPane().add(igual, mida);
		accioButo(igual);
	}

	private void accioButo(JButton buto) {
		buto.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				switch (buto.getText()) {
				case "+":
					if (!operador.equals("")) {
						num2 = Double.parseDouble(pantalla.getText());
						valorPantalla = String.valueOf(calcula());
					}else if (pantalla.getText().length() > 0) {
						num1 = Double.parseDouble(pantalla.getText());
						
					}
					operador = "+";
					esborra=true;
					hiHaPunt = false;
					break;
				case "-":
					if (pantalla.getText().length() == 0){
						valorPantalla = "-";
					}else if (!operador.equals("")) {
						num2 = Double.parseDouble(pantalla.getText());
						esborra=true;
						valorPantalla = String.valueOf(calcula());
						operador = "-";
					}else if (pantalla.getText().length() > 0) {
						num1 = Double.parseDouble(pantalla.getText());
						esborra=true;
						operador = "-";
					}
					hiHaPunt = false;
					break;
				case "=":
					if (!operador.equals("")) {
						num2 = Double.parseDouble(pantalla.getText());
						valorPantalla = String.valueOf(calcula());
					}
					break;
				case ".":
					if (!hiHaPunt) {
						valorPantalla = pantalla.getText() + e.getActionCommand();
						pantalla.setText(valorPantalla);
						hiHaPunt = true;
					}
					break;
				default:
					if(esborra){
						valorPantalla=""+ e.getActionCommand();
						esborra=false;
					}else{
						valorPantalla = pantalla.getText() + e.getActionCommand();
					}
					break;
				}
				pantalla.setText(valorPantalla);
			}
		});
	}

	private double calcula() {
		double resultat = 0;
		if (operador.equals("+")){
			resultat = num1 + num2;
		}else if (operador.equals("-")){
			resultat = num1-num2;
		}
		operador="";
		num1=resultat;
		num2=0;
		return resultat;
	}
}
