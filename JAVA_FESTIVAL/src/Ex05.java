
public class Ex05 {

	public static void main(String[] args) {
		
		int num1 =77;
		int num2 =1;
		int sum = 0;
		
		while (true) {
			if(num1>0 && num2<78){
				sum +=(num1*num2);
				num1-=1;
				num2+=1;
			}else {
				System.out.println("ÃÑ °ª : "+sum);
				break;			
			}			
		}
	}

}
