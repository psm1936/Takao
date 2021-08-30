package STARTGUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import ADMINGUI.AdminMainGUI;
import DAO.AdminDAO;
import DAO.MemberDAO;
import MEMBERGUI.MemberMainGUI;
import VO.AdminVO;
import VO.MemberVO;

public class LoginGUI {

	private JFrame frame;
	private JTextField tf_id;
	private JTextField tf_pw;

	ImageIcon img1 = new ImageIcon("img/batang00.png");

	// 이미지 크기 변경
	Image changed_img1 = img1.getImage().getScaledInstance(434, 501, Image.SCALE_SMOOTH);
	ImageIcon changed_icon_img1 = new ImageIcon(changed_img1);

	/**
	 * Create the application.
	 */
	public LoginGUI() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 540);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("\uC544\uC774\uB514 ");
		lblNewLabel.setBounds(87, 190, 97, 33);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("\uBE44\uBC00\uBC88\uD638 ");
		lblNewLabel_1.setBounds(87, 248, 97, 33);
		frame.getContentPane().add(lblNewLabel_1);

		tf_id = new JTextField();
		tf_id.setBounds(87, 223, 250, 21);
		frame.getContentPane().add(tf_id);
		tf_id.setColumns(10);

		tf_pw = new JTextField();
		tf_pw.setColumns(10);
		tf_pw.setBounds(87, 281, 250, 21);
		frame.getContentPane().add(tf_pw);

		JButton btnNewButton = new JButton("\uB85C\uADF8\uC778");
		btnNewButton.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 20));
		btnNewButton.setBackground(Color.ORANGE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = tf_id.getText();
				String pw = tf_pw.getText();

				if (!id.equals("") && !pw.equals("") && !id.equals("admin")) {
					MemberDAO dao = new MemberDAO();
					MemberVO vo = dao.loginSelect(id, pw);

					if (vo != null) {
						JOptionPane.showMessageDialog(null, "로그인 성공");
						new MemberMainGUI(id);
						frame.dispose();
					} else {
						JOptionPane.showMessageDialog(null, "로그인 실패", "로그인", JOptionPane.ERROR_MESSAGE);
					}
				} else if (!id.equals("") && !pw.equals("") && id.equals("admin")) {
					AdminDAO dao = new AdminDAO();
					AdminVO vo = dao.loginSelect(id, pw);

					if (vo != null) {
						JOptionPane.showMessageDialog(null, "관리자 로그인 성공");
						new AdminMainGUI();
						frame.dispose();
					} else {
						JOptionPane.showMessageDialog(null, "관리자 로그인 실패", "로그인", JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(null, "모든 정보를 입력하세요.", "로그인", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnNewButton.setBounds(87, 340, 250, 51);
		frame.getContentPane().add(btnNewButton);

		JButton button = new JButton("\uCDE8\uC18C");
		button.setBackground(Color.ORANGE);
		button.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 20));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new LoginJoin();
				frame.dispose();
			}
		});
		button.setBounds(87, 419, 250, 51);
		frame.getContentPane().add(button);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 434, 501);
		frame.getContentPane().add(panel);
		panel.setLayout(new GridLayout(1, 0, 0, 0));
		
		JLabel lblNewLabel_2 = new JLabel("");
		panel.add(lblNewLabel_2);
		lblNewLabel_2.setIcon(changed_icon_img1);
	}

}
