package in.vrush.primenumber;

public class PrimeMain {
	public static void main(String[] args) {
		PrimeNumber obj = new PrimeNumber(7);
		if(obj.isPrimeNumber())
			System.out.println("Is a Prime Number");
		else
			System.out.println("Is not a Prime Number");
	}
}
