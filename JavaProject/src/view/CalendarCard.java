package view;

import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JScrollPane;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseAdapter;
import java.awt.SystemColor;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;

public class CalendarCard extends JPanel {

	/**
	 * Create the panel.
	 */
	public CalendarCard(String month, int numOfDay) {
		setBackground(new Color(255, 255, 255));
		setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 10, 975, 471);
		add(scrollPane);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		scrollPane.setViewportView(panel);
		panel.setLayout(null);
		panel.setPreferredSize(new Dimension(1250, 600));

		JLabel label = new JLabel("1\uC6D4");
		label.setForeground(new Color(0, 0, 51));
		label.setFont(new Font("±¼¸²", Font.BOLD, 24));
		label.setBounds(568, 0, 140, 34);
		panel.add(label);
		label.setText(month);

		JLabel lblNewLabel = new JLabel("\uAD70\uBC88");
		lblNewLabel.setForeground(new Color(0, 0, 51));
		lblNewLabel.setFont(new Font("±¼¸²", Font.BOLD, 14));
		lblNewLabel.setBounds(12, 57, 95, 15);
		panel.add(lblNewLabel);

		JLabel label_1 = new JLabel("\uACC4\uAE09");
		label_1.setForeground(new Color(0, 0, 51));
		label_1.setFont(new Font("±¼¸²", Font.BOLD, 14));
		label_1.setBounds(133, 56, 39, 15);
		panel.add(label_1);

		JLabel label_2 = new JLabel("\uC774\uB984");
		label_2.setForeground(new Color(0, 0, 51));
		label_2.setFont(new Font("±¼¸²", Font.BOLD, 14));
		label_2.setBounds(211, 56, 66, 15);
		panel.add(label_2);

		int x = 80;
		
		for (int j = 0; j < numOfDay; j++) {
			JLabel lblNewLabel1 = new JLabel((j+1)+"");
			lblNewLabel1.setBounds(309 + (j * 26), 55, 30,25);
			panel.add(lblNewLabel1);
		
		}
		for (int i = 0; i < 15; i++) {

			for (int j = 0; j < numOfDay; j++) {
				JButton btnNewButton = new JButton("");
				btnNewButton.setBackground(new Color(255, 255, 255));
				btnNewButton.addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent e) {
						JButton buttonn = (JButton) e.getSource();

						String str = buttonn.getText();

						if (e.getClickCount() == 1) {
							buttonn.setBackground(new Color(255, 215, 0));
						}
						if (e.getClickCount() == 2) {
							buttonn.setBackground(new Color(255, 255, 255));
						}
						if (e.getClickCount() == 3) {
							buttonn.setBackground(new Color(255, 0, 0));
						}
					}
					
				});
				btnNewButton.setBounds(300 + (j * 26), x, 25,25);
				panel.add(btnNewButton);
			}
			x += 30;
		}

	}
}
