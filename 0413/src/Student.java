
public class Student {
	String name;
	String number;
	int age;
	int scoreJava;
	int scoreWeb;
	int scoreAndroid;

	public void show() {

		System.out.println(name + "�� �ȳ��ϼ���.");
		System.out.println("[" + number + ", " + age + "�� ]");
		System.out.println(name + "���� Java������" + scoreJava + "���Դϴ�.");
		System.out.println(name + "���� Web������" + scoreWeb + "���Դϴ�.");
		System.out.println(name + "���� Android������" + scoreAndroid + "���Դϴ�.");

	}
}
