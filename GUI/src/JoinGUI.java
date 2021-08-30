import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import DAO.MemberDAO;

public class JoinGUI {

	private JFrame frame;
	private JTextField tf_id;
	private JTextField tf_pw;
	private JTextField tf_name;

	
	/**
	 * Create the application.
	 */
	public JoinGUI() {
		initialize();
		frame.setVisible(true);
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 291, 439);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("JOIN");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Consolas", Font.BOLD, 25));
		lblNewLabel.setBounds(103, 27, 72, 33);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lbl_ID = new JLabel("ID :");
		lbl_ID.setBounds(27, 79, 57, 15);
		frame.getContentPane().add(lbl_ID);
		
		JLabel lbl_PW = new JLabel("Password : ");
		lbl_PW.setBounds(27, 123, 90, 15);
		frame.getContentPane().add(lbl_PW);
		
		JLabel lbl_Name = new JLabel("Name : ");
		lbl_Name.setBounds(27, 175, 57, 15);
		frame.getContentPane().add(lbl_Name);
		
		JLabel lbl_Gender = new JLabel("Gender : ");
		lbl_Gender.setBounds(27, 232, 57, 15);
		frame.getContentPane().add(lbl_Gender);
		
		tf_id = new JTextField();
		tf_id.setBounds(111, 76, 134, 21);
		frame.getContentPane().add(tf_id);
		tf_id.setColumns(10);
		
		tf_pw = new JTextField();
		tf_pw.setBounds(111, 120, 134, 21);
		frame.getContentPane().add(tf_pw);
		tf_pw.setColumns(10);
		
		tf_name = new JTextField();
		tf_name.setBounds(111, 172, 134, 21);
		frame.getContentPane().add(tf_name);
		tf_name.setColumns(10);
		
		//라디오 버튼을 그룹으로 묶기 위해 버튼 그룹 생성
		ButtonGroup gender = new ButtonGroup();
		
		JRadioButton rb_male = new JRadioButton("Male");
		rb_male.setBounds(103, 228, 57, 23);
		frame.getContentPane().add(rb_male);
		
		JRadioButton rb_female = new JRadioButton("Female");
		rb_female.setBounds(171, 228, 80, 23);
		frame.getContentPane().add(rb_female);
		
		//버튼 그룹에 라디오 버튼 추가
		gender.add(rb_male);
		gender.add(rb_female);
		
		
		JLabel lbl_Hobby = new JLabel("Hobby : ");
		lbl_Hobby.setBounds(27, 287, 57, 15);
		frame.getContentPane().add(lbl_Hobby);
		
		JCheckBox chk_soccer = new JCheckBox("\uCD95\uAD6C");
		chk_soccer.setBounds(89, 283, 57, 23);
		frame.getContentPane().add(chk_soccer);
		
		JCheckBox chk_basket = new JCheckBox("\uB18D\uAD6C");
		chk_basket.setBounds(150, 283, 57, 23);
		frame.getContentPane().add(chk_basket);
		
		JCheckBox chk_base = new JCheckBox("\uC57C\uAD6C");
		chk_base.setBounds(211, 283, 56, 23);
		frame.getContentPane().add(chk_base);
		
		JButton btn_reset = new JButton("RESET");
		btn_reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf_id.setText("");
				tf_pw.setText("");
				tf_name.setText("");
				//라디오버튼 -> 초기화 불가능.
				chk_soccer.setSelected(false);//false = 체크 안 된 상태, true=체크 된 상태.
				chk_basket.setSelected(false);
				chk_base.setSelected(false);
			}
		});
		btn_reset.setBounds(27, 348, 97, 23);
		frame.getContentPane().add(btn_reset);
		
		JButton btn_join = new JButton("JOIN");
		btn_join.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = tf_id.getText();
				String pw = tf_id.getText();
				String name = tf_id.getText();
				
				//if, else if단일 선택(택1)
				String gender="";
				if(rb_male.isSelected()) {
					gender = "male";
				}else if(rb_female.isSelected()){
					gender = "female";
				}
				
				//if 여러개 - 다중(중복) 선택 가능
				String hobby="";
				if(chk_soccer.isSelected()) {
					hobby += "축구";
				}if(chk_basket.isSelected()) {
					hobby += "농구";
				}if(chk_base.isSelected()) {
					hobby += "야구";
				}
				
				//모든 값을 입력해야지만 가입이 되도록 선택 강제함.
				if(!id.equals("")&&!pw.equals("")&&!name.equals("")&&!gender.equals("")&&!hobby.equals("")) {
					MemberDAO dao = new MemberDAO();
					int cnt = dao.joinInsert(id, pw, name, gender, hobby);
					
					if(cnt>0) {//잘 삽입이 됐다면
						JOptionPane.showMessageDialog(null, "회원가입 성공!");
						//회원가입 성공하면 로그인 join페이지로 돌아가기
						new LoginJoin();
						frame.dispose();
					}else {
						JOptionPane.showMessageDialog(null, "회원가입 실패","회원가입",JOptionPane.ERROR_MESSAGE);
					}
				}else {
					JOptionPane.showMessageDialog(null, "모든 정보를 입력하시오", "회원가입",JOptionPane.ERROR_MESSAGE);
				}
				
			}
		});
		btn_join.setBounds(148, 348, 97, 23);
		frame.getContentPane().add(btn_join);
	}

}
