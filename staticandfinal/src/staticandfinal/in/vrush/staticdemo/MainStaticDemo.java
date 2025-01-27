package staticandfinal.in.vrush.staticdemo;

public class MainStaticDemo {
	public static void main(String[] args) {
//		StaticDemo staticdemo = new StaticDemo();
//		staticdemo.setVariable(10);
		StaticDemo.setVariable(10);
		int result = StaticDemo.getVariable();
		System.out.println(result);
	}
}
