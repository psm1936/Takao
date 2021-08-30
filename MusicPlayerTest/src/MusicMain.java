import java.util.ArrayList;
import java.util.Scanner;

public class MusicMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MusicPlayer player = new MusicPlayer();
		
		
		while (true) {
			System.out.print("1.재생 2.정지 3.다음곡 4.이전곡 5.종료 >> ");
			int menu = sc.nextInt();
			
			if(menu == 1) {
								
						
				Music m =player.play();
				System.out.println(musicInfo(m));
			}else if(menu ==2) {
				String message = player.stop();
				System.out.println(message);				
			}else if(menu ==3) {
				Music m =player.nextPlay();
				System.out.println(musicInfo(m));
			}else if(menu ==4) {
				Music m =player.prePlay();
				System.out.println(musicInfo(m));
			}else if(menu ==5) {
				System.out.println("프로그램 종료");
				player.stop();
				break;
			}
			
		}
		
		
		

	}

	private static String musicInfo(Music m) {
		return m.getSinger()+", "+m.getMusicName()+", "+changeTime(m);
	}

	private static String changeTime(Music m) {
		return m.getPlayTime()/60+"분"+m.getPlayTime()/60+"초";
	}

}
