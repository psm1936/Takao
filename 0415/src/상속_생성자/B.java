package ���_������;

import org.omg.CORBA.PUBLIC_MEMBER;

public class B extends A{
	public B() {
		System.out.println("B����!");
	}
	
	public B(int x) {
		System.out.println("B(x)����!");
	}
	public B(int x, int y) {
		super(x, y);
		System.out.println("B(x,y)����!");
	}
}
