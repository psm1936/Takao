
public class Ex03 {

	public static void main(String[] args) {
		int hol =0;
		int zag =0;
		for (int i = 1; i <= 100; i+=2) {
			hol +=i;
		}
		for (int i = 2; i <= 100; i+=2) {
			zag +=i;
		}
		System.out.print("°á°ú : "+(hol-zag));
	}

}
