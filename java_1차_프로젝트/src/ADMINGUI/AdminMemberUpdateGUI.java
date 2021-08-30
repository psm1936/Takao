package ADMINGUI;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import DAO.BookDAO;
import DAO.MemberDAO;
import VO.MemberVO;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.Color;

public class AdminMemberUpdateGUI {

	private JFrame frame;
	private JTextField tf_id;
	private JTextField tf_pw;
	private JTextField tf_name;
	private JTextField tf_tel;
	private JTextField tf_addr;
	private JTextField tf_donscore;
	private JTextField tf_readscore;
	private JTextField tf_adminid;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	MemberVO vo;
	String idget;
	ArrayList<MemberVO> al = null;
	MemberDAO dao = new MemberDAO();
	String member_id;
	private JPanel panel;
	private JLabel lblNewLabel;
	
	

	

	/**
	 * Create the application.
	 */
	public AdminMemberUpdateGUI(MemberVO vo) {
		
		this.vo = vo;
		initialize();
		frame.setVisible(true);
		
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 400, 620);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblId = new JLabel("\uC544\uC774\uB514");
		lblId.setHorizontalAlignment(SwingConstants.LEFT);
		lblId.setBounds(70, 84, 57, 15);
		frame.getContentPane().add(lblId);
		
		JLabel label_2 = new JLabel("\uBE44\uBC00\uBC88\uD638");
		label_2.setHorizontalAlignment(SwingConstants.LEFT);
		label_2.setBounds(70, 128, 57, 15);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("\uC774\uB984");
		label_3.setHorizontalAlignment(SwingConstants.LEFT);
		label_3.setBounds(70, 174, 57, 15);
		frame.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("\uC804\uD654\uBC88\uD638");
		label_4.setHorizontalAlignment(SwingConstants.LEFT);
		label_4.setBounds(70, 219, 57, 15);
		frame.getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("\uC8FC\uC18C");
		label_5.setHorizontalAlignment(SwingConstants.LEFT);
		label_5.setBounds(70, 265, 57, 15);
		frame.getContentPane().add(label_5);
		
		JLabel label_6 = new JLabel("\uAE30\uBD80\uC810\uC218");
		label_6.setHorizontalAlignment(SwingConstants.LEFT);
		label_6.setBounds(70, 310, 57, 15);
		frame.getContentPane().add(label_6);
		
		JLabel label_7 = new JLabel("\uB300\uCD9C\uC810\uC218");
		label_7.setHorizontalAlignment(SwingConstants.LEFT);
		label_7.setBounds(70, 356, 57, 15);
		frame.getContentPane().add(label_7);
		
		JLabel label_8 = new JLabel("\uAD00\uB9AC\uC790");
		label_8.setHorizontalAlignment(SwingConstants.LEFT);
		label_8.setBounds(70, 397, 57, 15);
		frame.getContentPane().add(label_8);
		
		tf_id = new JTextField();
		tf_id.setBounds(70, 97, 250, 21);
		frame.getContentPane().add(tf_id);
		tf_id.setColumns(10);
		
		tf_pw = new JTextField();
		tf_pw.setColumns(10);
		tf_pw.setBounds(70, 143, 250, 21);
		frame.getContentPane().add(tf_pw);
		
		tf_name = new JTextField();
		tf_name.setColumns(10);
		tf_name.setBounds(70, 188, 250, 21);
		frame.getContentPane().add(tf_name);
		
		tf_tel = new JTextField();
		tf_tel.setColumns(10);
		tf_tel.setBounds(70, 234, 250, 21);
		frame.getContentPane().add(tf_tel);
		
		tf_addr = new JTextField();
		tf_addr.setColumns(10);
		tf_addr.setBounds(70, 279, 250, 21);
		frame.getContentPane().add(tf_addr);
		
		tf_donscore = new JTextField();
		tf_donscore.setColumns(10);
		tf_donscore.setBounds(70, 325, 250, 21);
		frame.getContentPane().add(tf_donscore);
		
