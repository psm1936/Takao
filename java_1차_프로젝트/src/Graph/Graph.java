/*
 * ���ϸ� : Graph1.java
 * ���� : 
 */

package Graph;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Graph {
	public static void main(String arg[]) {
		JFrame frame = new JFrame("�����׷���");
		frame.setLocation(500, 300);
		// frame.setPreferredSize(new Dimension(400,300));
		frame.setSize(400, 300);

		// �����̳ʶ� �� �״�� �ٸ� ������Ʈ�� ������ �� �ִ� ������Ʈ�� ���Ѵ�.
		Container contentPane = frame.getContentPane();

		// �׷����� �׸� �г��� �����.
		DrawingPanel drawpanel = new DrawingPanel();

		// ���� �׷����� ǥ���� �׷����� ��ġ�� �߾ӿ�..
		contentPane.add(drawpanel, BorderLayout.CENTER);

		// �гλ���
		JPanel panel = new JPanel();

		JTextField txt1 = new JTextField(3);
		JTextField txt2 = new JTextField(3);
		JTextField txt3 = new JTextField(3);

		JButton btn = new JButton("�׷����׸���");

		// �г� �߰�
		panel.add(new JLabel("����1��"));
		panel.add(txt1);
		panel.add(new JLabel("����2��"));
		panel.add(txt2);
		panel.add(new JLabel("����3��"));
		panel.add(txt3);
		panel.add(btn);

		contentPane.add(panel, BorderLayout.SOUTH);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// ��ư�� �̺�Ʈ ���
		btn.addActionListener(new DrawAction(txt1, txt2, txt3, drawpanel));

		frame.setVisible(true);
	}
}
