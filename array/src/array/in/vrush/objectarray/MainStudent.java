package array.in.vrush.objectarray;

public class MainStudent {
	public static void main(String[] args) {
//		Student[] stdArray = new Student[5];                      //First way
//		stdArray[0] = new Student();
//		Student[] stdArray = {new Student(), new Student(), new Student()};           //second way
		Student[] stdArray = new Student[] {new Student(), new Student(), new Student()};           //Third way
		stdArray[0].setName("ABC");
		System.out.println(stdArray[0].getName());
	}
}
