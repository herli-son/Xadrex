package ui;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;

public class Opcoes extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public Opcoes() {
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		add(panel, BorderLayout.NORTH);
		
		JButton btnNewButton = new JButton("x");
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("x");
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("x");
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("x");
		panel.add(btnNewButton_3);
		
		JPanel panel_1 = new JPanel();
		add(panel_1, BorderLayout.CENTER);

	}

}
