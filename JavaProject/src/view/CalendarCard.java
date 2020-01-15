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

public class CalendarCard extends JPanel {

	/**
	 * Create the panel.
	 */
	public CalendarCard(String month, int numOfDay) {
		setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 10, 975, 483);
		add(scrollPane);

		JPanel panel = new JPanel();
		scrollPane.setViewportView(panel);
		panel.setLayout(null);
		panel.setPreferredSize(new Dimension(2000, 600));

		JLabel label = new JLabel("1\uC6D4");
		label.setFont(new Font("±¼¸²", Font.BOLD, 24));
		label.setBounds(35, 0, 140, 34);
		panel.add(label);
		label.setText(month);

		JLabel lblNewLabel = new JLabel("\uAD70\uBC88");
		lblNewLabel.setBounds(12, 52, 95, 15);
		panel.add(lblNewLabel);

		JLabel label_1 = new JLabel("\uACC4\uAE09");
		label_1.setBounds(131, 52, 39, 15);
		panel.add(label_1);

		JLabel label_2 = new JLabel("\uC774\uB984");
		label_2.setBounds(209, 52, 66, 15);
		panel.add(label_2);

		int x = 50;
		for (int i = 0; i < 14; i++) {

			for (int j = 0; j < numOfDay; j++) {
				JButton btnNewButton = new JButton((j + 1) + "");
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
				btnNewButton.setBounds(300 + (j * 50), x, 50, 20);
				panel.add(btnNewButton);
			}
			x += 30;
		}

	}
}
