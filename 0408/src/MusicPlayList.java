import java.util.ArrayList;
import java.util.Scanner;

public class MusicPlayList {

	public static void main(String[] args) {
		// 노래 목록을 만들어주는 프로그램
		// 노래추가, 삭제, 조회, 프로그램 종료
		Scanner sc = new Scanner(System.in);
		ArrayList<String> musiclist = new ArrayList<String>();

//		musiclist.add("1.NewFace!");
//		musiclist.add("2.SIGNAL");
//		musiclist.add("3.아재개그");

		while (true) {
			System.out.print("[1]노래추가, [2]노래삭제, [3]노래조회, [4]종료 >>");
			int menu = sc.nextInt();
			// 4번 종료 
			if (menu == 4) {
				break;
			} // 1번 노래추가 선택 시작점.
			else if (menu == 1) {
				ShowMusicInfo(musiclist);
				
				System.out.print("[1]마지막 위치에 추가 [2]원하는 위치에 추가 >> ");
				int positon = sc.nextInt();

				System.out.print("추가 할 노래 입력 >>");
				String name = sc.next();
				
				if (positon == 1) {
					musiclist.add(name);
					
					System.out.println("추가가 완료되었습니다.");
				} else if (positon == 2) {
					System.out.print("추가 할 위치 입력 >>");
					int positonName = sc.nextInt();
					
					musiclist.add(positonName - 1, name);
					System.out.println("추가가 완료되었습니다.");
				}
               // 2번 노래삭제 시작점  재생목록 보이기
			} else if (menu == 2) {
				ShowMusicInfo(musiclist);
                
				// 2번 노래삭제  글
				System.out.print("[1]선택삭제 [2]전체삭제 >>");
				int del = sc.nextInt();
				// 1. 선택 삭제 
				if(del==1) {
					System.out.print("삭제할 노래 선택>>");
					int delNum = sc.nextInt();
					musiclist.remove(musiclist.get(delNum-1));
					
					System.out.println("노래가 삭제 되었습니다.");
				} // 2. 전체 삭제
				else if(del==2) {
					musiclist.clear();
					
					System.out.println("전체 리스트가 삭제되었습니다.");
				}
			}// 3번 노래조회 시작점.
			else if(menu==3) {
				ShowMusicInfo(musiclist); // 함수만들기 refactor -> extract method
                
			}

		}

	}

	private static void ShowMusicInfo(ArrayList<String> musiclist) {
		System.out.println("======== 현재 재생 목록  ========");
		if (musiclist.size() == 0) {
			System.out.println("재생 목록이 없습니다.");
		} else {
			for (int i = 0; i < musiclist.size(); i++) {
				System.out.println(i + 1 + ". " + musiclist.get(i));
			}
		}
		System.out.println("===========================");
	}

}
