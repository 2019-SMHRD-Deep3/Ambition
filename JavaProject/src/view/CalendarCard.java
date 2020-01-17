package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

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

public class CalendarCard extends JPanel {
   private MemberManagementService service = new MemberManagementService();
   private JTextField textField;
   private JTextField textField_2;
   private JTextField textField_3;
   private JTextField textField_4;
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
   /**
    * Create the panel.
    */
   public CalendarCard(String month, int numOfDay) {
      setBackground(new Color(255, 255, 255));
      setLayout(null);

      JScrollPane scrollPane = new JScrollPane();
      scrollPane.setBounds(0, 10, 975, 471);
      add(scrollPane);

      JPanel panel = new JPanel();
      panel.setBackground(new Color(255, 255, 255));
      scrollPane.setViewportView(panel);
      panel.setLayout(null);
      panel.setPreferredSize(new Dimension(1250, 600));

      JLabel label = new JLabel("1\uC6D4");
      label.setForeground(new Color(0, 0, 51));
      label.setFont(new Font("굴림", Font.BOLD, 24));
      label.setBounds(568, 0, 140, 34);
      panel.add(label);
      label.setText(month);

      JLabel lblNewLabel = new JLabel("\uAD70\uBC88");
      lblNewLabel.setForeground(new Color(0, 0, 51));
      lblNewLabel.setFont(new Font("굴림", Font.BOLD, 14));
      lblNewLabel.setBounds(50, 56, 59, 15);
      panel.add(lblNewLabel);

      JLabel label_1 = new JLabel("\uACC4\uAE09");
      label_1.setForeground(new Color(0, 0, 51));
      label_1.setFont(new Font("굴림", Font.BOLD, 14));
      label_1.setBounds(107, 56, 39, 15);
      panel.add(label_1);

      JLabel label_2 = new JLabel("\uC774\uB984");
      label_2.setForeground(new Color(0, 0, 51));
      label_2.setFont(new Font("굴림", Font.BOLD, 14));
      label_2.setBounds(167, 56, 66, 15);
      panel.add(label_2);
      
     
      
      
      JLabel label_3 = new JLabel("\uC0AC\uC720");
      label_3.setFont(new Font("굴림", Font.BOLD, 14));
      label_3.setBounds(234, 56, 57, 15);
      panel.add(label_3);
      
      JPanel panel_1 = new JPanel();
      panel_1.setBackground(Color.WHITE);
      panel_1.setBounds(25, 78, 257, 450);
      panel.add(panel_1);
      panel_1.setLayout(new GridLayout(15, 4, 0, 5));
      
      
         
      textField = new JTextField();
      panel_1.add(textField);
      textField.setColumns(10);
   
      textField_2 = new JTextField();
      panel_1.add(textField_2);
      textField_2.setColumns(10);
      
      textField_3 = new JTextField();
      panel_1.add(textField_3);
      textField_3.setColumns(10);
      
      textField_4 = new JTextField();
      panel_1.add(textField_4);
      textField_4.setColumns(10);
      
      textField_5 = new JTextField();
      panel_1.add(textField_5);
      textField_5.setColumns(10);
      
      textField_6 = new JTextField();
      panel_1.add(textField_6);
      textField_6.setColumns(10);
      
      textField_7 = new JTextField();
      panel_1.add(textField_7);
      textField_7.setColumns(10);
       
      textField_8 = new JTextField();
      panel_1.add(textField_8);
      textField_8.setColumns(10);
      
      textField_9 = new JTextField();
      panel_1.add(textField_9);
      textField_9.setColumns(10);
      
      textField_10 = new JTextField();
      panel_1.add(textField_10);
      textField_10.setColumns(10);
      
      textField_12 = new JTextField();
      panel_1.add(textField_12);
      textField_12.setColumns(10);
      
      textField_13 = new JTextField();
      panel_1.add(textField_13);
      textField_13.setColumns(10);
      
      textField_14 = new JTextField();
      panel_1.add(textField_14);
      textField_14.setColumns(10);
      
      textField_15 = new JTextField();
      panel_1.add(textField_15);
      textField_15.setColumns(10);
      
      textField_16 = new JTextField();
      panel_1.add(textField_16);
      textField_16.setColumns(10);
      
      textField_17 = new JTextField();
      panel_1.add(textField_17);
      textField_17.setColumns(10);
      
      textField_18 = new JTextField();
      panel_1.add(textField_18);
      textField_18.setColumns(10);
      
      textField_19 = new JTextField();
      panel_1.add(textField_19);
      textField_19.setColumns(10);
      
      textField_20 = new JTextField();
      panel_1.add(textField_20);
      textField_20.setColumns(10);
      
      textField_21 = new JTextField();
      panel_1.add(textField_21);
      textField_21.setColumns(10);
      
      textField_22 = new JTextField();
      panel_1.add(textField_22);
      textField_22.setColumns(10);
      
      textField_23 = new JTextField();
      panel_1.add(textField_23);
      textField_23.setColumns(10);
      
      textField_24 = new JTextField();
      panel_1.add(textField_24);
      textField_24.setColumns(10);
      
      textField_25 = new JTextField();
      panel_1.add(textField_25);
      textField_25.setColumns(10);
      
      textField_26 = new JTextField();
      panel_1.add(textField_26);
      textField_26.setColumns(10);
      
      textField_27 = new JTextField();
      panel_1.add(textField_27);
      textField_27.setColumns(10);
      
      textField_28 = new JTextField();
      panel_1.add(textField_28);
      textField_28.setColumns(10);
      
      textField_29 = new JTextField();
      panel_1.add(textField_29);
      textField_29.setColumns(10);
      
      textField_30 = new JTextField();
      panel_1.add(textField_30);
      textField_30.setColumns(10);
      
      textField_31 = new JTextField();
      panel_1.add(textField_31);
      textField_31.setColumns(10);
      
      textField_32 = new JTextField();
      panel_1.add(textField_32);
      textField_32.setColumns(10);
      
      textField_33 = new JTextField();
      panel_1.add(textField_33);
      textField_33.setColumns(10);
      
      textField_34 = new JTextField();
      panel_1.add(textField_34);
      textField_34.setColumns(10);
      
      textField_35 = new JTextField();
      panel_1.add(textField_35);
      textField_35.setColumns(10);
      
      textField_36 = new JTextField();
      panel_1.add(textField_36);
      textField_36.setColumns(10);
      
      textField_37 = new JTextField();
      panel_1.add(textField_37);
      textField_37.setColumns(10);
      
      textField_38 = new JTextField();
      panel_1.add(textField_38);
      textField_38.setColumns(10);
      
      textField_39 = new JTextField();
      panel_1.add(textField_39);
      textField_39.setColumns(10);
      
      textField_40 = new JTextField();
      panel_1.add(textField_40);
      textField_40.setColumns(10);
      
      textField_41 = new JTextField();
      panel_1.add(textField_41);
      textField_41.setColumns(10);
      
      textField_42 = new JTextField();
      panel_1.add(textField_42);
      textField_42.setColumns(10);
      
      textField_43 = new JTextField();
      panel_1.add(textField_43);
      textField_43.setColumns(10);
      
      textField_44 = new JTextField();
      panel_1.add(textField_44);
      textField_44.setColumns(10);
      
      textField_45 = new JTextField();
      panel_1.add(textField_45);
      textField_45.setColumns(10);
      
      textField_46 = new JTextField();
      panel_1.add(textField_46);
      textField_46.setColumns(10);
      
      textField_47 = new JTextField();
      panel_1.add(textField_47);
      textField_47.setColumns(10);
      
      textField_48 = new JTextField();
      panel_1.add(textField_48);
      textField_48.setColumns(10);
      
      textField_49 = new JTextField();
      panel_1.add(textField_49);
      textField_49.setColumns(10);
      
      textField_50 = new JTextField();
      panel_1.add(textField_50);
      textField_50.setColumns(10);
      
      textField_51 = new JTextField();
      panel_1.add(textField_51);
      textField_51.setColumns(10);
      
      textField_52 = new JTextField();
      panel_1.add(textField_52);
      textField_52.setColumns(10);
      
      textField_53 = new JTextField();
      panel_1.add(textField_53);
      textField_53.setColumns(10);
      
      textField_54 = new JTextField();
      panel_1.add(textField_54);
      textField_54.setColumns(10);
      
      textField_55 = new JTextField();
      panel_1.add(textField_55);
      textField_55.setColumns(10);
      
      textField_56 = new JTextField();
      panel_1.add(textField_56);
      textField_56.setColumns(10);
      
      textField_57 = new JTextField();
      panel_1.add(textField_57);
      textField_57.setColumns(10);
      
      textField_58 = new JTextField();
      panel_1.add(textField_58);
      textField_58.setColumns(10);
      
      textField_59 = new JTextField();
      panel_1.add(textField_59);
      textField_59.setColumns(10);
      
      textField_60 = new JTextField();
      panel_1.add(textField_60);
      textField_60.setColumns(10);
      
      textField_61 = new JTextField();
      panel_1.add(textField_61);
      textField_61.setColumns(10);
      
      btnNewButton_1 = new JButton("\uCD94\uAC00");
      btnNewButton_1.addMouseListener(new MouseAdapter() {
         @Override
         public void mouseClicked(MouseEvent e) {
            String Army_id = textField.getText();
            String Vacation = textField_4.getText();
            MemberAll m = new MemberAll(Army_id, Vacation);
         // 로그인
         MemberAll UpdateVacation = service.VacationUpdate(m);//회원정보 넘겨주기 리턴설계 로그인성공시 객체를 리턴을 받고 화면을 넘어다녀도 계속유지되도록한다.
         if(UpdateVacation==null) {
            JOptionPane.showMessageDialog(frame,
                  "등록 성공.");
            
         }else {
            JOptionPane.showMessageDialog(frame,
                  "등록 실패 군번을 확인해주세요");
            
            
         }
            
            
            
            
            
         }
         
         
         
      });
      btnNewButton_1.setFont(new Font("굴림", Font.BOLD, 12));
      btnNewButton_1.setBounds(218, 23, 64, 23);
      panel.add(btnNewButton_1);

      int x = 80;
      
      for (int j = 0; j < numOfDay; j++) {
         JLabel lblNewLabel1 = new JLabel((j+1)+"");
         lblNewLabel1.setBounds(309 + (j * 26), 55, 30,25);
         panel.add(lblNewLabel1);
      
      }
      for (int i = 0; i < 15; i++) {

         for (int j = 0; j < numOfDay; j++) {
            JButton btnNewButton = new JButton("");
            btnNewButton.setBackground(new Color(255, 255, 255));
            btnNewButton.addMouseListener(new MouseAdapter() {
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
               }
               
            });
            btnNewButton.setBounds(300 + (j * 26), x, 25,25);
            panel.add(btnNewButton);
         }
         x += 30;
      }

   }
}