package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class ArmyMain {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ArmyMain window = new ArmyMain();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ArmyMain() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1200, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(12, 10, 282, 641);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(12, 20, 120, 44);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\uC870\uC9C1\uB3C4");
		lblNewLabel_1.setBounds(12, 93, 158, 44);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\uAD70\uC778\uC815\uBCF4");
		lblNewLabel_2.setBounds(12, 183, 168, 56);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewlabel = new JLabel("\uC9C1\uCC45");
		lblNewlabel.setBounds(12, 284, 120, 44);
		panel.add(lblNewlabel);
		
		JLabel lblNewLabel_3 = new JLabel("\uCD9C\uD0C0\uAD00\uB9AC");
		lblNewLabel_3.setBounds(0, 375, 147, 64);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setBounds(12, 510, 135, 64);
		panel.add(lblNewLabel_4);
	}
}
