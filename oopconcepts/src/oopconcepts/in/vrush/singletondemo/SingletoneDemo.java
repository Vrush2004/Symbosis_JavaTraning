package oopconcepts.in.vrush.singletondemo;

public class SingletoneDemo {
	private static SingletoneDemo object1;
	
	private SingletoneDemo() {}
	
	static {
		object1 = new SingletoneDemo();
	}
	
	public static SingletoneDemo getObject() {
		return object1;
	}
}
