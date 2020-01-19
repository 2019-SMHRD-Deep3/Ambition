package view;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

import controller.MemberManagementService;
import model.Member;
import model.MemberAll;
import model.MemberDAO;

public class Mainpa {
	MemberDAO dao = new MemberDAO();
	private JFrame frame;
	private CardLayout cardLayout;
	private CardLayout cardlayout;
	private MemberManagementService service = new MemberManagementService();
	private int[] numOfdays = { 31, 28, 30, 31, 30, 31, 31, 30, 31, 30, 31, 30 };
	private Member loginUser;
	private JTable table;
	private JScrollPane scrollPane;
	private static Mainpa window;
	String SArmyClass;
	String SArmyMos;
	String nameselect;
	String SArmyDelete;
	String Army_nameDelte; // 테이블선택값 가지고있음.
	static int index1;
	static String ID;
	static String CLASS;
	static String MOS;
	static String NAME;
	static String BIRTH;
	static String SEX;
	static String ADDRESS;
	static String BLOODTYPE;
	static String VACATION;
	static String ENLIST;
	static String DISCHARGE;
	static String RANK;
	static int index2;

	static String ID22;
	static String CLASS22;
	static String NAME22;
	static String VACATION22;

	static String IDVacation;

	private JTextField textField;
	private JPanel panel_1;
	private JScrollPane scrollPane_1;

	/**
	 * Launch the application.
	 */
//   public static void main(String[] args) {
//      EventQueue.invokeLater(new Runnable() {
//         public void run() {
//            try {
//               window = new mainpa();
//               window.frame.setVisible(true);
//            } catch (Exception e) {
//               e.printStackTrace();
//            }
//         }
//      });
//   }

	/**
	 * Create the application.
	 */
	public Mainpa(Member loginUser) {
		this.loginUser = loginUser;
		initialize();
		frame.setVisible(true);
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
	      
	      JPanel LocationView = new JPanel();
	      LocationView.setBounds(0, 127, 988, 456);
	      LocationInfo.add(LocationView);
	      cardlayout = new CardLayout(0, 0);
	      LocationView.setLayout(cardlayout);
	       
        지도창_1 지도창_1 = new 지도창_1();
        LocationView.add(지도창_1);
	      

	      
	      JLabel 뷰 = new JLabel("");
	      뷰.setIcon(new ImageIcon("C:\\image\\\uB178\uC120\uCD5C\uC885.PNG"));
	      뷰.setBounds(0, 0, 991, 127);
	      LocationInfo.add(뷰);


		JPanel UnitIntroduce = new JPanel();
		UnitIntroduce.setBackground(new Color(214, 220, 229));
		UnitIntroduce.setBounds(0, 0, 991, 661);
		panel_2.add(UnitIntroduce);
		UnitIntroduce.setLayout(null);

		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\image\\\uB300\uB300\uC7A5\uC778\uC0AC\uB9D0.png"));
		lblNewLabel_4.setBounds(0, 0, 991, 661);
		UnitIntroduce.add(lblNewLabel_4);

		JPanel HumanMangement = new JPanel();
		HumanMangement.setBackground(Color.WHITE);
		HumanMangement.setBounds(0, 0, 991, 661);
//         panel_2.add(HumanMangement);
		HumanMangement.setLayout(null);// 추가한것

		// 추가한공간 시작
		JButton btnNewButton_1 = new JButton("\uB4F1\uB85D");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Enroll join = new Enroll(window);

			}
		});

		JButton btnNewButton_3 = new JButton("수정");
		btnNewButton_3.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				index1 = table.getSelectedRow();
				ID = (String) table.getValueAt(index1, 0);
				CLASS = (String) table.getValueAt(index1, 1);
				MOS = (String) table.getValueAt(index1, 2);
				NAME = (String) table.getValueAt(index1, 3);
				BIRTH = (String) table.getValueAt(index1, 4);
				SEX = (String) table.getValueAt(index1, 5);
				ADDRESS = (String) table.getValueAt(index1, 6);
				BLOODTYPE = (String) table.getValueAt(index1, 7);
				VACATION = (String) table.getValueAt(index1, 8);
				ENLIST = (String) table.getValueAt(index1, 9);
				DISCHARGE = (String) table.getValueAt(index1, 10);
				RANK = (String) table.getValueAt(index1, 11);
				Update join = new Update(window);

