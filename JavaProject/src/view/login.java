package view;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.border.MatteBorder;

public class login {
	CardLayout cardLayout;
	private JFrame frame;
	private JPanel panel;
	private JPanel pnlCard1;
	private JPanel pnlCard2;
	private JLabel lblArmyNumber;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblPassward;
	private JTextField textField;
//	"C:\\Users\\sm09\\Desktop\\a.txt"
	/**
	 * Launch the application.
	 */
	
	private JTextField textField_1;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JLabel lblPhonenumber;
	private JSeparator separator_3;
	private JSeparator separator_4;
	private JTextField textField_2;
	private JPasswordField passwordField_2;
	private JButton btnNewButton_1;
//	
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login window = new login();
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
	public login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(500, 200, 963, 593);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		frame.getContentPane().setLayout(springLayout);
		
		ImageIcon icon = new ImageIcon("C:\\image\\메인이미지4.PNG");
		
		
		 panel = new JPanel(){
			@Override
			protected void paintComponent(Graphics g) {
				g.drawImage(icon.getImage(),0,0,panel.getWidth(),panel.getHeight(),null); //그릴준비끝. 0,0은 위치 좌측상단  //
				setOpaque(false);
				
			}
		};
		
		springLayout.putConstraint(SpringLayout.NORTH, panel, 0, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, panel, 0, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel, 554, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel, 947, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel pnlCards = new JPanel();
		pnlCards.setBounds(467, 0, 480, 554);
		panel.add(pnlCards);
		pnlCards.setBackground(new Color(0, 0, 0, 0));
		pnlCards.setLayout(new CardLayout(0, 0));
		
		cardLayout = (CardLayout) (pnlCards.getLayout());
		
		pnlCard1 = new JPanel();
		pnlCards.add(pnlCard1, "name_2625854246066500");
		pnlCard1.setName("pnl1");
		pnlCard1.setBorder(null);
		pnlCard1.setOpaque(false);
		pnlCard1.setBackground(new Color(0, 0, 0, 0));
		pnlCard1.setLayout(null);
		
		lblArmyNumber = new JLabel("Army Number");
		lblArmyNumber.setForeground(Color.WHITE);
		lblArmyNumber.setBounds(102, 126, 90, 15);
		pnlCard1.add(lblArmyNumber);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				pnlCards.removeAll();
	            pnlCards.add(pnlCard2);
	            pnlCards.repaint();
	            pnlCards.revalidate();
			}
		});
		
		lblNewLabel_1.setIcon(new ImageIcon("C:\\image\\\uC870\uC778.png"));
		lblNewLabel_1.setBounds(263, 440, 123, 31);
		pnlCard1.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			System.out.println("야호");
			}

			
		});
		
		
		lblNewLabel_2.setIcon(new ImageIcon("C:\\image\\\uB85C\uADF8\uC7784.png"));
		lblNewLabel_2.setBounds(110, 440, 102, 31);
		pnlCard1.add(lblNewLabel_2);
		
		lblPassward = new JLabel("Password");
		lblPassward.setForeground(Color.WHITE);
		lblPassward.setBounds(102, 244, 102, 15);
		pnlCard1.add(lblPassward);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(102, 182, 284, 15);
		pnlCard1.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(102, 304, 284, 15);
		pnlCard1.add(separator_1);
		
		textField = new JTextField();
		textField.setForeground(Color.WHITE);
		textField.setBorder(new MatteBorder(1, 1, 1, 1, new Color(19,12,51)));
		
		textField.setBackground(new Color(19,12,51));
		textField.setBounds(102, 151, 284, 21);
		pnlCard1.add(textField);
		textField.setColumns(10);
		
		passwordField_2 = new JPasswordField();
		passwordField_2.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(19, 12, 51)));
		passwordField_2.setBackground(new Color(19,12,51));
		passwordField_2.setBounds(102, 270, 278, 21);
		pnlCard1.add(passwordField_2);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\image\\mainimage2.png"));
		lblNewLabel_5.setBounds(0, 0, 480, 554);
		pnlCard1.add(lblNewLabel_5);
		
		pnlCard2 = new JPanel();
		pnlCard2.setName("pnl2");
		
		pnlCards.add(pnlCard2, "name_2624187421360400");
		pnlCard2.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(78, 58, 57, 15);
		pnlCard2.add(lblNewLabel);
		
		JLabel lblNewLabel_3 = new JLabel("Password");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setBounds(78, 124, 97, 15);
		pnlCard2.add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				cardLayout.show(pnlCards, "pnlCard1");
			}
		});
		btnNewButton.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(19, 12,51)));
		btnNewButton.setBackground(new Color(19,12,51));
		btnNewButton.setIcon(new ImageIcon("C:\\image\\\uC870\uC778.png"));
		btnNewButton.setBounds(102, 440, 111, 31);
		pnlCard2.add(btnNewButton);
		
		JLabel lblNewLabel_4 = new JLabel("PasswordCheck");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setBounds(78, 189, 149, 15);
		pnlCard2.add(lblNewLabel_4);
		
		textField_1 = new JTextField();
		textField_1.setForeground(Color.WHITE);
		textField_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(19, 12, 51)));
		textField_1.setBackground(new Color(19,12,51));
		textField_1.setBounds(78, 83, 297, 21);
		pnlCard2.add(textField_1);
		textField_1.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setForeground(Color.WHITE);
		passwordField.setBounds(78, 149, 297, 21);
		passwordField.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(19, 12, 51)));
		passwordField.setBackground(new Color(19,12,51));
		pnlCard2.add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setForeground(Color.WHITE);
		passwordField_1.setBounds(78, 214, 297, 21);
		passwordField_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(19, 12, 51)));
		passwordField_1.setBackground(new Color(19,12,51));
		pnlCard2.add(passwordField_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("male");
		rdbtnNewRadioButton.setForeground(new Color(255, 255, 255));
		rdbtnNewRadioButton.setBackground(new Color(19,12,51));
		rdbtnNewRadioButton.setBounds(78, 355, 82, 23);
		pnlCard2.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("female");
		rdbtnNewRadioButton_1.setForeground(Color.WHITE);
		rdbtnNewRadioButton_1.setBackground(new Color(19,12,51));
		rdbtnNewRadioButton_1.setBounds(163, 355, 87, 23);
		pnlCard2.add(rdbtnNewRadioButton_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(78, 108, 297, 2);
		pnlCard2.add(separator_2);
		
		lblPhonenumber = new JLabel("PhoneNumber");
		lblPhonenumber.setForeground(Color.WHITE);
		lblPhonenumber.setBounds(78, 264, 97, 15);
		pnlCard2.add(lblPhonenumber);
		
		separator_3 = new JSeparator();
		separator_3.setBounds(78, 174, 297, 2);
		pnlCard2.add(separator_3);
		
		separator_4 = new JSeparator();
		separator_4.setBounds(78, 238, 297, 2);
		pnlCard2.add(separator_4);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setBounds(78, 310, 297, 2);
		pnlCard2.add(separator_5);
		
		textField_2 = new JTextField();
		textField_2.setForeground(Color.WHITE);
		textField_2.setBorder(new MatteBorder(1, 1, 1, 1, (Color) null));
		textField_2.setBounds(78, 289, 297, 21);
		textField_2.setBackground(new Color(19, 12, 51));
		pnlCard2.add(textField_2);
		textField_2.setColumns(10);
		
		btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				pnlCards.removeAll();
	            pnlCards.add(pnlCard1);
	            pnlCards.repaint();
	            pnlCards.revalidate();
			}
		});
		btnNewButton_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(19, 21, 51)));
		btnNewButton_1.setIcon(new ImageIcon("C:\\image\\\uCE94\uC2AC.png"));
		btnNewButton_1.setBackground(new Color(19, 21, 51));
		btnNewButton_1.setBounds(252, 440, 123, 31);
		pnlCard2.add(btnNewButton_1);
//		separator_5.setBounds(78, 303, 297, 2);
		
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setIcon(new ImageIcon("C:\\image\\mainimage2.png"));
		lblNewLabel_6.setBounds(0, 0, 480, 554);
		pnlCard2.add(lblNewLabel_6);
		
		
	}
}