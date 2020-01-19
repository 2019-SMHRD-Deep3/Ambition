package view;

import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

import controller.MemberManagementService;
import model.MemberAll;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Vacationlist {

	private JScrollPane scrollPane;
	private MemberManagementService service = new MemberManagementService();
	private JTable table;
	private JFrame frame;
	private JScrollPane scrollPane_1;
	private JLabel lblNewLabel_1;
	/**
	 * Launch the application.
	 */
//   public static void main(String[] args) {
//      EventQueue.invokeLater(new Runnable() {
//         public void run() {
//            try {
//               Vacationlist window = new Vacationlist();
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
	public Vacationlist() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1185, 484);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 1169, 445);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 74, 573, 371);
		panel.add(scrollPane);

		scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(594, 74, 573, 371);
		panel.add(scrollPane_1);

		JLabel lblNewLabel = new JLabel("\uD734\uAC00\uC790 \uBA85\uB2E8");
		lblNewLabel.setFont(new Font("±¼¸²", Font.BOLD, 15));
		lblNewLabel.setBounds(201, 36, 123, 28);
		panel.add(lblNewLabel);

		lblNewLabel_1 = new JLabel("\uD734\uAC00\uC608\uC815\uC790 \uBA85\uB2E8");
		lblNewLabel_1.setBounds(824, 36, 123, 28);
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("±¼¸²", Font.BOLD, 15));

		JButton btnNewButton = new JButton("\uB2EB\uAE30");
		btnNewButton.setBounds(1072, 10, 97, 23);
		panel.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});

		show_VacationAView();

		show_VacationAView2();
	}

	private void show_VacationAView() {
		String[] columnNames = { "Army_id", "ArmyClass", "Army_Name", "Vacation", "VacationStart", "VacationFinish"

		};
		ArrayList<MemberAll> list = service.MemberAllVacation2();
//            System.out.println(list.size());

		Object[][] data = new Object[list.size()][6];
		for (int i = 0; i < list.size(); i++) {
			MemberAll m = list.get(i);

			data[i] = new Object[] { m.getArmy_id(), m.getArmyClass(), m.getArmy_name(), m.getVacaTion(),
					m.getVACATIONSTART(), m.getVACATIONFINISH() };

		}
		table = new JTable(data, columnNames);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		TableColumn column = null;
		scrollPane.setViewportView(table);

		DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer(); // µðÆúÆ®Å×ÀÌºí¼¿·»´õ·¯¸¦ »ý¼º
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

	private void show_VacationAView2() {
		String[] columnNames = { "Army_id", "ArmyClass", "Army_Name", "Vacation", "VacationStart", "VacationFinish"

		};
		ArrayList<MemberAll> list = service.MemberAllVacation3();
//            System.out.println(list.size());

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

		DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer(); // µðÆúÆ®Å×ÀÌºí¼¿·»´õ·¯¸¦ »ý¼º
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

}