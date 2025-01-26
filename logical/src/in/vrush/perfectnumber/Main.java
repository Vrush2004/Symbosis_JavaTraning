package in.vrush.perfectnumber;

public class Main {
	public static void main(String[] args) {
		PerfectNumber obj = new PerfectNumber();
		obj.setNumber(28);
		if(obj.isPerfectNumber())
			System.out.println("Number is perfect");
		else
			System.out.println("Number is not perfect");
	}
} 
