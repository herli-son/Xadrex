package ui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import java.awt.GridLayout;

public class CadastroTabuleiro extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public CadastroTabuleiro() {
		setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(10, 47, 430, 40);
		add(panel);

		JLabel lblNewLabel = new JLabel("Titulo");
		panel.add(lblNewLabel);

		JTextArea txtrLogin = new JTextArea();
		txtrLogin.setColumns(20);
		panel.add(txtrLogin);

		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 200, 430, 40);
		add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));

		JPanel panel_3 = new JPanel();
		panel_2.add(panel_3, BorderLayout.CENTER);
		panel_3.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton btnNewButton = new JButton("Criar");
		panel_3.add(btnNewButton);

		JPanel panel_4 = new JPanel();
		panel_4.setBounds(10, 98, 430, 40);
		add(panel_4);

		JLabel lblNewLabel_3 = new JLabel("Descrição");
		panel_4.add(lblNewLabel_3);

		JTextArea txtrLogin_1 = new JTextArea();
		txtrLogin_1.setColumns(20);
		panel_4.add(txtrLogin_1);
		
		JPanel panel_4_1 = new JPanel();
		panel_4_1.setBounds(10, 149, 430, 40);
		add(panel_4_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("Desafiado");
		panel_4_1.add(lblNewLabel_3_1);
		
		JTextArea txtrLogin_1_1 = new JTextArea();
		txtrLogin_1_1.setColumns(20);
		panel_4_1.add(txtrLogin_1_1);
	}

}
