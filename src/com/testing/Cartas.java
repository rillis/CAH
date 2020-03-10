package com.testing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.image.processing.Cards;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Cartas extends JFrame {

	private JPanel contentPane;
	int random1 = random(0,77);
	int random2 = random(0,456);
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cartas frame = new Cartas();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Cartas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 840, 513);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel n1 = new JLabel("0");
		n1.setBounds(10, 412, 46, 14);
		n1.setText(""+random1);
		contentPane.add(n1);
		
		JLabel n2 = new JLabel("0");
		n2.setHorizontalAlignment(SwingConstants.RIGHT);
		n2.setBounds(768, 412, 46, 14);
		n2.setText(""+random2);
		contentPane.add(n2);
		
		JLabel cartaPreta = new JLabel("");
		cartaPreta.setBounds(10, 11, 390, 390);
		setIcon(cartaPreta, Cards.preffix2+Cards.blackArchiveName+random1+Cards.extension);
		contentPane.add(cartaPreta);
		
		JLabel cartaBranca = new JLabel("");
		cartaBranca.setBounds(424, 11, 390, 390);
		setIcon(cartaBranca, Cards.preffix2+Cards.whiteArchiveName+random2+Cards.extension);
		contentPane.add(cartaBranca);
		
		JButton btnRandom = new JButton("Random");
		btnRandom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				random1 = random(0,78);
				random2 = random(0,456);
				n1.setText(""+random1);
				n2.setText(""+random2);
				setIcon(cartaPreta, Cards.preffix2+Cards.blackArchiveName+random1+Cards.extension);
				setIcon(cartaBranca, Cards.preffix2+Cards.whiteArchiveName+random2+Cards.extension);
			}
		});
		btnRandom.setBounds(363, 440, 89, 23);
		contentPane.add(btnRandom);
		
	}
	
	public int random(int min, int max) {
		return (int)(Math.random() * ((max - min) + 1)) + min;
	}
	
	public void setIcon(JLabel jL, String arq) {
		System.out.println(arq);
		ImageIcon image = new ImageIcon(Cartas.class.getResource(arq));
		jL.setIcon(image);
	}
}
