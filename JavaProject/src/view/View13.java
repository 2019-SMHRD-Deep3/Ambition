package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.CardLayout;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;

public class View13 {

	private JFrame frame;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JTextField textField;
	private JLabel lblNewLabel_3;
	private JPasswordField passwordField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					View13 window = new View13();
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
	public View13() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(500, 200, 956, 587);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(436, 0, 504, 548);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setForeground(Color.WHITE);
		separator_3.setBounds(60, 416, 282, 2);
		panel.add(separator_3);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setForeground(Color.WHITE);
		separator_2.setBounds(60, 334, 282, 2);
		panel.add(separator_2);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(Color.WHITE);
		separator_1.setBounds(60, 254, 282, 2);
		panel.add(separator_1);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.WHITE);
		separator.setBounds(60, 162, 282, 2);
		panel.add(separator);
		
		JRadioButton radioButton_1 = new JRadioButton("\uBCD1\uC0AC");
		radioButton_1.setOpaque(false);
		radioButton_1.setForeground(new Color(255, 255, 255));
		radioButton_1.setFont(new Font("»õ±¼¸²", Font.PLAIN, 12));
		radioButton_1.setBounds(173, 480, 55, 23);
		panel.add(radioButton_1);
		
		JRadioButton radioButton = new JRadioButton("\uBD80\uC0AC\uAD00");
		radioButton.setForeground(new Color(255, 255, 255));
		radioButton.setOpaque(false);
		radioButton.setFont(new Font("»õ±¼¸²", Font.PLAIN, 12));
		radioButton.setBounds(110, 480, 70, 23);
		panel.add(radioButton);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("\uC7A5\uAD50");
		rdbtnNewRadioButton.setForeground(new Color(255, 255, 255));
		rdbtnNewRadioButton.setOpaque(false);
		rdbtnNewRadioButton.setFont(new Font("»õ±¼¸²", Font.PLAIN, 12));
		rdbtnNewRadioButton.setBounds(60, 480, 55, 23);
		panel.add(rdbtnNewRadioButton);
		
		JLabel lblNewLabel_6 = new JLabel("\uC9C1\uCC45");
		lblNewLabel_6.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 16));
		lblNewLabel_6.setForeground(Color.WHITE);
		lblNewLabel_6.setBounds(60, 441, 214, 33);
		panel.add(lblNewLabel_6);
		
		textField_2 = new JTextField();
		textField_2.setForeground(new Color(255, 255, 255));
		textField_2.setBorder(null);
		textField_2.setOpaque(false);
		textField_2.setBounds(60, 403, 214, 15);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("\uC0DD\uB144\uC6D4\uC77C");
		lblNewLabel_5.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 16));
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setBounds(62, 346, 212, 33);
		panel.add(lblNewLabel_5);
		
		textField_1 = new JTextField();
		textField_1.setForeground(new Color(255, 255, 255));
		textField_1.setBorder(null);
		textField_1.setOpaque(false);
		textField_1.setBounds(60, 313, 212, 23);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel(" Name");
		lblNewLabel_4.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setBounds(60, 266, 212, 26);
		panel.add(lblNewLabel_4);
		
		passwordField = new JPasswordField();
		passwordField.setForeground(new Color(255, 255, 255));
		passwordField.setBorder(null);
		passwordField.setOpaque(false);
		passwordField.setBounds(62, 230, 212, 23);
		panel.add(passwordField);
		
		lblNewLabel_3 = new JLabel(" Password");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setBounds(60, 174, 145, 33);
		panel.add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setForeground(new Color(255, 255, 255));
		textField.setBorder(null);
		textField.setOpaque(false);
		textField.setBackground(new Color(255, 255, 255));
		textField.setBounds(60, 147, 212, 15);
		panel.add(textField);
		textField.setColumns(10);
		
		lblNewLabel_2 = new JLabel("Army Number");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(52, 94, 145, 33);
		panel.add(lblNewLabel_2);
		
		lblNewLabel_1 = new JLabel("JOIN");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 33));
		lblNewLabel_1.setBackground(Color.WHITE);
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(172, 28, 159, 56);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("ÈÞ¸Õ¿¢½ºÆ÷", Font.BOLD, 17));
		lblNewLabel.setBounds(6, 5, 492, 555);
		lblNewLabel.setIcon(new ImageIcon("C:\\image\\mainimage2.png"));
		panel.add(lblNewLabel);
	}
}
