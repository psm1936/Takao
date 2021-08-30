
public class PersonMain {

	public static void main(String[] args) {
//		Person p1 = new Person("辫固锐",20);		
//		System.out.println(p1.getName());
//		System.out.println(p1.getAge());
//		
//		Person p2 = new Person("弥己快", 21);
//	    System.out.println(p2.getName());
//	    System.out.println(p2.getAge());
	    
	    Person p1 = new Person("辫固锐",20);		
		Person p2 = new Person("弥己快", 21);
		Person p3 = new Person("公具龋", 18);
		
	    Person[] personArr = new Person[3];
	    personArr[0] = new Person("辫固锐", 20);
	    personArr[1] = new Person("弥己快", 21);
	    personArr[2] = new Person("公具龋", 18);
	    
	    System.out.println(p1);
	    System.out.println(personArr[2]);
	    
	    for (int i = 0; i < personArr.length; i++) {
	    	System.out.println(personArr[i].getName());
		}
	    
	    
	    int num1 = 10;
	    int num2 = 20;
	    int num3 = 30;
	    
	    int[] arr = new int[3];
	    
	    arr[0] =10;
	    arr[1] =20;
	    arr[2] =30;
	}

}
