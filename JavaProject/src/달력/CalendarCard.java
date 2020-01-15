package ´Þ·Â;

import javax.swing.JPanel;

import javax.swing.JLabel;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import java.awt.Font;

public class CalendarCard extends JPanel {

   /**
    * Create the panel.
    */
   public CalendarCard(String month, int numOfDay) {
      setLayout(null);
      
      JScrollPane scrollPane = new JScrollPane();
      scrollPane.setBounds(28, 10, 693, 428);
      add(scrollPane);
      
      JPanel panel = new JPanel();
      scrollPane.setViewportView(panel);
      panel.setLayout(null);
      panel.setPreferredSize(new Dimension(1600, 600));
      
      JLabel label = new JLabel("1\uC6D4");
      label.setFont(new Font("±¼¸²", Font.BOLD, 16));
      label.setBounds(81, 0, 76, 37);
      panel.add(label);
      label.setText(month);
      
      JLabel lblNewLabel = new JLabel("\uAD70\uBC88");
      lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
      lblNewLabel.setBounds(12, 47, 76, 15);
      panel.add(lblNewLabel);
      
      JLabel lblNewLabel_1 = new JLabel("\uACC4\uAE09");
      lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
      lblNewLabel_1.setBounds(72, 47, 57, 15);
      panel.add(lblNewLabel_1);
      
      JLabel label_1 = new JLabel("\uC774\uB984");
      label_1.setHorizontalAlignment(SwingConstants.CENTER);
      label_1.setBounds(127, 47, 57, 15);
      panel.add(label_1);
      
      int x = 50;
      
      for (int i = 0; i < 14; i++) {	
    	  for (int j = 0; j < numOfDay; j++) {
    		  JButton btnNewButton = new JButton((j+1)+"");
    		  btnNewButton.setBounds(200+(j*45), x, 50, 45);
    		  panel.add(btnNewButton);    
    	  }
    	  x+=50;
	}
      


   }
}