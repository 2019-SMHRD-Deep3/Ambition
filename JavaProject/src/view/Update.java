package view;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.MemberManagementService;
import model.MemberAll;
import java.awt.SystemColor;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Update {

   private JFrame frame;
   private JTextField ID;
   private JTextField CLASS;
   private JTextField MOS;
   private JTextField NAME;
   private JTextField BIRTH;
   private JTextField ADDRESS;
   private JTextField BLOOD;
   private JTextField VACATION;
   private JTextField ENLIST;
   private JTextField DISCHARGE;
   private JButton btnNewButton;
   MemberManagementService service = new MemberManagementService();
   private JTextField SEX;
   private mainpa window;
   private JTextField Salary;

   /**
    * Launch the application.
    */

   /**
    * Create the application.
    * 
    * @param window
    */
   public Update(mainpa window) {
      this.window = window;
      initialize();
      frame.setVisible(true);
   }

   /**
    * Initialize the contents of the frame.
    */
   private void initialize() {
      frame = new JFrame();
      frame.setBounds(100, 100, 885, 196);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.getContentPane().setLayout(null);

      JPanel panel = new JPanel();
      panel.setBackground(new Color(0, 0, 51));
      panel.setBounds(0, 0, 869, 157);
      frame.getContentPane().add(panel);
      panel.setLayout(null);

      JPanel panel_1 = new JPanel();
      panel_1.setBackground(new Color(255, 255, 255));
      panel_1.setForeground(Color.WHITE);
      panel_1.setBounds(12, 40, 833, 32);
      panel.add(panel_1);
      panel_1.setLayout(null);
      
      JLabel lblNewLabel = new JLabel("ID");
      lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
      lblNewLabel.setFont(new Font("±¼¸²", Font.BOLD, 12));
      lblNewLabel.setBounds(12, 10, 46, 15);
      panel_1.add(lblNewLabel);
      
      JLabel lblClass = new JLabel("\uACC4\uAE09");
      lblClass.setHorizontalAlignment(SwingConstants.CENTER);
      lblClass.setFont(new Font("±¼¸²", Font.BOLD, 12));
      lblClass.setBounds(76, 10, 57, 15);
      panel_1.add(lblClass);
      
      JLabel lblMos = new JLabel("\uC8FC\uD2B9\uAE30");
      lblMos.setHorizontalAlignment(SwingConstants.CENTER);
      lblMos.setFont(new Font("±¼¸²", Font.BOLD, 12));
      lblMos.setBounds(146, 10, 57, 15);
      panel_1.add(lblMos);
      
      JLabel lblName = new JLabel("\uC774\uB984");
      lblName.setHorizontalAlignment(SwingConstants.CENTER);
      lblName.setFont(new Font("±¼¸²", Font.BOLD, 12));
      lblName.setBounds(216, 10, 57, 15);
      panel_1.add(lblName);
      
      JLabel lblBirth = new JLabel("\uC0DD\uB144\uC6D4\uC77C");
      lblBirth.setHorizontalAlignment(SwingConstants.CENTER);
      lblBirth.setFont(new Font("±¼¸²", Font.BOLD, 12));
      lblBirth.setBounds(284, 10, 57, 15);
      panel_1.add(lblBirth);
      
      JLabel lblSex = new JLabel("\uC131\uBCC4");
      lblSex.setHorizontalAlignment(SwingConstants.CENTER);
      lblSex.setFont(new Font("±¼¸²", Font.BOLD, 12));
      lblSex.setBounds(353, 10, 46, 15);
      panel_1.add(lblSex);
      
      JLabel lblAddress = new JLabel("\uC8FC\uC18C");
      lblAddress.setHorizontalAlignment(SwingConstants.CENTER);
      lblAddress.setFont(new Font("±¼¸²", Font.BOLD, 12));
      lblAddress.setBounds(411, 10, 76, 15);
      panel_1.add(lblAddress);
      
      JLabel lblBlood = new JLabel("\uD608\uC561\uD615");
      lblBlood.setHorizontalAlignment(SwingConstants.CENTER);
      lblBlood.setFont(new Font("±¼¸²", Font.BOLD, 12));
      lblBlood.setBounds(481, 10, 76, 15);
      panel_1.add(lblBlood);
      
      JLabel lblVacation = new JLabel("\uD734\uAC00");
      lblVacation.setHorizontalAlignment(SwingConstants.CENTER);
      lblVacation.setFont(new Font("±¼¸²", Font.BOLD, 12));
      lblVacation.setBounds(545, 10, 88, 15);
      panel_1.add(lblVacation);
      
      JLabel lblEnlist = new JLabel("\uC785\uB300\uC77C");
      lblEnlist.setHorizontalAlignment(SwingConstants.CENTER);
      lblEnlist.setFont(new Font("±¼¸²", Font.BOLD, 12));
      lblEnlist.setBounds(628, 10, 57, 15);
      panel_1.add(lblEnlist);
      
      JLabel lblDischarge = new JLabel("\uC804\uC5ED\uC77C");
      lblDischarge.setHorizontalAlignment(SwingConstants.CENTER);
      lblDischarge.setFont(new Font("±¼¸²", Font.BOLD, 12));
      lblDischarge.setBounds(695, 10, 57, 15);
      panel_1.add(lblDischarge);
      
      JLabel lblSalary = new JLabel("\uAE09\uC5EC");
      lblSalary.setHorizontalAlignment(SwingConstants.CENTER);
      lblSalary.setFont(new Font("±¼¸²", Font.BOLD, 12));
      lblSalary.setBounds(764, 10, 57, 15);
      panel_1.add(lblSalary);

      JPanel panel_2 = new JPanel();
      panel_2.setBounds(12, 82, 833, 32);
      panel.add(panel_2);
      panel_2.setLayout(new GridLayout(0, 12, 0, 0));
      
     

      ID = new JTextField();
      panel_2.add(ID);
      ID.setColumns(10);
      ID.setText(mainpa.getID()+"");

      CLASS = new JTextField();
      panel_2.add(CLASS);
      CLASS.setColumns(10);
      CLASS.setText(mainpa.getCLASS()+"");

      MOS = new JTextField();
      panel_2.add(MOS);
      MOS.setColumns(10);
      MOS.setText(mainpa.getMOS());

      NAME = new JTextField();
      panel_2.add(NAME);
      NAME.setColumns(10);
      NAME.setText(mainpa.getNAME()+"");

      BIRTH = new JTextField();
      panel_2.add(BIRTH);
      BIRTH.setColumns(10);
      BIRTH.setText(mainpa.getBIRTH()+"");

      SEX = new JTextField();
      panel_2.add(SEX);
      SEX.setColumns(10);
      SEX.setText(mainpa.getSEX()+"");

      ADDRESS = new JTextField();
      panel_2.add(ADDRESS);
      ADDRESS.setColumns(10);
     ADDRESS.setText(mainpa.getADDRESS()+"");

      BLOOD = new JTextField();
      panel_2.add(BLOOD);
      BLOOD.setColumns(10);
      BLOOD.setText(mainpa.getBLOODTYPE()+"");

      VACATION = new JTextField();
      panel_2.add(VACATION);
      VACATION.setColumns(10);
      if(mainpa.getVACATION()==null){
         VACATION.setText(null);
      }else {
      VACATION.setText(mainpa.getVACATION()+"");
      }

      ENLIST = new JTextField();
      panel_2.add(ENLIST);
      ENLIST.setColumns(10);
      ENLIST.setText(mainpa.getENLIST()+"");

      DISCHARGE = new JTextField();
      panel_2.add(DISCHARGE);
      DISCHARGE.setColumns(10);
      DISCHARGE.setText(mainpa.getDISCHARGE()+"");

      Salary = new JTextField();
      panel_2.add(Salary);
      Salary.setColumns(10);
      Salary.setText(mainpa.getCLASS()+"");
      

      btnNewButton = new JButton("\uB4F1\uB85D");
     
      btnNewButton.setFont(new Font("±¼¸²", Font.BOLD, 12));
      btnNewButton.setBackground(new Color(255, 255, 255));
      btnNewButton.setForeground(Color.BLACK);
      btnNewButton.addMouseListener(new MouseAdapter() {
         @Override
         public void mouseClicked(MouseEvent e) {

            String infoid = ID.getText();
            String infoclass = CLASS.getText();
            String infomos = MOS.getText();
            String infoname = NAME.getText();
            String infobirth = BIRTH.getText();
            String infosex = SEX.getText();
            String infoaddress = ADDRESS.getText();
            String infoblood = BLOOD.getText();
            String infovacation = VACATION.getText();
            String infoenlist = ENLIST.getText();
            String infodischarge = DISCHARGE.getText();
            String infoSalary = Salary.getText();
            
            System.out.println(infoid);

            MemberAll member = new MemberAll(infoid, infoclass, infomos, infoname, infobirth, infosex, infoaddress,
                  infoblood, infovacation, infoenlist, infodischarge, infoSalary);
            
    

            int result = service.Update(member); // Á¤º¸´Â mÀ» ¹Þ¾Æ¼­ Á¶ÀÎ. ¼º°øÇÏ¸é true ½ÇÆÐÇÏ¸éfalse¸¦ ¹Þ±âÀ§ÇØ ºÒ¸°Çü Å¸ÀÔ¿¡ ³Ö¾îÁØ´Ù.
            
            if (result == 1) {
               JOptionPane.showMessageDialog(frame, "¼öÁ¤¼º°ø");
               window.show();
               frame.dispose(); // È­¸éÁ¾·á
            } else {
               JOptionPane.showMessageDialog(frame, "¼öÁ¤½ÇÆÐ");
            }

         }
      });
      btnNewButton.setBounds(642, 124, 97, 23);
      panel.add(btnNewButton);
      
      JButton btnNewButton_1 = new JButton("\uCDE8\uC18C");
      btnNewButton_1.addMouseListener(new MouseAdapter() {
         @Override
         public void mouseClicked(MouseEvent e) {
            frame.dispose();
         }
      });
      btnNewButton_1.setBackground(new Color(255,255,255));
      btnNewButton_1.setFont(new Font("±¼¸²", Font.BOLD, 12));
      
      btnNewButton_1.setBounds(751, 124, 94, 23);
      panel.add(btnNewButton_1);
      
     

   }
}