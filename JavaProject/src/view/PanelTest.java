package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;

public class PanelTest extends JPanel {

	/**
	 * Create the panel.
	 */
	public PanelTest() {
	      this.setBackground(Color.WHITE);

	      this.setBounds(100, 100, 970, 676);
	      this.setLayout(null);
	      
	      JScrollPane scrollPane = new JScrollPane();
	      scrollPane.setBounds(0, 150, 986, 510);
	      this.add(scrollPane);
	      
	      JPanel panel_19 = new JPanel();
	      panel_19.setBackground(Color.WHITE);
	      panel_19.setPreferredSize(new Dimension(850, 700));
	      scrollPane.setViewportView(panel_19);
	      panel_19.setLayout(null);
	      
	      JPanel panel_1 = new JPanel();
	      panel_1.setBounds(377, 254, 147, 24);
	      panel_19.add(panel_1);
	      panel_1.setBackground(new Color(102, 153, 204));
	      panel_1.setLayout(null);
	      
	      JSeparator separator_4 = new JSeparator();
	      separator_4.setBounds(81, 5, 0, 2);
	      panel_1.add(separator_4);
	      
	      JLabel lblNewLabel_2 = new JLabel("\uC911\uB300\uC7A5");
	      lblNewLabel_2.setForeground(new Color(255, 255, 255));
	      lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
	      lblNewLabel_2.setFont(new Font("±¼¸²", Font.BOLD, 15));
	      lblNewLabel_2.setBounds(46, 6, 57, 15);
	      panel_1.add(lblNewLabel_2);
	      
	      JPanel panel_2 = new JPanel();
	      panel_2.setBounds(20, 410, 85, 24);
	      panel_19.add(panel_2);
	      panel_2.setBackground(new Color(102, 153, 153));
	      panel_2.setLayout(null);
	      
	      JLabel label_4 = new JLabel("\uC218\uC1A1");
	      label_4.setHorizontalAlignment(SwingConstants.CENTER);
	      label_4.setForeground(new Color(255, 250, 250));
	      label_4.setFont(new Font("±¼¸²", Font.BOLD, 13));
	      label_4.setBounds(4, 0, 73, 25);
	      panel_2.add(label_4);
	      
	      JPanel panel_7 = new JPanel();
	      panel_7.setBounds(10, 464, 107, 196);
	      panel_19.add(panel_7);
	      
	      JSeparator separator_8 = new JSeparator();
	      separator_8.setBounds(60, 433, 1, 30);
	      panel_19.add(separator_8);
	      separator_8.setOrientation(SwingConstants.VERTICAL);
	      
	      JPanel panel = new JPanel();
	      panel.setBounds(21, 313, 80, 90);
	      panel_19.add(panel);
	      panel.setLayout(null);
	      
	      JLabel lbl2 = new JLabel("");
	      lbl2.setBounds(0, 0, 80, 90);
	      panel.add(lbl2);
	      lbl2.addMouseListener(new MouseAdapter() {
	      	@Override
	      	public void mouseClicked(MouseEvent e) {
	      		JFileChooser chooser = new JFileChooser();
	               chooser.showOpenDialog(null);
	               File f = chooser.getSelectedFile();
	               String filename = f.getAbsolutePath();
	               Image getAbsolutePath = null;
	               ImageIcon icon = new ImageIcon(filename);
	               Image image = icon.getImage().getScaledInstance(lbl2.getWidth(), lbl2.getHeight(), Image.SCALE_SMOOTH);
	               lbl2.setIcon(icon);		
	      		
	      	}
	      });
	      
	      JPanel panel_16 = new JPanel();
	      panel_16.setBounds(410, 154, 80, 90);
	      panel_19.add(panel_16);
	      panel_16.setLayout(null);
	      
	      JLabel lbl1 = new JLabel("");
	      lbl1.addMouseListener(new MouseAdapter() {
	      	@Override
	      	public void mouseClicked(MouseEvent e) {
	      		
	      		JFileChooser chooser = new JFileChooser();
	               chooser.showOpenDialog(null);
	               File f = chooser.getSelectedFile();
	               String filename = f.getAbsolutePath();
	               Image getAbsolutePath = null;
	               ImageIcon icon = new ImageIcon(filename);
	               Image image = icon.getImage().getScaledInstance(lbl1.getWidth(), lbl1.getHeight(), Image.SCALE_SMOOTH);
	               lbl1.setIcon(icon);	
	      		
	      		
	      		
	      	}
	      });
	      lbl1.setBounds(0, 0, 80, 90);
	      panel_16.add(lbl1);
	      
	      JPanel panel_17 = new JPanel();
	      panel_17.setBounds(348, 119, 207, 24);
	      panel_19.add(panel_17);
	      panel_17.setBackground(new Color(0, 102, 153));
	      panel_17.setLayout(null);
	      
	      JLabel label_6 = new JLabel("\uB300\uB300\uC7A5 \uCC28\uC900\uC12D");
	      label_6.setHorizontalAlignment(SwingConstants.CENTER);
	      label_6.setForeground(Color.WHITE);
	      label_6.setFont(new Font("±¼¸²", Font.BOLD, 15));
	      label_6.setBounds(37, 6, 133, 15);
	      panel_17.add(label_6);
	      
	      JPanel panel_18 = new JPanel();
	      panel_18.setBounds(400, 0, 100, 110);
	      panel_19.add(panel_18);
	      panel_18.setLayout(null);
	      
	      JLabel lbl_image = new JLabel("");
	      lbl_image.addMouseListener(new MouseAdapter() {
	      	@Override
	      	public void mouseClicked(MouseEvent arg0) {
	      		JFileChooser chooser = new JFileChooser();
	            chooser.showOpenDialog(null);
	            File f = chooser.getSelectedFile();
	            String filename = f.getAbsolutePath();
	            Image getAbsolutePath = null;
	            ImageIcon icon = new ImageIcon(filename);
	            Image image = icon.getImage().getScaledInstance(lbl_image.getWidth(), lbl_image.getHeight(), Image.SCALE_SMOOTH);
	            lbl_image.setIcon(icon);
	      		
	      		
	      	}
	      });
	      lbl_image.setBounds(0, 0, 100, 110);
	      panel_18.add(lbl_image);
	      
	      JSeparator separator_14 = new JSeparator();
	      separator_14.setBounds(49, 289, 802, 15);
	      panel_19.add(separator_14);
	      
	      JSeparator separator = new JSeparator();
	      separator.setBounds(50, 288, 25, 25);
	      panel_19.add(separator);
	      separator.setOrientation(SwingConstants.VERTICAL);
	      
	      JSeparator separator_1 = new JSeparator();
	      separator_1.setBounds(250, 288, 25, 25);
	      panel_19.add(separator_1);
	      separator_1.setOrientation(SwingConstants.VERTICAL);
	      
	      JPanel panel_3 = new JPanel();
	      panel_3.setBounds(213, 313, 80, 90);
	      panel_19.add(panel_3);
	      panel_3.setLayout(null);
	      
	      JLabel lbl3 = new JLabel("");
	      lbl3.addMouseListener(new MouseAdapter() {
	      	@Override
	      	public void mouseClicked(MouseEvent e) {
	      		
	      		JFileChooser chooser = new JFileChooser();
	               chooser.showOpenDialog(null);
	               File f = chooser.getSelectedFile();
	               String filename = f.getAbsolutePath();
	               Image getAbsolutePath = null;
	               ImageIcon icon = new ImageIcon(filename);
	               Image image = icon.getImage().getScaledInstance(lbl3.getWidth(), lbl3.getHeight(), Image.SCALE_SMOOTH);
	               lbl3.setIcon(icon);		
	      		
	      	}
	      });
	      lbl3.setBounds(0, 0, 80, 90);
	      panel_3.add(lbl3);
	      
	      JPanel panel_4 = new JPanel();
	      panel_4.setBounds(413, 313, 80, 90);
	      panel_19.add(panel_4);
	      panel_4.setLayout(null);
	      
	      JLabel lbl4 = new JLabel("");
	      lbl4.addMouseListener(new MouseAdapter() {
	      	@Override
	      	public void mouseClicked(MouseEvent e) {
	      		
	      		JFileChooser chooser = new JFileChooser();
	               chooser.showOpenDialog(null);
	               File f = chooser.getSelectedFile();
	               String filename = f.getAbsolutePath();
	               Image getAbsolutePath = null;
	               ImageIcon icon = new ImageIcon(filename);
	               Image image = icon.getImage().getScaledInstance(lbl4.getWidth(), lbl4.getHeight(), Image.SCALE_SMOOTH);
	               lbl4.setIcon(icon);	
	      		
	      	}
	      });
	      lbl4.setBounds(0, 0, 80, 90);
	      panel_4.add(lbl4);
	      
	      JPanel panel_5 = new JPanel();
	      panel_5.setBounds(613, 313, 80, 90);
	      panel_19.add(panel_5);
	      panel_5.setLayout(null);
	      
	      JLabel lbl5 = new JLabel("");
	      lbl5.addMouseListener(new MouseAdapter() {
	      	@Override
	      	public void mouseClicked(MouseEvent e) {
	      		
	      		JFileChooser chooser = new JFileChooser();
	               chooser.showOpenDialog(null);
	               File f = chooser.getSelectedFile();
	               String filename = f.getAbsolutePath();
	               Image getAbsolutePath = null;
	               ImageIcon icon = new ImageIcon(filename);
	               Image image = icon.getImage().getScaledInstance(lbl5.getWidth(), lbl5.getHeight(), Image.SCALE_SMOOTH);
	               lbl5.setIcon(icon);	
	      		
	      	}
	      });
	      lbl5.setBounds(0, 0, 80, 90);
	      panel_5.add(lbl5);
	      
	      JPanel panel_6 = new JPanel();
	      panel_6.setBounds(813, 313, 80, 90);
	      panel_19.add(panel_6);
	      panel_6.setLayout(null);
	      
	      JLabel lbl6 = new JLabel("");
	      lbl6.addMouseListener(new MouseAdapter() {
	      	@Override
	      	public void mouseClicked(MouseEvent e) {
	      		
	      		JFileChooser chooser = new JFileChooser();
	               chooser.showOpenDialog(null);
	               File f = chooser.getSelectedFile();
	               String filename = f.getAbsolutePath();
	               Image getAbsolutePath = null;
	               ImageIcon icon = new ImageIcon(filename);
	               Image image = icon.getImage().getScaledInstance(lbl6.getWidth(), lbl6.getHeight(), Image.SCALE_SMOOTH);
	               lbl6.setIcon(icon);	
	      		
	      	}
	      });
	      lbl6.setBounds(0, 0, 80, 90);
	      panel_6.add(lbl6);
	      
	      JPanel panel_8 = new JPanel();
	      panel_8.setBounds(211, 410, 85, 24);
	      panel_19.add(panel_8);
	      panel_8.setLayout(null);
	      panel_8.setBackground(new Color(102, 153, 153));
	      
	      JLabel label_1 = new JLabel("\uC218\uC1A1");
	      label_1.setHorizontalAlignment(SwingConstants.CENTER);
	      label_1.setForeground(new Color(255, 250, 250));
	      label_1.setFont(new Font("±¼¸²", Font.BOLD, 13));
	      label_1.setBounds(220, 0, 73, 25);
	      panel_8.add(label_1);
	      
	      JLabel label = new JLabel("\uD1B5\uC2E0");
	      label.setHorizontalAlignment(SwingConstants.CENTER);
	      label.setForeground(new Color(255, 250, 250));
	      label.setFont(new Font("±¼¸²", Font.BOLD, 13));
	      label.setBounds(5, 0, 73, 25);
	      panel_8.add(label);
	      
	      JPanel panel_9 = new JPanel();
	      panel_9.setBounds(411, 410, 85, 24);
	      panel_19.add(panel_9);
	      panel_9.setLayout(null);
	      panel_9.setBackground(new Color(102, 153, 153));
	      
	      JLabel label_2 = new JLabel("\uC758\uBB34");
	      label_2.setHorizontalAlignment(SwingConstants.CENTER);
	      label_2.setForeground(new Color(255, 250, 250));
	      label_2.setFont(new Font("±¼¸²", Font.BOLD, 13));
	      label_2.setBounds(5, 0, 73, 25);
	      panel_9.add(label_2);
	      
	      JPanel panel_10 = new JPanel();
	      panel_10.setBounds(611, 410, 85, 24);
	      panel_19.add(panel_10);
	      panel_10.setLayout(null);
	      panel_10.setBackground(new Color(102, 153, 153));
	      
	      JLabel label_3 = new JLabel("\uD0C4\uC57D");
	      label_3.setHorizontalAlignment(SwingConstants.CENTER);
	      label_3.setForeground(new Color(255, 250, 250));
	      label_3.setFont(new Font("±¼¸²", Font.BOLD, 13));
	      label_3.setBounds(5, 0, 73, 25);
	      panel_10.add(label_3);
	      
	      JPanel panel_11 = new JPanel();
	      panel_11.setBounds(811, 410, 85, 24);
	      panel_19.add(panel_11);
	      panel_11.setLayout(null);
	      panel_11.setBackground(new Color(102, 153, 153));
	      
	      JLabel label_5 = new JLabel("\uC791\uC804");
	      label_5.setHorizontalAlignment(SwingConstants.CENTER);
	      label_5.setForeground(new Color(255, 250, 250));
	      label_5.setFont(new Font("±¼¸²", Font.BOLD, 13));
	      label_5.setBounds(5, 0, 73, 25);
	      panel_11.add(label_5);
	      
	      JSeparator separator_2 = new JSeparator();
	      separator_2.setBounds(452, 288, 25, 25);
	      panel_19.add(separator_2);
	      separator_2.setOrientation(SwingConstants.VERTICAL);
	      
	      JSeparator separator_3 = new JSeparator();
	      separator_3.setBounds(654, 288, 25, 25);
	      panel_19.add(separator_3);
	      separator_3.setOrientation(SwingConstants.VERTICAL);
	      
	      JSeparator separator_5 = new JSeparator();
	      separator_5.setBounds(849, 288, 25, 25);
	      panel_19.add(separator_5);
	      separator_5.setOrientation(SwingConstants.VERTICAL);
	      
	      JSeparator separator_6 = new JSeparator();
	      separator_6.setBounds(452, 140, 25, 25);
	      panel_19.add(separator_6);
	      separator_6.setOrientation(SwingConstants.VERTICAL);
	      
	      JSeparator separator_7 = new JSeparator();
	      separator_7.setBounds(452, 108, 25, 25);
	      panel_19.add(separator_7);
	      separator_7.setOrientation(SwingConstants.VERTICAL);
	      
	      JPanel panel_12 = new JPanel();
	      panel_12.setBounds(198, 464, 107, 196);
	      panel_19.add(panel_12);
	      
	      JPanel panel_13 = new JPanel();
	      panel_13.setBounds(399, 464, 107, 196);
	      panel_19.add(panel_13);
	      
	      JPanel panel_14 = new JPanel();
	      panel_14.setBounds(600, 464, 107, 196);
	      panel_19.add(panel_14);
	      
	      JPanel panel_15 = new JPanel();
	      panel_15.setBounds(799, 464, 107, 196);
	      panel_19.add(panel_15);
	      
	      JSeparator separator_9 = new JSeparator();
	      separator_9.setBounds(251, 433, 1, 30);
	      panel_19.add(separator_9);
	      separator_9.setOrientation(SwingConstants.VERTICAL);
	      
	      JSeparator separator_10 = new JSeparator();
	      separator_10.setBounds(452, 433, 1, 30);
	      panel_19.add(separator_10);
	      separator_10.setOrientation(SwingConstants.VERTICAL);
	      
	      JSeparator separator_11 = new JSeparator();
	      separator_11.setBounds(654, 433, 1, 30);
	      panel_19.add(separator_11);
	      separator_11.setOrientation(SwingConstants.VERTICAL);
	      
	      JSeparator separator_12 = new JSeparator();
	      separator_12.setBounds(849, 433, 1, 30);
	      panel_19.add(separator_12);
	      separator_12.setOrientation(SwingConstants.VERTICAL);
	      
	      JSeparator separator_13 = new JSeparator();
	      separator_13.setBounds(452, 276, 25, 25);
	      panel_19.add(separator_13);
	      separator_13.setOrientation(SwingConstants.VERTICAL);
	      
	      JSeparator separator_15 = new JSeparator();
	      separator_15.setOrientation(SwingConstants.VERTICAL);
	      separator_15.setBounds(452, 240, 25, 25);
	      panel_19.add(separator_15);
	}
}
