package BOOKGUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import DAO.BookDAO;
import DAO.RentBookDAO;
import MEMBERGUI.MemberMainGUI;
import VO.BookVO;
import java.awt.GridLayout;
import java.awt.Font;
import java.awt.Color;

public class MemberBookGUI {

	private JFrame frame;
	private JTable table;
	BookDAO dao = new BookDAO();
	RentBookDAO redao = new RentBookDAO();
	ArrayList<BookVO> al = null;
	JScrollPane scrollPane = null;
	String choice = "";
	String searchText = "";
	int book_no = 0;
	BookVO vo = null;
	String id = "";
	
	
	/**
	 * Create the application.
	 */
	public MemberBookGUI(ArrayList<BookVO> al, String id) {
		this.al = al;
		this.id = id;
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
		panel.setBounds(12, 111, 640, 410);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 640, 410);
		panel.add(scrollPane);
				
		String[] header = { "도서번호", "도서제목", "출판사", "저자", "장르", "소개", "대출여부" };
		// 컬럼값 (데이터) - 2차원배열
		String[][] data = new String[al.size()][7];
		
		for (int i = 0; i < al.size(); i++) {
			for (int j = 0; j < 7; j++) {
				if (j == 0) {
					data[i][j] = "" + al.get(i).getNo();
				} else if (j == 1) {
					data[i][j] = al.get(i).getName();
				} else if (j == 2) {
					data[i][j] = al.get(i).getComp();
				} else if (j == 3) {
					data[i][j] = al.get(i).getAuthor();
				} else if (j == 4) {
					data[i][j] = al.get(i).getGenre();
				} else if (j == 5) {
					data[i][j] = al.get(i).getText();
				} else if (j == 6) {
					//==============================대여유무 판단=========================================	
					String check = "" + al.get(i).getRent();
				
					if(check.equals("0")) {
						data[i][j]="대여 가능";
					}else if(check.equals("1")) {
						data[i][j]="대여중";
					}
//==============================대여유무 판단=========================================	
				}
			}
		}
		table = new JTable(data, header);
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int row = table.getSelectedRow();
				String str = (String) table.getModel().getValueAt(row, 0);
				book_no = Integer.parseInt(str);
				vo = dao.memberoneSelect(book_no);
			}
		});
		scrollPane.setViewportView(table);

		JButton btnNewButton = new JButton("\uB3C4\uC11C \uB300\uC5EC"); // 대여버튼
		btnNewButton.setBackground(Color.ORANGE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int exitOption = JOptionPane.showConfirmDialog(null, "도서를 대여하시겠습니까?", "도서대여",
						JOptionPane.YES_NO_OPTION);

				// YES_OPTION은 0, NO_OPTION은 1, CLOSED_OPTION은 -1을 반환한다
				if (exitOption == JOptionPane.YES_OPTION) {
					if (vo.getRent() == '1') {
						JOptionPane.showMessageDialog(null, "이미 대여된 도서입니다.", "도서대여", JOptionPane.ERROR_MESSAGE);
						return;
					} else {
						int cnt = dao.rentoutupdate(vo.getNo());
						int cntRent = redao.rentbookInsert(vo.getNo(), id);
						if (cnt > 0 && cntRent > 0) {
							JOptionPane.showMessageDialog(null, "도서대여 성공");	
							new MemberMainGUI(id);
							frame.dispose();
						} else {
							JOptionPane.showMessageDialog(null, "도서 대여 실패", "도서대여", JOptionPane.ERROR_MESSAGE);
						}
					}
				} else if ((exitOption == JOptionPane.NO_OPTION) || (exitOption == JOptionPane.CLOSED_OPTION)) {
					return; // 아무 작업도 하지 않고 다이얼로그 상자를 닫는다
				}

			}
		});
		btnNewButton.setBounds(502, 65, 150, 40);
		frame.getContentPane().add(btnNewButton);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(12, 10, 366, 91);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(new GridLayout(1, 0, 0, 0));
		
		JLabel lblNewLabel = new JLabel("\uAC80\uC0C9 \uB3C4\uC11C \uACB0\uACFC");
		lblNewLabel.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 45));
		panel_1.add(lblNewLabel);
	}
}
