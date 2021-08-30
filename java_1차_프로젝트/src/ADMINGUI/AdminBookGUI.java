package ADMINGUI;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import BOOKGUI.BookInsertGUI;
import BOOKGUI.BookUpdateGUI;
import DAO.BookDAO;
import VO.BookVO;

public class AdminBookGUI {

	private JFrame frame;
	private JTextField tf_text;
	private JTable table;
	BookDAO dao = new BookDAO();
	ArrayList<BookVO> al = null;
	JScrollPane scrollPane = null;
	String choice = "";
	String searchText = "";
	int book_no = 0;
	BookVO vo = null;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminBookGUI window = new AdminBookGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AdminBookGUI() {

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

		JButton button = new JButton("\uB3C4\uC11C \uB4F1\uB85D"); // ���� ��� ��ư
		button.setBackground(Color.ORANGE);
		button.setFont(new Font("�޸յձ�������", Font.PLAIN, 15));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new BookInsertGUI();
			}
		});
		button.setBounds(12, 25, 150, 40);
		frame.getContentPane().add(button);

		JButton button_1 = new JButton("\uB3C4\uC11C \uC218\uC815"); // ���� ���� ��ư
		button_1.setBackground(Color.ORANGE);
		button_1.setFont(new Font("�޸յձ�������", Font.PLAIN, 15));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new BookUpdateGUI(vo);
			}
		});
		button_1.setBounds(172, 25, 150, 40);
		frame.getContentPane().add(button_1);

		JButton button_2 = new JButton("\uB3C4\uC11C \uC0AD\uC81C"); // ���� ���� ��ư
		button_2.setBackground(Color.ORANGE);
		button_2.setFont(new Font("�޸յձ�������", Font.PLAIN, 15));
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int exitOption = JOptionPane.showConfirmDialog(null, "�����Ͻðڽ��ϱ�?", "��������", JOptionPane.YES_NO_OPTION);

				// YES_OPTION�� 0, NO_OPTION�� 1, CLOSED_OPTION�� -1�� ��ȯ�Ѵ�
				if (exitOption == JOptionPane.YES_OPTION) {
					boolean result = dao.delete(book_no);
					if (result == true) {
						JOptionPane.showMessageDialog(null, "�������� ����");
					} else {
						JOptionPane.showMessageDialog(null, "�������� ����", "��������", JOptionPane.ERROR_MESSAGE);
					}
				} else if ((exitOption == JOptionPane.NO_OPTION) || (exitOption == JOptionPane.CLOSED_OPTION)) {
					return; // �ƹ� �۾��� ���� �ʰ� ���̾�α� ���ڸ� �ݴ´�
				}

			}
		});
		button_2.setBounds(334, 25, 150, 40);
		frame.getContentPane().add(button_2);

		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "\uB3C4\uC11C\uBA85", "\uCD9C\uD310\uC0AC\uBA85",
				"\uC800\uC790\uBA85", "\uC7A5\uB974\uBA85" }));
