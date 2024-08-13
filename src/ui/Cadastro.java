package ui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import java.awt.GridLayout;
import javax.swing.BoxLayout;

public class Cadastro extends JPanel {

	private static final long serialVersionUID = 1L;
	private JPasswordField passwordField;

	/**
	 * Create the panel.
	 */
	public Cadastro() {
		setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(10, 47, 430, 40);
		add(panel);

		JLabel lblNewLabel = new JLabel("Usuario");
		panel.add(lblNewLabel);

		JTextArea txtrLogin = new JTextArea();
		txtrLogin.setColumns(20);
		panel.add(txtrLogin);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 149, 430, 40);
		add(panel_1);

		JLabel lblNewLabel_1 = new JLabel("Senha:");
		panel_1.add(lblNewLabel_1);

		passwordField = new JPasswordField();
		passwordField.setColumns(20);
		panel_1.add(passwordField);

		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 200, 430, 40);
		add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));

		JPanel panel_3 = new JPanel();
		panel_2.add(panel_3, BorderLayout.CENTER);
		panel_3.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panel_5 = new JPanel();
		panel_3.add(panel_5);
		panel_5.setLayout(new GridLayout(1, 0, 0, 0));
		
		JButton btnNewButton = new JButton("Cadastrar");
		panel_5.add(btnNewButton);
		
		JPanel panel_6 = new JPanel();
		panel_3.add(panel_6);
		panel_6.setLayout(new GridLayout(1, 0, 0, 0));
		
		JButton btnNewButton_1 = new JButton("Cancelar");
		panel_6.add(btnNewButton_1);

		JPanel panel_4 = new JPanel();
		panel_4.setBounds(10, 98, 430, 40);
		add(panel_4);

		JLabel lblNewLabel_3 = new JLabel("Nome");
		panel_4.add(lblNewLabel_3);

		JTextArea txtrLogin_1 = new JTextArea();
		txtrLogin_1.setColumns(20);
		panel_4.add(txtrLogin_1);
	}

}
