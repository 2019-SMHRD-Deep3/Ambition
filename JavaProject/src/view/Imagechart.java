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

public class Imagechart {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

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
		frame.setBounds(100, 100, 1300, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(102, 153, 204));
		panel_1.setBounds(518, 241, 162, 29);
		frame.getContentPane().add(panel_1);
		
		textField_1 = new JTextField();
		textField_1.setBackground(SystemColor.textHighlight);
		textField_1.setForeground(new Color(102, 153, 204));
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setFont(new Font("±¼¸²", Font.BOLD, 12));
		textField_1.setText("\uC911\uB300\uC7A5");
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		JSeparator separator_4 = new JSeparator();
		panel_1.add(separator_4);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(102, 153, 153));
		panel_2.setBounds(83, 438, 183,36);
		frame.getContentPane().add(panel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(102, 153, 153));
		panel_3.setBounds(295, 439, 183, 36);
		frame.getContentPane().add(panel_3);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(102, 153, 153));
		panel_4.setBounds(505, 439, 183, 36);
		frame.getContentPane().add(panel_4);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(102, 153, 153));
		panel_5.setBounds(720, 437, 183, 36);
		frame.getContentPane().add(panel_5);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(102, 153, 153));
		panel_6.setBounds(942, 437, 183, 36);
		frame.getContentPane().add(panel_6);
		
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
		
		textField = new JTextField();
		textField.setFont(new Font("±¼¸²", Font.BOLD, 12));
		textField.setForeground(new Color(255, 255, 255));
		textField.setText("\uB300\uB300\uC7A5");
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setBackground(new Color(0, 102, 153));
		panel_17.add(textField);
		textField.setColumns(10);
		
		JPanel panel_18 = new JPanel();
		panel_18.setBounds(540, 1, 106, 112);
		frame.getContentPane().add(panel_18);
		
		JSeparator separator_13 = new JSeparator();
		separator_13.setOrientation(SwingConstants.VERTICAL);
		separator_13.setBounds(591, 132, 9, 15);
		frame.getContentPane().add(separator_13);
	}
}
