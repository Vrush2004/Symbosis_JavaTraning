package in.vrush.armstrongnumber;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		ArmstrongNumber obj = new ArmstrongNumber();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Integer Value: ");
		int variable = scanner.nextInt();
		obj.setNumber(variable);
		
		if(obj.isArmstrongNumber())
			System.out.println(variable + " is a Armstrong Number !");
		else
			System.out.println(variable + " is not a Armstrong Number !");
		
		scanner.close();
		
//		System.out.println("Enter Integer Value: ");
//		int variable = scanner.nextInt();
//		
//		System.out.println("Enter Address: ");
//		scanner.nextLine();
//		String address = scanner.nextLine();
		
		scanner.close();
	}
}
