
public class Ex03IcreDecre {

	public static void main(String[] args) {
		// 증감 연산자
		// ++  (증가 연산자)
		// --  (감소 연산자)
		
		int i =3;
		System.out.println(++i);  // 바로 더해진다.        4 
		System.out.println(i++);  // 다음에 사용할때 더해진다. 4
		System.out.println(i);    // 출력 하니 더해진다.     5
		
		int hap=0,j=0,k=0,l=0;
		hap = ++j + k++ + ++l;
		System.out.println(hap +","+j+","+k+","+l);
				
		int a=3,b=4,c=5,d=5;
		a+=6 + --b;
		d*=7 - c++;
		System.out.println(a+","+b+","+c+","+d);

	}

}
