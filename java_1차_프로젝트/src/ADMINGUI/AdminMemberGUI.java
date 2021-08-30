package ADMINGUI;

import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import DAO.MemberDAO;
import VO.MemberVO;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;

public class AdminMemberGUI {

	private JFrame frame;
	private JTextField tf_text;

	MemberDAO dao = new MemberDAO();
	ArrayList<MemberVO> al = null;
	MemberVO vo = null;
	String choice = "";
	String searchText = "";
	private JTable table;

	public AdminMemberGUI() {

		al = dao.allSelect();
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 680, 570);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(12, 176, 640, 345);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
//		scrollPane.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseClicked(MouseEvent e) {
//				if (e.getClickCount() == 2) {
//
//					new AdminMemberUpdateGUI();
//
//				}
//
//			}
//		});
		scrollPane.setBounds(0, 0, 640, 345);
		panel.add(scrollPane);

		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				if (e.getClickCount() == 2) {
					int row = table.getSelectedRow();
					String idget = (String) table.getValueAt(row, 0);
					new AdminMemberUpdateGUI(vo);
				}
			}
		});
		frame.dispose();

		scrollPane.setViewportView(table);

		JButton btnNewButton = new JButton("\uC870\uD68C");
		btnNewButton.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 12));
		btnNewButton.setBackground(Color.ORANGE);
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "\uC544\uC774\uB514", "\uC774\uB984" }));
		comboBox.setBounds(12, 145, 94, 21);
		frame.getContentPane().add(comboBox);

		tf_text = new JTextField();
		tf_text.setBounds(113, 145, 350, 21);
		frame.getContentPane().add(tf_text);
		tf_text.setColumns(10);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { // 조회 버튼

				choice = (String) comboBox.getSelectedItem();
				searchText = tf_text.getText();
				al = dao.select(choice, searchText);

				String[] header = { "회원아이디", "회원비밀번호", "이름", "전화번호", "주소", "기부점수", "대여점수", "관리자" };
				// 컬럼값 (데이터) - 2차원배열
				String[][] data = new String[al.size()][8];
				for (int i = 0; i < al.size(); i++) {

					for (int j = 0; j < 8; j++) {
						if (j == 0) {
							data[i][j] = al.get(i).getId();
						} else if (j == 1) {
							data[i][j] = al.get(i).getPw();
						} else if (j == 2) {
							data[i][j] = al.get(i).getName();
						} else if (j == 3) {
							data[i][j] = al.get(i).getTel();
						} else if (j == 4) {
							data[i][j] = al.get(i).getAddress();
						} else if (j == 5) {
							data[i][j] = "" + al.get(i).getDonscore();
						} else if (j == 6) {
							data[i][j] = "" + al.get(i).getReadscore();
						} else if (j == 7) {
							data[i][j] = al.get(i).getAdmin_id();
						}
					}
				}
				DefaultTableModel mod = new DefaultTableModel(data, header) {
					@Override
					public boolean isCellEditable(int rowIndex, int mColIndex) {
						return false;
					}
				};
				table = new JTable(mod);
				table.addMouseListener(new MouseAdapter() {

				});
				scrollPane.setViewportView(table);

			}
		});
		btnNewButton.setBounds(475, 143, 70, 23);
		frame.getContentPane().add(btnNewButton);

		JButton button = new JButton("\uC804\uCCB4\uC870\uD68C");
		button.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 12));
		button.setBackground(Color.ORANGE);

		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) { // 전체조회버튼

				al = dao.allSelect();

				String[] header = { "회원아이디", "회원비밀번호", "이름", "전화번호", "주소", "기부점수", "대여점수", "관리자" };
				// 컬럼값 (데이터) - 2차원배열
				String[][] data = new String[al.size()][8];
				for (int i = 0; i < al.size(); i++) {

					for (int j = 0; j < 8; j++) {
						if (j == 0) {
							data[i][j] = al.get(i).getId();
						} else if (j == 1) {
							data[i][j] = al.get(i).getPw();
						} else if (j == 2) {
							data[i][j] = al.get(i).getName();
						} else if (j == 3) {
							data[i][j] = al.get(i).getTel();
						} else if (j == 4) {
							data[i][j] = al.get(i).getAddress();
						} else if (j == 5) {
							data[i][j] = "" + al.get(i).getDonscore();
						} else if (j == 6) {
							data[i][j] = "" + al.get(i).getReadscore();
						} else if (j == 7) {
							data[i][j] = al.get(i).getAdmin_id();
						}
					}
				}
				DefaultTableModel mod = new DefaultTableModel(data, header) {
					@Override
					public boolean isCellEditable(int rowIndex, int mColIndex) {
						return false;
					}
				};
				table = new JTable(mod);
				table.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {

						if (e.getClickCount() == 2) {
							int row = table.getSelectedRow();
							String idget = (String) table.getValueAt(row, 0);
							vo = dao.oneSelect(idget);
							new AdminMemberUpdateGUI(vo);

						}
					}
				});
				scrollPane.setViewportView(table);

			}

		});
		button.setBounds(557, 143, 95, 23);
		frame.getContentPane().add(button);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(12, 10, 640, 125);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(new GridLayout(1, 0, 0, 0));

		JLabel lblNewLabel = new JLabel("\uD68C\uC6D0 \uAD00\uB9AC");
		lblNewLabel.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 45));
		panel_1.add(lblNewLabel);

	}
}
