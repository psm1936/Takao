import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.tree.DefaultTreeSelectionModel;

public class AddressMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Address> ad = new ArrayList<Address>(); 
		
		while (true) {
			System.out.print("[1]�߰� [2]��ü��ȸ [3]���� [4]�˻� [5]���� >> ");
			int num = sc.nextInt();
			
			if(num ==1) {
				System.out.print("�̸� : ");
				String name = sc.next();
				System.out.print("���� : ");
				int age = sc.nextInt();
				System.out.print("��ȭ��ȣ : ");
				String pNum = sc.next();
				
				ad.add(new Address(name, age, pNum)); 
				
			}else if(num==2) {
				
				for (int i = 0; i < ad.size(); i++) {
					System.out.println((i+1)+". "+ad.get(i).getName()+"("+ad.get(i).getAge()+") : "+ad.get(i).getPhoneNumber());					
				}
				if(ad.size()==0) {
					System.out.println("��ϵ� ����ó�� �����ϴ�.");
				}
				
			}else if(num==3) {
				
				for (int i = 0; i < ad.size(); i++) {
					System.out.println((i+1)+". "+ad.get(i).getName()+"("+ad.get(i).getAge()+") : "+ad.get(i).getPhoneNumber());					
				}
				System.out.print("������ ��ȣ �Է� : ");
				int d = sc.nextInt();
				for (int i = 0; i < ad.size(); i++) {
					if((d-1)==i) {
						ad.remove(i);			
					}
				}
				if(ad.size()==0) {
					System.out.println("��ϵ� ����ó�� �����ϴ�.");
				}
				
			}else if(num==4) {
				
				
				if(ad.size() ==0) {
					System.out.println("�˻��� �̸��� ������ �����ϴ�."); 
				}else {
					System.out.print("�˻��� �̸� �Է� : ");
					String name1 = sc.next();	
					
					for(int i =0; i <ad.size(); i++) {
						if(ad.get(i).getName().equals(name1)) {
							System.out.println((i+1)+". "+ad.get(i).getName()+"("+ad.get(i).getAge()+") : "+ad.get(i).getPhoneNumber());
							break;
						}
						
						if(i==ad.size()-1) {
							System.out.println("�˻��� �̸��� ������ �����ϴ�.");
						}
					}					
				}
				
				
				
				
				
				
			}else if(num==5) {
				System.out.println("���α׷� ����");
				break;
			}
		} 
		
	}

}
