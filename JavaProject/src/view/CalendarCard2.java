package view;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.TableColumn;

import controller.MemberManagementService;
import model.Member;
import model.MemberAll;
import javax.swing.border.MatteBorder;

public class CalendarCard2 extends JPanel {
	private MemberManagementService service = new MemberManagementService();
	private JTextField ID;
	private JTextField CLASS;
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
	private JTable table;
	private JScrollPane scrollPane;
	int max = 0;
	int min = 32;

	/**
	 * Create the panel.
	 */

	/**
	 * @wbp.parser.constructor
	 */
	public CalendarCard2(String month, int numOfDay) {
		setBackground(new Color(255, 255, 255));
		setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		scrollPane.setBounds(0, 10, 975, 164);
		add(scrollPane);

		JPanel panel = new JPanel();
		panel.setBorder(null);
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

		CLASS = new JTextField();
		panel_1.add(CLASS);
		CLASS.setColumns(10);

		NAME = new JTextField();
		panel_1.add(NAME);
		NAME.setColumns(10);

		VACATION = new JTextField();
		panel_1.add(VACATION);
		VACATION.setColumns(10);

		btnNewButton_1 = new JButton("등록");

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

						System.out.println(min + 1);
						System.out.println(max + 1);
					}

				});

				Button[j].setBounds(300 + (j * 26), x, 25, 22);

				panel.add(Button[j]);

			}
			btnArray[i] = Button;
			x += 30;
		}

		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				String infoid = ID.getText();
				String infoclass = CLASS.getText();
				String infoname = NAME.getText();
				String infovacation = VACATION.getText();
				String infovacationstart = month + (min + 1) + "일";
				String infovacationFinish = month + (max + 1) + "일";

				MemberAll member = new MemberAll(infoid, infoclass, infoname, infovacation, infovacationstart,
						infovacationFinish);

				boolean result = service.memberVacationEnroll(member); // 정보는 m을 받아서 조인. 성공하면 true 실패하면false를 받기위해 불린형
																		// 타입에 넣어준다.
				if (result == true) {
					JOptionPane.showMessageDialog(frame, "등록성공");

				} else {
					JOptionPane.showMessageDialog(frame, "등록실패");
				}
			}

		});

		btnNewButton_1.setFont(new Font("굴림", Font.BOLD, 12));
		btnNewButton_1.setBounds(218, 23, 64, 23);
		panel.add(btnNewButton_1);

	}
}