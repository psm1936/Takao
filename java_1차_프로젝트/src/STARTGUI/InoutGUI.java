package STARTGUI;

import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import DAO.InoutDAO;
import VO.AllVO;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;

public class InoutGUI {

	private JFrame frame;
	private JTable table;
	private JButton btnNewButton;
	private JTextField tf_search;
	private JButton btn_search;
	InoutDAO dao = new InoutDAO();
	ArrayList<AllVO> al = null;
	private JPanel panel_1;
	private JLabel lblNewLabel;


	   public InoutGUI() {
		   al = dao.allSelect();
	      initialize();
	      frame.setVisible(true);
	   }


	   private void initialize() {
	      frame = new JFrame();
	      frame.setBounds(100, 100, 680, 570);
	      frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	      frame.getContentPane().setLayout(null);
	      
	      JPanel panel = new JPanel();
	      panel.setBounds(12, 154, 640, 367);
	      frame.getContentPane().add(panel);
	      panel.setLayout(new GridLayout(1, 0, 0, 0));
	      
	      JScrollPane scrollPane = new JScrollPane();
	      panel.add(scrollPane);
	      
			String[] header = {"���̵�", "�̸�", "�Խ� ��¥", "��� ��¥"};//���̺� ����
			String[][] data = new String[al.size()][header.length];
			SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			int num = 0;
			for (int i = al.size()-1; i >= 0; i--) {
				for (int j = 0; j < header.length; j++) {
					if(j==0) {
						data[i][j] =  al.get(num).getId();
					}else if(j==1) {
						data[i][j] =  al.get(num).getName();
					}else if(j==2) {
						// �ڵ带 Ȯ���غ��� DB���� �ҷ��ͼ� vo�� ���������� Date�� �����ϰ� ��ż�
						// ����Ҷ� �������� �ɾ� �ٰԿ�
						// �ٽ� �ð� ������ / ������ Ȯ�μ����� �غ��ðھ�� ��   format1.format(al.get(num).getIn_outdate())
						data[i][j] =  al.get(num).getIn_indate();
					}else if(j==3) {	
						String notdate =al.get(num).getIn_outdate();				
						if(notdate.equals("null")) {
						data[i][j] = "";
						}else {
							data[i][j] = al.get(num).getIn_outdate();
						}
					}
				}
				num++;
			}
			table = new JTable(data, header);
			table.setFillsViewportHeight(true);
			scrollPane.setViewportView(table);// ������ ��� ��ü ����
			// �ڵ带 Ȯ���غ��� DB���� �ҷ��ͼ� vo�� ���������� Date�� �����ϰ� ��ż�
			// ����Ҷ� �������� �ɾ� �ٰԿ�
			// �ٽ� �ð� ������ / ������ Ȯ�μ����� �غ��ðھ�� ��   format1.format(al.get(num).getIn_outdate())
	      
	         
			
			btnNewButton = new JButton("\uC804 \uCCB4 \uBAA9 \uB85D");
			btnNewButton.setFont(new Font("�޸յձ�������", Font.PLAIN, 15));
			btnNewButton.setBackground(Color.ORANGE);
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					table = new JTable(data, header);
					table.setFillsViewportHeight(true);
					scrollPane.setViewportView(table);
				}
			});// ��ü ��ư ����  ���̺� �����ֱ�
			btnNewButton.setBounds(502, 104, 150, 40);
			frame.getContentPane().add(btnNewButton);
			
			tf_search = new JTextField();
			tf_search.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					tf_search.setText("");
					
				}
			});// �˻� �ؽ�Ʈ Ŭ�������� ���� �ʱ�ȭ
			tf_search.setText("\uC544\uC774\uB514 \uB610\uB294 \uC774\uB984\uC744 \uAC80\uC0C9\uD558\uC138\uC694");
			tf_search.setBounds(12, 123, 350, 21);
			frame.getContentPane().add(tf_search);
			tf_search.setColumns(10);
			
			btn_search = new JButton("\uAC80 \uC0C9");
			btn_search.setBackground(Color.ORANGE);
			btn_search.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String searchText = tf_search.getText();
					al = dao.select(searchText);
					String[] header = {"���̵�", "�̸�", "�Խ� ��¥", "��� ��¥"};//���̺� ����
					String[][] data = new String[al.size()][header.length];
					int num = 0;
					for (int i = al.size()-1; i >= 0; i--) {
						for (int j = 0; j < header.length; j++) {
							if(j==0) {
								data[i][j] =  al.get(num).getId();
							}else if(j==1) {
								data[i][j] =  al.get(num).getName();
							}else if(j==2) {
								data[i][j] =  ""+al.get(num).getIn_indate();
							}else if(j==3) {	
								String notdate =""+al.get(num).getIn_outdate();				
								if(notdate.equals("null")) {
								data[i][j] = "";
								}else {
									data[i][j] = ""+al.get(num).getIn_outdate();
								}
							}
						}
						num++;
					}
					table = new JTable(data, header);
					table.setFillsViewportHeight(true);
					scrollPane.setViewportView(table);				
				}
			});//�˻� ��ư
			btn_search.setBounds(374, 123, 70, 21);
			frame.getContentPane().add(btn_search);
			
			panel_1 = new JPanel();
			panel_1.setBounds(12, 10, 432, 91);
			frame.getContentPane().add(panel_1);
			panel_1.setLayout(new GridLayout(1, 0, 0, 0));
			
			lblNewLabel = new JLabel("\uC785\uC2E4/\uD1F4\uC2E4\uAD00\uB9AC");
			lblNewLabel.setFont(new Font("�޸յձ�������", Font.PLAIN, 45));
			panel_1.add(lblNewLabel);
	     
	      
	      
	
}
}
