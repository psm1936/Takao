package ADMINGUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import BOOKGUI.RentBookGUI;
import STARTGUI.InoutGUI;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;

public class AdminMainGUI {

   private JFrame frame;

  

   /**
    * Create the application.
    */
   public AdminMainGUI() {
      initialize();
      frame.setVisible(true);
   }

   /**
    * Initialize the contents of the frame.
    */
   private void initialize() {
      frame = new JFrame();
      frame.setBounds(100, 100, 400, 540);
      frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      frame.getContentPane().setLayout(null);
      
      JButton button = new JButton("\uD68C\uC6D0\uAD00\uB9AC"); // 회원관리버튼
      button.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 20));
      button.setBackground(Color.ORANGE);
      button.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
        	 
        	 new AdminMemberGUI();
         }
      });
      button.setBounds(67, 160, 250, 51);
      frame.getContentPane().add(button);
      
      JButton button_1 = new JButton("\uB3C4\uC11C\uAD00\uB9AC"); //도서관리 버튼
      button_1.setBackground(Color.ORANGE);
      button_1.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 20));
      button_1.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
        	 new AdminBookGUI();
        	 
         }
         
         
      });
      button_1.setBounds(67, 248, 250, 51);
      frame.getContentPane().add(button_1);
      
      JButton button_2 = new JButton("\uB300\uC5EC\uB3C4\uC11C\uAD00\uB9AC"); //대여도서관리 버튼
      button_2.setBackground(Color.ORANGE);
      button_2.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 20));
      button_2.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
        	
        	new RentBookGUI();
        	

        	  
         }
      });
      button_2.setBounds(67, 333, 250, 51);
      frame.getContentPane().add(button_2);
      
      JButton button_3 = new JButton("\uC785\uC2E4/\uD1F4\uC2E4\uAD00\uB9AC"); // 입출입관리 버튼
      button_3.setBackground(Color.ORANGE);
      button_3.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 20));
      button_3.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
        	 new InoutGUI();
        	 
         }
      });
      button_3.setBounds(67, 420, 250, 51);
      frame.getContentPane().add(button_3);
      
      JPanel panel = new JPanel();
      panel.setBounds(0, 10, 384, 121);
      frame.getContentPane().add(panel);
      panel.setLayout(new GridLayout(1, 0, 0, 0));
      
      JLabel lblNewLabel = new JLabel("\uAD00 \uB9AC \uC790");
      lblNewLabel.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 45));
      lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
      panel.add(lblNewLabel);
   }

}