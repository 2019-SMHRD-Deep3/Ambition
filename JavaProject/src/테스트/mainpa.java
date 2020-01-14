package 테스트;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;

public class mainpa {

   private JFrame frame;

   /**
    * Launch the application.
    */
   public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
               mainpa window = new mainpa();
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
      
      JPanel panel = new JPanel();
      panel.setBackground(new Color(0, 0, 51));
      panel.setForeground(new Color(0, 0, 51));
      panel.setBounds(0, 0, 292, 661);
      frame.getContentPane().add(panel);
      panel.setLayout(null);
      
      JLabel lblNewLabel = new JLabel("ARMY HR SYSTEM");
      lblNewLabel.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 23));
      lblNewLabel.setForeground(new Color(255, 255, 255));
      lblNewLabel.setBounds(61, 15, 202, 77);
      panel.add(lblNewLabel);
      
      JLabel label = new JLabel("\uC778\uC6D0\uAD00\uB9AC");
      label.setFont(new Font("굴림", Font.BOLD, 16));
      label.setForeground(new Color(255, 255, 255));
      label.setBounds(24, 274, 178, 57);
      panel.add(label);
      
      JLabel label_1 = new JLabel("\uCD9C\uD0C0\uAD00\uB9AC");
      label_1.setFont(new Font("굴림", Font.BOLD, 16));
      label_1.setForeground(new Color(255, 255, 255));
      label_1.setBounds(24, 365, 178, 57);
      panel.add(label_1);
      
      JLabel label_2 = new JLabel("\uC704\uCE58\uC815\uBCF4");
      label_2.setFont(new Font("굴림", Font.BOLD, 16));
      label_2.setForeground(new Color(255, 255, 255));
      label_2.setBounds(24, 463, 178, 57);
      panel.add(label_2);
      
      JLabel label_3 = new JLabel("\uC870\uC9C1\uB3C4");
      label_3.setFont(new Font("굴림", Font.BOLD, 16));
      label_3.setForeground(Color.WHITE);
      label_3.setBounds(24, 552, 178, 57);
      panel.add(label_3);
      
      JLabel 로그인이름창 = new JLabel("000");
      로그인이름창.setFont(new Font("굴림", Font.PLAIN, 15));
      로그인이름창.setForeground(new Color(255, 255, 255));
      로그인이름창.setBounds(50, 102, 54, 30);
      panel.add(로그인이름창);
      
      JLabel 환영합니다 = new JLabel("\uB2D8 \uD658\uC601\uD569\uB2C8\uB2E4.");
      환영합니다.setFont(new Font("굴림", Font.PLAIN, 15));
      환영합니다.setForeground(new Color(255, 255, 255));
      환영합니다.setBounds(101, 102, 156, 30);
      panel.add(환영합니다);
      
      JLabel label_4 = new JLabel("\uBD80\uB300\uC18C\uAC1C");
      label_4.setFont(new Font("굴림체", Font.BOLD, 16));
      label_4.setForeground(Color.WHITE);
      label_4.setBounds(24, 174, 178, 57);
      panel.add(label_4);
      
      JLabel lblNewLabel_1 = new JLabel("");
      lblNewLabel_1.setIcon(new ImageIcon("C:\\image\\\uC2A4\uB9C8\uD2B8\uBBF8\uB514\uC5B4\uB85C\uACE0.png"));
      lblNewLabel_1.setBounds(4, 28, 57, 61);
      panel.add(lblNewLabel_1);
      
      JPanel panel_1 = new JPanel();
      panel_1.setBackground(new Color(255, 255, 255));
      panel_1.setForeground(new Color(255, 255, 255));
      panel_1.setBounds(293, 0, 991, 661);
      frame.getContentPane().add(panel_1);
      panel_1.setLayout(null);
   }
}