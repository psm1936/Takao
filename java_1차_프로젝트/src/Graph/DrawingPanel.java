/*
 * ���ϸ� : DrawingPanel.java
 * ���� : ����׷����� ǥ���ϱ� ���� �׷���
 */

package Graph;

import java.awt.Graphics;

import javax.swing.JPanel;

public class DrawingPanel extends JPanel {
	int kor, eng, math;

	public void paint(Graphics g) {// ����Ʈ�� �׷��Ƚ� ��ü�� ������ �ִ� �޼ҵ�
		// �г� ��ü�� �Ͼ������ ǥ��
		g.clearRect(0, 0, getWidth(), getHeight());
		g.drawLine(50, 250, 350, 250); // �׷����� ���� ����
		g.drawLine(50, 20, 50, 250); // �׷����� ���� ����

		for (int cnt = 1; cnt <= 10; cnt++) {
			// ��ǥ���� 10�� �������� 10~100���� ���
			g.drawString(cnt * 10 + "", 25, 255 - 20 * cnt); // ��Ʈ��Ÿ������ ��ȯ�����ֱ� ���� +"" �߰�
			// ��ǥ���� 10�� ������ �������� ���
			g.drawLine(50, 250 - 20 * cnt, 350, 250 - 20 * cnt);
		}

		g.drawString("����1��", 100, 270);
		g.drawString("����2��", 200, 270);
		g.drawString("����3��", 300, 270);

		if (kor > 0) {
			g.fillRect(110, 250 - kor * 2, 10, kor * 2);
		}

		if (eng > 0) {
			g.fillRect(210, 250 - eng * 2, 10, eng * 2);
		}

		if (math > 0) {
			g.fillRect(310, 250 - math * 2, 10, math * 2);
		}
	}

	void setScore(int kor, int eng, int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

}