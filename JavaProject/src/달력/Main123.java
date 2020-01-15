package 달력;

import java.awt.EventQueue;

import javax.swing.JFrame;

import javax.swing.JPanel;
import java.awt.CardLayout;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Main123 {

   private JFrame frame;
   private CardLayout cardLayout;
   private int[] numOfdays = {31,28,30,31,30,31,28,30,31,30,31,30};
   /**
    * Launch the application.
    */
   public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
               Main123 window = new Main123();
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
   public Main123() {
      initialize();
   }

   /**
    * Initialize the contents of the frame.
    */
   private void initialize() {
      frame = new JFrame();
      frame.setBounds(100, 100, 800, 598);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.getContentPane().setLayout(null);
      
      JPanel panel = new JPanel();
      panel.setBounds(0, 0, 784, 559);
      frame.getContentPane().add(panel);
      panel.setLayout(new CardLayout(0, 0));
      
      JPanel 달력패널 = new JPanel();
      panel.add(달력패널, "name_2770846906562300");
      달력패널.setLayout(null);
      
      JPanel 달력뷰 = new JPanel();
      달력뷰.setBounds(12, 75, 772, 441);
      달력패널.add(달력뷰);
      cardLayout = new CardLayout(0, 0);
      달력뷰.setLayout(cardLayout);
      
      for (int i = 0; i < 12; i++) {
         달력뷰.add(new CalendarCard((i+1)+"월",numOfdays[i]));
      }
      
      JButton btnNewButton = new JButton("\uC774\uC804\uB2EC");
      btnNewButton.addMouseListener(new MouseAdapter() {
         @Override
         public void mouseClicked(MouseEvent e) {
            cardLayout.previous(달력뷰);
         }
      });
      btnNewButton.setBounds(627, 526, 69, 23);
      달력패널.add(btnNewButton);
      
      JButton btnNewButton_1 = new JButton("\uB2E4\uC74C\uB2EC");
      btnNewButton_1.addMouseListener(new MouseAdapter() {
         @Override
         public void mouseClicked(MouseEvent e) {
            cardLayout.next(달력뷰);
         }
      });
      btnNewButton_1.setBounds(711, 526, 73, 23);
      달력패널.add(btnNewButton_1);
      
      JPanel 조직도패널 = new JPanel();
      panel.add(조직도패널, "name_2770835940909300");
      
      JPanel 인사관리패널 = new JPanel();
      panel.add(인사관리패널, "name_2770810332159300");
   }
}
	