//         System.out.println(ID);

			}

		});

		JButton btnNewButton_4 = new JButton("삭제");
		btnNewButton_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int result = JOptionPane.showConfirmDialog(null, "삭제하시겠습니까?", "Confirm", JOptionPane.YES_NO_OPTION);
				if (result == JOptionPane.CLOSED_OPTION) {

				} else if (result == JOptionPane.YES_OPTION) {
//               예를 선택한경우
					int index = table.getSelectedRow();
					Army_nameDelte = (String) table.getValueAt(index, 0);

//               System.out.println(table.getValueAt(index, 0));
					showDelete();

				} else {
//               아니오를 선택한 경우
				}

			}
		});
		btnNewButton_4.setFont(new Font("굴림체", Font.BOLD, 12));
		btnNewButton_4.setBackground(Color.WHITE);
		btnNewButton_4.setBounds(890, 170, 80, 23);
		HumanMangement.add(btnNewButton_4);

		btnNewButton_3.setBackground(Color.WHITE);
		btnNewButton_3.setBounds(800, 170, 80, 23);
		HumanMangement.add(btnNewButton_3);

		JButton btnNewButton_2 = new JButton("\uC774\uB984");
		btnNewButton_2.setBounds(270, 170, 60, 21);

		HumanMangement.add(btnNewButton_2);

		JButton btnNewButton_5 = new JButton("조회");
		btnNewButton_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				show();
			}
		});
		btnNewButton_5.setBounds(620, 170, 80, 23);
		btnNewButton_5.setBackground(Color.WHITE);
		HumanMangement.add(btnNewButton_5);
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setBounds(710, 170, 80, 23);
		HumanMangement.add(btnNewButton_1);

		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setIcon(new ImageIcon("C:\\image\\\uC778\uC6D0\uAD00\uB9AC.png"));
		lblNewLabel_7.setBounds(0, 0, 991, 151);
		HumanMangement.add(lblNewLabel_7);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 200, 991, 461);
		HumanMangement.add(scrollPane);

		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "\uACC4\uAE09", "\uC774\uB4F1\uBCD1", "\uC77C\uBCD1",
				"\uC0C1\uBCD1", "\uBCD1\uC7A5", "\uD558\uC0AC", "\uC911\uC0AC", "\uC0C1\uC0AC", "\uC18C\uC704",
				"\uC911\uC704", "\uB300\uC704", "\uC18C\uB839", "\uC911\uB839" }));
		comboBox.setBounds(100, 170, 70, 21);
		HumanMangement.add(comboBox);

		comboBox.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				if (e.getStateChange() == 1) {

					SArmyClass = (String) e.getItem();
					show_SArmyClass();
				}

			}
		});

		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] { "병과", "수송", "작전", "통신", "의무", "탄약" }));
		comboBox_1.setBounds(200, 170, 60, 21);
		HumanMangement.add(comboBox_1);

		comboBox_1.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				if (e.getStateChange() == 1) {

					SArmyMos = (String) e.getItem();
					show_SArmyMos();
				}

			}
		});

		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			@Override
			// 엔터쳤을때 실행되게.
			public void keyTyped(KeyEvent e) {
				if (KeyEvent.VK_ENTER == e.getKeyChar()) {
					nameselect = textField.getText();
					show_SArmyName();
				}
			}
		});
		textField.setBounds(330, 170, 70, 22);
		HumanMangement.add(textField);
		textField.setColumns(10);

		show();
		// 추가한 공간 끝
		JPanel Attend = new JPanel();
		Attend.setBackground(new Color(240, 240, 240));
		Attend.setBounds(0, 0, 991, 661);
