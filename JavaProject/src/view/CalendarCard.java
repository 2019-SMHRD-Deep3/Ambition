package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.time.LocalDate;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import controller.MemberManagementService;
import model.Member;
import model.MemberAll;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalendarCard extends JPanel {
	private MemberManagementService service = new MemberManagementService();
	private JTextField ID;
	private JTextField PW;
	private JTextField NAME;
	private JTextField VACATION;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_1;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField textField_29;
	private JTextField textField_30;
	private JTextField textField_31;
	private JTextField textField_32;
	private JTextField textField_33;
	private JTextField textField_34;
	private JTextField textField_35;
	private JTextField textField_36;
	private JTextField textField_37;
	private JTextField textField_38;
	private JTextField textField_39;
	private JTextField textField_40;
	private JTextField textField_41;
	private JTextField textField_42;
	private JTextField textField_43;
	private JTextField textField_44;
	private JTextField textField_45;
	private JTextField textField_46;
	private JTextField textField_47;
	private JTextField textField_48;
	private JTextField textField_49;
	private JTextField textField_50;
	private JTextField textField_51;
	private JTextField textField_52;
	private JTextField textField_53;
	private JTextField textField_54;
	private JTextField textField_55;
	private JTextField textField_56;
	private JTextField textField_57;
	private JTextField textField_58;
	private JTextField textField_59;
	private JTextField textField_60;
	private JTextField textField_61;
	private JButton btnNewButton_1;
	private JFrame frame;
	private JButton btnNewButton;
	private JButton[][] btnArray = new JButton[15][];
	private JButton[] Button;
	int max = 0;
	int min = 32;
	String maxx = "";
	String minn = "";

	/**
	 * Create the panel.
	 */
	public CalendarCard(String month, int numOfDay) {
		setBackground(new Color(255, 255, 255));
		setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 10, 975, 164);
		add(scrollPane);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		scrollPane.setViewportView(panel);
		panel.setPreferredSize(new Dimension(1250, 100));
		panel.setLayout(null);

		JLabel label = new JLabel("1\uC6D4");
		label.setBounds(568, 0, 140, 34);
		label.setForeground(new Color(0, 0, 51));
		label.setFont(new Font("굴림", Font.BOLD, 24));
		panel.add(label);
		label.setText(month);

		JLabel lblNewLabel = new JLabel("\uAD70\uBC88");
		lblNewLabel.setBounds(50, 56, 59, 15);
		lblNewLabel.setForeground(new Color(0, 0, 51));
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 14));
		panel.add(lblNewLabel);

		JLabel label_1 = new JLabel("\uACC4\uAE09");
		label_1.setBounds(107, 56, 39, 15);
		label_1.setForeground(new Color(0, 0, 51));
		label_1.setFont(new Font("굴림", Font.BOLD, 14));
		panel.add(label_1);

		JLabel label_2 = new JLabel("\uC774\uB984");
		label_2.setBounds(167, 56, 66, 15);
		label_2.setForeground(new Color(0, 0, 51));
		label_2.setFont(new Font("굴림", Font.BOLD, 14));
		panel.add(label_2);

		JLabel label_3 = new JLabel("\uC0AC\uC720");
		label_3.setBounds(234, 56, 57, 15);
		label_3.setFont(new Font("굴림", Font.BOLD, 14));
		panel.add(label_3);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(25, 78, 257, 25);
		panel_1.setBackground(Color.WHITE);
		panel.add(panel_1);
		panel_1.setLayout(new GridLayout(1, 4, 0, 3));

		ID = new JTextField();
		panel_1.add(ID);
		ID.setColumns(10);
		System.out.println(Mainpa.getID22() + "");

		PW = new JTextField();
		panel_1.add(PW);
		PW.setColumns(10);

		NAME = new JTextField();
		panel_1.add(NAME);
		NAME.setColumns(10);

		VACATION = new JTextField();
		panel_1.add(VACATION);
		VACATION.setColumns(10);

		btnNewButton_1 = new JButton("\uCD94\uAC00");

		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				LocalDate onlyDate = LocalDate.now();
				String result4 = "";
				String result2 = "";
				result4 = String.valueOf(onlyDate);
//              System.out.println(result);
				String[] date = new String[3];
				date = result4.split("-");
				result2 = date[0];
				result2 = date[0].substring(2, 4);

