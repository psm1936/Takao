
public class Ex03 {

	public static void main(String[] args) {
		int input =5;
		int st =0;
		
		char aString = 65;
			
		
		for (int i = 0; i < input; i++) {
			for (int j = 0; j < input-st; j++) {          
				if(j>= st) {
					System.out.print(aString + " ");        //양 옆으로 한칸식 줄어들었을 때 출력.
					aString++;
				}else {
					System.out.print(" "+" ");              // 빈공간 출력
				}				
				
			}
			st = i< (input/2)? st+1 : st-1;                 // 중간부분에서 다시 커지게 만드는 조건문  i 가 커지면 고정적인 input/2 의 수를 넘게 되고 맞게된다면  st+1이 누적된다.
			System.out.println("");                         // 다시 돌아가서 출력된다.
		}

	}

}
