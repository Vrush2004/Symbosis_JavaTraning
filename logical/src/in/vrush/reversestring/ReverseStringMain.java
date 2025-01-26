package in.vrush.reversestring;
import java.util.*;

public class ReverseStringMain {
	public static void main (String[] args) {
		ReverseString obj = new ReverseString();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a address to reverse: ");
		String temp = scanner.nextLine();
		obj.setVariable(temp);
//		String result = obj.reverseString();
		String result = obj.reverseStringLine();
		System.out.println(result);
		
		scanner.close();
	}
}
