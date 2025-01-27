package staticandfinal.in.vrush.staticdemo;

public class StaticDemo {
	static int variable;
	
	public static void setVariable(int variable) {
		StaticDemo.variable = variable;
	}
	
	public static int getVariable() {
		return variable;
	}
	
	public void printVariable() {
		System.out.println(variable);
	}
}
