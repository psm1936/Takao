import javax.print.DocFlavor.STRING;

public class ex20 {

	public static void main(String[] args) {
		String score = "A,A,B,C,D,A,C,D,D,D,F";
		String[] as = score.split(",");
		
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		int num4 = 0;
		int num5 = 0;
		for (int i = 0; i < as.length; i++) {
			if(as[i].equals("A")) {
				num1++;
			}else if(as[i].equals("B")) {
				num2++;
			}else if(as[i].equals("C")) {
				num3++;
			}else if(as[i].equals("D")) {
				num4++;
			}else if(as[i].equals("F")) {
				num5++;
			}
			
		}
		System.out.println("A :"+ num1+"명");
		System.out.println("B :"+ num2+"명");
		System.out.println("C :"+ num3+"명");
		System.out.println("D :"+ num4+"명");
		System.out.println("F :"+ num5+"명");

	}

}
