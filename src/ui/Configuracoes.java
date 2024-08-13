package ui;

import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JInternalFrame;

public class Configuracoes extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public Configuracoes() {
		setLayout(new GridLayout(1, 0, 0, 0));
		
		JInternalFrame internalFrame = new JInternalFrame("Configurações de tabuleiro");
		internalFrame.setClosable(true);
		add(internalFrame);
		internalFrame.setVisible(true);

	}

}
