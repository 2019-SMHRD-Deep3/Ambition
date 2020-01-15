package �޷�;

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
      
      JPanel �޷��г� = new JPanel();
      panel.add(�޷��г�, "name_2770846906562300");
      �޷��г�.setLayout(null);
      
      JPanel �޷º� = new JPanel();
      �޷º�.setBounds(12, 75, 772, 441);
      �޷��г�.add(�޷º�);
      cardLayout = new CardLayout(0, 0);
      �޷º�.setLayout(cardLayout);
      
      for (int i = 0; i < 12; i++) {
         �޷º�.add(new CalendarCard((i+1)+"��",numOfdays[i]));
      }
      
      JButton btnNewButton = new JButton("\uC774\uC804\uB2EC");
      btnNewButton.addMouseListener(new MouseAdapter() {
         @Override
         public void mouseClicked(MouseEvent e) {
            cardLayout.previous(�޷º�);
         }
      });
      btnNewButton.setBounds(627, 526, 69, 23);
      �޷��г�.add(btnNewButton);
      
      JButton btnNewButton_1 = new JButton("\uB2E4\uC74C\uB2EC");
      btnNewButton_1.addMouseListener(new MouseAdapter() {
         @Override
         public void mouseClicked(MouseEvent e) {
            cardLayout.next(�޷º�);
         }
      });
      btnNewButton_1.setBounds(711, 526, 73, 23);
      �޷��г�.add(btnNewButton_1);
      
      JPanel �������г� = new JPanel();
      panel.add(�������г�, "name_2770835940909300");
      
      JPanel �λ�����г� = new JPanel();
      panel.add(�λ�����г�, "name_2770810332159300");
   }
}
	