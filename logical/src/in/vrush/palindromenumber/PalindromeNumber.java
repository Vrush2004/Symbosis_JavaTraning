package in.vrush.palindromenumber;

public class PalindromeNumber {
	int number;
	public PalindromeNumber() {}
	public PalindromeNumber(int number) {
		this.number = number;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	public int getNumber() {
		return number;
	}
	
	public int reverseGivenNumber() {
		int result = 0;
		int temp = number;
		while(temp != 0) {
			result = result * 10 + temp % 10;
			temp = temp / 10;
		}
		return result;
	}
	
	public boolean checkPalindrome() {
		return reverseGivenNumber() == number;
	}
}
