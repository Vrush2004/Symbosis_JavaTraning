package oopconcepts.in.vrush.interfaceclass;

public interface Calculator {
	
	public final static int VAR = 100;
	
	public abstract int calculate(int no1, int no2);
	
	public default void printMessage(String message) {
		System.out.println(message);
	}
	
	private void printMyMessage(String message) {
		System.out.println(message);
	}
	
	public static void printVariable() {
		System.out.println(VAR);
	}
}