package view;

import java.awt.EventQueue;
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

public class Enroll {

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
   
   /**
    * Launch the application.
    */
   
   /**
    * Create the application.
    * @param window 
    */
   public Enroll(mainpa window) {
      this.window = window;
      initialize();
      frame.setVisible(true);
   }

   /**
    * Initialize the contents of the frame.
    */
   private void initialize() {
      frame = new JFrame();
      frame.setBounds(100, 100, 792, 196);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.getContentPane().setLayout(null);
      
      JPanel panel = new JPanel();
      panel.setBounds(0, 0, 776, 157);
      frame.getContentPane().add(panel);
      panel.setLayout(null);
      
      JPanel panel_1 = new JPanel();
      panel_1.setBounds(0, 0, 776, 15);
      panel.add(panel_1);
      GridBagLayout gbl_panel_1 = new GridBagLayout();
      gbl_panel_1.columnWidths = new int[] {0, 0, 0, 0, 10};
      gbl_panel_1.rowHeights = new int[] {0, 0};
      gbl_panel_1.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
      gbl_panel_1.rowWeights = new double[]{0.0, Double.MIN_VALUE};
      panel_1.setLayout(gbl_panel_1);
      
      JLabel lblNewLabel = new JLabel("Army_id");
      GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
      gbc_lblNewLabel.insets = new Insets(0, 0, 0, 5);
      gbc_lblNewLabel.gridx = 0;
      gbc_lblNewLabel.gridy = 0;
      panel_1.add(lblNewLabel, gbc_lblNewLabel);
      
      JLabel lblNewLabel_1 = new JLabel("Army");
      GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
      gbc_lblNewLabel_1.insets = new Insets(0, 0, 0, 5);
      gbc_lblNewLabel_1.gridx = 1;
      gbc_lblNewLabel_1.gridy = 0;
      panel_1.add(lblNewLabel_1, gbc_lblNewLabel_1);
      
      JLabel lblNewLabel_2 = new JLabel("Army");
      GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
      gbc_lblNewLabel_2.insets = new Insets(0, 0, 0, 5);
      gbc_lblNewLabel_2.gridx = 2;
      gbc_lblNewLabel_2.gridy = 0;
      panel_1.add(lblNewLabel_2, gbc_lblNewLabel_2);
      
      JLabel lblNewLabel_3 = new JLabel("New label");
      GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
      gbc_lblNewLabel_3.gridx = 3;
      gbc_lblNewLabel_3.gridy = 0;
      panel_1.add(lblNewLabel_3, gbc_lblNewLabel_3);
      
      JPanel panel_2 = new JPanel();
      panel_2.setBounds(0, 25, 776, 66);
      panel.add(panel_2);
      panel_2.setLayout(new GridLayout(0, 11, 0, 0));
      
      ID = new JTextField();
      panel_2.add(ID);
      ID.setColumns(10);
      
      CLASS = new JTextField();
      panel_2.add(CLASS);
      CLASS.setColumns(10);
      
      MOS = new JTextField();
      panel_2.add(MOS);
      MOS.setColumns(10);
      
      NAME = new JTextField();
      panel_2.add(NAME);
      NAME.setColumns(10);
      
      BIRTH = new JTextField();
      panel_2.add(BIRTH);
      BIRTH.setColumns(10);
      
      SEX = new JTextField();
      panel_2.add(SEX);
      SEX.setColumns(10);
      
      ADDRESS = new JTextField();
      panel_2.add(ADDRESS);
      ADDRESS.setColumns(10);
      
      BLOOD = new JTextField();
      panel_2.add(BLOOD);
      BLOOD.setColumns(10);
      
      VACATION = new JTextField();
      panel_2.add(VACATION);
      VACATION.setColumns(10);
      
      ENLIST = new JTextField();
      panel_2.add(ENLIST);
      ENLIST.setColumns(10);
      
      DISCHARGE = new JTextField();
      panel_2.add(DISCHARGE);
      DISCHARGE.setColumns(10);
      
      btnNewButton = new JButton("New button");
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

            
            MemberAll member = new MemberAll(infoid, infoclass, infomos, infoname, infobirth, infosex, infoaddress, infoblood, infovacation
                  , infoenlist, infodischarge);
         
            boolean result = service.memberEnroll(member); //정보는 m을 받아서 조인.   성공하면 ture 실패하면false를 받기위해 불린형 타입에 넣어준다.
            if(result == true) {
               JOptionPane.showMessageDialog(frame,
                      "등록성공");
               window.show();
               frame.dispose(); // 화면종료
            }else {
               JOptionPane.showMessageDialog(frame,
                      "등록실패");
            }
         
         }
      });
      btnNewButton.setBounds(450, 124, 97, 23);
      panel.add(btnNewButton);
      
       
   }
}