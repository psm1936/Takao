import java.util.ArrayList;

import javazoom.jl.player.MP3Player;

public class MusicPlayer {
	
    MP3Player mp3 = new MP3Player();
	ArrayList<Music> musicList = new ArrayList<Music>();
	int curIndex = 0;

	public MusicPlayer() {
		musicList.add(new Music("DallaDalla", "Itzy", 100, "C://music/Itzy - Dalla Dalla.mp3"));
		musicList.add(new Music("깡", "Rain", 120,"C://music/Rain - 깡.mp3"));
		musicList.add(new Music("SOLO", "Jennie", 200,"C://music/JENNIE - SOLO.mp3"));
	}
	
	

	public Music play() {

		Music m = musicList.get(curIndex);
		if(mp3.isPlaying()) {
			mp3.stop();
		}
		
		mp3.play(m.getMusicPath());
		return m;
	}

	public Music nextPlay() {
		curIndex++;

		if (curIndex >= musicList.size()) {
			curIndex = 0;
		}

		Music m = musicList.get(curIndex);
		
		if(mp3.isPlaying()) {           // 노래 정지하고 플레이.
			mp3.stop();
		}
		mp3.play(m.getMusicPath());
		
		return m;
	}

	public Music prePlay() {
		curIndex--;

		if (curIndex<0) {
			curIndex = musicList.size()-1; // 현재 사이즈의 크기 
		}

		Music m = musicList.get(curIndex);
		
		if(mp3.isPlaying()) {
			mp3.stop();
		}
		mp3.play(m.getMusicPath());

		return m;
	}
	
	public String stop() {
		String s="노래가 정지되었습니다.";	
		if(mp3.isPlaying()) {
			mp3.stop();
		}
		return s;
	}
}
