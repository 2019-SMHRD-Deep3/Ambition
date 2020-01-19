package view;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class 지도창_1 extends JPanel {

	
	/**
	 * Create the panel.
	 */
	public 지도창_1() {
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 991, 590);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\image\\\uB178\uC120\uC815\uBCF4\uC81C\uBC1Cfinal.png"));
		lblNewLabel.setBounds(90, -42, 1001, 580);
		panel.add(lblNewLabel);

	}
}
