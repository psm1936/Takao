
public class Ex07 {

	public static void main(String[] args) {
		String score = "A,A,B,C,D,A,C,D,D,D,F";
		
		String[] s = score.split(",");
		
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int e = 0;
		for (int i = 0; i < s.length; i++) {
			if(s[i].equals("A")) {
				a++;
			}else if(s[i].equals("B")) {
				b++;
			}else if(s[i].equals("C")) {
				c++;
			}else if(s[i].equals("D")) {
				d++;
			}else if(s[i].equals("F")) {
				e++;
			}
		}		
		System.out.println("A : "+a+"명");
		System.out.println("B : "+b+"명");
		System.out.println("C : "+c+"명");
		System.out.println("D : "+d+"명");
		System.out.println("F : "+e+"명");
	}

}