		tf_readscore = new JTextField();
		tf_readscore.setColumns(10);
		tf_readscore.setBounds(70, 371, 250, 21);
		frame.getContentPane().add(tf_readscore);
		
		tf_adminid = new JTextField();
		tf_adminid.setColumns(10);
		tf_adminid.setBounds(70, 411, 250, 21);
		frame.getContentPane().add(tf_adminid);
		
		
		
		tf_id.setText(vo.getId());
		tf_pw.setText(vo.getPw());
		tf_name.setText(vo.getName());
		tf_tel.setText(vo.getTel());
		tf_addr.setText(vo.getAddress());
		tf_donscore.setText(Integer.toString(vo.getDonscore()));
		tf_readscore.setText(Integer.toString(vo.getReadscore()));
		tf_adminid.setText((vo.getAdmin_id()));
		
		
//		int doname = Integer.parseInt(tf_doname.getText());
		
		btnNewButton = new JButton("\uC218\uC815");
		btnNewButton.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 20));
		btnNewButton.setBackground(Color.ORANGE);
		btnNewButton.addActionListener(new ActionListener() { // 수정하기버튼
			public void actionPerformed(ActionEvent e) {
				String id = tf_id.getText();
				String pw = tf_pw.getText();
				String name = tf_name.getText();
				String tel = tf_tel.getText();
				String addr = tf_addr.getText();
				int donscore = Integer.parseInt(tf_donscore.getText());
				int readscore = Integer.parseInt(tf_readscore.getText());
				String adminid = tf_adminid.getText();
				if(!name.equals("")&&!tel.equals("")&&!addr.equals("")&&!adminid.equals("")) {
					MemberDAO dao = new MemberDAO();
					int cnt = dao.update(vo.getId(),pw, name, tel, addr, donscore, readscore,adminid);
					
					
					if(cnt>0) {
						JOptionPane.showMessageDialog(null, "회원정보수정 성공");
						frame.dispose();
					}else {
						JOptionPane.showMessageDialog(null, "회원정보수정 실패", "회원정보수정", JOptionPane.ERROR_MESSAGE);
					}
				}
				else {
					JOptionPane.showMessageDialog(null, "모든 정보를 입력하세요.", "도서수정", JOptionPane.ERROR_MESSAGE);
				}
				
				
				
			}
		});
		btnNewButton.setBounds(70, 442, 250, 51);
		frame.getContentPane().add(btnNewButton);
		
		btnNewButton_1 = new JButton("\uC0AD\uC81C");
		btnNewButton_1.setBackground(Color.ORANGE);
		btnNewButton_1.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 20));
		btnNewButton_1.addActionListener(new ActionListener() { //삭제 버튼
			public void actionPerformed(ActionEvent e) {
				
				int exitOption = JOptionPane.showConfirmDialog(null, "삭제하시겠습니까?", "회원삭제", JOptionPane.YES_NO_OPTION);

				// YES_OPTION은 0, NO_OPTION은 1, CLOSED_OPTION은 -1을 반환한다
				if (exitOption == JOptionPane.YES_OPTION) {
					boolean result = dao.delete(vo.getId());
					
					if (result == true) {
						
						JOptionPane.showMessageDialog(null, "회원삭제 성공");
						frame.dispose();
						new AdminMemberGUI();
						
					} else {
						JOptionPane.showMessageDialog(null, "회원삭제 실패", "회원삭제", JOptionPane.ERROR_MESSAGE);
					}
				} else if ((exitOption == JOptionPane.NO_OPTION) || (exitOption == JOptionPane.CLOSED_OPTION)) {
					return; // 아무 작업도 하지 않고 다이얼로그 상자를 닫는다
				}
				
			}
		});
		btnNewButton_1.setBounds(70, 503, 250, 51);
		frame.getContentPane().add(btnNewButton_1);
		
		panel = new JPanel();
		panel.setBounds(70, 10, 250, 64);
		frame.getContentPane().add(panel);
		panel.setLayout(new GridLayout(1, 0, 0, 0));
		
		lblNewLabel = new JLabel("\uD68C\uC6D0 \uC815\uBCF4");
		lblNewLabel.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 45));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel);
	}
}
