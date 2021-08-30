import java.util.ArrayList;
import java.util.Scanner;

public class MusicPlayList {

	public static void main(String[] args) {
		// �뷡 ����� ������ִ� ���α׷�
		// �뷡�߰�, ����, ��ȸ, ���α׷� ����
		Scanner sc = new Scanner(System.in);
		ArrayList<String> musiclist = new ArrayList<String>();

//		musiclist.add("1.NewFace!");
//		musiclist.add("2.SIGNAL");
//		musiclist.add("3.���簳��");

		while (true) {
			System.out.print("[1]�뷡�߰�, [2]�뷡����, [3]�뷡��ȸ, [4]���� >>");
			int menu = sc.nextInt();
			// 4�� ���� 
			if (menu == 4) {
				break;
			} // 1�� �뷡�߰� ���� ������.
			else if (menu == 1) {
				ShowMusicInfo(musiclist);
				
				System.out.print("[1]������ ��ġ�� �߰� [2]���ϴ� ��ġ�� �߰� >> ");
				int positon = sc.nextInt();

				System.out.print("�߰� �� �뷡 �Է� >>");
				String name = sc.next();
				
				if (positon == 1) {
					musiclist.add(name);
					
					System.out.println("�߰��� �Ϸ�Ǿ����ϴ�.");
				} else if (positon == 2) {
					System.out.print("�߰� �� ��ġ �Է� >>");
					int positonName = sc.nextInt();
					
					musiclist.add(positonName - 1, name);
					System.out.println("�߰��� �Ϸ�Ǿ����ϴ�.");
				}
               // 2�� �뷡���� ������  ������ ���̱�
			} else if (menu == 2) {
				ShowMusicInfo(musiclist);
                
				// 2�� �뷡����  ��
				System.out.print("[1]���û��� [2]��ü���� >>");
				int del = sc.nextInt();
				// 1. ���� ���� 
				if(del==1) {
					System.out.print("������ �뷡 ����>>");
					int delNum = sc.nextInt();
					musiclist.remove(musiclist.get(delNum-1));
					
					System.out.println("�뷡�� ���� �Ǿ����ϴ�.");
				} // 2. ��ü ����
				else if(del==2) {
					musiclist.clear();
					
					System.out.println("��ü ����Ʈ�� �����Ǿ����ϴ�.");
				}
			}// 3�� �뷡��ȸ ������.
			else if(menu==3) {
				ShowMusicInfo(musiclist); // �Լ������ refactor -> extract method
                
			}

		}

	}

	private static void ShowMusicInfo(ArrayList<String> musiclist) {
		System.out.println("======== ���� ��� ���  ========");
		if (musiclist.size() == 0) {
			System.out.println("��� ����� �����ϴ�.");
		} else {
			for (int i = 0; i < musiclist.size(); i++) {
				System.out.println(i + 1 + ". " + musiclist.get(i));
			}
		}
		System.out.println("===========================");
	}

}
