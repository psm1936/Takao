import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import VO.MemberVO;

public class MainGUI {

	private JFrame frame;
	MemberVO vo = null;

	/**
	 * Create the application.
	 */
	public MainGUI(MemberVO vo) {
		//1. initialize 이전에 사용자의 정보를 가져온 후 초기화 해줘야 함.
		this.vo = vo;
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 395, 174);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lbl_member = new JLabel("");
		lbl_member.setFont(new Font("굴림", Font.PLAIN, 25));
		lbl_member.setBounds(184, 34, 150, 32);
		frame.getContentPane().add(lbl_member);
		
		//웰텀 옆에 이름 나오게 추가해줌.
		lbl_member.setText(vo.getName());

		JLabel lblNewLabel_1 = new JLabel("Welcome!");
		lblNewLabel_1.setFont(new Font("Sitka Heading", Font.BOLD, 32));
		lblNewLabel_1.setBounds(39, 34, 150, 32);
		frame.getContentPane().add(lblNewLabel_1);

		
		//관리자일 때만 볼 수 있게(회원관리 버튼)
		if(vo.getId().equals("admin")) {
			JButton btn_manage = new JButton("\uD68C\uC6D0\uAD00\uB9AC");
			btn_manage.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					new InfoGUI();
					frame.dispose();
				}
			});
			btn_manage.setBounds(237, 100, 97, 23);
			frame.getContentPane().add(btn_manage);
		}
		
	}

}
