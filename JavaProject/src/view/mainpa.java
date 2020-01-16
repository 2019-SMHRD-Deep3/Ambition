package view;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;
import javax.swing.table.TableColumn;

import controller.MemberManagementService;
import model.MemberAll;

public class mainpa {
	private JFrame frame;
	private CardLayout cardLayout;
	private MemberManagementService service = new MemberManagementService();
	private int[] numOfdays = { 31, 28, 30, 31, 30, 31, 31, 30, 31, 30, 31, 30 };
	private MemberAll loginUser;
	private JTable table;
	private JScrollPane scrollPane;
	private static mainpa window;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					window = new mainpa();
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
	public mainpa() {
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

		JPanel panel_2 = new JPanel();
		panel_2.setBounds(293, 0, 991, 661);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		// 추가한 공간 끝
		JPanel Attend = new JPanel();
		Attend.setBackground(new Color(240, 240, 240));
		Attend.setBounds(0, 0, 991, 661);
		panel_2.add(Attend); //주석처리는 앞에 안보이게
		Attend.setLayout(new CardLayout(0, 0));
		
				JPanel 달력패널 = new JPanel();
				달력패널.setBackground(new Color(255, 255, 255));
				Attend.add(달력패널, "name_2787805674265200");
						달력패널.setLayout(null);
				
						JPanel 달력뷰 = new JPanel();
						달력뷰.setBounds(0, 127, 988, 486);
						달력패널.add(달력뷰);
						cardLayout = new CardLayout(0, 0);
						달력뷰.setLayout(cardLayout);
						
								JButton BtnNewButton = new JButton("\uC774\uC804\uB2EC");
								BtnNewButton.setBackground(new Color(0, 0, 51));
								BtnNewButton.setFont(new Font("굴림", Font.BOLD, 12));
								BtnNewButton.setForeground(new Color(255, 255, 255));
								BtnNewButton.setBounds(389, 623, 79, 23);
								달력패널.add(BtnNewButton);
								
										JButton BtnNewButton_1 = new JButton("\uB2E4\uC74C\uB2EC");
										BtnNewButton_1.setBackground(new Color(0, 0, 51));
										BtnNewButton_1.setFont(new Font("굴림", Font.BOLD, 12));
										BtnNewButton_1.setForeground(new Color(255, 255, 255));
										BtnNewButton_1.setBounds(484, 623, 73, 23);
										달력패널.add(BtnNewButton_1);
										
										JLabel lblNewLabel_5 = new JLabel("");
										lblNewLabel_5.setBackground(new Color(255, 255, 255));
										lblNewLabel_5.setIcon(new ImageIcon("C:\\image\\33.png"));
										lblNewLabel_5.setBounds(-51, 0, 1039, 128);
										달력패널.add(lblNewLabel_5);
										BtnNewButton_1.addMouseListener(new MouseAdapter() {
											@Override
											public void mouseClicked(MouseEvent e) {
												cardLayout.next(달력뷰);
											}
										});
										BtnNewButton.addMouseListener(new MouseAdapter() {
											@Override
											public void mouseClicked(MouseEvent e) {
												cardLayout.previous(달력뷰);
											}
										});

		JPanel MainView = new JPanel();
		MainView.setBackground(new Color(255, 255, 255));
		MainView.setBounds(0, 0, 991, 661);
		panel_2.add(MainView);
		MainView.setLayout(null);

		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\image\\\uBE44\uD589\uAE301.png"));
		lblNewLabel_2.setBounds(-102, 0, 1093, 661);
		MainView.add(lblNewLabel_2);

		JPanel LocationInfo = new JPanel();
		LocationInfo.setBounds(0, 0, 991, 661);
		panel_2.add(LocationInfo);
		LocationInfo.setBackground(new Color(255, 255, 255));
		LocationInfo.setLayout(null);

		JLabel lblClick = new JLabel("\u261CClick");
		lblClick.setBackground(new Color(255, 250, 250));
		lblClick.setForeground(new Color(199, 21, 133));
		lblClick.setFont(new Font("맑은 고딕", Font.BOLD, 22));
		lblClick.setBounds(758, 262, 94, 28);
		LocationInfo.add(lblClick);

		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\image\\\uC624\uC2DC\uB294\uAE382.png"));
		lblNewLabel_3.setBounds(0, 0, 991, 661);
		LocationInfo.add(lblNewLabel_3);

		JButton btnNewButton = new JButton("");
		btnNewButton.setBounds(677, 252, 120, 65);
		LocationInfo.add(btnNewButton);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("함초롬바탕", Font.PLAIN, 13));
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Desktop d = Desktop.getDesktop();
				try {
					d.browse(new URI(
						"https://map.naver.com/v5/search/%EA%B4%91%EC%A3%BC%EA%B4%91%EC%97%AD%EC%8B%9C%20%EB%82%A8%EA%B5%AC%20%EC%86%A1%EC%95%94%EB%A1%9C%2060%20%EA%B4%91%EC%A3%BCCGI%EC%84%BC%ED%84%B0?c=14123855.5344141,4178896.8350967,17,0,0,0,dh"));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (URISyntaxException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setBorder(new MatteBorder(0, 0, 0, 0, (Color) new Color(0, 0, 0)));
		btnNewButton.setEnabled(false);
		btnNewButton.setBackground(new Color(0, 0, 0, 0));

		JPanel UnitIntroduce = new JPanel();
		UnitIntroduce.setBackground(new Color(214, 220, 229));
		UnitIntroduce.setBounds(0, 0, 991, 661);
		panel_2.add(UnitIntroduce);
		UnitIntroduce.setLayout(null);

		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\image\\\uCC28\uC900\uC12D\uC6D0\uC7A5.png"));
		lblNewLabel_4.setBounds(0, 0, 991, 661);
		UnitIntroduce.add(lblNewLabel_4);

		JPanel HumanMangement = new JPanel();
		HumanMangement.setBackground(Color.WHITE);
		HumanMangement.setBounds(0, 0, 991, 661);
		panel_2.add(HumanMangement);
		HumanMangement.setLayout(null);// 추가한것

		// 추가한공간 시작
		JButton btnNewButton_1 = new JButton("\uB4F1\uB85D");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Enroll join = new Enroll(window);

			}
		});
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setBounds(900, 150, 80, 23);
		HumanMangement.add(btnNewButton_1);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 200, 991, 461);
		HumanMangement.add(scrollPane);

		show();

		for (int i = 0; i < 12; i++) {
			달력뷰.add(new CalendarCard((i + 1) + "월", numOfdays[i]));
		}

		JPanel OrganizationChart = new JPanel();
		OrganizationChart.setBackground(new Color(102, 255, 255));
		OrganizationChart.setBounds(0, 0, 991, 661);
		panel_2.add(OrganizationChart);
		OrganizationChart.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 51));
		panel.setForeground(new Color(0, 0, 51));
		panel.setBounds(0, 0, 292, 661);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("ARMY HR SYSTEM");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				panel_2.removeAll();
				panel_2.add(MainView);
				panel_2.repaint();
				panel_2.revalidate();

			}
		});
		lblNewLabel.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 23));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(61, 15, 202, 77);
		panel.add(lblNewLabel);

		JLabel label = new JLabel("\uC778\uC6D0\uAD00\uB9AC");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				panel_2.removeAll();
				panel_2.add(HumanMangement);
				panel_2.repaint();
				panel_2.revalidate();
			}
		});
		label.setFont(new Font("굴림", Font.BOLD, 16));
		label.setForeground(new Color(255, 255, 255));
		label.setBounds(24, 274, 192, 67);
		panel.add(label);

		JLabel label_1 = new JLabel("\uCD9C\uD0C0\uAD00\uB9AC");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				panel_2.removeAll();
				panel_2.add(Attend);
				panel_2.repaint();
				panel_2.revalidate();
			}
		});
		label_1.setFont(new Font("굴림", Font.BOLD, 16));
		label_1.setForeground(new Color(255, 255, 255));
		label_1.setBounds(24, 365, 192, 67);
		panel.add(label_1);

		JLabel label_2 = new JLabel("\uC624\uC2DC\uB294 \uAE38");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_2.removeAll();
				panel_2.add(LocationInfo);
				panel_2.repaint();
				panel_2.revalidate();
			}
		});
		label_2.setFont(new Font("굴림", Font.BOLD, 16));
		label_2.setForeground(new Color(255, 255, 255));
		label_2.setBounds(24, 463, 192, 67);
		panel.add(label_2);

		JLabel label_3 = new JLabel("\uC870\uC9C1\uB3C4");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_2.removeAll();
				panel_2.add(OrganizationChart);
				panel_2.repaint();
				panel_2.revalidate();
			}
		});
		label_3.setFont(new Font("굴림", Font.BOLD, 16));
		label_3.setForeground(Color.WHITE);
		label_3.setBounds(24, 552, 192, 67);
		panel.add(label_3);

		JLabel 로그인이름창 = new JLabel("000");
		로그인이름창.setHorizontalAlignment(SwingConstants.RIGHT);
		로그인이름창.setFont(new Font("굴림", Font.PLAIN, 16));
		로그인이름창.setForeground(new Color(255, 255, 255));
		로그인이름창.setBounds(52, 101, 54, 30);
		panel.add(로그인이름창);

		JLabel 환영합니다 = new JLabel("\uB2D8 \uD658\uC601\uD569\uB2C8\uB2E4.");
		환영합니다.setHorizontalAlignment(SwingConstants.LEFT);
		환영합니다.setFont(new Font("굴림", Font.PLAIN, 15));
		환영합니다.setForeground(new Color(255, 255, 255));
		환영합니다.setBounds(107, 102, 156, 30);
		panel.add(환영합니다);

		JLabel label_4 = new JLabel("\uBD80\uB300\uC18C\uAC1C");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_2.removeAll();
				panel_2.add(UnitIntroduce);
				panel_2.repaint();
				panel_2.revalidate();
			}
		});
		label_4.setFont(new Font("굴림체", Font.BOLD, 16));
		label_4.setForeground(Color.WHITE);
		label_4.setBounds(24, 174, 192, 67);
		panel.add(label_4);

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\image\\\uC2A4\uB9C8\uD2B8\uBBF8\uB514\uC5B4\uB85C\uACE0.png"));
		lblNewLabel_1.setBounds(4, 28, 57, 61);
		panel.add(lblNewLabel_1);
	}

	public void show() {
		String[] columnNames = { "Army_id", "ArmyClass", "Mos", "Army_Name", "Army_Birth", "Sex", "AddRess",
				"BloodType", "Vacation", "Enlist", "Discharge"

		};
		ArrayList<MemberAll> list = service.MemberAllLookup();

		Object[][] data = new Object[list.size()][11];
		for (int i = 0; i < list.size(); i++) {
			MemberAll m = list.get(i);
			data[i] = new Object[] { m.getArmy_id(), m.getArmyClass(),m.getMos(), m.getArmy_name(), m.getArmy_birth(), m.getSex(),m.getAddress(),
					m.getBloodType(),   m.getVacaTion(), m.getEnlist(), m.getDischarge() };
		}
		table = new JTable(data, columnNames);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		TableColumn column = null;
		for (int i = 0; i < 11; i++) {
			column = table.getColumnModel().getColumn(i);
			if (i == 2 || i == 5) {
				column.setPreferredWidth(50); // third column is bigger
			} else {
				column.setPreferredWidth(100);
			}
		}
		scrollPane.setViewportView(table);
	}
}
