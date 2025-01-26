package basiccodes.in.vrush.simplecodes;

public class ReverseNumber {
	int number;
	public ReverseNumber(int number) {
		this.number = number;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	public int getNumber() {
		return number;
	}
	
	public int reverseGivenNumber() {
		int digit;
		int result = 0;
		while(number != 0) {
			digit = number % 10;
			number = number / 10;
			result = result * 10 + digit;
		}
		return result;
	}
	public static void main(String[] args) {
		ReverseNumber obj = new ReverseNumber(12345);
		System.out.println(obj.reverseGivenNumber());   
	}
}