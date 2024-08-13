package ui;

import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JInternalFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Historico extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTable table;

	/**
	 * Create the panel.
	 */
	public Historico() {
		setLayout(new GridLayout(1, 0, 0, 0));
		
		JInternalFrame internalFrame = new JInternalFrame("Historico de movimentações");
		internalFrame.setMaximizable(true);
		internalFrame.setClosable(true);
		add(internalFrame);
		internalFrame.getContentPane().setLayout(new GridLayout(1, 0, 0, 0));
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
			},
			new String[] {
				"Pe\u00E7a", "Casa de Origem", "Casa de destino", "Descri\u00E7\u00E3o"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				true, true, true, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(0).setPreferredWidth(100);
		table.getColumnModel().getColumn(1).setPreferredWidth(100);
		table.getColumnModel().getColumn(2).setPreferredWidth(100);
		table.getColumnModel().getColumn(3).setPreferredWidth(100);
		internalFrame.getContentPane().add(table);
		internalFrame.setVisible(true);

	}

}
