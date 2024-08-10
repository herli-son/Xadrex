package ui;

import javax.swing.JPanel;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JPasswordField;
import java.awt.TextField;
import javax.swing.JLabel;
import javax.swing.BoxLayout;

public class Login extends JPanel {

	private static final long serialVersionUID = 1L;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JPasswordField passwordField_2;

	/**
	 * Create the panel.
	 */
	public Login() {
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 54, 430, 40);
		add(panel);
		
		JLabel lblNewLabel = new JLabel("Login:");
		panel.add(lblNewLabel);
		
		JTextArea txtrLogin = new JTextArea();
		txtrLogin.setColumns(20);
		panel.add(txtrLogin);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 107, 430, 40);
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
		
		JLabel lblNewLabel_2 = new JLabel("Esqueci a senha");
		panel_2.add(lblNewLabel_2, BorderLayout.NORTH);
		
		passwordField_1 = new JPasswordField();
		panel_2.add(passwordField_1, BorderLayout.CENTER);
		
		passwordField_2 = new JPasswordField();
		passwordField_2.setColumns(25);
		panel_2.add(passwordField_2, BorderLayout.EAST);

	}
}