//              if(month.length()==2) {
//                 
//              }else {
//                 month = "0"+month;
//              }

				showll();

				String Army_id = ID.getText();
				String Army_class = PW.getText();
				String Army_name = NAME.getText();
				String Vacation = VACATION.getText();
				String VacationStart = result2 + month + (minn);
				String VacationFinish = result2 + month + (maxx);

				MemberAll m = new MemberAll(Army_id, Army_class, Army_name, Vacation, VacationStart, VacationFinish);

				// 로그인
				boolean result = service.memberVacationEnroll2(m); // 정보는 m을 받아서 조인. 성공하면 true 실패하면false를 받기위해 불린형 타입에
																	// 넣어준다.
				if (result == true) {
					JOptionPane.showMessageDialog(frame, "등록성공");

				} else {
					JOptionPane.showMessageDialog(frame, "등록실패");
				}

			}

		});
		for (int j = 0; j < numOfDay; j++) {
			JLabel lblNewLabel1 = new JLabel((j + 1) + "");
			lblNewLabel1.setBounds(309 + (j * 26), 55, 30, 25);
			panel.add(lblNewLabel1);

		}

		int x = 80;

		for (int i = 0; i < 1; i++) {
			final int btni = i;

			for (int j = 0; j < numOfDay; j++) {
				final int btnj = j;

				Button = new JButton[numOfDay];
				Button[j] = new JButton("");
				Button[j].setBackground(new Color(255, 255, 255));
				Button[j].addMouseListener(new MouseAdapter() {

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
						System.out.println(month);
//                     
//                     System.out.println(btni);
//                     System.out.println(btnj);
						if (min > btnj) {
							min = btnj;
						}

						if (max < btnj) {
							max = btnj;
						}

						minn = Integer.toString(min);
						if (minn.length() == 2) {

						} else {
							minn = "0" + min;
						}

						maxx = Integer.toString(max);
						if (maxx.length() == 2) {

						} else {
							maxx = "0" + max;
						}

					}

				});

				Button[j].setBounds(300 + (j * 26), x, 25, 22);

				panel.add(Button[j]);

			}
			btnArray[i] = Button;
			x += 30;
		}

		btnNewButton_1.setFont(new Font("굴림", Font.BOLD, 12));
		btnNewButton_1.setBounds(218, 23, 64, 23);
		panel.add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("\uAC31\uC2E0");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_2.setFont(new Font("굴림", Font.BOLD, 12));
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				up();
			}
		});
		btnNewButton_2.setBounds(150, 23, 64, 23);
		panel.add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("\uD604\uD669");
		btnNewButton_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Vacationlist view = new Vacationlist();
			}
		});
		btnNewButton_3.setFont(new Font("굴림", Font.BOLD, 12));
		btnNewButton_3.setBounds(80, 23, 64, 23);
		panel.add(btnNewButton_3);

//      for (int i = 0; i < 15; i++) {
//
//         for (int j = 0; j < numOfDay; j++) {
//            JButton btnNewButton = new JButton("");
//            panel_2.add(btnNewButton);
//            btnNewButton.setBackground(new Color(255, 255, 255));
//            btnNewButton.addMouseListener(new MouseAdapter() {
//               public void mouseClicked(MouseEvent e) {
//                  JButton buttonn = (JButton) e.getSource();
//
//                  String str = buttonn.getText();
//
//                  if (e.getClickCount() == 1) {
//                     buttonn.setBackground(new Color(255, 215, 0));
//                  }
//                  if (e.getClickCount() == 2) {
//                     buttonn.setBackground(new Color(255, 255, 255));
//                  }
//                  if (e.getClickCount() == 3) {
//                     buttonn.setBackground(new Color(255, 0, 0));
//                  }
//               }
//               
//            });
//            btnNewButton.setBounds(300 + (j * 26), x, 25,25);
//            panel.add(btnNewButton);
//         }
//         x += 30;
//      }

	}

	public void up() {

		ID.setText(Mainpa.getID22() + "");
		PW.setText(Mainpa.getCLASS22() + "");
		NAME.setText(Mainpa.getNAME22() + "");
		VACATION.setText(Mainpa.getVACATION22() + "");
	}

	private void showll() {
		String Army_id = ID.getText();
		String Vacation = VACATION.getText();
		MemberAll m = new MemberAll(Army_id, Vacation);

		// 로그인
		MemberAll UpdateVacation = service.VacationUpdate(m);// 회원정보 넘겨주기 리턴설계 로그인성공시 객체를 리턴을 받고 화면을 넘어다녀도
		// 계속유지되도록한다.
		if (UpdateVacation == null) {
			JOptionPane.showMessageDialog(frame, "등록 성공.");

		} else {
			JOptionPane.showMessageDialog(frame, "등록 실패 군번을 확인해주세요");

		}

	}

}