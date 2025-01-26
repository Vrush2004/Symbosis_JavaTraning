package oopconcepts.in.vrush.singletondemo;

public class MainSingletonDemo {
	public static void main(String[] args) {
		SingletoneDemo obj1 = SingletoneDemo.getObject();
		SingletoneDemo obj2 = SingletoneDemo.getObject();
	}
}
