import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.tree.DefaultTreeSelectionModel;

public class AddressMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Address> ad = new ArrayList<Address>(); 
		
		while (true) {
			System.out.print("[1]추가 [2]전체조회 [3]삭제 [4]검색 [5]종료 >> ");
			int num = sc.nextInt();
			
			if(num ==1) {
				System.out.print("이름 : ");
				String name = sc.next();
				System.out.print("나이 : ");
				int age = sc.nextInt();
				System.out.print("전화번호 : ");
				String pNum = sc.next();
				
				ad.add(new Address(name, age, pNum)); 
				
			}else if(num==2) {
				
				for (int i = 0; i < ad.size(); i++) {
					System.out.println((i+1)+". "+ad.get(i).getName()+"("+ad.get(i).getAge()+") : "+ad.get(i).getPhoneNumber());					
				}
				if(ad.size()==0) {
					System.out.println("등록된 연락처가 없습니다.");
				}
				
			}else if(num==3) {
				
				for (int i = 0; i < ad.size(); i++) {
					System.out.println((i+1)+". "+ad.get(i).getName()+"("+ad.get(i).getAge()+") : "+ad.get(i).getPhoneNumber());					
				}
				System.out.print("삭제할 번호 입력 : ");
				int d = sc.nextInt();
				for (int i = 0; i < ad.size(); i++) {
					if((d-1)==i) {
						ad.remove(i);			
					}
				}
				if(ad.size()==0) {
					System.out.println("등록된 연락처가 없습니다.");
				}
				
			}else if(num==4) {
				
				
				if(ad.size() ==0) {
					System.out.println("검색한 이름의 정보가 없습니다."); 
				}else {
					System.out.print("검색할 이름 입력 : ");
					String name1 = sc.next();	
					
					for(int i =0; i <ad.size(); i++) {
						if(ad.get(i).getName().equals(name1)) {
							System.out.println((i+1)+". "+ad.get(i).getName()+"("+ad.get(i).getAge()+") : "+ad.get(i).getPhoneNumber());
							break;
						}
						
						if(i==ad.size()-1) {
							System.out.println("검색한 이름의 정보가 없습니다.");
						}
					}					
				}
				
				
				
				
				
				
			}else if(num==5) {
				System.out.println("프로그램 종료");
				break;
			}
		} 
		
	}

}
