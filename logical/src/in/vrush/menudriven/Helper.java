package in.vrush.menudriven;
import java.util.*;
import in.vrush.palindromenumber.*;
import in.vrush.perfectnumber.*;
import in.vrush.primenumber.*;
import in.vrush.armstrongnumber.*;
import in.vrush.reversestring.*;
import in.vrush.charactercount.*;
import in.vrush.fibonacciseries.*;

public class Helper {
	public int printMenu(Scanner scanner) {
		System.out.println("1. To check number is Palindrome");
		System.out.println("2. To check number is Perfect Number");
		System.out.println("3. To check number is Prime Number");
		System.out.println("4. To check number is Armstrong Number");
		System.out.println("5. To reverse a String by character");
		System.out.println("6. To reverse a String Line");
		System.out.println("7. To Count Characters");
		System.out.println("8. To Get the fibonacci series");
		System.out.println("0. Exit");
		return scanner.nextInt();
	}
	
	public void checkPalindromeNumber(Scanner scanner) {
		PalindromeNumber number = new PalindromeNumber();
		System.out.println("Enter a number: ");
		int variable  = scanner.nextInt();
		number.setNumber(121);
		if(number.checkPalindrome())
			System.out.println("Number is Palindrome");
		else
			System.out.println("Number is not Palindrome");
	}
	
	public void checkPerfectNumber(Scanner scanner) {
		PerfectNumber number = new PerfectNumber();
		System.out.println("Enter a number: ");
		int variable  = scanner.nextInt();
		number.setNumber(variable);
		if(number.isPerfectNumber())
			System.out.println("Number is Perfect Number");
		else
			System.out.println("Number is not Perfect Number");
	}
	
	public void checkPrimeNumber(Scanner scanner) {
		PrimeNumber number = new PrimeNumber();
		System.out.println("Enter a number: ");
		int variable  = scanner.nextInt();
		number.setNumber(variable);
		if(number.isPrimeNumber())
			System.out.println("Number is Prime Number");
		else
			System.out.println("Number is not Prime Number");
	}
	
	public void checkArmstrongNumber(Scanner scanner) {
		ArmstrongNumber number = new ArmstrongNumber();
		System.out.println("Enter a number: ");
		int variable  = scanner.nextInt();
		number.setNumber(variable);
		if(number.isArmstrongNumber())
			System.out.println("Number is Armstrong Number");
		else
			System.out.println("Number is not Armstrong Number");
	}
	
	public void reverseStrings(Scanner scanner) {
	    ReverseString number = new ReverseString();
	    System.out.println("Enter a string: ");
	    String variable = scanner.next();
	    number.setVariable(variable);
	    System.out.println("Reverse String: " + number.reverseString());
	}
	
	public void reverseStringLine(Scanner scanner) {
	    ReverseString number = new ReverseString();
	    System.out.println("Enter a string: ");
	    scanner.nextLine();
	    String variable = scanner.nextLine();
	    number.setVariable(variable);
	    System.out.println("Reverse String: " + number.reverseStringLine());
	}
	
	public void characterCount(Scanner scanner) {
	    CharacterCount number = new CharacterCount();
	    System.out.println("Enter a string: ");
	    scanner.nextLine(); 
	    String variable = scanner.nextLine();
	    number.setVariable(variable);
	    number.countVowels();
	}
	
	public void fibonacciSeries(Scanner scanner) {
		FibonacciSeries number = new FibonacciSeries();
		System.out.println("Enter the limit for print the Fibonacci Series: ");
		int variable  = scanner.nextInt();
		number.setLimit(variable);
		number.printFibonacciSeries();
	}
}
