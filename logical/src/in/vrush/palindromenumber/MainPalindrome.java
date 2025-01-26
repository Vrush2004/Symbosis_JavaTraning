package in.vrush.palindromenumber;


public class MainPalindrome {
	public static void main(String[] args) {
		PalindromeNumber obj = new PalindromeNumber(123);
		if(obj.checkPalindrome()) 
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
	}
}
