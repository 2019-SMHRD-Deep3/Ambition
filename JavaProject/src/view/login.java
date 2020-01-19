
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

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.border.MatteBorder;

import controller.MemberManagementService;
import model.Member;

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
	private JTextField ID;
//   "C:\\Users\\sm09\\Desktop\\a.txt"
	/**
	 * Launch the application.
	 */

	private JTextField ID2;
	private JPasswordField PW2;
	private JPasswordField PWW2;
	private JLabel lblPhonenumber;
	private JSeparator separator_3;
	private JSeparator separator_4;
	private JTextField PN;
	private JPasswordField PW;
	private JButton btnNewButton_1;
	private MemberManagementService service = new MemberManagementService();
	private JLabel lblNewLabel_7;
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

		panel = new JPanel() {
			@Override
			protected void paintComponent(Graphics g) {
				g.drawImage(icon.getImage(), 0, 0, panel.getWidth(), panel.getHeight(), null); // 그릴준비끝. 0,0은 위치 좌측상단 //
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
		lblArmyNumber.setBounds(114, 126, 90, 15);
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
		lblNewLabel_1.setBounds(258, 427, 123, 31);
		pnlCard1.add(lblNewLabel_1);

		lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				// 로그인기능
				// id, pw를 컴포넌트에서 가져오기
				String infoid = ID.getText();
				String infopw = PW.getText();
				// Member 객체생성
				Member m = new Member(infoid, infopw);
				// 로그인
				Member loginUser = service.memberLogin(m);// 회원정보 넘겨주기 리턴설계 로그인성공시 객체를 리턴을 받고 화면을 넘어다녀도 계속유지되도록한다.

				if (loginUser == null) {
					JOptionPane.showMessageDialog(frame, "로그인 실패");
				} else {
					JOptionPane.showMessageDialog(frame, "로그인 성공");

					frame.dispose(); // 로그인창은 꺼준다.
					if (infoid.length() == 10) {
						Mainpa2 main = new Mainpa2(loginUser);
					} else {
						Mainpa main = new Mainpa(loginUser);
					}
				}
			}

		});

		lblNewLabel_2.setIcon(new ImageIcon("C:\\image\\\uB85C\uADF8\uC7784.png"));
		lblNewLabel_2.setBounds(127, 427, 102, 31);
		pnlCard1.add(lblNewLabel_2);

		lblPassward = new JLabel("Password");
		lblPassward.setForeground(Color.WHITE);
		lblPassward.setBounds(114, 245, 102, 15);
		pnlCard1.add(lblPassward);

		JSeparator separator = new JSeparator();
		separator.setBounds(114, 176, 284, 15);
		pnlCard1.add(separator);

		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(114, 295, 284, 15);
		pnlCard1.add(separator_1);

		ID = new JTextField();
		ID.setForeground(Color.WHITE);
		ID.setBorder(new MatteBorder(1, 1, 1, 1, new Color(19, 12, 51)));

		ID.setBackground(new Color(19, 12, 51));
		ID.setBounds(114, 151, 284, 21);
		pnlCard1.add(ID);
		ID.setColumns(10);

		PW = new JPasswordField();
		PW.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(19, 12, 51)));
		PW.setBackground(new Color(19, 12, 51));
		PW.setBounds(114, 270, 278, 21);
		pnlCard1.add(PW);

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

		JRadioButton male = new JRadioButton("male");
		male.setForeground(new Color(255, 255, 255));
		male.setBackground(new Color(19, 12, 51));
		male.setBounds(78, 355, 82, 23);
		pnlCard2.add(male);
		ButtonGroup group = new ButtonGroup();
		group.add(male);

		JLabel lblNewLabel_3 = new JLabel("Password");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setBounds(78, 124, 97, 15);
		pnlCard2.add(lblNewLabel_3);

		JButton btnNewButton = new JButton("");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {

				String Army_id = ID2.getText();
				String Password = PW2.getText();
				String PasswordCheck = PWW2.getText();
				if (Password.equals(PasswordCheck)) {
					int Phonenumber = Integer.parseInt(PN.getText());
					int sex = 0;
					if (male.isSelected() == true) { // 선택레뒤오박스는 isSelected를 사용. 불린형
						sex = 1;
					} else {
						sex = 2;
					}
					// Member 객체를 생성

					Member member = new Member(Army_id, Password, PasswordCheck, Phonenumber, sex);
					// Controller에게 회원가입요청
//               if(Password!=PasswordCheck) {
//                  JOptionPane.showMessageDialog(frame,
//                         "회원가입 실패");
//               }

					boolean result = service.memberJoin(member); // 정보는 m을 받아서 조인. 성공하면 ture 실패하면false를 받기위해 불린형 타입에
																	// 넣어준다.
					if (result == true) {
						JOptionPane.showMessageDialog(frame, "회원가입 성공");
						ID2.setText(null);
						PW2.setText(null);
						PWW2.setText(null);
						PN.setText(null);

						pnlCards.removeAll();
						pnlCards.add(pnlCard1);
						pnlCards.repaint();
						pnlCards.revalidate();

					} else {
						JOptionPane.showMessageDialog(frame, "회원가입 실패");
					}
				} else {
					JOptionPane.showMessageDialog(frame, "비밀번호를 확인해주세요");
				}

			}
		});
		btnNewButton.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(19, 12, 51)));
		btnNewButton.setBackground(new Color(19, 12, 51));
		btnNewButton.setIcon(new ImageIcon("C:\\image\\\uC870\uC778.png"));
		btnNewButton.setBounds(102, 440, 111, 31);
		pnlCard2.add(btnNewButton);

		JLabel lblNewLabel_4 = new JLabel("PasswordCheck");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setBounds(78, 189, 149, 15);
		pnlCard2.add(lblNewLabel_4);

		ID2 = new JTextField();
		ID2.setForeground(Color.WHITE);
		ID2.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(19, 12, 51)));
		ID2.setBackground(new Color(19, 12, 51));
		ID2.setBounds(78, 83, 297, 21);
		pnlCard2.add(ID2);
		ID2.setColumns(10);

		PW2 = new JPasswordField();
		PW2.setForeground(Color.WHITE);
		PW2.setBounds(78, 149, 297, 21);
		PW2.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(19, 12, 51)));
		PW2.setBackground(new Color(19, 12, 51));
		pnlCard2.add(PW2);

		PWW2 = new JPasswordField();
		PWW2.setForeground(Color.WHITE);
		PWW2.setBounds(78, 214, 297, 21);
		PWW2.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(19, 12, 51)));
		PWW2.setBackground(new Color(19, 12, 51));
		pnlCard2.add(PWW2);

		JRadioButton female = new JRadioButton("female");
		female.setForeground(Color.WHITE);
		female.setBackground(new Color(19, 12, 51));
		female.setBounds(163, 355, 87, 23);
		pnlCard2.add(female);
		group.add(female);

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

		PN = new JTextField();
		PN.setForeground(Color.WHITE);
		PN.setBorder(new MatteBorder(1, 1, 1, 1, (Color) null));
		PN.setBounds(78, 289, 297, 21);
		PN.setBackground(new Color(19, 12, 51));
		pnlCard2.add(PN);
		PN.setColumns(10);

		btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				ID2.setText(null);
				PW2.setText(null);
				PWW2.setText(null);
				PN.setText(null);
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
//      separator_5.setBounds(78, 303, 297, 2);

		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setIcon(new ImageIcon("C:\\image\\mainimage2.png"));
		lblNewLabel_6.setBounds(0, 0, 480, 554);
		pnlCard2.add(lblNewLabel_6);
		
		lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setIcon(new ImageIcon("C:\\image\\\uBA54\uC778\uC774\uBBF8\uC9C04 (2).png"));
		lblNewLabel_7.setBounds(0, 0, 947, 554);
		panel.add(lblNewLabel_7);

	}

}