package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

public class view11 {

	private JFrame frame;
	private JTextField pw;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					view11 window = new view11();
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
	public view11() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(500, 200, 963, 593);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\image\\\uD0F1\uD06C2.png"));
		lblNewLabel_5.setBounds(41, 463, 109, 56);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\image\\ddd.png"));
		lblNewLabel_2.setBounds(30, 27, 48, 49);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\image\\\uD0F1\uD06C.png"));
		lblNewLabel_4.setBounds(154, 463, 66, 56);
		frame.getContentPane().add(lblNewLabel_4);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(589, 265, 223, 28);
		frame.getContentPane().add(passwordField);
		
		JLabel lblPaw = new JLabel("Password");
		lblPaw.setForeground(Color.WHITE);
		lblPaw.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 15));
		lblPaw.setBounds(589, 220, 264, 43);
		frame.getContentPane().add(lblPaw);
		
		pw = new JTextField();
		pw.setBounds(589, 154, 223, 28);
		frame.getContentPane().add(pw);
		pw.setColumns(10);
		
		JLabel Number = new JLabel("Army Number");
		Number.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 15));
		Number.setForeground(Color.WHITE);
		Number.setBounds(589, 111, 264, 43);
		frame.getContentPane().add(Number);
		
		JLabel Join = new JLabel("");
		Join.setIcon(new ImageIcon("C:\\image\\\uC870\uC778.png"));
		Join.setBounds(709, 383, 103, 49);
		frame.getContentPane().add(Join);
		
		JLabel SignIn = new JLabel("");
		SignIn.setIcon(new ImageIcon("C:\\image\\\uB85C\uADF8\uC7784.png"));
		SignIn.setBounds(594, 383, 103, 49);
		frame.getContentPane().add(SignIn);
		
		JLabel lblNewLabel_3 = new JLabel("Army HR");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 25));
		lblNewLabel_3.setBounds(112, 97, 277, 85);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\image\\mainimage2.png"));
		lblNewLabel_1.setBounds(462, 0, 493, 556);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\image\\mainimage1.png"));
		lblNewLabel.setBounds(0, 0, 493, 556);
		frame.getContentPane().add(lblNewLabel);
	}
}
