package MEMBERGUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import BOOKGUI.MemberBookGUI;
import DAO.BookDAO;
import DAO.MemberinoutDAO;
import DAO.RentBookDAO;
import VO.AllVO;
import VO.BookVO;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Font;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.SystemColor;

public class MemberMainGUI {

	private JFrame frame;
	private JTextField tf_text;
	private JTable table;
	BookDAO dao = new BookDAO();
	MemberinoutDAO dao1 = new MemberinoutDAO();
	RentBookDAO redao = new RentBookDAO();
	ArrayList<BookVO> al = null;
	JScrollPane scrollPane = null;
	String choice = "";
	String searchText = "";
	int book_no = 0;
	BookVO vo = null;
	ArrayList<AllVO> myRental = null;
	String id = "";
	int cnt = 0;
	
	

	/**
	 * Create the application.
	 */
	public MemberMainGUI(String id) {
		this.id = id;
		initialize();
		frame.setVisible(true);

	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 934, 540);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		tf_text = new JTextField();
		tf_text.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tf_text.setText("");
			}
		});
		tf_text.setText(
				"\uAC80\uC0C9\uD558\uACE0\uC790 \uD558\uB294 \uB3C4\uC11C\uB97C \uC785\uB825\uD558\uC138\uC694.");
		tf_text.setBounds(118, 121, 350, 21);
		frame.getContentPane().add(tf_text);
		tf_text.setColumns(10);

		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "\uB3C4\uC11C\uBA85", "\uCD9C\uD310\uC0AC\uBA85",
				"\uC800\uC790\uBA85", "\uC7A5\uB974\uBA85" }));
		comboBox.setBounds(12, 121, 94, 21);
		frame.getContentPane().add(comboBox);

		JButton btnNewButton = new JButton("\uAC80\uC0C9"); // 도서 검색 버튼
		btnNewButton.setBackground(Color.ORANGE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				choice = (String) comboBox.getSelectedItem();
				searchText = tf_text.getText();
				al = dao.select(choice, searchText);
				new MemberBookGUI(al, id);

			}
		});
		btnNewButton.setBounds(480, 120, 70, 23);
		frame.getContentPane().add(btnNewButton);

		JPanel panel = new JPanel();
		panel.setBounds(12, 196, 704, 295);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 704, 295);
		panel.add(scrollPane);

		myRental = redao.memberSelect(id);
		String[] header = { "대여도서번호", "도서번호", "도서명", "회원 아이디", "회원 이름", "대여일", "반납일", "반납예정일" };
		// 컬럼값 (데이터) - 2차원배열
		String[][] data = new String[myRental.size()][8];

		//================================NULL값 없음======================================================
				int num=0;
				for (int i = myRental.size()-1; i >=0 ; i--) {
					
					for (int j = 0; j < 8; j++) {
						if (j == 0) {
							data[i][j] = "" + myRental.get(num).getNo();
						} else if (j == 1) {
							data[i][j] = "" + myRental.get(num).getBook_no();
						} else if (j == 2) {
							data[i][j] = myRental.get(num).getBook_name();
						} else if (j == 3) {
							data[i][j] = myRental.get(num).getId();
						} else if (j == 4) {
							data[i][j] = myRental.get(num).getName();
						} else if (j == 5) {
							data[i][j] = "" + myRental.get(num).getOutdate();
						} else if (j == 6) {
							String notdate =""+myRental.get(num).getIndate();				
							if(notdate.equals("null")) {
							data[i][j] = "";
							}else {
								data[i][j] = ""+myRental.get(num).getIndate();
							}
						} else if (j == 7) {
							data[i][j] = "" + myRental.get(num).getExdate();

						}
					}
					num++;
				}      
		//================================NULL값 없음===============================================
		table = new JTable(data, header); // 대여 도서 목록
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int row = table.getSelectedRow();
				String str = (String) table.getModel().getValueAt(row, 1);
				book_no = Integer.parseInt(str);
				vo = dao.oneSelect(book_no);

			}
		});
		scrollPane.setViewportView(table);

		JLabel lblNewLabel_2 = new JLabel("\uB300\uC5EC \uB3C4\uC11C \uBAA9\uB85D");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2.setBounds(12, 163, 120, 23);
		frame.getContentPane().add(lblNewLabel_2);
		
		JButton btnNewButton_2 = new JButton("\uB3C4\uC11C \uBC18\uB0A9"); // 도서 반납 버튼
		btnNewButton_2.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 15));
		btnNewButton_2.setBackground(Color.ORANGE);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int exitOption = JOptionPane.showConfirmDialog(null, "도서를 반납하시겠습니까?", "도서반납",
						JOptionPane.YES_NO_OPTION);
				
				// YES_OPTION은 0, NO_OPTION은 1, CLOSED_OPTION은 -1을 반환한다
				if (exitOption == JOptionPane.YES_OPTION) {
					if (vo.getRent() == '0') {//================================================   반납 할때 주는 점수 주는 코드
						JOptionPane.showMessageDialog(null, "이미 반납된 도서입니다.", "도서반납", JOptionPane.ERROR_MESSAGE);
						return;
					} else {
						int cnt = dao.rentinupdate(vo.getNo());
						dao.rentscore(id);
						int rentcnt = redao.indayUpdate(book_no);
						if (cnt > 0 && rentcnt > 0) {
							JOptionPane.showMessageDialog(null, "도서반납 성공");
							new MemberMainGUI(id);
							frame.dispose();
						} else {
							JOptionPane.showMessageDialog(null, "도서반납 실패", "도서대여", JOptionPane.ERROR_MESSAGE);
						}
					}//========================================================================= 반납 할때 주는 점수 주는 코드
				} else if ((exitOption == JOptionPane.NO_OPTION) || (exitOption == JOptionPane.CLOSED_OPTION)) {
					return; // 아무 작업도 하지 않고 다이얼로그 상자를 닫는다
				}
			}
		});
		JButton btn_in = new JButton("\uC785\uC2E4");
		btn_in.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 15));
		btn_in.setBackground(Color.ORANGE);
		btn_in.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						cnt  = dao1.InInsert(id);
					if(cnt==1) {
						JOptionPane.showMessageDialog(null, "입실 하셧습니다.");
						btn_in.setText("입실 중입니다.");
					}else if(cnt==0) {
						JOptionPane.showMessageDialog(null, "입실 실패하셧습니다.", "회원메인창", JOptionPane.ERROR_MESSAGE);
					}
				}
		});
		btn_in.setBounds(566, 71, 150, 25);
		frame.getContentPane().add(btn_in);
		//---------------------------------------------------------------------------- 퇴실
		JButton btn_out = new JButton("\uD1F4\uC2E4");
		btn_out.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 15));
		btn_out.setBackground(Color.ORANGE);
		btn_out.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				cnt  = dao1.Inupdate(id);
				if(cnt==1) {
					btn_in.setText("입 실");
					JOptionPane.showMessageDialog(null, "퇴실하셨습니다.");
				}else if(cnt==0) {
					JOptionPane.showMessageDialog(null, "이미퇴실 하셨습니다.", "회원메인창", JOptionPane.ERROR_MESSAGE);
				}
				
			}
		});
		btn_out.setBounds(566, 106, 150, 25);
		frame.getContentPane().add(btn_out);
		
		btnNewButton_2.setBounds(566, 146, 150, 40);
		frame.getContentPane().add(btnNewButton_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(12, 10, 456, 101);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(new GridLayout(1, 0, 0, 0));
		
				JLabel lblNewLabel = new JLabel("\uB3C4\uC11C \uAC80\uC0C9");
				lblNewLabel.setBackground(Color.WHITE);
				lblNewLabel.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 45));
				panel_1.add(lblNewLabel);
				
				JPanel panel_2 = new JPanel();
				panel_2.setBounds(728, 72, 178, 62);
				frame.getContentPane().add(panel_2);
				panel_2.setLayout(new GridLayout(1, 0, 0, 0));
				
						JLabel lblNewLabel_1 = new JLabel("\uB0B4\uAC00 \uB3C4\uC11C\uC655!");
						lblNewLabel_1.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 20));
						panel_2.add(lblNewLabel_1);
						lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
						
						JPanel panel_3 = new JPanel();
						panel_3.setBounds(728, 146, 178, 345);
						frame.getContentPane().add(panel_3);
						
						JPanel panel_4 = new JPanel();
						panel_4.setBounds(0, 0, 918, 501);
						frame.getContentPane().add(panel_4);
						panel_4.setLayout(new GridLayout(1, 0, 0, 0));
						
						JLabel lblNewLabel_3 = new JLabel("");
						panel_4.add(lblNewLabel_3);
						
	
		
	}
}