//      panel_2.add(Attend); //주석처리는 앞에 안보이게
		Attend.setLayout(new CardLayout(0, 0));

		JPanel 달력패널 = new JPanel();
		달력패널.setBackground(new Color(255, 255, 255));
		Attend.add(달력패널, "name_2787805674265200");
		달력패널.setLayout(null);

		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(573, 300, 400, 300);
		달력패널.add(panel_3);
		panel_3.setLayout(null);

		JButton btnNewButton_6 = new JButton("\uC0AD\uC81C");

		btnNewButton_6.addMouseListener(new MouseAdapter() {

			private String Army_ID;

			@Override
			public void mouseClicked(MouseEvent e) {

				int result = JOptionPane.showConfirmDialog(null, "삭제하시겠습니까?", "Confirm", JOptionPane.YES_NO_OPTION);
				if (result == JOptionPane.CLOSED_OPTION) {

				} else if (result == JOptionPane.YES_OPTION) {
//                              예를 선택한경우
					int index = table.getSelectedRow();
					IDVacation = (String) table.getValueAt(index, 0);

//                              System.out.println(table.getValueAt(index, 0));
					showDeleteVacation();

				} else {
//                              아니오를 선택한 경우
				}

//                        index1 = table.getSelectedRow();
//                        IDVacation = (String)table.getValueAt(index1, 0);
			}
		});
		btnNewButton_6.setFont(new Font("굴림", Font.BOLD, 12));
		btnNewButton_6.setBackground(Color.WHITE);
		btnNewButton_6.setBounds(100, 0, 68, 23);
		panel_3.add(btnNewButton_6);

		JButton btnNewButton_7 = new JButton("\uC704\uB85C");
		btnNewButton_7.setBackground(Color.WHITE);
		btnNewButton_7.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {

				index2 = table.getSelectedRow();
				ID22 = (String) table.getValueAt(index2, 0);
				CLASS22 = (String) table.getValueAt(index2, 1);
				NAME22 = (String) table.getValueAt(index2, 2);
				VACATION22 = (String) table.getValueAt(index2, 3);

			}
		});
		btnNewButton_7.setBounds(20, 0, 68, 23);
		panel_3.add(btnNewButton_7);

		JPanel 달력뷰 = new JPanel();
		달력뷰.setBounds(0, 50, 988, 184);
		달력패널.add(달력뷰);
		cardLayout = new CardLayout(0, 0);
		달력뷰.setLayout(cardLayout);

		for (int i = 0; i < 12; i++) {
			if (i < 9) {

				달력뷰.add(new CalendarCard("0" + (i + 1), numOfdays[i]));
			} else {

				달력뷰.add(new CalendarCard((i + 1) + "", numOfdays[i]));
			}
		}

		JButton BtnNewButton = new JButton("\uC774\uC804\uB2EC");
		BtnNewButton.setBackground(new Color(0, 0, 51));
		BtnNewButton.setFont(new Font("굴림", Font.BOLD, 12));
		BtnNewButton.setForeground(new Color(255, 255, 255));
		BtnNewButton.setBounds(389, 250, 79, 23);
		달력패널.add(BtnNewButton);

		JButton BtnNewButton_1 = new JButton("\uB2E4\uC74C\uB2EC");
		BtnNewButton_1.setBackground(new Color(0, 0, 51));
		BtnNewButton_1.setFont(new Font("굴림", Font.BOLD, 12));
		BtnNewButton_1.setForeground(new Color(255, 255, 255));
		BtnNewButton_1.setBounds(484, 250, 73, 23);
		달력패널.add(BtnNewButton_1);

		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setBackground(new Color(255, 255, 255));
		lblNewLabel_5.setIcon(new ImageIcon("C:\\image\\\uCD9C\uD0C0\uAD00\uB9AC3.png"));
		lblNewLabel_5.setBounds(0, 0, 991, 128);

		scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(0, 300, 573, 300);
		scrollPane_1.setBackground(Color.WHITE);

		달력패널.add(scrollPane_1);

		달력패널.add(lblNewLabel_5);

		JLabel lblNewLabel_8 = new JLabel("출타신청현황");
		lblNewLabel_8.setFont(new Font("굴림", Font.BOLD, 16));
		lblNewLabel_8.setBounds(20, 250, 150, 25);
		달력패널.add(lblNewLabel_8);

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

		for (int i = 0; i < 12; i++) {
			달력뷰.add(new CalendarCard((i + 1) + "월", numOfdays[i]));
		}

		JPanel OrganizationChart = new JPanel();
		OrganizationChart.setLayout(new CardLayout(0, 0));
		PanelTest panelTest = new PanelTest();
		OrganizationChart.add(panelTest, "name_2878821101757000");

		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setBounds(0, 0, 991, 130);
		panelTest.add(lblNewLabel_6);
		lblNewLabel_6.setIcon(new ImageIcon("C:\\image\\\uC870\uC9C1\uB3C4.png"));
		OrganizationChart.setBackground(Color.WHITE);
		OrganizationChart.setBounds(0, 0, 991, 661);
		panel_2.add(OrganizationChart);

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
				show_VacationAView();

			}
		});
		label_1.setFont(new Font("굴림", Font.BOLD, 16));
		label_1.setForeground(new Color(255, 255, 255));
		label_1.setBounds(24, 365, 192, 67);
		panel.add(label_1);

		JLabel label_2 = new JLabel("\uB178\uC120\uC815\uBCF4");
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

		JLabel 로그인이름창 = new JLabel(loginUser.getArmy_id());
		로그인이름창.setHorizontalAlignment(SwingConstants.RIGHT);
		로그인이름창.setFont(new Font("굴림", Font.PLAIN, 16));
		로그인이름창.setForeground(new Color(255, 255, 255));
		로그인이름창.setBounds(24, 102, 94, 30);
		panel.add(로그인이름창);

		JLabel 환영합니다 = new JLabel("\uB2D8 \uD658\uC601\uD569\uB2C8\uB2E4.");
		환영합니다.setHorizontalAlignment(SwingConstants.LEFT);
		환영합니다.setFont(new Font("굴림", Font.PLAIN, 15));
		환영합니다.setForeground(new Color(255, 255, 255));
		환영합니다.setBounds(134, 102, 156, 30);
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

	public static int getIndex1() {
		return index1;
	}

	public void setIndex1(int index1) {
		this.index1 = index1;
	}

	public static String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public static String getCLASS() {
		return CLASS;
	}

	public void setCLASS(String cLASS) {
		CLASS = cLASS;
	}

	public static String getMOS() {
		return MOS;
	}

	public void setMOS(String mOS) {
		MOS = mOS;
	}

	public static String getNAME() {
		return NAME;
	}

	public void setNAME(String nAME) {
		NAME = nAME;
	}

	public static String getBIRTH() {
		return BIRTH;
	}

	public void setBIRTH(String bIRTH) {
		BIRTH = bIRTH;
	}

	public static String getSEX() {
		return SEX;
	}

	public void setSEX(String sEX) {
		SEX = sEX;
	}

	public static String getADDRESS() {
		return ADDRESS;
	}

	public void setADDRESS(String aDDRESS) {
		ADDRESS = aDDRESS;
	}

	public static String getBLOODTYPE() {
		return BLOODTYPE;
	}

	public void setBLOODTYPE(String bLOODTYPE) {
		BLOODTYPE = bLOODTYPE;
	}

	public static String getVACATION() {
		return VACATION;
	}

	public void setVACATION(String vACATION) {
		VACATION = vACATION;
	}

	public static String getENLIST() {
		return ENLIST;
	}

	public void setENLIST(String eNLIST) {
		ENLIST = eNLIST;
	}

	public static String getDISCHARGE() {
		return DISCHARGE;
	}

	public void setDISCHARGE(String dISCHARGE) {
		DISCHARGE = dISCHARGE;
	}

	public static String getRANK() {
		return RANK;
	}

	public void setRANK(String rANK) {
		RANK = rANK;
	}

	protected void showDelete() {
		String[] columnNames = { "Army_id", "ArmyClass", "Mos", "Army_Name", "Army_Birth", "Sex", "AddRess",
				"BloodType", "Vacation", "Enlist", "Discharge", "Salary"

		};
		dao.selectDelete(Army_nameDelte);
		show();
	}

	protected void showDeleteVacation() {
		String[] columnNames = { "Army_id", "ArmyClass", "Army_Name", "Vacation", "VacationStart", "VacationFinish"

		};
		dao.VacationDelete(IDVacation);
		show_VacationAView();
	}

	protected void show_SArmyClass() {
		String[] columnNames = { "Army_id", "ArmyClass", "Mos", "Army_Name", "Army_Birth", "Sex", "AddRess",
				"BloodType", "Vacation", "Enlist", "Discharge", "Salary"

		};
		ArrayList<MemberAll> list = dao.selectClass(SArmyClass);

		Object[][] data = new Object[list.size()][12];
		for (int i = 0; i < list.size(); i++) {
			MemberAll m = list.get(i);
			data[i] = new Object[] { m.getArmy_id(), m.getArmyClass(), m.getMos(), m.getArmy_name(), m.getArmy_birth(),
					m.getSex(), m.getAddress(), m.getBloodType(), m.getVacaTion(), m.getEnlist(), m.getDischarge(),
					m.getRANK() };
		}
		table = new JTable(data, columnNames);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		TableColumn column = null;

		DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer(); // 디폴트테이블셀렌더러를 생성
		dtcr.setHorizontalAlignment(SwingConstants.CENTER);
		TableColumnModel tcm = table.getColumnModel();

		tcm.getColumn(1).setCellRenderer(dtcr);
		tcm.getColumn(2).setCellRenderer(dtcr);
		tcm.getColumn(3).setCellRenderer(dtcr);
		tcm.getColumn(4).setCellRenderer(dtcr);
		tcm.getColumn(5).setCellRenderer(dtcr);
		tcm.getColumn(7).setCellRenderer(dtcr);
		tcm.getColumn(8).setCellRenderer(dtcr);

		for (int i = 0; i < 12; i++) {
			column = table.getColumnModel().getColumn(i);
			if (i == 5) {
				column.setPreferredWidth(50); // third column is bigger
			} else if (i == 6) {
				column.setPreferredWidth(140);
			} else if (i == 4 || i == 2) {
				column.setPreferredWidth(70);
			} else {
				column.setPreferredWidth(100);
			}
		}
		scrollPane.setViewportView(table);
	}

	protected void show_SArmyMos() {
		String[] columnNames = { "Army_id", "ArmyClass", "Mos", "Army_Name", "Army_Birth", "Sex", "AddRess",
				"BloodType", "Vacation", "Enlist", "Discharge", "Salary"

		};
		ArrayList<MemberAll> list = dao.selectMos(SArmyMos);

		Object[][] data = new Object[list.size()][12];
		for (int i = 0; i < list.size(); i++) {
			MemberAll m = list.get(i);
			data[i] = new Object[] { m.getArmy_id(), m.getArmyClass(), m.getMos(), m.getArmy_name(), m.getArmy_birth(),
					m.getSex(), m.getAddress(), m.getBloodType(), m.getVacaTion(), m.getEnlist(), m.getDischarge(),
					m.getRANK() };
		}
		table = new JTable(data, columnNames);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		TableColumn column = null;

		DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer(); // 디폴트테이블셀렌더러를 생성
		dtcr.setHorizontalAlignment(SwingConstants.CENTER);
		TableColumnModel tcm = table.getColumnModel();

		tcm.getColumn(1).setCellRenderer(dtcr);
		tcm.getColumn(2).setCellRenderer(dtcr);
		tcm.getColumn(3).setCellRenderer(dtcr);
		tcm.getColumn(4).setCellRenderer(dtcr);
		tcm.getColumn(5).setCellRenderer(dtcr);
		tcm.getColumn(7).setCellRenderer(dtcr);
		tcm.getColumn(8).setCellRenderer(dtcr);

		for (int i = 0; i < 12; i++) {
			column = table.getColumnModel().getColumn(i);
			if (i == 5) {
				column.setPreferredWidth(50); // third column is bigger
			} else if (i == 6) {
				column.setPreferredWidth(140);
			} else if (i == 4 || i == 2) {
				column.setPreferredWidth(70);
			} else {
				column.setPreferredWidth(100);
			}
		}
		scrollPane.setViewportView(table);
	}

	protected void show_SArmyName() {
		String[] columnNames = { "Army_id", "ArmyClass", "Mos", "Army_Name", "Army_Birth", "Sex", "AddRess",
				"BloodType", "Vacation", "Enlist", "Discharge", "Salary"

		};
		ArrayList<MemberAll> list = dao.selectName(nameselect);

		Object[][] data = new Object[list.size()][12];
		for (int i = 0; i < list.size(); i++) {
			MemberAll m = list.get(i);
			data[i] = new Object[] { m.getArmy_id(), m.getArmyClass(), m.getMos(), m.getArmy_name(), m.getArmy_birth(),
					m.getSex(), m.getAddress(), m.getBloodType(), m.getVacaTion(), m.getEnlist(), m.getDischarge(),
					m.getRANK() };
		}
		table = new JTable(data, columnNames);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		TableColumn column = null;

		DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer(); // 디폴트테이블셀렌더러를 생성
		dtcr.setHorizontalAlignment(SwingConstants.CENTER);
		TableColumnModel tcm = table.getColumnModel();

		tcm.getColumn(1).setCellRenderer(dtcr);
		tcm.getColumn(2).setCellRenderer(dtcr);
		tcm.getColumn(3).setCellRenderer(dtcr);
		tcm.getColumn(4).setCellRenderer(dtcr);
		tcm.getColumn(5).setCellRenderer(dtcr);
		tcm.getColumn(7).setCellRenderer(dtcr);
		tcm.getColumn(8).setCellRenderer(dtcr);

		for (int i = 0; i < 12; i++) {
			column = table.getColumnModel().getColumn(i);
			if (i == 5) {
				column.setPreferredWidth(50); // third column is bigger
			} else if (i == 6) {
				column.setPreferredWidth(140);
			} else if (i == 4 || i == 2) {
				column.setPreferredWidth(70);
			} else {
				column.setPreferredWidth(100);
			}
		}
		scrollPane.setViewportView(table);
	}

	public void show() {
		String[] columnNames = { "Army_id", "ArmyClass", "Mos", "Army_Name", "Army_Birth", "Sex", "AddRess",
				"BloodType", "Vacation", "Enlist", "Discharge", "Salary"

		};
		ArrayList<MemberAll> list = service.MemberAllLookup();

		Object[][] data = new Object[list.size()][12];

		for (int i = 0; i < list.size(); i++) {
			MemberAll m = list.get(i);

			data[i] = new Object[] { m.getArmy_id(), m.getArmyClass(), m.getMos(), m.getArmy_name(), m.getArmy_birth(),
					m.getSex(), m.getAddress(), m.getBloodType(), m.getVacaTion(), m.getEnlist(), m.getDischarge(),
					m.getRANK() };
		}
		table = new JTable(data, columnNames);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		TableColumn column = null;

		DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer(); // 디폴트테이블셀렌더러를 생성
		dtcr.setHorizontalAlignment(SwingConstants.CENTER);
		TableColumnModel tcm = table.getColumnModel();

		tcm.getColumn(1).setCellRenderer(dtcr);
		tcm.getColumn(2).setCellRenderer(dtcr);
		tcm.getColumn(3).setCellRenderer(dtcr);
		tcm.getColumn(4).setCellRenderer(dtcr);
		tcm.getColumn(5).setCellRenderer(dtcr);
		tcm.getColumn(7).setCellRenderer(dtcr);
		tcm.getColumn(8).setCellRenderer(dtcr);

		for (int i = 0; i < 12; i++) {
			column = table.getColumnModel().getColumn(i);
			if (i == 5) {
				column.setPreferredWidth(50); // third column is bigger
			} else if (i == 6) {
				column.setPreferredWidth(140);
			} else if (i == 2 || i == 4) {
				column.setPreferredWidth(70);
			} else {
				column.setPreferredWidth(100);
			}
		}
		scrollPane.setViewportView(table);
	}

	private void show_VacationAView() {
		String[] columnNames = { "Army_id", "ArmyClass", "Army_Name", "Vacation", "VacationStart", "VacationFinish"

		};
		ArrayList<MemberAll> list = service.MemberAllVacation();
//         System.out.println(list.size());

		Object[][] data = new Object[list.size()][6];
		for (int i = 0; i < list.size(); i++) {
			MemberAll m = list.get(i);

			data[i] = new Object[] { m.getArmy_id(), m.getArmyClass(), m.getArmy_name(), m.getVacaTion(),
					m.getVACATIONSTART(), m.getVACATIONFINISH() };

		}
		table = new JTable(data, columnNames);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		TableColumn column = null;
		scrollPane_1.setViewportView(table);

		DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer(); // 디폴트테이블셀렌더러를 생성
		dtcr.setHorizontalAlignment(SwingConstants.CENTER);
		TableColumnModel tcm = table.getColumnModel();

		tcm.getColumn(0).setCellRenderer(dtcr);
		tcm.getColumn(1).setCellRenderer(dtcr);
		tcm.getColumn(2).setCellRenderer(dtcr);
		tcm.getColumn(3).setCellRenderer(dtcr);
		tcm.getColumn(4).setCellRenderer(dtcr);
		tcm.getColumn(5).setCellRenderer(dtcr);

		for (int i = 0; i < 6; i++) {
			column = table.getColumnModel().getColumn(i);
			if (i == 5) {
				column.setPreferredWidth(90);
			} else if (i == 6) {
				column.setPreferredWidth(140);
			} else if (i == 2 || i == 4) {
				column.setPreferredWidth(90);
			} else {
				column.setPreferredWidth(100);
			}
		}

	}

	public static String getID22() {
		return ID22;
	}

	public static void setID22(String iD22) {
		ID22 = iD22;
	}

	public static String getCLASS22() {
		return CLASS22;
	}

	public static void setCLASS22(String cLASS22) {
		CLASS22 = cLASS22;
	}

	public static String getNAME22() {
		return NAME22;
	}

	public static void setNAME22(String nAME22) {
		NAME22 = nAME22;
	}

	public static String getVACATION22() {
		return VACATION22;
	}

	public static void setVACATION22(String vACATION22) {
		VACATION22 = vACATION22;
	}

	public static String getIDVacation() {
		return IDVacation;
	}

	public static void setIDVacation(String iDVacation) {
		IDVacation = iDVacation;
	}
}