package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JLabel;

public class Imagechart {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Imagechart window = new Imagechart();
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
	public Imagechart() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 1300, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(102, 153, 204));
		panel_1.setBounds(518, 241, 162, 29);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(81, 5, 0, 2);
		panel_1.add(separator_4);
		
		JLabel lblNewLabel_2 = new JLabel("\uC911\uB300\uC7A5");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("±¼¸²", Font.BOLD, 15));
		lblNewLabel_2.setBounds(51, 8, 57, 15);
		panel_1.add(lblNewLabel_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(102, 153, 153));
		panel_2.setBounds(83, 438, 183,36);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uC218\uC1A1");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(255, 250, 250));
		lblNewLabel.setFont(new Font("±¼¸²", Font.BOLD, 15));
		lblNewLabel.setBounds(61, 10, 57, 15);
		panel_2.add(lblNewLabel);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(102, 153, 153));
		panel_3.setBounds(295, 439, 183, 36);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("\uD1B5\uC2E0");
		lblNewLabel_3.setFont(new Font("±¼¸²", Font.BOLD, 15));
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(63, 11, 57, 15);
		panel_3.add(lblNewLabel_3);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(102, 153, 153));
		panel_4.setBounds(505, 439, 183, 36);
		frame.getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("\uC758\uBB34");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setFont(new Font("±¼¸²", Font.BOLD, 15));
		lblNewLabel_4.setBounds(65, 8, 57, 15);
		panel_4.add(lblNewLabel_4);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(102, 153, 153));
		panel_5.setBounds(720, 437, 183, 36);
		frame.getContentPane().add(panel_5);
		panel_5.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("\uD0C4\uC57D");
		lblNewLabel_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_5.setFont(new Font("±¼¸²", Font.BOLD, 15));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBounds(65, 9, 57, 15);
		panel_5.add(lblNewLabel_5);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(102, 153, 153));
		panel_6.setBounds(942, 437, 183, 36);
		frame.getContentPane().add(panel_6);
		panel_6.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("\uC791\uC804");
		lblNewLabel_6.setForeground(new Color(255, 255, 255));
		lblNewLabel_6.setFont(new Font("±¼¸²", Font.BOLD, 15));
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setBounds(64, 10, 57, 15);
		panel_6.add(lblNewLabel_6);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBounds(97, 520, 156, 131);
		frame.getContentPane().add(panel_7);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBounds(306, 520, 156, 131);
		frame.getContentPane().add(panel_8);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBounds(521, 515, 156, 136);
		frame.getContentPane().add(panel_9);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBounds(741, 515, 156, 136);
		frame.getContentPane().add(panel_10);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBounds(955, 515, 156, 136);
		frame.getContentPane().add(panel_11);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(161, 285, 850, 11);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setBounds(164, 284, 25, 49);
		frame.getContentPane().add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setOrientation(SwingConstants.VERTICAL);
		separator_2.setBounds(1009, 282, 22, 48);
		frame.getContentPane().add(separator_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setOrientation(SwingConstants.VERTICAL);
		separator_3.setBounds(592, 268, 17, 67);
		frame.getContentPane().add(separator_3);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setOrientation(SwingConstants.VERTICAL);
		separator_5.setBounds(391, 226, -11, 62);
		frame.getContentPane().add(separator_5);
		
		JSeparator separator_6 = new JSeparator();
		separator_6.setOrientation(SwingConstants.VERTICAL);
		separator_6.setBounds(380, 283, 25, 49);
		frame.getContentPane().add(separator_6);
		
		JSeparator separator_7 = new JSeparator();
		separator_7.setOrientation(SwingConstants.VERTICAL);
		separator_7.setBounds(803, 284, 17, 49);
		frame.getContentPane().add(separator_7);
		
		JSeparator separator_8 = new JSeparator();
		separator_8.setOrientation(SwingConstants.VERTICAL);
		separator_8.setBounds(164, 474, 1, 49);
		frame.getContentPane().add(separator_8);
		
		JSeparator separator_9 = new JSeparator();
		separator_9.setOrientation(SwingConstants.VERTICAL);
		separator_9.setBounds(381, 474, 11, 46);
		frame.getContentPane().add(separator_9);
		
		JSeparator separator_10 = new JSeparator();
		separator_10.setOrientation(SwingConstants.VERTICAL);
		separator_10.setBounds(594, 468, 17, 49);
		frame.getContentPane().add(separator_10);
		
		JSeparator separator_11 = new JSeparator();
		separator_11.setOrientation(SwingConstants.VERTICAL);
		separator_11.setBounds(809, 466, 17, 49);
		frame.getContentPane().add(separator_11);
		
		JSeparator separator_12 = new JSeparator();
		separator_12.setOrientation(SwingConstants.VERTICAL);
		separator_12.setBounds(1029, 471, 25, 49);
		frame.getContentPane().add(separator_12);
		
		JPanel panel = new JPanel();
		panel.setBounds(123, 332, 88, 108);
		frame.getContentPane().add(panel);
		
		JPanel panel_12 = new JPanel();
		panel_12.setBounds(337, 330, 90, 109);
		frame.getContentPane().add(panel_12);
		
		JPanel panel_13 = new JPanel();
		panel_13.setBounds(548, 330, 94, 110);
		frame.getContentPane().add(panel_13);
		
		JPanel panel_14 = new JPanel();
		panel_14.setBounds(761, 329, 94, 109);
		frame.getContentPane().add(panel_14);
		
		JPanel panel_15 = new JPanel();
		panel_15.setBounds(975, 329, 102, 107);
		frame.getContentPane().add(panel_15);
		
		JPanel panel_16 = new JPanel();
		panel_16.setBounds(547, 145, 98, 97);
		frame.getContentPane().add(panel_16);
		
		JPanel panel_17 = new JPanel();
		panel_17.setBackground(new Color(0, 102, 153));
		panel_17.setBounds(469, 111, 248, 24);
		frame.getContentPane().add(panel_17);
		panel_17.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("\uB300\uB300\uC7A5");
		lblNewLabel_1.setForeground(new Color(255, 250, 250));
		lblNewLabel_1.setFont(new Font("±¼¸²", Font.BOLD, 15));
		lblNewLabel_1.setBounds(95, 5, 64, 15);
		panel_17.add(lblNewLabel_1);
		
		JPanel panel_18 = new JPanel();
		panel_18.setBounds(540, 1, 106, 112);
		frame.getContentPane().add(panel_18);
		
		JSeparator separator_13 = new JSeparator();
		separator_13.setOrientation(SwingConstants.VERTICAL);
		separator_13.setBounds(591, 132, 9, 15);
		frame.getContentPane().add(separator_13);
	}
}
