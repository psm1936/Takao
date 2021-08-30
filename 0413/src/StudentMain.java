
public class StudentMain {

	public static void main(String[] args) {
		
		Student st1 = new Student();
		
		st1.name ="È«±æµ¿";
		st1.number ="20150675";
		st1.age = 22;
		st1.scoreJava = 50;
		st1.scoreWeb = 89;
		st1.scoreAndroid = 77;
		
		Student st2 = new Student();
		st2.name ="±è¿µÈñ";
		st2.number ="20090541";
		st2.age =29;
		st2.scoreJava =90;
		st2.scoreWeb =25;
		st2.scoreAndroid =30;
		
		//st1 Á¤º¸
		st1.show();
		System.out.println("=======================");
		st2.show();
	}	

}
