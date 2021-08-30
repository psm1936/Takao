
public class Ex18 {

	public static void main(String[] args) {
		int[] point = {92,32,52,9,81,2,68};
		//거리가 짧은 점(index)들을 출력!
		
		int min = point[0];
		int sum =0;
		boolean g = true;
		int a =0;
		int b =0;
		
		for (int i = 0; i < point.length-1; i++) {
			for (int j = i+1; j < point.length; j++) {
				if(point[i]>point[j]) {
					sum = point[i]-point[j];
					g= true;
				}else {
					sum = point[j]-point[i];
					g= false;
				}
				
				if(min>sum) {
					min = sum;
					if(g==true) {
						a= i;
						b= j;
					}else {
						a= j;
						b= i;
					}
				}
			}
			
		}System.out.println("result = ["+a+", "+b+"]");
				
	}

}
