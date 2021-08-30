package BOOKGUI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.Color;
import java.awt.Font;

public class BookSearchGUI {

	private JFrame frame;
	private JTable table;

	

	/**
	 * Create the application.
	 */
	public BookSearchGUI() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 680, 540);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("\uB3C4\uC11C \uB4F1\uB85D");
		btnNewButton.setFont(new Font("�޸յձ�������", Font.PLAIN, 12));
		btnNewButton.setBackground(Color.ORANGE);
		btnNewButton.setBounds(555, 32, 95, 23);
		frame.getContentPane().add(btnNewButton);
		
		JPanel panel = new JPanel();
		panel.setBounds(12, 65, 640, 426);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 640, 426);
		panel.add(scrollPane);
		
		String[] header = {"������ȣ", "��������", "���ǻ�", "����", "�帣"};
		//�÷��� (������) - 2�����迭
		String[][] data = new String[30][5];
		
		table = new JTable(data, header);
		scrollPane.setColumnHeaderView(table);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
