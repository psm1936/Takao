package Graph;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

public class DrawAction implements ActionListener {

	JTextField txt1, txt2, txt3;
	DrawingPanel drawpanel;

	DrawAction(JTextField txt1, JTextField txt2, JTextField txt3, DrawingPanel drawpanel) {
		this.txt1 = txt1;
		this.txt2 = txt2;
		this.txt3 = txt3;
		this.drawpanel = drawpanel;
	}

	public void actionPerformed(ActionEvent e) {
		try {
			int kor = Integer.parseInt(txt1.getText());
			int eng = Integer.parseInt(txt2.getText());
			int math = Integer.parseInt(txt3.getText());

			drawpanel.setScore(kor, eng, math);

			// �׷����� �׸��� �г��� paint()�� ���������� ȣ��
			drawpanel.repaint();

		} catch (NumberFormatException n) {
			System.out.println("�߸��� ���� �����Դϴ�.");

		}
	}
}