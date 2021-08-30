import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.SpringLayout;
import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MusicPlayerGUI {

	private JFrame frame;
	MusicPlayer player = new MusicPlayer();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MusicPlayerGUI window = new MusicPlayerGUI();
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
	public MusicPlayerGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		
		//setBounds ∞™ 4∞≥  (x√‡, y√‡, ≥–¿Ã, ≥Ù¿Ã)
		frame.setBounds(300, 150, 867, 363);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(12, 10, 827, 145);
		frame.getContentPane().add(panel);
		panel.setLayout(new CardLayout(0, 0));
		
		JLabel lbl_musicinfo = new JLabel("Music_Info");
		lbl_musicinfo.setForeground(Color.WHITE);
		lbl_musicinfo.setBackground(Color.WHITE);
		lbl_musicinfo.setFont(new Font("±º∏≤", Font.BOLD, 50));
		lbl_musicinfo.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lbl_musicinfo, "name_285138166594300");
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.BLACK);
		panel_1.setBounds(12, 169, 827, 145);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(new GridLayout(1, 0, 0, 0));
		
		JButton btn_pre = new JButton("\u25C0\u25C0");
		btn_pre.setBackground(Color.BLACK);
		btn_pre.setForeground(Color.WHITE);
		btn_pre.setFont(new Font("±º∏≤", Font.PLAIN, 35));
		btn_pre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Music m =player.prePlay();
				lbl_musicinfo.setText(musicInfo(m));
			}
		});
		panel_1.add(btn_pre);
		
		JButton btn_play = new JButton("\u25B6");
		btn_play.setBackground(Color.BLACK);
		btn_play.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Music m =player.play();
				lbl_musicinfo.setText(musicInfo(m));
			}
		});
		btn_play.setForeground(Color.WHITE);
		btn_play.setFont(new Font("±º∏≤", Font.PLAIN, 35));
		panel_1.add(btn_play);
		
		JButton btn_stop = new JButton("\u25A0");
		btn_stop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String message = player.stop();
				lbl_musicinfo.setText(message);	
			}
		});
		btn_stop.setBackground(Color.BLACK);
		btn_stop.setForeground(Color.WHITE);
		btn_stop.setFont(new Font("±º∏≤", Font.PLAIN, 35));
		panel_1.add(btn_stop);
		
		JButton btn_next = new JButton("\u25B6\u25B6");
		btn_next.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				
				Music m =player.nextPlay();
				lbl_musicinfo.setText(musicInfo(m));
			}
		});
		btn_next.setBackground(Color.BLACK);
		btn_next.setForeground(Color.WHITE);
		btn_next.setFont(new Font("±º∏≤", Font.PLAIN, 35));
		panel_1.add(btn_next);
	}
	
	private static String musicInfo(Music m) {
		return m.getSinger()+", "+m.getMusicName()+", "+changeTime(m);
	}

	private static String changeTime(Music m) {
		return m.getPlayTime()/60+"∫–"+m.getPlayTime()/60+"√ ";
	}
}
