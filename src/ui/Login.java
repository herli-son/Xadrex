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
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;

public class Login extends JPanel {

	private static final long serialVersionUID = 1L;
	private JPasswordField passwordField;

	/**
	 * Create the panel.
	 */
	public Login() {
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 54, 430, 40);
		add(panel);
		
		JLabel lblNewLabel = new JLabel("Usuario:");
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
		
		JPanel panel_3 = new JPanel();
		panel_2.add(panel_3, BorderLayout.CENTER);
		panel_3.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panel_4 = new JPanel();
		panel_3.add(panel_4);
		panel_4.setLayout(new GridLayout(1, 0, 0, 0));
		
		JButton btnNewButton = new JButton("Login");
		panel_4.add(btnNewButton);
		
		JPanel panel_5 = new JPanel();
		panel_3.add(panel_5);
		panel_5.setLayout(new GridLayout(1, 0, 0, 0));
		
		JButton btnNewButton_1 = new JButton("Cancelar");
		panel_5.add(btnNewButton_1);

	}
}
