package STARTGUI;

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

import DAO.MemberDAO;
import VO.MemberVO;

import java.awt.Color;

public class JoinGUI {

	private JFrame frame;
	private JTextField tf_id;
	private JTextField tf_pw;
	private JTextField tf_name;
	private JTextField tf_tel;
	private JTextField tf_address;
	private JTextField tf_pw1;

	

	/**
	 * Create the application.
	 */
	public JoinGUI() {
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
		
		JLabel lblNewLabel = new JLabel("\uC544\uC774\uB514 ");
		lblNewLabel.setBounds(71, 147, 97, 15);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel label = new JLabel("\uBE44\uBC00\uBC88\uD638 ");
		label.setBounds(71, 188, 97, 15);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("\uC774\uB984 ");
		label_1.setBounds(71, 279, 95, 15);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("\uC804\uD654\uBC88\uD638 ");
		label_2.setBounds(71, 325, 95, 15);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("\uC8FC\uC18C ");
		label_3.setBounds(71, 371, 95, 15);
		frame.getContentPane().add(label_3);
		
		tf_id = new JTextField();
		tf_id.setBounds(71, 162, 250, 21);
		frame.getContentPane().add(tf_id);
		tf_id.setColumns(10);
		
		tf_pw = new JTextField();
		tf_pw.setColumns(10);
		tf_pw.setBounds(71, 202, 250, 21);
		frame.getContentPane().add(tf_pw);
		
		tf_pw1 = new JTextField();
		tf_pw1.setBounds(71, 248, 250, 21);
		frame.getContentPane().add(tf_pw1);
		tf_pw1.setColumns(10);
		
		tf_name = new JTextField();
		tf_name.setColumns(10);
		tf_name.setBounds(71, 294, 250, 21);
		frame.getContentPane().add(tf_name);
		
		tf_tel = new JTextField();
		tf_tel.setColumns(10);
		tf_tel.setBounds(71, 340, 250, 21);
		frame.getContentPane().add(tf_tel);
		
		tf_address = new JTextField();
		tf_address.setColumns(10);
		tf_address.setBounds(71, 386, 250, 21);
		frame.getContentPane().add(tf_address);
		
		JLabel lblNewLabel_1 = new JLabel("\uD68C\uC6D0\uAC00\uC785");
		lblNewLabel_1.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 35));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(0, 30, 384, 59);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("\uB4F1\uB85D");
		btnNewButton.setBackground(Color.ORANGE);
		btnNewButton.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = tf_id.getText();
				String pw = tf_pw.getText();
				String pw1 = tf_pw1.getText();
				String name = tf_name.getText();
				String tel = tf_tel.getText();
				String address = tf_address.getText();
				
												
				if(!id.equals("")&&!pw.equals("")&&!name.equals("")&&!tel.equals("")&&!address.equals("")&&!pw1.equals("")&&pw.equals(pw1)) {
					MemberDAO dao = new MemberDAO();
					int cnt = dao.joininsert(id, pw, name, tel, address);
					
					if(pw.equals(pw1) && cnt>0) {
						JOptionPane.showMessageDialog(null, "회원가입 성공");
						new LoginJoin();
						frame.dispose();
					}else {
						//=================================================================== 중복 되는 아이디 코드  시작
						ArrayList<MemberVO> al= new ArrayList<MemberVO>();
						
						al=dao.OneSelect();
						 id = tf_id.getText();
						
						int sum=0;//중복 아이디 더하는 변수
						for(int i=0;i<al.size();i++) {
							if(!al.get(i).getId().equals(id)) {
								sum++;
							}		
						}
						if(sum==al.size()) {
							JOptionPane.showMessageDialog(null, "회원가입 실패", "회원가입", JOptionPane.ERROR_MESSAGE);
							
						}else {
							JOptionPane.showMessageDialog(null, "중복 되는 아이디가 존재 합니다.", "회원가입", JOptionPane.ERROR_MESSAGE);
						}
//====================================================================== 중복 되는 아이디 코드 끝
					}
				}else if(!pw.equals("")&&!pw1.equals("")&&!pw.equals(pw1)) {
					JOptionPane.showMessageDialog(null, "같은 비밀번호를 입력하세요.", "회원가입", JOptionPane.ERROR_MESSAGE);
				}
				else {
					JOptionPane.showMessageDialog(null, "모든 정보를 입력하세요.", "회원가입", JOptionPane.ERROR_MESSAGE);
				}
				
			}
		});
		btnNewButton.setBounds(69, 428, 250, 51);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("\uBE44\uBC00\uBC88\uD638 \uD655\uC778 ");
		lblNewLabel_2.setBounds(69, 233, 97, 15);
		frame.getContentPane().add(lblNewLabel_2);
	}
}
