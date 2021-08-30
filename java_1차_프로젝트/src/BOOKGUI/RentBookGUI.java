package BOOKGUI;

import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import DAO.RentBookDAO;
import VO.AllVO;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import java.awt.Font;

public class RentBookGUI {
	private JTable table;
	private JFrame frame;
	private JTextField tf_search;
	RentBookDAO dao = new RentBookDAO();
	ArrayList<AllVO> al = null;
	LocalDate today = LocalDate.now();
	ArrayList<AllVO> arroverdate = new ArrayList<AllVO>();

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RentBookGUI window = new RentBookGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public RentBookGUI() {
		al = dao.allSelect();
		initialize();
		frame.setVisible(true);
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 680, 570);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		tf_search = new JTextField();
		tf_search.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				tf_search.setText("");
			}
		});
		tf_search.setText(
				"\uAC80\uC0C9\uD558\uACE0\uC790 \uD558\uB294 \uB3C4\uC11C\uB97C \uC785\uB825\uD558\uC138\uC694.");
		tf_search.setBounds(12, 75, 350, 21);
		frame.getContentPane().add(tf_search);
		tf_search.setColumns(10);

		JPanel panel = new JPanel();
		panel.setBounds(12, 142, 640, 379);
		frame.getContentPane().add(panel);
		panel.setLayout(new GridLayout(0, 1, 0, 0));

		JScrollPane scrollPane = new JScrollPane();
		panel.add(scrollPane);
		// 테이블 컬럼 이름
		String[] header = { "도서번호", "도서명", "회원 아이디", "회원 이름", "대여일", "반납일", "반납예정일", "연체일" };
		// 컬럼값(데이터)
		String[][] data = new String[al.size()][header.length];
		int num = 0;
		for (int i = al.size() - 1; i >= 0; i--) {
			for (int j = 0; j < header.length; j++) {
				if (j == 0) {
					data[i][j] = "" + al.get(num).getBook_no();
				} else if (j == 1) {
					data[i][j] = al.get(num).getBook_name();
				} else if (j == 2) {
					data[i][j] = al.get(num).getId();
				} else if (j == 3) {
					data[i][j] = al.get(num).getName();
				} else if (j == 4) {
					data[i][j] = "" + al.get(num).getOutdate();
				} else if (j == 5) {
					String notdate ="" + al.get(num).getIndate();				
					if(notdate.equals("null")) {
					data[i][j] = "";
					}else {
						data[i][j] = "" + al.get(num).getIndate();
					}
				} else if (j == 6) {
					data[i][j] = "" + al.get(num).getExdate();
				} else if (j == 7) {

					LocalDate date2 = LocalDate.parse(data[i][6], DateTimeFormatter.ISO_DATE);
					long overdate = ChronoUnit.DAYS.between(today, date2);
					if (overdate < 0) {
						data[i][j] = -overdate + "일 연체중";
						arroverdate.add(al.get(num));

					}

				}
			}
			num++;
		}

		table = new JTable(data, header);// JTable:테이블 만드는 키워드 순서가 데이터 그다음 컬럼

		// 패널전체에 테이블이 꽉차게 만들고 싶을때
		table.setFillsViewportHeight(true);
		// 테이블을 스크롤 패널에 추가, 컬럼 이름 보이기 위해서 추가**
		scrollPane.setViewportView(table);
		JButton btnNewButton_1 = new JButton("\uB300\uC5EC \uBAA9\uB85D");
		btnNewButton_1.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 15));
		btnNewButton_1.setBackground(Color.ORANGE);
		btnNewButton_1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {

				table = new JTable(data, header);
				table.setFillsViewportHeight(true);
				scrollPane.setViewportView(table);
			}
		});
		btnNewButton_1.setBounds(502, 42, 150, 40);
		frame.getContentPane().add(btnNewButton_1);

		JButton tf_overrentbook = new JButton("\uC5F0\uCCB4 \uB3C4\uC11C \uBAA9\uB85D");// 연체 도서 관리 버튼
		tf_overrentbook.setBackground(Color.ORANGE);
		tf_overrentbook.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 15));
		tf_overrentbook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] header = { "도서번호", "도서명", "회원 아이디", "회원 이름", "대여일", "반납일", "반납예정일", "연체일" };
				String[][] data1 = new String[arroverdate.size()][header.length];
				int num = 0;
				for (int i = arroverdate.size() - 1; i >= 0; i--) {
					for (int j = 0; j < header.length; j++) {
						if (j == 0) {
							data1[i][j] = "" + arroverdate.get(num).getBook_no();
						} else if (j == 1) {
							data1[i][j] = arroverdate.get(num).getBook_name();
						} else if (j == 2) {
							data1[i][j] = arroverdate.get(num).getId();
						} else if (j == 3) {
							data1[i][j] = arroverdate.get(num).getName();
						} else if (j == 4) {
							data1[i][j] = "" + arroverdate.get(num).getOutdate();
						} else if (j == 5) {
							data1[i][j] = "" + arroverdate.get(num).getIndate();
						} else if (j == 6) {
							data1[i][j] = "" + arroverdate.get(num).getExdate();
						} else if (j == 7) {
							LocalDate date2 = LocalDate.parse(data1[i][6], DateTimeFormatter.ISO_DATE);
							long overdate = ChronoUnit.DAYS.between(today, date2);
							if (overdate < 0) {
								data1[i][j] = -overdate + "일 연체중";
							}
						}
					}
					num++;

				}
				table = new JTable(data1, header);
				table.setFillsViewportHeight(true);
				scrollPane.setViewportView(table);

			}
		});
		tf_overrentbook.setBounds(502, 92, 150, 40);
		frame.getContentPane().add(tf_overrentbook);

		JButton btnNewButton = new JButton("\uAC80 \uC0C9");
		btnNewButton.setBackground(Color.ORANGE);
		btnNewButton.addActionListener(new ActionListener() {// ======검색
			public void actionPerformed(ActionEvent arg0) {
				String searchText = tf_search.getText();
				al = dao.select(searchText);
				// 테이블 컬럼 이름
				String[] header = { "도서번호", "도서명", "회원 아이디", "회원 이름", "대여일", "반납일", "반납예정일", "연체일" };
				// 컬럼값(데이터)
				String[][] data = new String[al.size()][header.length];
				int num = 0;
				for (int i = al.size() - 1; i >= 0; i--) {

					for (int j = 0; j < header.length; j++) {
						if (j == 0) {
							data[i][j] = "" + al.get(num).getBook_no();
						} else if (j == 1) {
							data[i][j] = al.get(num).getBook_name();
						} else if (j == 2) {
							data[i][j] = al.get(num).getId();
						} else if (j == 3) {
							data[i][j] = al.get(num).getName();
						} else if (j == 4) {
							data[i][j] = "" + al.get(num).getOutdate();
						} else if (j == 5) {
							String notdate ="" + al.get(num).getIndate();				
							if(notdate.equals("null")) {
							data[i][j] = "";
							}else {
								data[i][j] = "" + al.get(num).getIndate();
							}
						} else if (j == 6) {
							data[i][j] = "" + al.get(num).getExdate();
						} else if (j == 7) {
							LocalDate date2 = LocalDate.parse(data[i][6], DateTimeFormatter.ISO_DATE);
							long overdate = ChronoUnit.DAYS.between(today, date2);

							if (overdate < 0) {
								data[i][j] = -overdate + "일 연체중";
								
							} else {
								data[i][j] = "";
							}
						}
					}
					num++;
				}
				table = new JTable(data, header);
				table.setFillsViewportHeight(true);
				scrollPane.setViewportView(table);
			}
		});
		btnNewButton.setBounds(374, 75, 70, 21);
		frame.getContentPane().add(btnNewButton);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(12, 106, 193, 36);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(new GridLayout(1, 0, 0, 0));
		
				JLabel lblNewLabel = new JLabel("\uB300\uC5EC\uBAA9\uB85D");
				lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 12));
				panel_1.add(lblNewLabel);
				
				JPanel panel_2 = new JPanel();
				panel_2.setBounds(12, 0, 432, 65);
				frame.getContentPane().add(panel_2);
				panel_2.setLayout(new GridLayout(1, 0, 0, 0));
				
				JLabel lblNewLabel_1 = new JLabel("\uB300\uC5EC\uB3C4\uC11C\uAD00\uB9AC");
				lblNewLabel_1.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 45));
				panel_2.add(lblNewLabel_1);
	}
}
