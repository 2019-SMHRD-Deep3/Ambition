package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import javax.swing.SwingConstants;
import java.awt.Font;

public class OrganizationChart {

	private JFrame frame;
	private JTextField textField_14;
	private JTextField textField_15;
	private JPanel panel;
	private JPanel panel_1;
	private JPanel panel_2;
	private JPanel panel_3;
	private JPanel panel_4;
	private JPanel panel_5;
	private JPanel panel_6;
	private JPanel panel_7;
	private JPanel panel_8;
	private JPanel panel_9;
	private JPanel panel_10;
	private JPanel panel_11;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_16;
	private JTextField textField_19;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField textField_29;
	private JTextField textField_30;
	private JSeparator separator;
	private JSeparator separator_1;
	private JSeparator separator_2;
	private JSeparator separator_3;
	private JSeparator separator_4;
	private JSeparator separator_5;
	private JSeparator separator_6;
	private JSeparator separator_7;
	private JSeparator separator_8;
	private JSeparator separator_9;
	private JSeparator separator_10;
	private JSeparator separator_11;
	private JSeparator separator_12;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OrganizationChart window = new OrganizationChart();
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
	public OrganizationChart() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 946, 668);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		panel = new JPanel();
		panel.setBounds(311, 43, 293, 68);
		frame.getContentPane().add(panel);
		panel.setLayout(new GridLayout(2, 0, 0, 0));
		
		textField = new JTextField();
		textField.setFont(new Font("±¼¸²", Font.BOLD, 15));
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setText("\uB300\uB300\uC7A5");
		textField.setForeground(new Color(255, 255, 255));
		textField.setBackground(new Color(0, 102, 153));
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setForeground(new Color(51, 153, 204));
		textField_1.setText("\u3147\u3139\u3147\u3139");
		textField_1.setFont(new Font("±¼¸²", Font.BOLD, 12));
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		panel_1 = new JPanel();
		panel_1.setBounds(337, 153, 234, 68);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(new GridLayout(2, 0, 0, 0));
		
		textField_3 = new JTextField();
		textField_3.setForeground(new Color(255, 255, 255));
		textField_3.setFont(new Font("±¼¸²", Font.BOLD, 15));
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setText("\uC911\uB300\uC7A5");
		textField_3.setBackground(new Color(102, 153, 204));
		panel_1.add(textField_3);
		textField_3.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setFont(new Font("±¼¸²", Font.BOLD, 12));
		textField_2.setForeground(new Color(0, 102, 204));
		textField_2.setText("\u3147\u3147\u3147");
		panel_1.add(textField_2);
		textField_2.setColumns(10);
		
		panel_2 = new JPanel();
		panel_2.setBounds(29, 282, 144, 68);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(new GridLayout(2, 0, 0, 0));
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("±¼¸²", Font.BOLD, 12));
		textField_5.setHorizontalAlignment(SwingConstants.CENTER);
		textField_5.setForeground(new Color(255, 255, 255));
		textField_5.setText("\uC218\uC1A1");
		textField_5.setBackground(new Color(102, 153, 153));
		panel_2.add(textField_5);
		textField_5.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setText("");
		panel_2.add(textField_4);
		textField_4.setColumns(10);
		
		panel_3 = new JPanel();
		panel_3.setBounds(207, 282, 144,68);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(new GridLayout(2, 0, 0, 0));
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("±¼¸²", Font.BOLD, 12));
		textField_6.setForeground(new Color(255, 255, 255));
		textField_6.setText("\uD1B5\uC2E0");
		textField_6.setHorizontalAlignment(SwingConstants.CENTER);
		textField_6.setBackground(new Color(102, 153, 153));
		panel_3.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		panel_3.add(textField_7);
		textField_7.setColumns(10);
		
		panel_4 = new JPanel();
		panel_4.setBounds(388, 282, 144, 68);
		frame.getContentPane().add(panel_4);
		panel_4.setLayout(new GridLayout(2, 0, 0, 0));
		
		textField_9 = new JTextField();
		textField_9.setForeground(new Color(255, 255, 255));
		textField_9.setFont(new Font("±¼¸²", Font.BOLD, 12));
		textField_9.setHorizontalAlignment(SwingConstants.CENTER);
		textField_9.setText("\uD0C4\uC57D");
		textField_9.setBackground(new Color(102, 153, 153));
		panel_4.add(textField_9);
		textField_9.setColumns(10);
		
		textField_8 = new JTextField();
		panel_4.add(textField_8);
		textField_8.setColumns(10);
		
		panel_5 = new JPanel();
		panel_5.setBounds(575, 282, 144, 68);
		frame.getContentPane().add(panel_5);
		panel_5.setLayout(new GridLayout(2, 0, 0, 0));
		
		textField_11 = new JTextField();
		textField_11.setFont(new Font("±¼¸²", Font.BOLD, 12));
		textField_11.setForeground(new Color(255, 255, 255));
		textField_11.setHorizontalAlignment(SwingConstants.CENTER);
		textField_11.setText("\uC758\uBB34");
		textField_11.setBackground(new Color(102, 153, 153));
		panel_5.add(textField_11);
		textField_11.setColumns(10);
		
		textField_10 = new JTextField();
		panel_5.add(textField_10);
		textField_10.setColumns(10);
		
		panel_6 = new JPanel();
		panel_6.setBounds(748, 282, 144, 68);
		frame.getContentPane().add(panel_6);
		panel_6.setLayout(new GridLayout(2, 0, 0, 0));
		
		textField_13 = new JTextField();
		textField_13.setForeground(new Color(255, 255, 255));
		textField_13.setFont(new Font("±¼¸²", Font.BOLD, 12));
		textField_13.setText("\u3147\u3147");
		textField_13.setHorizontalAlignment(SwingConstants.CENTER);
		textField_13.setBackground(new Color(102, 153, 153));
		panel_6.add(textField_13);
		textField_13.setColumns(10);
		
		textField_12 = new JTextField();
		panel_6.add(textField_12);
		textField_12.setColumns(10);
		
		panel_7 = new JPanel();
		panel_7.setBounds(39, 374, 123, 177);
		frame.getContentPane().add(panel_7);
		panel_7.setLayout(new GridLayout(0, 1, 0, 0));
		
		textField_21 = new JTextField();
		textField_21.setForeground(new Color(51, 153, 153));
		textField_21.setFont(new Font("±¼¸²", Font.BOLD, 12));
		textField_21.setHorizontalAlignment(SwingConstants.CENTER);
		textField_21.setText("\u3139\u3139\u3139\u3139");
		panel_7.add(textField_21);
		textField_21.setColumns(10);
		
		textField_22 = new JTextField();
		panel_7.add(textField_22);
		textField_22.setColumns(10);
		
		textField_23 = new JTextField();
		panel_7.add(textField_23);
		textField_23.setColumns(10);
		
		panel_8 = new JPanel();
		panel_8.setBounds(214, 374, 123, 177);
		frame.getContentPane().add(panel_8);
		panel_8.setLayout(new GridLayout(0, 1, 0, 0));
		
		textField_24 = new JTextField();
		panel_8.add(textField_24);
		textField_24.setColumns(10);
		
		textField_17 = new JTextField();
		panel_8.add(textField_17);
		textField_17.setColumns(10);
		
		textField_25 = new JTextField();
		panel_8.add(textField_25);
		textField_25.setColumns(10);
		
		panel_9 = new JPanel();
		panel_9.setBounds(400, 374, 123, 177);
		frame.getContentPane().add(panel_9);
		panel_9.setLayout(new GridLayout(0, 1, 0, 0));
		
		textField_29 = new JTextField();
		panel_9.add(textField_29);
		textField_29.setColumns(10);
		
		textField_30 = new JTextField();
		panel_9.add(textField_30);
		textField_30.setColumns(10);
		
		textField_16 = new JTextField();
		panel_9.add(textField_16);
		textField_16.setColumns(10);
		
		panel_10 = new JPanel();
		panel_10.setBounds(585, 374, 123, 177);
		frame.getContentPane().add(panel_10);
		panel_10.setLayout(new GridLayout(0, 1, 0, 0));
		
		textField_26 = new JTextField();
		panel_10.add(textField_26);
		textField_26.setColumns(10);
		
		textField_18 = new JTextField();
		panel_10.add(textField_18);
		textField_18.setColumns(10);
		
		textField_19 = new JTextField();
		panel_10.add(textField_19);
		textField_19.setColumns(10);
		
		panel_11 = new JPanel();
		panel_11.setBounds(758, 372, 123, 177);
		frame.getContentPane().add(panel_11);
		panel_11.setLayout(new GridLayout(0, 1, 0, 0));
		
		textField_27 = new JTextField();
		panel_11.add(textField_27);
		textField_27.setColumns(10);
		
		textField_28 = new JTextField();
		panel_11.add(textField_28);
		textField_28.setColumns(10);
		
		textField_20 = new JTextField();
		panel_11.add(textField_20);
		textField_20.setColumns(10);
		
		separator = new JSeparator();
		separator.setBounds(85, 244, 743, 10);
		frame.getContentPane().add(separator);
		
		separator_1 = new JSeparator();
		separator_1.setBounds(311, 252, 1, 2);
		frame.getContentPane().add(separator_1);
		
		separator_2 = new JSeparator();
		separator_2.setOrientation(SwingConstants.VERTICAL);
		separator_2.setBounds(451, 110, 21, 46);
		frame.getContentPane().add(separator_2);
		
		separator_3 = new JSeparator();
		separator_3.setOrientation(SwingConstants.VERTICAL);
		separator_3.setBounds(451, 220, 14, 62);
		frame.getContentPane().add(separator_3);
		
		separator_4 = new JSeparator();
		separator_4.setOrientation(SwingConstants.VERTICAL);
		separator_4.setBounds(85, 244, 21, 38);
		frame.getContentPane().add(separator_4);
		
		separator_5 = new JSeparator();
		separator_5.setOrientation(SwingConstants.VERTICAL);
		separator_5.setBounds(827, 244, 14, 38);
		frame.getContentPane().add(separator_5);
		
		separator_6 = new JSeparator();
		separator_6.setOrientation(SwingConstants.VERTICAL);
		separator_6.setBounds(85, 349, 14, 27);
		frame.getContentPane().add(separator_6);
		
		separator_7 = new JSeparator();
		separator_7.setOrientation(SwingConstants.VERTICAL);
		separator_7.setBounds(270, 349, 8, 27);
		frame.getContentPane().add(separator_7);
		
		separator_8 = new JSeparator();
		separator_8.setOrientation(SwingConstants.VERTICAL);
		separator_8.setBounds(451, 349, 14, 27);
		frame.getContentPane().add(separator_8);
		
		separator_9 = new JSeparator();
		separator_9.setOrientation(SwingConstants.VERTICAL);
		separator_9.setBounds(646, 349, 8, 27);
		frame.getContentPane().add(separator_9);
		
		separator_10 = new JSeparator();
		separator_10.setOrientation(SwingConstants.VERTICAL);
		separator_10.setBounds(827, 348, 14, 28);
		frame.getContentPane().add(separator_10);
		
		separator_11 = new JSeparator();
		separator_11.setOrientation(SwingConstants.VERTICAL);
		separator_11.setBounds(270, 244, 14, 38);
		frame.getContentPane().add(separator_11);
		
		separator_12 = new JSeparator();
		separator_12.setOrientation(SwingConstants.VERTICAL);
		separator_12.setBounds(646, 244, 14, 38);
		frame.getContentPane().add(separator_12);
	}
}
