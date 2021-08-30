package BOOKGUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import ADMINGUI.AdminBookGUI;
import DAO.BookDAO;
import VO.BookVO;
import java.awt.Font;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.Color;

public class BookUpdateGUI {

	private JFrame frame;
	private JTextField tf_name;
	private JTextField tf_comp;
	private JTextField tf_author;
	private JTextField tf_genre;
	private JTextField tf_text;
	private JTextField tf_doname;
	BookVO vo;
	
	
	
	/**
	 * Create the application.
	 */
	public BookUpdateGUI(BookVO vo) {
		this.vo = vo;
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
		
		JLabel lblNewLabel = new JLabel("\uB3C4\uC11C \uC81C\uBAA9 ");
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setBounds(66, 108, 97, 21);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel label = new JLabel("\uCD9C\uD310\uC0AC ");
		label.setHorizontalAlignment(SwingConstants.LEFT);
		label.setBounds(66, 160, 97, 21);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("\uC800\uC790 ");
		label_1.setHorizontalAlignment(SwingConstants.LEFT);
		label_1.setBounds(66, 211, 97, 21);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("\uC7A5\uB974 ");
		label_2.setHorizontalAlignment(SwingConstants.LEFT);
		label_2.setBounds(66, 263, 97, 21);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("\uC18C\uAC1C ");
		label_3.setHorizontalAlignment(SwingConstants.LEFT);
		label_3.setBounds(66, 315, 97, 21);
		frame.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("\uAE30\uBD80\uC790 ");
		label_4.setFont(new Font("굴림", Font.PLAIN, 12));
		label_4.setHorizontalAlignment(SwingConstants.LEFT);
		label_4.setBounds(66, 367, 97, 21);
		frame.getContentPane().add(label_4);
		
		tf_name = new JTextField();		
		tf_name.setBounds(66, 129, 250, 21);
		frame.getContentPane().add(tf_name);
		tf_name.setColumns(10);
		
		tf_comp = new JTextField();
		tf_comp.setColumns(10);
		tf_comp.setBounds(66, 180, 250, 21);
		frame.getContentPane().add(tf_comp);
		
		tf_author = new JTextField();
		tf_author.setColumns(10);
		tf_author.setBounds(66, 232, 250, 21);
		frame.getContentPane().add(tf_author);
		
		tf_genre = new JTextField();
		tf_genre.setColumns(10);
		tf_genre.setBounds(66, 284, 250, 21);
		frame.getContentPane().add(tf_genre);
		
		tf_text = new JTextField();
		tf_text.setColumns(10);
		tf_text.setBounds(66, 336, 250, 21);
		frame.getContentPane().add(tf_text);
		
		tf_doname = new JTextField();
		tf_doname.setColumns(10);
		tf_doname.setBounds(66, 388, 250, 21);
		frame.getContentPane().add(tf_doname);
		
		tf_name.setText(vo.getName());
		tf_comp.setText(vo.getComp());
		tf_author.setText(vo.getAuthor());
		tf_genre.setText(vo.getGenre());
		tf_text.setText(vo.getText());
		tf_doname.setText(vo.getDoname());
		
		
		
						
		
		
		
		JButton btnNewButton = new JButton("\uC218\uC815\uC644\uB8CC");
		btnNewButton.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 20));
		btnNewButton.setBackground(Color.ORANGE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String name = tf_name.getText();
				String comp = tf_comp.getText();
				String author = tf_author.getText();
				String genre = tf_genre.getText();
				String text = tf_text.getText();
				String doname = tf_doname.getText();
				
												
				if(!name.equals("")&&!comp.equals("")&&!author.equals("")&&!genre.equals("")) {
					BookDAO dao = new BookDAO();
					int cnt = dao.update(vo.getNo(),name, comp, author, genre, text, doname);
					
					if(cnt>0) {
						JOptionPane.showMessageDialog(null, "도서수정 성공");
						new AdminBookGUI();
						frame.dispose();
					}else {
						JOptionPane.showMessageDialog(null, "도서수정 실패", "도서수정", JOptionPane.ERROR_MESSAGE);
					}
				}
				else {
					JOptionPane.showMessageDialog(null, "모든 정보를 입력하세요.", "도서수정", JOptionPane.ERROR_MESSAGE);
				}
				
				
				
			}
		});
		btnNewButton.setBounds(66, 426, 250, 51);
		frame.getContentPane().add(btnNewButton);
		
		JPanel panel = new JPanel();
		panel.setBounds(66, 10, 250, 78);
		frame.getContentPane().add(panel);
		panel.setLayout(new GridLayout(1, 0, 0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("\uB3C4\uC11C \uC218\uC815");
		lblNewLabel_1.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 45));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_1);
	}

}
