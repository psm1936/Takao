/*
 * 파일명 : DrawingPanel.java
 * 내용 : 막대그래프를 표현하기 위한 그래프
 */

package Graph;

import java.awt.Graphics;

import javax.swing.JPanel;

public class DrawingPanel extends JPanel {
	int kor, eng, math;

	public void paint(Graphics g) {// 페인트는 그래픽스 객체를 가지고 있는 메소드
		// 패널 전체를 하얀색으로 표현
		g.clearRect(0, 0, getWidth(), getHeight());
		g.drawLine(50, 250, 350, 250); // 그래프의 가로 길이
		g.drawLine(50, 20, 50, 250); // 그래프의 세로 길이

		for (int cnt = 1; cnt <= 10; cnt++) {
			// 좌표값을 10의 간격으로 10~100까지 출력
			g.drawString(cnt * 10 + "", 25, 255 - 20 * cnt); // 스트링타입으로 변환시켜주기 위해 +"" 추가
			// 좌표값을 10의 간격의 라인으로 출력
			g.drawLine(50, 250 - 20 * cnt, 350, 250 - 20 * cnt);
		}

		g.drawString("도서1등", 100, 270);
		g.drawString("도서2등", 200, 270);
		g.drawString("도서3등", 300, 270);

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