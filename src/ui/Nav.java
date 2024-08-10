package ui;

import javax.swing.JPanel;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import javax.swing.JButton;

public class Nav extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public Nav() {
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		add(panel, BorderLayout.NORTH);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnNewButton = new JButton("X");
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("X");
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("X");
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("X");
		panel.add(btnNewButton_3);
		
		JPanel panel_1 = new JPanel();
		add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

	}
}