//		comboBox.setSelectedItem(null);
		comboBox.setBounds(12, 76, 94, 21);
		frame.getContentPane().add(comboBox);

		tf_text = new JTextField();
		tf_text.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tf_text.setText("");
			}
		});
		tf_text.setText(
				"\uAC80\uC0C9\uD558\uACE0\uC790 \uD558\uB294 \uB3C4\uC11C\uB97C \uC785\uB825\uD558\uC138\uC694."); // ����
																													// �˻�
																													// �ؽ�Ʈ
		tf_text.setBounds(108, 75, 350, 23);
		frame.getContentPane().add(tf_text);
		tf_text.setColumns(10);
		JButton button_3 = new JButton("\uAE30\uBD80\uB3C4\uC11C\uBAA9\uB85D"); // ���� ��θ�� ��ư
		button_3.setFont(new Font("�޸յձ�������", Font.PLAIN, 15));
		button_3.setBackground(Color.ORANGE);
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				al = dao.doallSelect();
				String[] header = { "������ȣ", "��������", "���ǻ�", "����", "�帣", "�Ұ�", "�����", "���⿩��", "������" };
				// �÷��� (������) - 2�����迭
				String[][] data = new String[al.size()][9];

				for (int i = 0; i < al.size(); i++) {
					for (int j = 0; j < 9; j++) {
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
							data[i][j] = al.get(i).getDoname();
						} else if (j == 7) {
							//==============================�뿩���� �Ǵ�=========================================	
							String check = "" + al.get(i).getRent();
						
							if(check.equals("0")) {
								data[i][j]="�뿩 ����";
							}else if(check.equals("1")) {
								data[i][j]="�뿩��";
							}
		//==============================�뿩���� �Ǵ�=========================================	
						} else if (j == 8) {
							data[i][j] = al.get(i).getAdmin_id();
						}
					}
				}
				table = new JTable(data, header);
				scrollPane.setViewportView(table);

			}
		});
		button_3.setBounds(496, 25, 150, 40);
		frame.getContentPane().add(button_3);

		JButton btnNewButton_1 = new JButton("\uAC80\uC0C9"); // �˻� ��ư
		btnNewButton_1.setBackground(Color.ORANGE);
		btnNewButton_1.setFont(new Font("�޸յձ�������", Font.PLAIN, 12));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				choice = (String) comboBox.getSelectedItem();
				searchText = tf_text.getText();
				al = dao.select(choice, searchText);

				String[] header = { "������ȣ", "��������", "���ǻ�", "����", "�帣", "�Ұ�", "�����", "���⿩��", "������" };
				// �÷��� (������) - 2�����迭
				String[][] data = new String[al.size()][9];

				for (int i = 0; i < al.size(); i++) {
					for (int j = 0; j < 9; j++) {
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
							// =====================null �� �Ⱥ��̰� �ϴ� �ڵ�
							String notdate = al.get(i).getDoname();
							if (notdate.equals("null")) {
								data[i][j] = "";
							} else {
								data[i][j] = al.get(i).getDoname();;
							}
							// =====================null �� �Ⱥ��̰� �ϴ� �ڵ�
						} else if (j == 7) {
							//==============================�뿩���� �Ǵ�=========================================	
							String check = "" + al.get(i).getRent();
						
							if(check.equals("0")) {
								data[i][j]="�뿩 ����";
							}else if(check.equals("1")) {
								data[i][j]="�뿩��";
							}
		//==============================�뿩���� �Ǵ�=========================================	
						} else if (j == 8) {
							data[i][j] = al.get(i).getAdmin_id();
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
						vo = dao.oneSelect(book_no);
					}
				});
				scrollPane.setViewportView(table);

			}
		});
		btnNewButton_1.setBounds(470, 75, 70, 23);
		frame.getContentPane().add(btnNewButton_1);

		JButton button_4 = new JButton("\uC804\uCCB4\uAC80\uC0C9"); // ��ü �˻� ��ư
		button_4.setBackground(Color.ORANGE);
		button_4.setFont(new Font("�޸յձ�������", Font.PLAIN, 12));
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				al = dao.allSelect();

				String[] header = { "������ȣ", "��������", "���ǻ�", "����", "�帣", "�Ұ�", "�����", "���⿩��", "������" };
				// �÷��� (������) - 2�����迭
				String[][] data = new String[al.size()][9];

				for (int i = 0; i < al.size(); i++) {
					for (int j = 0; j < 9; j++) {
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
							// =====================null �� �Ⱥ��̰� �ϴ� �ڵ�
							String notdate = al.get(i).getDoname(); 
							if (notdate.equals("null")){
								data[i][j] = " ";
							} else {
								data[i][j] = al.get(i).getDoname();
							}
							// =====================null �� �Ⱥ��̰� �ϴ� �ڵ�
						} else if (j == 7) {
							
							//==============================�뿩���� �Ǵ�=========================================	
							String check = "" + al.get(i).getRent();
						
							if(check.equals("0")) {
								data[i][j]="�뿩 ����";
							}else if(check.equals("1")) {
								data[i][j]="�뿩��";
							}
		//==============================�뿩���� �Ǵ�=========================================	
						} else if (j == 8) {
							data[i][j] = al.get(i).getAdmin_id();
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
						vo = dao.oneSelect(book_no);
					}
				});
				scrollPane.setViewportView(table);
			}
		});
		button_4.setBounds(551, 75, 95, 23);
		frame.getContentPane().add(button_4);


		JPanel panel = new JPanel();
		panel.setBounds(12, 108, 634, 411);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 634, 411);
		panel.add(scrollPane);

	}
}
